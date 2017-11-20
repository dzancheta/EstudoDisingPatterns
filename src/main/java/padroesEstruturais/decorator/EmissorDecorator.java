package padroesEstruturais.decorator;

/**
 * Created by daniel on 13/09/17.
 */
public class EmissorDecorator implements Emissor {
    private Emissor emissor;

    public EmissorDecorator(Emissor emissor){
        this.emissor = emissor;
    }

    public void envia(String mensagem) {

    }

    public Emissor getEmissor(){
        return this.emissor;
    }
}
