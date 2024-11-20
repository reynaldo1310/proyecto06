package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;

public class PerroTest {

    @Test
    void testComer() {
        Perro perro = new Perro(45.5);

        perro.comer(34.2);

        assertEquals(79.7, perro.getPeso(), 0.000001);
    }

    @Test 
    void TestCompararColeccionesVerdad() {



    }

    @Test
    void TestCompararColeccionesFalse() {

    }

    public boolean comparar(List<Perro> lista1, List<Perro> lista2) {
        if (lista1 == null && lista2 == null){
            return true;
        } else if(lista1 == null || lista2 == null) {
            
        }
        if (lista1 == null || lista2 == null) {
            return false;
        }

        if(lista1.size() !=  lista2.size()) {
            return false;
        }
        for (int i = 0; i < lista1.size(); i++) {
            if (! Objects.equals(lista1.get(i), lista2.get(i))) {
                return false;
            }
        }
        return true;
    }

}
