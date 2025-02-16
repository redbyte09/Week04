package com.advancereflectionquestions;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//  Define an Interface
interface Greeting {
    void sayHello();
}

// Implement the Interface
class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, Sakshi Sharma!");
    }
}

// Create a Dynamic Proxy Handler
class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging: Calling method - " + method.getName()); // Log method name
        return method.invoke(target, args); // Execute the actual method
    }
}

public class DynamicProxyExample {
    public static void main(String[] args) {
        // Create an instance of GreetingImpl
        Greeting realObject = new GreetingImpl();

        //Create a Dynamic Proxy
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(realObject)
        );

        // Call the method via Proxy
        proxyInstance.sayHello();
    }
}

