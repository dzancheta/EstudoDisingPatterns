package padroesEstruturais.bridge;

/**
 * Created by daniel on 12/09/17.
 */
public class TesteRecibo {
    public static void main(String... args){
        GeradorDeArquivo geradorDeArquivoTXT = new GeraArquivoTXT();
        Recibo recibo = new Recibo("Dzancheta Ltda", "Daniel Zancheta", 125D, geradorDeArquivoTXT );
        recibo.geraArquivo();
    }
}
