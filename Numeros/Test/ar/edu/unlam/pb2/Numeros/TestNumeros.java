package ar.edu.unlam.pb2.Numeros;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestNumeros {

	@Test
	public void testParaObtenerCantidadDeElementosDeLaLista() {
		List<Integer>  miLista = new LinkedList<>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
            
        //1. miLista tiene 8 elementos
        
        Integer obtenido = miLista.size();
        Integer esperado = 8;
        assertEquals(esperado, obtenido);
        
	}
	
	@Test
	public void testParacomprobarLaPosicion(){
		List<Integer>  miLista = new LinkedList<>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
            
        Integer obtenido = miLista.get(3);
        Integer esperado = 4;
        assertEquals(esperado, obtenido);
		
	}
}
	
	/*//2. el cuarto elemento es 4

    // ¿que pasa en este caso?
    //miLista.add(2,2);

    //3. ¿Como probarias lo que paso anterior?

    // ¿que pasa en este caso?
    //miLista.remove(8);

    // ¿que prueba se te ocurre?
}*/


