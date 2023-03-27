package org.example;

import agents.BorsaAgentA;
import agents.BorsaAgentB;
import subject.Subject;

public class Main {
    public static void main(String[] args) {


        Subject wheat = new Subject("wheat");
        Subject soy = new Subject("soy");

        new BorsaAgentA(soy);
        new BorsaAgentA(wheat);

        new BorsaAgentB(wheat);


        System.out.println("Stock Prices");
        System.out.println("*******************\n");
        wheat.setEstado(10);
        soy.setEstado(20);


        System.out.println("\n*******************\nPrice raised 10 €\n*******************\n");
        wheat.setEstado(20);








    }
}