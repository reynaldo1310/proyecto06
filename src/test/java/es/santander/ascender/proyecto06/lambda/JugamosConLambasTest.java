package es.santander.ascender.proyecto06.lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
    public void testTransformarConFor() {
        for (Datos d: listaATransformar) {
            d.setEdad(d.getEdad() * 3);
        }


        assertEquals(listaATransformar.get(0).getEdad(), 9);
        assertEquals(listaATransformar.get(1).getEdad(), 240);
    }


    @Test
    public void testTransformarSinLambdas() {
        // No quiero hacer esto, sino que se busca aplicar forech del ArrayList
        // for (Datos d: listaATransformar) {
        //     d.setEdad(d.getEdad() * 3);
        // }

        listaATransformar.forEach(new Consumer<Datos>() {

            @Override
            public void accept(Datos dato) {
                dato.setEdad(dato.getEdad() * 3);
            }           
        });
        assertEquals(listaATransformar.get(0).getEdad(), 9);
        assertEquals(listaATransformar.get(1).getEdad(), 240);
        
    }
    
    @Test
    public void testTransformarConLambdas() {
        listaATransformar.forEach( 
            (d) -> d.setEdad(d.getEdad() * 3)
        );

        assertEquals(listaATransformar.get(0).getEdad(), 9);
        assertEquals(listaATransformar.get(1).getEdad(), 240);
    }
}

 