package stepic.makeTheFollowingCodeThreadSafe;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.function.Consumer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafe5Quiz {
    private static final int POOL_SIZE = 50;
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(POOL_SIZE);

    public static void main(final String[] args) throws Exception {
        final CyclicBarrier barrier = new CyclicBarrier(POOL_SIZE);
        final CountDownLatch done = new CountDownLatch(POOL_SIZE);
        final ThreadSafe5 account = new ThreadSafe5(100);
        final Random random = new Random(41);
        for (int i = 0; i < POOL_SIZE; i++) {
            run(random.nextInt() % 3 == 0
                            ? account::deposit
                            : account::withdraw,
                    Math.abs(random.nextInt(100)),
                    barrier,
                    done);
        }
        done.await();
        System.out.printf("Account balance is %d%n", account.getBalance());
        EXECUTOR.shutdown();
    }

    private static Future<?> run(
            final Consumer<Integer> operation, final int amount, final CyclicBarrier barrier, final CountDownLatch done) {
        return EXECUTOR.submit(() -> {
            try {
                barrier.await();
            } catch (final InterruptedException | BrokenBarrierException ex) {
                throw new RuntimeException(ex);
            }
            operation.accept(amount);
            done.countDown();
        });
    }

    public static class ThreadSafe5 {
        // Tip: always prefer "weakened" type for the declaration, i.e. List instead of ArrayList, as an example.
        private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        private final Lock r = lock.readLock();
        private final Lock w = lock.writeLock();
        private int balance;

        public ThreadSafe5(final int balance) {
            this.balance = balance;
        }

        public void withdraw(final int amount) {
            r.lock();
            try {
                System.out.printf("Withdraw %d%n", amount);
                if (balance >= amount) {
                    balance -= amount;
                }
            } finally {
                r.unlock();
            }
        }

        public void deposit(final int amount) {
            r.lock();
            try {
                System.out.printf("Deposit %d%n", amount);
                balance += amount;
            } finally {
                r.unlock();
            }
        }

        public int getBalance() {
            w.lock();
            try {
                return balance;
            } finally {
                w.unlock();
            }
        }
    }
}
