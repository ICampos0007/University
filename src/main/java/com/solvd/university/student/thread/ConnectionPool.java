package com.solvd.university.student.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ConnectionPool {
    private static final Logger logger = LogManager.getLogger(ConnectionPool.class);
    private static ConnectionPool connectionPool = null;
    private List<Connection> connections = new ArrayList<>();

    private ConnectionPool() {
        IntStream.range(1, 5).forEach(i -> {
            Connection connection = new Connection();
            connection.setName("Connection " + i);
            connections.add(connection);
        });
    }

    public static synchronized ConnectionPool getInstance() {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
        }
        return connectionPool;
    }

    public synchronized Connection getConnection() throws InterruptedException {
        while (connections.isEmpty()) {
            // Check if the number of active connections is already at the maximum (5)
            if (inUseConnections() >= 5) {
                logger.warn("Thread " + Thread.currentThread().getName() +
                        " is waiting because the maximum number of connections is reached.");
                wait();
            } else {
                // Wait until a connection becomes available
                wait(1000);
            }
        }

        Connection connection = connections.remove(0);

        logger.info("Thread " + Thread.currentThread().getName() +
                " acquired connection: " + connection.getName());

        return connection;
    }

    public synchronized void releaseConnection(Connection connection) {
        connections.add(connection);

        logger.info("Thread " + Thread.currentThread().getName() +
                " released connection: " + connection.getName());
    }

    // Add a method to get the number of connections in use
    private int inUseConnections() {
        return connections.size();
    }
}
