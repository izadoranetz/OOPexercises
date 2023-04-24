package ListaProfessor.Questionario.Q3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.id = 54867L;
        pessoa1.nome = "Maria Xavier";

        Livro livro1 = new Livro();
        livro1.autor = "Machado de Assis";
        livro1.titulo = "Memórias Póstumas de Brás Cubas";
        livro1.id = 584847564L;
        livro1.emprestado = true;

        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.id = 4565469L;
        emprestimo1.dataDevolucao = new Date(2023-05-02);
        emprestimo1.dataEmprestimo = new Date(2023-04-23);
        emprestimo1.pessoa = pessoa1;
        emprestimo1.livro = livro1;

        System.out.println("O livro " + emprestimo1.livro.titulo +
        "do autor " + emprestimo1.livro.autor +
        " foi emprestado em " + emprestimo1.dataEmprestimo +
        " para " + emprestimo1.pessoa.nome + 
        "\nCódigo do empréstimo: " + emprestimo1.id);
    }
}
