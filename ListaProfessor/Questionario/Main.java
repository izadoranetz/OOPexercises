package ListaProfessor.Questionario;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.cep = "00000-000";
        endereco1.cidade = "Brasilia";
        endereco1.logradouro = "SQN 000 Bl 00";
        endereco1.complemento = "apto 00";
        endereco1.numero = 202;

        Contato contato1 = new Contato();
        contato1.descricao = "Colega de trabalho";
        contato1.telefone = "(00) 00000-0000";
        contato1.email = "contato@contato.com";
        contato1.endereco = endereco1;

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Fulana";
        pessoa1.sobrenome = "Silva";
        pessoa1.dataNascimento = "01/01/2000";
        pessoa1.contato = contato1;

        System.out.println("Nome: " + pessoa1.nome + " " + pessoa1.sobrenome);
        System.out.println("Telefone de contato: " + pessoa1.contato.telefone);
        System.out.println("E-mail: " + pessoa1.contato.email);
        System.out.println("Endereco: " + pessoa1.contato.endereco.logradouro + " " + 
        pessoa1.contato.endereco.numero + " " + 
        pessoa1.contato.endereco.complemento + " - " + 
        pessoa1.contato.endereco.cidade);

    }
}