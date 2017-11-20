package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public interface ComunicadorFactory {
    Emissor createEmissor();
    Receptor createReceptor();
}
