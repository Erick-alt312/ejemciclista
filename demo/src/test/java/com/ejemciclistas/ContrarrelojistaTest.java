package com.ejemciclistas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContrarrelojistaTest {
    private Contrarrelojista contrarrelojista;

    @BeforeEach
    public void setUp() {
        contrarrelojista = new Contrarrelojista(3, "Daniel Felipe Martinez", 61.5);
    }

    @Test
    public void testAtributosIniciales() {
        assertEquals(3, contrarrelojista.getIdentificador());
        assertEquals("Daniel Felipe Martinez", contrarrelojista.getNombre());
        assertEquals(0, contrarrelojista.getTiempoAcumulado());
        assertEquals(61.5, contrarrelojista.getVelocidadMaxima(), 0.001);
    }

    @Test
    public void testImprimirTipo() {
        assertEquals("Es un Contrarrelojista", contrarrelojista.imprimirTipo());
    }

    @Test
    public void testModificarAtributos() {
        contrarrelojista.setTiempoAcumulado(110);
        contrarrelojista.setVelocidadMaxima(64.2);

        assertEquals(110, contrarrelojista.getTiempoAcumulado());
        assertEquals(64.2, contrarrelojista.getVelocidadMaxima(), 0.001);
    }
}
