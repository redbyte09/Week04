package com.pipedstreanquestion;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            // Create piped input and output streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Create writer and reader threads
            Thread writerThread = new Thread(new WriterThread(pos));
            Thread readerThread = new Thread(new ReaderThread(pis));

            // Start both threads
            writerThread.start();
            readerThread.start();

            // Wait for both threads to finish
            writerThread.join();
            readerThread.join();

            System.out.println("Inter-thread communication completed successfully!");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Writer Thread - writes data to the PipedOutputStream
class WriterThread implements Runnable {
    private final PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            outputStream.write(message.getBytes());  // Writing data to pipe
            outputStream.close();  // Close stream after writing
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Reader Thread - reads data from the PipedInputStream
class ReaderThread implements Runnable {
    private final PipedInputStream inputStream;

    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);  // Read data from pipe

            if (bytesRead != -1) {
                String receivedMessage = new String(buffer, 0, bytesRead);
                System.out.println("Received Message: " + receivedMessage);
            }

            inputStream.close();  // Close stream after reading
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
