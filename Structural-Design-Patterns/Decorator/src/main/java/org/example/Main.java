package org.example;

import org.example.document.BasicReport;
import org.example.document.ColorAccessibleReport;
import org.example.document.Document;
import org.example.document.DyslexiaFriendlyReport;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Creating a basic report
        Document basicReport = new BasicReport();

        basicReport.generateReport();

        // Creating decorated reports
        Document colorAccessibleReport = new ColorAccessibleReport(basicReport);
        colorAccessibleReport.generateReport();

        Document dyslexiaFriendlyReport = new DyslexiaFriendlyReport(basicReport);
        dyslexiaFriendlyReport.generateReport();






    }
}