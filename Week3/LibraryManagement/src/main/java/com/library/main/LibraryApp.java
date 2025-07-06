package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {
        // Load Spring context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean
        BookService service = (BookService) context.getBean("bookService");

        // Call method
        service.addBook("Ikigai");
        service.addBook("Atomic Habits");

        // Close the context (good practice)
        ((ClassPathXmlApplicationContext) context).close();
    }
}
