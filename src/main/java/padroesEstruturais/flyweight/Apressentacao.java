package padroesEstruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 13/09/17.
 */
public class Apressentacao {
    private List<Slide> slides = new ArrayList<Slide>();

    public void adicionaSlide(Slide slide){
        slides.add(slide);
    }
    public void imprime(){
        for (Slide slide : this.slides){
            slide.imprime();
            System.out.println();
        }
    }
}
