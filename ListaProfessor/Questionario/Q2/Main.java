package ListaProfessor.Questionario.Q2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.CPF = 00000000000;
        usuario1.matricula = "0000000";
        usuario1.nome = "Beltrano Soares";
        usuario1.telefone = "(00) 00000-0000";


        Livro livro1 = new Livro();
        livro1.titulo = "Memórias Póstumas de Brás Cubas";
        livro1.autor = "Machado de Assis";
        livro1.ano = new Date(1881-00-00);
        livro1.edicao = 1;
        livro1.editora = "Cia das Letras";
        livro1.ISBN = "978-85-7989-086-7";

        Livro livro2 = new Livro();
        livro2.titulo = "Dom Casmurro";
        livro2.autor = "Machado de Assis";
        livro2.ano = new Date(1889-00-00);
        livro2.edicao = 2;
        livro2.editora = "Nova Fronteira";
        livro2.ISBN = "978-85-209-4452-2";

        Livro livro3 = new Livro();
        livro3.titulo = "A Hora da Estrela";
        livro3.autor = "Clarice Lispector";
        livro3.ano = new Date(1977-00-00);
        livro3.edicao = 1;
        livro3.editora = "Rocco";
        livro3.ISBN = "978-85-325-0589-6";

        Exemplar exemplar1 = new Exemplar();
        exemplar1.codigo = 54654654;
        exemplar1.cativa = false;
        exemplar1.livroEmprestado = livro2;

        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.dataDeEmprestimo = new Date(2023-01-20);
        emprestimo1.dataPrevistaDeDevolucao = new Date(2023-02-18);
        emprestimo1.dataDeEntregaReal = new Date(2023-02-15);
        emprestimo1.exemplarLocado = exemplar1;
        emprestimo1.situacao = 2;
        emprestimo1.usuarioLocador = usuario1;

        System.out.println("O livro " + exemplar1.livroEmprestado.titulo + " foi locado em " + emprestimo1.dataDeEmprestimo +
        " por " + emprestimo1.usuarioLocador.nome + " e devolvido em " + emprestimo1.dataDeEntregaReal);
        

    }
}
