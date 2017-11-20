package padroesDeCriacao.multiton;

/**
 * Created by daniel on 12/09/17.
 */
public class TemaApplication {
    public static void main(String... args){
        Tema temaFire = Tema.getInstance(Tema.FIRE);
        System.out.println("Tema" + temaFire.getNome());
        System.out.println("Cor da Fonte: " + temaFire.getCorDaFonte());
        System.out.println("Cor do Fundo: " + temaFire.getCorDeFundo());

        Tema temaFire2 = Tema.getInstance(Tema.SKY);
        System.out.println("----------------------------");
        System.out.println("Comparando as referencias... ");
        System.out.println(temaFire == temaFire2);
    }
}

