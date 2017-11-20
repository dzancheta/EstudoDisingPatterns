package padroesDeCriacao.builder;

import java.util.Calendar;

/**
 * Created by daniel on 11/09/17.
 */
public interface BoletoBuilder {
    void buildSacado (String sacado);
    void buildCedente (String cedente);
    void buildValor( double valor);
    void buildVencimento(Calendar vencimento);
    void buildNossoNumero(int nossoNumero);

    Boleto getBoleto();
}
