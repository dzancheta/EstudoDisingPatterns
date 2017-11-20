package datastructure;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosParesService {

    public List<Integer> numerosPares(List<Integer> lista) {

        List<Integer> filterNumberPares = lista.stream()
                .filter(number -> number %2 == 0)
                .collect(Collectors.toList());
        return  filterNumberPares;
    }

}

