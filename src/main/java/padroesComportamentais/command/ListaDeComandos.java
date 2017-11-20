package padroesComportamentais.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 13/09/17.
 */
public class ListaDeComandos {
    private Player player;
    private List<Comando> comandos = new ArrayList<Comando>();

    public void adiciona(Comando comando){
        this.comandos.add(comando);
    }
    public void executa(){
        for (Comando comando : this.comandos){
            comando.executa(player);
        }
    }
}
