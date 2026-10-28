package com.ejemciclistas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un equipo ciclista.
 * Contiene el nombre del equipo, pais, tiempo total acumulado (estatico)
 * y una lista dinamica de sus ciclistas integrantes.
 */
public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo = 0;
    private List<Ciclista> ciclistas;

    /**
     * Constructor de la clase Equipo.
     *
     * @param nombreEquipo Nombre del equipo ciclista
     * @param pais         Pais de procedencia del equipo
     */
    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    protected String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    public static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public static void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public List<Ciclista> getCiclistas() {
        return ciclistas;
    }

    /**
     * Anade un ciclista a la coleccion del equipo.
     *
     * @param ciclista Objeto ciclista a ingresar.
     */
    public void añadirCiclista(Ciclista ciclista) {
        if (ciclista != null) {
            ciclistas.add(ciclista);
        }
    }

    /**
     * Metodo alternativo sin caracter especial 'ñ' para compatibilidad.
     *
     * @param ciclista Objeto ciclista a ingresar.
     */
    public void anadirCiclista(Ciclista ciclista) {
        añadirCiclista(ciclista);
    }

    /**
     * Calcula la suma de los tiempos de carrera de todos los ciclistas del equipo
     * y actualiza el atributo estatico tiempoTotalEquipo.
     *
     * @return Suma de tiempos acumulados en minutos.
     */
    public int calcularTotalTiempo() {
        int total = 0;
        for (Ciclista ciclista : ciclistas) {
            total += ciclista.getTiempoAcumulado();
        }
        tiempoTotalEquipo = total;
        return tiempoTotalEquipo;
    }

    /**
     * Imprime en pantalla todos los datos generales del equipo y de sus ciclistas.
     */
    public void imprimirDatosEquipo() {
        calcularTotalTiempo();
        System.out.println("=========================================");
        System.out.println("            DATOS DEL EQUIPO             ");
        System.out.println("=========================================");
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("Pais de origen: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo + " minutos");
        System.out.println("Cantidad de ciclistas: " + ciclistas.size());
        System.out.println("-----------------------------------------");
        System.out.println("Detalle de ciclistas integrantes:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("-----------------------------------------");
            ciclista.imprimirDatos();
        }
        System.out.println("=========================================\n");
    }

    /**
     * Lista unicamente los nombres de todos los ciclistas que conforman el equipo.
     */
    public void listarNombresCiclistas() {
        System.out.println("Ciclistas pertenecientes al equipo '" + nombreEquipo + "':");
        if (ciclistas.isEmpty()) {
            System.out.println("(El equipo aun no tiene ciclistas asignados)");
            return;
        }
        for (Ciclista ciclista : ciclistas) {
            System.out.println("- " + ciclista.getNombre() + " (" + ciclista.imprimirTipo() + ")");
        }
    }

    /**
     * Busca un ciclista por su identificador e imprime en pantalla sus datos.
     * Si no existe, muestra el mensaje correspondiente.
     *
     * @param id Identificador numerico del ciclista buscado.
     */
    public void imprimirDatosCiclistaPorId(int id) {
        boolean encontrado = false;
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == id) {
                System.out.println("\n[+] Ciclista localizado con ID " + id + ":");
                ciclista.imprimirDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\n[-] El ciclista con identificador " + id + " no se encuentra en el equipo.");
        }
    }
}
