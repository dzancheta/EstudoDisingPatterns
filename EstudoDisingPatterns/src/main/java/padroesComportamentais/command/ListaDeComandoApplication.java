package padroesComportamentais.command;

/**
 * Created by daniel on 13/09/17.
 */
public class ListaDeComandoApplication {
    public static void main(String... args){
        Player player = new Player();
        ListaDeComandos listaDeComandos = new ListaDeComandos();

        listaDeComandos.adiciona(new TocaMusicaComando(player, "musica1.mp3"));
        listaDeComandos.adiciona(new AumentaVolumeComando(player, 3));
        listaDeComandos.adiciona(new TocaMusicaComando(player, "musical2.mp3"));
        listaDeComandos.adiciona(new DiminuiVolumeComando(player, 3));
        listaDeComandos.adiciona(new TocaMusicaComando(player, "musica3.mp3"));

        listaDeComandos.executa();
    }
}
