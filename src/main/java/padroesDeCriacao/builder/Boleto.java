package padroesDeCriacao.builder;

import java.util.Calendar;

/**
 * Created by daniel on 11/09/17.
 */
public interface Boleto {
    String getSacado();
    String getCedente();
    double getValor();
    Calendar getVencimento();
    int getNossoNumero();
    String toString();
}
