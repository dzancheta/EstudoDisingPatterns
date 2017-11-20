package padroesComportamentais.mediator;

/**
 * Created by daniel on 14/09/17.
 */

public class CentralDeTaxisApplication {
    public static void main(String... args){
        CentralDeTaxi central = new CentralDeTaxi();

        Passageiro p1 = new Passageiro(central, "Daniel Zancheta");
        Passageiro p2 = new Passageiro(central, "Marcelo Martins");
        Passageiro p3 = new Passageiro(central, "Jonas Hirata");
        Passageiro p4 = new Passageiro(central, "Daniel ");
        Passageiro p5 = new Passageiro(central, "Daniel Simonetti");
        Passageiro p6 = new Passageiro(central, "Daniel Simonetti Zancheta");

        Taxi t1 = new Taxi(central);
        central.adicionaTaxiDisponivel(t1);

        Taxi t2 = new Taxi(central);
        central.adicionaTaxiDisponivel(t2);

        Taxi t3 = new Taxi(central);
        central.adicionaTaxiDisponivel(t3);

        Taxi t4 = new Taxi(central);
        central.adicionaTaxiDisponivel(t4);

        new Thread( p1 ).start();
        new Thread( p4 ).start();
        new Thread( p5 ).start();
        new Thread( p6 ).start();
        new Thread( p2 ).start();
        new Thread( p3 ).start();

    }
}
