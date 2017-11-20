package datastructure;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumerosParesService numerosParesService = new NumerosParesService();
        MultiplicadorService multiplicadorService = new MultiplicadorService();
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12, 13, 14, 15, 16);
        numerosParesService.numerosPares(lista);
        multiplicadorService.listamultiplica(lista);
        System.out.println(numerosParesService.numerosPares(lista));
        System.out.println(multiplicadorService.listamultiplica(lista));


        // Criar função em um service que receba essa lista e retorne só os numeros pares, utilizando java 8 - Estudar stream filter JAVA 8
        // Criar função que receba lista e multiplique cada numero da lista por 2 - Estudar stream map JAVA 8
    }
}
