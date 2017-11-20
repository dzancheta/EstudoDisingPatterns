package padroesComportamentais.mediator;

/**
 * Created by daniel on 14/09/17.
 */
public class Passageiro  implements Runnable{
    private CentralDeTaxi central;
    private String nome;

    public Passageiro(CentralDeTaxi central, String nome) {
        this.central = central;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void run(){
        for (int i = 0; i < 5; i++){
            this.central.pedeTaxi(this);
        }
    }
}
