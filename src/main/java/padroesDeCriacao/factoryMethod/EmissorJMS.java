package padroesDeCriacao.factoryMethod;

/**
 * Created by daniel on 08/09/17.
 */
public class EmissorJMS implements Emissor {
    public void envia(String mensagem){
        System.out.println("Envia por JMS a mensagem: ");
        System.out.println(mensagem);
    }
}
