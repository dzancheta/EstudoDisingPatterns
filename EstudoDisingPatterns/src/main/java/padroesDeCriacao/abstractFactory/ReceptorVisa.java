package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class ReceptorVisa implements Receptor{
    public String recebe(){
        System.out.println("Recebendo mensagem da visa");
        String mensagem = "Mensagem da Visa";
        return mensagem;
    }
}
