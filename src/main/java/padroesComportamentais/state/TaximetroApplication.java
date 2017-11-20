package padroesComportamentais.state;

/**
 * Created by daniel on 14/09/17.
 */
public class TaximetroApplication {
    public static void main(String... args){
        Bandeira b1 = new Bandeira1();
        Bandeira b2 = new Bandeira2();

        Taximetro taximetro = new Taximetro(b1);

        double valor1 = taximetro.calculaValorDaCorrida(5,10);
        System.out.println("Valor da corrida em bandeira 1: " + valor1);

        taximetro.setBandeira(b2);

        double valor2 = taximetro.calculaValorDaCorrida(5,10);
        System.out.println("Valor da corrida em bandeira 1: " + valor2);
    }
}
