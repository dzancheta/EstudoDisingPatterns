package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class ReceptorCreator {
    public static final int Visa = 0;
    public static final int Master = 1;

    public Receptor create(int tipoDoCreator){
        if(tipoDoCreator == ReceptorCreator.Visa){
            return new ReceptorVisa();
        }else if(tipoDoCreator == ReceptorCreator.Master){
            return new ReceptorMaster();
        }else {
            throw new IllegalArgumentException("Tipo de receptor não suportado!");
        }
    }
}
