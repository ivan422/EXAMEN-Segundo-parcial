package test;

import examenhash.Hash;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestHash {

    Hash pruebas = new Hash();

    @Test
    public void testHash1() {
        assertEquals(28, pruebas.sumarDigitos(58771));
        assertEquals(10, pruebas.hashSimple(58771));
        assertEquals("Excelente", pruebas.calificacion(58771));
    }

    @Test
    public void testHash2() {
        assertEquals(27, pruebas.sumarDigitos(56448));
        assertEquals(9, pruebas.hashSimple(56448));
        assertEquals("Aprovado", pruebas.calificacion(56448));
    }
    
    @Test
    public void testHash3Mio() {
        assertEquals(25, pruebas.sumarDigitos(58804));
        assertEquals(7, pruebas.hashSimple(58804));
        assertEquals("Aprovado", pruebas.calificacion(58804));
    }
    
    @Test
    public void testHash4() {
        assertEquals(29, pruebas.sumarDigitos(56585));
        assertEquals(11, pruebas.hashSimple(56585));
        assertEquals("Excelente", pruebas.calificacion(56585));
    }
    
    @Test
    public void testHash5() {
        assertEquals(30, pruebas.sumarDigitos(58755));
        assertEquals(3, pruebas.hashSimple(58755));
        assertEquals("Reprobado", pruebas.calificacion(58755));
    }
    
}
