package org.example.triple;

public class TriplePlugSocket {

    private int numberOfHoles;

    public TriplePlugSocket(){

    }

    public TriplePlugSocket(int holes){
        numberOfHoles = holes;
    }

    public int getNumberOfHoles(){
        return numberOfHoles;
    }

    public boolean fits(TriplePlugCharger charger){
        return this.getNumberOfHoles() == charger.getNumberOfPlugs();
    }
}
