package padroesEstruturais.composite;

/**
 * Created by daniel on 12/09/17.
 */
public class TrechoAndando implements Trecho {
    private String direcao;
    private double distancia;

    public TrechoAndando(String direcao, double destiancia) {
        this.direcao = direcao;
        this.distancia = destiancia;
    }

    public void imprime(){
        System.out.println("Vá andando: ");
        System.out.println(this.direcao);
        System.out.println("A distância percorrida será de: " + this.distancia + "metros. ←");
    }
}
