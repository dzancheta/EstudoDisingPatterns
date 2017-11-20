package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class EmissorCreator {
    public static final int Visa = 0;
    public static final int MasterCard = 1;

    public Emissor create(int tipoDoEmissor){
        if(tipoDoEmissor == EmissorCreator.Visa){
            return new EmissorVisa();
        }else if (tipoDoEmissor == EmissorCreator.MasterCard){
            return new EmissorMasterCard();
        }else{
            throw new IllegalArgumentException("Tipo de emissor não suportado!");
        }
    }
}
