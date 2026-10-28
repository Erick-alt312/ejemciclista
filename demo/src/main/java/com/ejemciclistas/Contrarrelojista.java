package com.ejemciclistas;

/**
 * Subclase concreta que representa a un ciclista especialista en pruebas contra el reloj.
 * Hereda de Ciclista e incorpora el atributo velocidad maxima en km/h.
 */
public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    /**
     * Constructor de la clase Contrarrelojista.
     * Invoca al constructor de la superclase Ciclista.
     *
     * @param identificador   Identificador unico del ciclista
     * @param nombre          Nombre del ciclista
     * @param velocidadMaxima Velocidad maxima en km/h (double)
     */
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Retorna el tipo de ciclista.
     *
     * @return Texto descriptivo del tipo de ciclista.
     */
    @Override
    protected String imprimirTipo() {
        return "Es un Contrarrelojista";
    }

    /**
     * Imprime en pantalla los datos del ciclista contrarrelojista,
     * invocando al metodo de la clase padre e imprimiendo su propio atributo.
     */
    @Override
    protected void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
    }
}
