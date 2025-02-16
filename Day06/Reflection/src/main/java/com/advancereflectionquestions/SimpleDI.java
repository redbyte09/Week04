package com.advancereflectionquestions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

// Create @Inject annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

//  Create a Simple Service class
class Service {
    void showMessage() {
        System.out.println("🚀 Service is working!");
    }
}

// Create a Client class that needs Service
class Client {
    // Mark this field for injection
    @Inject
    Service service;

    void run() {
        // Use the injected service
        service.showMessage();
    }
}

//  Simple Dependency Injection (DI) Container
class DIContainer {
    static void inject(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    field.setAccessible(true);
                    // Inject Service instance
                    field.set(obj, new Service());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

//  Main method to test DI
public class SimpleDI {
    public static void main(String[] args) {
        // Create Client object
        Client client = new Client();
        // Inject dependencies
        DIContainer.inject(client);
        client.run();
    }
}

