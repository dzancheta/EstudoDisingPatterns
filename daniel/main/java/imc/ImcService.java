package imc;

/**
 * Created by daniel on 21/06/17.
 */
public class ImcService {

    public String calcularImc(Pessoa pessoa){
        Double imc = pessoa.getPeso() / (pessoa.getAltura() * 2);
        if(imc > 12D) return "Ta gordo";
        else return "De boa, #partiudodo";
    }
}
