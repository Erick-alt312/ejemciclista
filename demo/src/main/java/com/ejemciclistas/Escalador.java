package com.ejemciclistas;

/**
 * Subclase concreta que representa a un ciclista escalador (especialista en montana).
 * Hereda de Ciclista e incorpora aceleracion promedio en subida y grado de rampa.
 */
public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampa;

    /**
     * Constructor de la clase Escalador.
     * Invoca al constructor de la superclase Ciclista.
     *
     * @param identificador       Identificador unico del ciclista
     * @param nombre              Nombre del ciclista
     * @param aceleracionPromedio Aceleracion promedio en subida en m/s^2 (float)
     * @param gradoRampa          Grado de rampa soportada en grados (float)
     */
    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    /**
     * Retorna el tipo de ciclista.
     *
     * @return Texto descriptivo del tipo de ciclista.
     */
    @Override
    protected String imprimirTipo() {
        return "Es un Escalador";
    }

    /**
     * Imprime en pantalla los datos del ciclista escalador,
     * invocando al metodo de la clase padre e imprimiendo sus propios atributos.
     */
    @Override
    protected void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Aceleracion promedio en subida: " + aceleracionPromedio + " m/s^2");
        System.out.println("Grado de rampa soportada: " + gradoRampa + " grados");
    }
}
