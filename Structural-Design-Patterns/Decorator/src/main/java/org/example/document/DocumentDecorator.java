package org.example.document;

abstract class DocumentDecorator implements Document{

    protected Document document;

    public DocumentDecorator(Document document){
        this.document = document;
    }

    @Override
    public void generateReport(){

    }
}
