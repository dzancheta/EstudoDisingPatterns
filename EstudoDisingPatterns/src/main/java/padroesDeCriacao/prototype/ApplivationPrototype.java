package padroesDeCriacao.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by daniel on 11/09/17.
 */
public class ApplivationPrototype {
    public static void main(String... args){
        String nome = "Daniel Zancheta";

        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 30);

        Set<String> hashSet = new HashSet<String>();

        hashSet.add("Curso");
        hashSet.add("Java");
        hashSet.add("Daniel Zancheta");

        Campanha campanha = new Campanha(nome, vencimento, hashSet);
        System.out.println(campanha);

        Campanha clone = campanha.clone();
        System.out.println(clone);
    }
}
