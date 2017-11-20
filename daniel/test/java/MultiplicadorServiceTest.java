import datastructure.MultiplicadorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MultiplicadorServiceTest {
    MultiplicadorService multiplicadorService = new MultiplicadorService();

    @Test
    public void deveRetornarValorMultiplicadoPorDois(){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Assertions.assertEquals(multiplicadorService.listamultiplica(integers), Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32));
    }
}
