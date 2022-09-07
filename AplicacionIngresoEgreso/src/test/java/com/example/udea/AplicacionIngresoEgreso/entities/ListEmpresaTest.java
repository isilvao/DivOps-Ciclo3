package com.example.udea.AplicacionIngresoEgreso.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListEmpresaTest {

    /*
    private ListEmpresa listEmpresa;

    private void setupEscenario1(){
        listEmpresa = new ListEmpresa("Entretenimiento");
        listEmpresa.addEmpresa(new Empresa(1,"Cine Colombia", "123456789", "Calle 123", "1234567", ""));
        listEmpresa.addEmpresa(new Empresa(2,"Royal Films", "123456786", "Calle 123", "1234567", ""));

    }

    @Test
    void findEmpresa() {
        setupEscenario1();
        assertEquals(2, listEmpresa.getLista().size());
        assertNotNull(ListEmpresa.findEmpresa("123456789"));
        assertNull(ListEmpresa.findEmpresa("123456788"));
        assertEquals("Cine Colombia", ListEmpresa.findEmpresa("123456789").getNombre());
    }

    @Test
    void addEmpresa() {
        listEmpresa = new ListEmpresa("Entretenimiento");
        assertTrue(listEmpresa.addEmpresa(new Empresa(1,"Cine Colombia", "123456789", "Calle 123", "1234567", "")));
        assertFalse(listEmpresa.addEmpresa(new Empresa(2,"Royal Films", "123456789", "Calle 123", "1234567", "")));
    }

    @Test
    void updateEmpresa() {
        setupEscenario1();
        Empresa empresa = new Empresa(1,"Cinemark", "123456786", "Calle 123", "1234567", "");
        assertNotNull(listEmpresa.updateEmpresa(empresa));
        assertEquals("Cinemark", listEmpresa.findEmpresa(1).getNombre());
        Empresa empresa1 = new Empresa(2,"Cinemark", "123456788", "Calle 123", "1234567", "");
        assertNull(listEmpresa.updateEmpresa(empresa1));
    }

    @Test
    void deleteEmpresa() {
        setupEscenario1();
        assertNotNull(listEmpresa.deleteEmpresa(listEmpresa.findEmpresa(1)));
        assertEquals(1, listEmpresa.getLista().size());
        assertNotNull(listEmpresa.deleteEmpresa(listEmpresa.findEmpresa(2)));
        assertEquals(0, listEmpresa.getLista().size());
    }

     */
}
