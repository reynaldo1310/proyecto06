package es.santander.ascender.proyecto06.lambda;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class JugamosConLambasTest {
    private List<Datos> listaATransformar;

    @BeforeEach
    public void setup() {
        listaATransformar = new ArrayList<>();

        listaATransformar.add(new Datos(3, "Juan"));    
        listaATransformar.add(new Datos(80, "Antonio"));

    }

    @Test
    public void testTransformarSinLambdas() {
        for (Datos d: listaATransformar) {
            d.setEdad(d.getEdad() * 3);
        }
    
        listaATransformar.forEach(newConsumer<Datos>() {



        });
    }




}
