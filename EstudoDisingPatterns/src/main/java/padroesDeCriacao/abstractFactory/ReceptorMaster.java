package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class ReceptorMaster implements Receptor{
    public String recebe() {
        System.out.println("Recebendo mensagem da MasterCard");
        String mensagem = "Mensagem MasterCard";
        return mensagem;
    }
}
