package com.ejemciclistas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EscaladorTest {
    private Escalador escalador;

    @BeforeEach
    public void setUp() {
        escalador = new Escalador(2, "Nairo Quintana", 3.8f, 15.0f);
    }

    @Test
    public void testAtributosIniciales() {
        assertEquals(2, escalador.getIdentificador());
        assertEquals("Nairo Quintana", escalador.getNombre());
        assertEquals(0, escalador.getTiempoAcumulado());
        assertEquals(3.8f, escalador.getAceleracionPromedio(), 0.001f);
        assertEquals(15.0f, escalador.getGradoRampa(), 0.001f);
    }

    @Test
    public void testImprimirTipo() {
        assertEquals("Es un Escalador", escalador.imprimirTipo());
    }

    @Test
    public void testModificarAtributos() {
        escalador.setTiempoAcumulado(115);
        escalador.setAceleracionPromedio(4.1f);
        escalador.setGradoRampa(18.0f);

        assertEquals(115, escalador.getTiempoAcumulado());
        assertEquals(4.1f, escalador.getAceleracionPromedio(), 0.001f);
        assertEquals(18.0f, escalador.getGradoRampa(), 0.001f);
    }
}
