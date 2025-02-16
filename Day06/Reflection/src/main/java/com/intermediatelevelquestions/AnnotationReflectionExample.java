package com.intermediatelevelquestions;

// Import annotation package
import java.lang.annotation.*;
// Import reflection package
import java.lang.reflect.*;

// Define a custom annotation
// Make it available at runtime
@Retention(RetentionPolicy.RUNTIME)
// Can only be applied to classes
@Target(ElementType.TYPE)
@interface Author {
    String name();  // Annotation parameter
}

// Apply the annotation to a class
@Author(name = "Sakshi Sharma")
class Book {
    void display() {
        System.out.println("Book class method is called.");
    }
}

public class AnnotationReflectionExample {
    public static void main(String[] args) {
        try {
            //  Get the Class object of Book
            Class<?> bookClass = Book.class;

            // Check if @Author annotation is present
            if (bookClass.isAnnotationPresent(Author.class)) {
                // Retrieve the annotation
                Author author = bookClass.getAnnotation(Author.class);

                // Display the annotation value
                System.out.println("Author Name: " + author.name());
            } else {
                System.out.println("No Author annotation found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

