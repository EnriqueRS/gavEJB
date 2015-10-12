package es.gav.excepciones;

/**
 * Clase que gestiona las excepciones posibles para el módulo de pujador
 * @author Enrique Ríos Santos
 */
public class PujadorExcepcion extends Exception {

    public PujadorExcepcion() {
    }

    public PujadorExcepcion(String msg) {
        super(msg);
    }
}
