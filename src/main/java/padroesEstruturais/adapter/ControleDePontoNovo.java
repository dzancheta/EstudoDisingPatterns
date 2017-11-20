package padroesEstruturais.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by daniel on 12/09/17.
 */
public class ControleDePontoNovo {
    public void registra(Funcionario funcionario, boolean entrada){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
        String format = simpleDateFormat.format(calendar.getTime());

        if(entrada == true){
            System.out.println("Entrada: " + funcionario.getNome() + " às " + format);
        }else {
            System.out.println("Saida: " + funcionario.getNome() + " às " + format);
        }
    }
}
