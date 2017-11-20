package padroesComportamentais.strategy;

import java.util.List;

/**
 * Created by daniel on 14/09/17.
 */
public interface Sorter{
    <T extends Comparable<? super T>> List<T> sort (List<T> list);

}
