package datastructure;

import java.util.List;
import java.util.stream.Collectors;

public class MultiplicadorService {

    public List<Integer> listamultiplica(List<Integer>lista){
        List<Integer> multiplicaNumber = lista.stream()
                .map(n -> n*2)
                .collect(Collectors.toList());
        return multiplicaNumber;
    }
}
