package org.example;

import org.example.adapter.Adapter;
import org.example.duo.DoubleSocket;
import org.example.triple.TriplePlugCharger;
import org.example.triple.TriplePlugSocket;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------------------------
        // Checking if the triple plug works with the triple socket
        TriplePlugCharger charger = new TriplePlugCharger(3);
        TriplePlugSocket socket = new TriplePlugSocket(3);

        if (socket.fits(charger)){
            System.out.println("The triple plugged charger fits the triple holed socket.");
        }

        // ---------------------------------------------------------------------------------------------------
        // Checking if the triple plug works with the double socket
        DoubleSocket doubleSocket = new DoubleSocket(2);

        // charger.fits(doubleSocket);
        // Method cannot be called

        // ---------------------------------------------------------------------------------------------------
        // Calling the adapter method
        Adapter adapter = new Adapter(doubleSocket);
        if (adapter.fits(charger)){
            System.out.println("The triple plugged charger fits the bouble holed socket, using an adapter.");
        } else {
            System.out.println("The tripled plugged charger could not be used with the double holed socket.");
        }




    }
}