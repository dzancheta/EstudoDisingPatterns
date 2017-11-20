package padroesComportamentais.command;

/**
 * Created by daniel on 13/09/17.
 */
public class DiminuiVolumeComando implements Comando {
    private Player player;
    private int levels;

    public DiminuiVolumeComando(Player player, int levels) {
        this.player = player;
        this.levels = levels;
    }

    public void executa(Player player) {
        this.player.decreaseVolume(this.levels);
    }
}
