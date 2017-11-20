package padroesEstruturais.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by daniel on 13/09/17.
 */
public class Estoque {
    public void enviaProduto(String produto, String enderecoDeEntrega){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 2);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(calendar.getTime());

        System.out.println("O produto " + produto + " será entregue no endereço" + enderecoDeEntrega + " até as 18h do dia " + format);
    }
}
