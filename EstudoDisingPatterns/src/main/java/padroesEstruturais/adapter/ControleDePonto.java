package padroesEstruturais.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by daniel on 12/09/17.
 */
public class ControleDePonto {
    public void registraEntrada(Funcionario funcoionario){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println("Entrada: " + funcoionario.getNome() + " às " + format);
    }

    public void registraSaida(Funcionario funcoionario) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");

        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println("Saida: " + funcoionario.getNome() + " às " + format);
    }
}
