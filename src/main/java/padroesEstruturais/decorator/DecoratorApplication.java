package padroesEstruturais.decorator;

/**
 * Created by daniel on 13/09/17.
 */
public class DecoratorApplication {
    public static void main(String... args){
        String mensagem = "TESTE";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);

        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);

        Emissor emissorComptCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao( new EmissorBasico()));
        emissorComptCompr.envia(mensagem);
    }
}
