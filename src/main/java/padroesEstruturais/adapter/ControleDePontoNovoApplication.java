package padroesEstruturais.adapter;

/**
 * Created by daniel on 12/09/17.
 */
public class ControleDePontoNovoApplication {
    public static void main(String... args)throws InterruptedException{
        ControleDePonto controleDePonto =  new ControleDePontoAdapter();
        Funcionario funcionario = new Funcionario("Daniel Zancheta");
        controleDePonto.registraEntrada(funcionario);
        Thread.sleep(3000);
        controleDePonto.registraSaida(funcionario);
    }
}
