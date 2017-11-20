package padroesComportamentais.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 14/09/17.
 */
public class SorterApplication {
    public static void main(String... args){
        Sorter sorter = new InsertionSorter();
        List<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(14);

        List<Integer> list2 = sorter.sort(list);
        for(Integer integer : list2){
            System.out.println(integer);
        }

        Sorter sorter2 = new SelectionSorter();
        List<Integer> list3 = sorter2.sort(list);
        for(Integer integer : list3){
            System.out.println(integer);
        }
    }
}
