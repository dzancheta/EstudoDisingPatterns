package padroesEstruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel on 13/09/17.
 */
public class TemaFlyweightFactory {
    private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = new HashMap<Class<? extends TemaFlyweight>, TemaFlyweight>();
    public static final Class<TemaAsterisco> ASTERISCOS = TemaAsterisco.class;
    public static final Class<TemaHifen> HIFEN = TemaHifen.class;
    public static final Class<TemaDzancheta> DZANCHETA = TemaDzancheta.class;

    public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz) {
        if (!temas.containsKey(clazz)) {
            try {
                temas.put(clazz, clazz.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return temas.get(clazz);
    }
}
