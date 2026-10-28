package com.ejemciclistas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquipoTest {
    private Equipo equipo;
    private Velocista v;
    private Escalador e;
    private Contrarrelojista c;

    @BeforeEach
    public void setUp() {
        equipo = new Equipo("Movistar Team", "Colombia");

        v = new Velocista(101, "Fernando Gaviria", 360.0, 68.0);
        v.setTiempoAcumulado(120);

        e = new Escalador(102, "Nairo Quintana", 3.8f, 15.0f);
        e.setTiempoAcumulado(110);

        c = new Contrarrelojista(103, "Rigoberto Uran", 60.0);
        c.setTiempoAcumulado(115);
    }

    @Test
    public void testCrearEquipo() {
        assertEquals("Movistar Team", equipo.getNombreEquipo());
        assertEquals("Colombia", equipo.getPais());
        assertEquals(0, equipo.getCiclistas().size());
    }

    @Test
    public void testAñadirCiclistas() {
        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        assertEquals(3, equipo.getCiclistas().size());
    }

    @Test
    public void testCalcularTotalTiempo() {
        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        int total = equipo.calcularTotalTiempo();
        assertEquals(345, total);
        assertEquals(345, Equipo.getTiempoTotalEquipo());
    }

    @Test
    public void testBuscarCiclistaPorIdExiste() {
        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);

        // No lanza excepción al invocar
        assertDoesNotThrow(() -> equipo.imprimirDatosCiclistaPorId(101));
    }

    @Test
    public void testBuscarCiclistaPorIdNoExiste() {
        equipo.añadirCiclista(v);

        // No lanza excepción con un ID inexistente
        assertDoesNotThrow(() -> equipo.imprimirDatosCiclistaPorId(999));
    }

    @Test
    public void testListarNombresCiclistas() {
        assertDoesNotThrow(() -> equipo.listarNombresCiclistas());
        equipo.añadirCiclista(v);
        assertDoesNotThrow(() -> equipo.listarNombresCiclistas());
    }
}
