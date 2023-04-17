package CursoJavaBasico.aula27.ListadeExercicios25a27.Exercicio01;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if(ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if(ligada){
            desligar();
        } else {
            ligar();
        }
    }

    /*
     * Como instanciaria essa classe:
     * Lampada lampada = new Lampada();
     * 
     * lampada.ligar();
     * 
     * System.out.println("Lâmpada está " + lampada.ligada);
     * 
     * lampada.desligar();
     * 
     * System.out.println("Lâmpada está " + lampada.ligada);
     * 
     */

     /*
      * lampada.ligar();
      * lampada.mostrarEstado();
      * lampada.desligar();
      * lampada.mostrarEstado();
      * 
      * lampada.mudarEstado();
      * lampada.mostrarEstado();
      */

}
