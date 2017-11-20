package padroesDeCriacao.objectPool;

/**
 * Created by daniel on 12/09/17.
 */
public class FuncionarioPoolApplication  {
    public static void main(String[] args){
        Pool<Funcionario> funcionarioPool = new FuncionarioPool();
        Funcionario funcionario = funcionarioPool.acquire();
        while (funcionario != null){
            System.out.println(funcionario.getNome());
            funcionario = funcionarioPool.acquire();
        }
    }
}
