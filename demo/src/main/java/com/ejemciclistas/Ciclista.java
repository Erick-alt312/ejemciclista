package com.ejemciclistas;

/**
 * Clase abstracta que modela un ciclista en una competencia ciclistica.
 * Contiene los atributos base: identificador, nombre y tiempo acumulado en minutos.
 */
public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado;

    /**
     * Constructor para inicializar un ciclista con su identificador y nombre.
     * El tiempo acumulado inicia en cero minutos.
     *
     * @param identificador Identificador unico del ciclista (tipo int)
     * @param nombre        Nombre completo del ciclista (tipo String)
     */
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    /**
     * Metodo abstracto que retorna la especialidad o tipo de ciclista.
     * Cada subclase concreta debe implementar este metodo retornando "Es un xxx".
     *
     * @return String con el tipo de ciclista
     */
    protected abstract String imprimirTipo();

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    /**
     * Imprime en pantalla los datos generales del ciclista.
     */
    protected void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado + " minutos");
    }
}
