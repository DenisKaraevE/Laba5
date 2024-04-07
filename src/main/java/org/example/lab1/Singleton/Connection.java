package org.example.lab1.Singleton;

public class Connection {
    private static Connection instance = null;

    private Connection() {}

    public static Connection getInstance() {
        if(null != instance)
            return instance;

        instance = new Connection();
        return instance;
    }
}
