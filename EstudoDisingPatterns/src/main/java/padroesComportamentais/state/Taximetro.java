package padroesComportamentais.state;

/**
 * Created by daniel on 14/09/17.
 */
public class Taximetro {
    private Bandeira bandeira;

    public Taximetro(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public double calculaValorDaCorrida(double tempo, double distancia){
        return this.bandeira.calculaValorDaCorrida(tempo, distancia);
    }
}
