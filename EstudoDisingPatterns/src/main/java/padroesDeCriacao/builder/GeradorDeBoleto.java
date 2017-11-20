package padroesDeCriacao.builder;

import java.util.Calendar;

/**
 * Created by daniel on 11/09/17.
 */
public class GeradorDeBoleto {
    private BoletoBuilder boletoBuilder;

    public GeradorDeBoleto(BoletoBuilder boletoBuilder){
        this.boletoBuilder = boletoBuilder;
    }

    public Boleto geraBoleto(){
        this.boletoBuilder.buildSacado("Daniel Zancheta");
        this.boletoBuilder.buildCedente("Domino Night Club");
        this.boletoBuilder.buildValor(250D);
        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 30);
        this.boletoBuilder.buildVencimento(vencimento);
        this.boletoBuilder.buildNossoNumero(414);

        Boleto boleto = boletoBuilder.getBoleto();

        return boleto;
    }

}
