package padroesDeCriacao.factoryMethod;

/**
 * Created by daniel on 08/09/17.
 */
public class EmissorEmail implements Emissor {
    public void envia(String mensagem){
        System.out.println("Enviando por Email a mensagem: ");
        System.out.println(mensagem);
    }
}
