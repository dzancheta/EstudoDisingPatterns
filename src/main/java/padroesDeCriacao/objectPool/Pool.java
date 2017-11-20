package padroesDeCriacao.objectPool;

/**
 * Created by daniel on 12/09/17.
 */
public interface Pool<T> {
    T acquire();
    void realease(T t);
}
