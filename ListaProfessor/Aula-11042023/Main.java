
public class Main {
    public static void main(String[] args) {
        UF uf = new UF();
        uf.nome = "Distrito Federal";

        Endereco endereco = new Endereco();
        endereco.rua = "SQN 215";
        endereco.cep = "70874020";
        endereco.uf = uf;
        
        System.out.println("Nome da rua: " + endereco.rua + "\nCEP: " + endereco.cep + "\n" + endereco.uf.nome);

    }
}