package padroesEstruturais.adapter;

/**
 * Created by daniel on 12/09/17.
 */
public class ControleDePontoAdapter extends ControleDePonto {
    private ControleDePontoNovo controleDePontoNovo;

    public ControleDePontoAdapter(){
        this.controleDePontoNovo = new ControleDePontoNovo();
    }
    public void registraEntrada(Funcionario funcionario){
        this.controleDePontoNovo.registra(funcionario, true);
    }

    public void registraSaida(Funcionario funcionario){
        this.controleDePontoNovo.registra(funcionario, false);
    }
}
