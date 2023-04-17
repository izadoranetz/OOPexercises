package ListaProfessor.Aula14042023.Exercicio4;

public class Main {

    public static void main(String[] args) {
        Cliente novoCliente = new Cliente("Pessoa", 0000000000);
        //novoCliente.nome = "Nome da Pessoa";
        //novoCliente.CPF = "0000000000";
        System.out.println(novoCliente.nome + " " + novoCliente.CPF);

        Pedido novoPedido = new Pedido(null, novoCliente, null);

        novoPedido.cliente = novoCliente;

        /*
         * 
         * public class Main {
         *  public static void main(String[] args) {
         *      Pedido pedido = new Pedido();
         * 
         *      pedido.cliente = new Cliente();
         *      pedido.cliente.nome = "Fulano";
         *      pedido.cliente.cpf = "0000000000";
         * 
         *      pedido.itens = ;
         * 
         *      pedido.pagamento =;
         * 
         *  }
         * }
         * 
         */
        
        
    }
}
