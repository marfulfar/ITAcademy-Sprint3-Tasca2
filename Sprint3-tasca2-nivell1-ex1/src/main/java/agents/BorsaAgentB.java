package agents;

import observer.Observador;
import subject.Subject;

public class BorsaAgentB extends Observador {


    protected int preu = 33;


    public BorsaAgentB(Subject subject) {
        this.sujeto = subject;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Preu del "+ sujeto.getName()+ " Borsa Agent B: " + (preu + sujeto.getEstado()));
    }

}
