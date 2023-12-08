package com.solvd.university.student.thread;

public class Client implements Runnable {

    @Override
    public void run() {
        try {
            Connection connection = ConnectionPool.getInstance().getConnection();

            // Simulate some work with the connection
            Thread.sleep(1000);

            ConnectionPool.getInstance().releaseConnection(connection);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create 10 threads
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Client(), "Thread-" + (i + 1));
            thread.start();
        }
    }
}