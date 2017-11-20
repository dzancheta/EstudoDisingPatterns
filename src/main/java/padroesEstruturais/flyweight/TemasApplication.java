package padroesEstruturais.flyweight;

/**
 * Created by daniel on 13/09/17.
 */
public class TemasApplication {
    public static void main(String... args){
    Apressentacao apressentacao = new Apressentacao();
    apressentacao.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.HIFEN), "DZANCHETA - Orientação a Objetos em Java",
         "  Com este curso você vai obter uma base \n" +
               "sólida de conhecimentos de Java\n" +
               "e de Orientação a Objetos."));
    apressentacao.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.DZANCHETA),"DZANCHETA - Desenvolvimento Web com JSF2 e JPA2",
       "    Depois deste curso, você estará apto a \n" +
               "desenvolver aplicações Web com \n" +
               "os padrões da plataforma Java ."));

    apressentacao.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCOS), "DZANCHETA - Persistência com JPA2 e Hibernate",
       "    Neste curso de Java Avançado , abordamos de \n"+
             "maneira profunda os recursos de persistência \n" +
             "do JPA2 e do Hibernate ."  ));
    apressentacao.imprime();
    }
}
