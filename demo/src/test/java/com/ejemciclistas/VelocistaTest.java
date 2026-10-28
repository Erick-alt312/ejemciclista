package com.ejemciclistas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VelocistaTest {
    private Velocista velocista;

    @BeforeEach
    public void setUp() {
        velocista = new Velocista(1, "Fernando Gaviria", 360.0, 65.5);
    }

    @Test
    public void testAtributosIniciales() {
        assertEquals(1, velocista.getIdentificador());
        assertEquals("Fernando Gaviria", velocista.getNombre());
        assertEquals(0, velocista.getTiempoAcumulado());
        assertEquals(360.0, velocista.getPotenciaPromedio(), 0.001);
        assertEquals(65.5, velocista.getVelocidadPromedioSprint(), 0.001);
    }

    @Test
    public void testImprimirTipo() {
        assertEquals("Es un Velocista", velocista.imprimirTipo());
    }

    @Test
    public void testModificarAtributos() {
        velocista.setTiempoAcumulado(130);
        velocista.setPotenciaPromedio(380.0);
        velocista.setVelocidadPromedioSprint(70.0);

        assertEquals(130, velocista.getTiempoAcumulado());
        assertEquals(380.0, velocista.getPotenciaPromedio(), 0.001);
        assertEquals(70.0, velocista.getVelocidadPromedioSprint(), 0.001);
    }
}
