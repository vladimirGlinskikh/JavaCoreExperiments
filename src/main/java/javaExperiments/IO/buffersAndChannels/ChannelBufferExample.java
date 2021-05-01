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

            String text = "\nEducation is a progressive discovery of our own ignorance. " +
                    "William James \"Will\" Durant";
//            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length);
//            buffer1.put(text.getBytes());
//            buffer1.flip();
//            channel.write(buffer1);

            ByteBuffer buffer1 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
