package ListaProfessor.Aula14042023.EXercicio06;

public class Main {
    public static void main(String[] args) {
        Livros livro = new Livros();
        livro.codigo = 1;
        livro.descLivro = "Java";
        livro.ISBN = "123456789";

        livro.editora = new Editoras();
        livro.editora.codEditora = 1;
        livro.editora.razaoSocial = "Editora 1";
        livro.editora.contato = "pessoa@email.com";
        livro.editora.telefone = "123456789";

        System.out.println("Livro: " + livro.descLivro);
        System.out.println("Editora: " + livro.editora.razaoSocial);
    }
}
