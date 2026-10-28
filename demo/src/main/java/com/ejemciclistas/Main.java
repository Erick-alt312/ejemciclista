package com.ejemciclistas;

import java.util.Scanner;

/**
 * Clase principal que ejecuta la simulacion de la carrera ciclistica.
 * Crea el equipo, registra ciclistas de diferentes especialidades,
 * calcula tiempos, lista participantes y permite la consulta por ID.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("   GESTION DE CARRERA CICLISTICA - UNIAJC              ");
        System.out.println("========================================================\n");

        // 1. Instanciar el equipo ciclista
        Equipo equipo = new Equipo("Movistar Team", "Colombia");

        // 2. Instanciar ciclistas de diferentes especialidades con sus tiempos acumulados
        Velocista velocista = new Velocista(101, "Fernando Gaviria", 365.0, 68.5);
        velocista.setTiempoAcumulado(120);

        Escalador escalador = new Escalador(102, "Nairo Quintana", 3.85f, 15.5f);
        escalador.setTiempoAcumulado(110);

        Contrarrelojista contrarrelojista = new Contrarrelojista(103, "Daniel Felipe Martinez", 59.2);
        contrarrelojista.setTiempoAcumulado(115);

        // 3. Agregar los ciclistas al equipo
        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);
        equipo.añadirCiclista(contrarrelojista);

        // 4. Imprimir la informacion consolidada del equipo y sus integrantes
        equipo.imprimirDatosEquipo();

        // 5. Listar los nombres de todos los ciclistas
        equipo.listarNombresCiclistas();

        // 6. Busqueda de un ciclista dado su identificador ingresado por teclado
        System.out.println("\n--------------------------------------------------------");
        System.out.print("Ingrese el identificador del ciclista a buscar: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            equipo.imprimirDatosCiclistaPorId(id);
        } else {
            System.out.println("Error: El identificador ingresado no es valido.");
        }
        scanner.close();
    }
}
