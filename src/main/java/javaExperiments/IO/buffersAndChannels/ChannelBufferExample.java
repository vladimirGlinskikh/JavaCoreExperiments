package javaExperiments.IO.buffersAndChannels;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("list.bin", "rw");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder context = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("read: " + byteRead);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    context.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
