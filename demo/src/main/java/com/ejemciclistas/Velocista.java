package com.ejemciclistas;

/**
 * Subclase concreta que representa a un ciclista velocista (sprinter).
 * Hereda de Ciclista e incorpora atributos de potencia y velocidad promedio en sprint.
 */
public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    /**
     * Constructor de la clase Velocista.
     * Invoca al constructor de la superclase Ciclista.
     *
     * @param identificador           Identificador unico del ciclista
     * @param nombre                  Nombre del ciclista
     * @param potenciaPromedio        Potencia promedio en vatios (W)
     * @param velocidadPromedioSprint Velocidad promedio en sprint (km/h)
     */
    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    /**
     * Retorna el tipo de ciclista.
     *
     * @return Texto descriptivo del tipo de ciclista.
     */
    @Override
    protected String imprimirTipo() {
        return "Es un Velocista";
    }

    /**
     * Imprime en pantalla los datos del ciclista velocista,
     * invocando al metodo de la clase padre e imprimiendo sus propios atributos.
     */
    @Override
    protected void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Potencia promedio: " + potenciaPromedio + " vatios");
        System.out.println("Velocidad promedio sprint: " + velocidadPromedioSprint + " km/h");
    }
}
