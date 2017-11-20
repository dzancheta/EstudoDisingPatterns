package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class MasterCardComunicadorFactory implements ComunicadorFactory{
    private EmissorCreator emissorCreator = new EmissorCreator();
    private ReceptorCreator receptorCreator = new ReceptorCreator();

    public Emissor createEmissor(){
        return emissorCreator.create(EmissorCreator.MasterCard);
    }
    public Receptor createReceptor(){
        return receptorCreator.create(ReceptorCreator.Master);
    }
}
