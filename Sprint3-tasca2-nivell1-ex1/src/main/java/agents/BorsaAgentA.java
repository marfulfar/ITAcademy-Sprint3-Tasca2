package agents;

import observer.Observador;
import subject.Subject;

public class BorsaAgentA extends Observador {


    private int preu = 10;

    public BorsaAgentA(Subject subject) {
        this.sujeto = subject;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {

        System.out.println("Preu del "+ sujeto.getName()+"  Borsa Agent A: " + (preu + sujeto.getEstado()));
    }

}
