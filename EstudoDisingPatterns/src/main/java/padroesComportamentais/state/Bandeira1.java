package padroesComportamentais.state;

/**
 * Created by daniel on 14/09/17.
 */
public class Bandeira1 implements Bandeira {
    public double calculaValorDaCorrida(double tempo, double distancia) {
        return 5.0 + tempo * 1.5 + distancia * 1.7;
    }
}
