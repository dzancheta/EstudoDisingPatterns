package padroesDeCriacao.factoryMethod;

/**
 * Created by daniel on 08/09/17.
 */
public class Application {
    public static void main(String... args){
        EmissorCreate create = new EmissorAssincronoCreate();
        Emissor emissor = create.create(0);
        emissor.envia("Pedido realizado com sucesso!");
    }
}

