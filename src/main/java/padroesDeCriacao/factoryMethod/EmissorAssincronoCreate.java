package padroesDeCriacao.factoryMethod;

/**
 * Created by daniel on 08/09/17.
 */
public class EmissorAssincronoCreate extends EmissorCreate {
    public Emissor create(int tipoDeEmissor){
        if(tipoDeEmissor == EmissorCreate.SMS){
            return new EmissorSMS();
        }else if(tipoDeEmissor == EmissorCreate.Email){
            return new EmissorEmail();
        }else if(tipoDeEmissor == EmissorCreate.JMS){
            return new EmissorJMS();
        }else throw new IllegalArgumentException("Tipo de emissor não suportado");
    }
}
