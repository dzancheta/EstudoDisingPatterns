package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class Application{
    public static void main(String... args){
        ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();

        String transacao =  "Valor=560; senha=123";
        Emissor emissor = comunicadorFactory.createEmissor();
        emissor.envia(transacao);

        Receptor receptor = comunicadorFactory.createReceptor();
        String mensagem = receptor.recebe();
        System.out.println(mensagem);
    }
}
