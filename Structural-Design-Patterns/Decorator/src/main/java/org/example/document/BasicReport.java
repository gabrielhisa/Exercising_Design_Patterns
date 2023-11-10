package org.example.document;

public class BasicReport implements Document{

    @Override
    public void generateReport() {
        System.out.println("Generating basic report.");
    }
}
