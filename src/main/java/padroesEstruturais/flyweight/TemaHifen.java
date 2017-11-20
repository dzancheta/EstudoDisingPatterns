package padroesEstruturais.flyweight;

import java.util.Arrays;

/**
 * Created by daniel on 13/09/17.
 */
public class TemaHifen implements TemaFlyweight {
    public void imprime(String titulo, String texto){
        System.out.println("---------- " + titulo + " -----------");
        System.out.println(texto);

        char[] rodape = new char[22 + titulo.length()];
        Arrays.fill(rodape, '-');
        System.out.println(rodape);
    }
}
