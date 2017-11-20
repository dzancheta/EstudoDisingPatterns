package imc;

/**
 * Created by daniel on 21/06/17.
 */
public class Main {

    public static void main(String[]args){
        ImcService imcService = new ImcService();
        String texto = imcService.calcularImc(new Pessoa("Daniel", 1.75, 75.2));
        System.out.println(texto);
    }
}
