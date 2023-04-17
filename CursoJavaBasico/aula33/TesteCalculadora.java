package CursoJavaBasico.aula33;

public class TesteCalculadora {
    public static void main(String[] args){
        MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println(calc.soma(1,2));
        System.out.println(calc.soma(1.2,1.4));
    }
}