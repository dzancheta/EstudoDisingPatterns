package padroesDeCriacao.builder;

/**
 * Created by daniel on 11/09/17.
 */
public class ApplicationSantander {
    public static void main(String... args){
        BoletoBuilder boletoBuilder = new SantanderBoletoBuilder();
        GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
        Boleto boleto = geradorDeBoleto.geraBoleto();
        System.out.println(boleto);
    }
}
