package org.example.adapter;

import org.example.duo.DoubleSocket;
import org.example.triple.TriplePlugCharger;
import org.example.triple.TriplePlugSocket;

public class Adapter extends TriplePlugSocket {

    private DoubleSocket socket;

    public Adapter(DoubleSocket doubleSocket){
        socket = doubleSocket;
    }

    @Override
    public boolean fits(TriplePlugCharger charger){
        return socket.getNumberOfHoles() <= charger.getNumberOfPlugs();
    }
}
