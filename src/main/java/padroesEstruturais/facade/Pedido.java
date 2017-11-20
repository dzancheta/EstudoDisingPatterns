package padroesEstruturais.facade;

/**
 * Created by daniel on 13/09/17.
 */
public class Pedido {
    private String produto;
    private String cliente;
    private String enderecoDeEntrega;

    public Pedido(String produto, String cliente, String enderecoDeEntrega) {
        this.produto = produto;
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public String getProduto() {
        return produto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }
}
