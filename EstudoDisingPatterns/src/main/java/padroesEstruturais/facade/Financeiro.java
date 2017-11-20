package padroesEstruturais.facade;

/**
 * Created by daniel on 13/09/17.
 */
public class Financeiro {
    public void fatura(String cliente, String produto){
        System.out.println("Fatura: ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Produto: " + produto);
    }
}
