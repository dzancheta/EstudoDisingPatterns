package padroesEstruturais.decorator;

/**
 * Created by daniel on 13/09/17.
 */
public class EmissorBasico implements Emissor {
    public void envia(String mensagem){
        System.out.println("Enviando uma mensagem: ");
        System.out.println(mensagem);
    }
}
