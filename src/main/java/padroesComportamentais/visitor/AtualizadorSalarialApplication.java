package padroesComportamentais.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 14/09/17.
 */
public class AtualizadorSalarialApplication {
    public static void main(String... args){
        List<Departamento> list = new ArrayList<Departamento>();
        Departamento departamento = new Departamento("Departamento 1");
        Gerente gerente = new Gerente("Gerente 1", 1500, "1234");
        Telefonista telefonista = new Telefonista("Telefonista 1", 1000, 1245);
        departamento.getFuncionarios().add(gerente);
        departamento.getFuncionarios().add(telefonista);

        list.add(departamento);

        Departamento departamento2 = new Departamento("Departamento 2");
        Gerente gerente1 = new Gerente("Gerente 2 ", 1800, "2253");
        Gerente gerente2 = new Gerente("Gerente 3 ", 1800, "2553");
        Telefonista telefonista1 = new Telefonista("Telefonista 2", 1090, 3263);

        departamento2.getFuncionarios().add(gerente1);
        departamento2.getFuncionarios().add(gerente2);
        departamento2.getFuncionarios().add(telefonista1);

        list.add(departamento2);

        AtualizadorDeFuncionario atualizadorDeFuncionario = new AtualizadorSalario();
            for (Departamento d : list){
                d.aceita(atualizadorDeFuncionario);
        }
            for (Departamento d : list){
                for(Funcionario f : d.getFuncionarios()){
                    System.out.println("Nome: " + f.getNome() + " - Salário:" +  f.getSalario()) ;
                }
            }
    }
}
