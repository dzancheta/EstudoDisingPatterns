package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class AplicationMaster {
    public static void main(String... args){
        ComunicadorFactory comunicadorFactory = new MasterCardComunicadorFactory();

        String transacao =  "Valor=370; senha=12345";
        Emissor emissor = comunicadorFactory.createEmissor();
        emissor.envia(transacao);

        Receptor receptor = comunicadorFactory.createReceptor();
        String mensagem = receptor.recebe();
        System.out.println(mensagem);
    }
}
