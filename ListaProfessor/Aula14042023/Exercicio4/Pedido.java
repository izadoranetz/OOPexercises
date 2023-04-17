package ListaProfessor.Aula14042023.Exercicio4;

public class Pedido {
    public Item itens;
    public Cliente cliente;
    public String pagamento;

    Pedido(Item itens, Cliente cliente, String pagamento) {
        this.itens = itens;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

}
