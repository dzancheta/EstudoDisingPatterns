package padroesDeCriacao.factoryMethod;

/**
 * Created by daniel on 08/09/17.
 */
public class EmissorSMS implements Emissor {
    public void envia(String mensagem){
        System.out.println("Envio por SMS a mensagem: ");
        System.out.println(mensagem);
    }
}
