package org.example.document;

public class ColorAccessibleReport extends DocumentDecorator{

    public ColorAccessibleReport(Document document){
        super(document);
    }

    @Override
    public void generateReport(){
        super.generateReport();
        System.out.println("Generating report with accessible colors.");
    }
}
