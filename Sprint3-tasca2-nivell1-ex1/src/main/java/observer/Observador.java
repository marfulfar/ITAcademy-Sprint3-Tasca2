package observer;

import subject.Subject;

public abstract class Observador {


    protected Subject sujeto;

    public abstract void actualizar();

}
