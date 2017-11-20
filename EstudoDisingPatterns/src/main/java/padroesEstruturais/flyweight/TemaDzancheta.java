package padroesEstruturais.flyweight;

import java.util.Arrays;

/**
 * Created by daniel on 13/09/17.
 */
public class TemaDzancheta implements TemaFlyweight {
    public void imprime(String titulo, String texto){
        System.out.println("####### " + titulo.toUpperCase()+ " #######");
        System.out.println(texto);
        char[] rodapeE = new char[(int) Math.floor((6 + titulo.length())/ 2.0)];
        char[] rodapeD = new char[(int) Math.ceil((6 + titulo.length())/ 2.0)];
        Arrays.fill(rodapeE, '#');
        Arrays.fill(rodapeD, '#');
        System.out.println(new String(rodapeE) + " www.teste.com.br " + new String(rodapeD));
    }
}
