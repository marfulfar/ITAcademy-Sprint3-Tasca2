package subject;

import observer.Observador;

import java.util.ArrayList;

public class Subject {


    private ArrayList<Observador> observadores = new ArrayList<Observador>();
    private int estado;

    private String name;

    public Subject(String name) {
    this.name=name;
    }

    public Subject(String name, ArrayList<Observador> observadores, int estado) {
        this.name = name;
        this.observadores = observadores;
        this.estado = estado;
    }

    public String getName() {
        return name;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        notificarTodosObservadores();
    }

    public void agregar(Observador obs){
        observadores.add(obs);
    }




    public void notificarTodosObservadores(){
        for (Observador obs:observadores) {
            obs.actualizar();
        }
    }

    public ArrayList<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(ArrayList<Observador> observadores) {
        this.observadores = observadores;
    }


}
