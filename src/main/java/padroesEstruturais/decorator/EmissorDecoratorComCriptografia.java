package padroesEstruturais.decorator;

/**
 * Created by daniel on 13/09/17.
 */
public class EmissorDecoratorComCriptografia extends EmissorDecorator {

    public EmissorDecoratorComCriptografia(Emissor emissor){
        super(emissor);
    }
    private String criptografa (String mensagem) {
        String mensagemCriptografada = new StringBuilder(mensagem).reverse().toString();
        return mensagemCriptografada;
    }

    public void envia(String mensagem) {
        System.out.println("Enviando mensagem criptografada: ");
        this.getEmissor().envia(criptografa(mensagem));
    }
}
