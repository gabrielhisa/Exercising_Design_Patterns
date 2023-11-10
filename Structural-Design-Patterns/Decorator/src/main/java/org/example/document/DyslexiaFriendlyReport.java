package org.example.document;

public class DyslexiaFriendlyReport extends DocumentDecorator{

    public DyslexiaFriendlyReport(Document document){
        super (document);
    }

    @Override
    public void generateReport(){
        System.out.println("Generating dyslexia friendly report.");
    }
}
