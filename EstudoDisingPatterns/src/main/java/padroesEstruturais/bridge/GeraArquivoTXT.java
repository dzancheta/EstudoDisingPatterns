package padroesEstruturais.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by daniel on 12/09/17.
 */
public class GeraArquivoTXT implements GeradorDeArquivo {
    public void gera(String conteudo){
        try {
            PrintStream saida = new PrintStream("arquivo.txt");
            saida.println(conteudo);
            System.out.println(conteudo);
            saida.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
