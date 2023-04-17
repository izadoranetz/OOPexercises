package CursoJavaBasico.aula33.listaExercicios28a33;

public class Lampada {
    private String modelo;
    private int potencia;
    private boolean ligada;

    public Lampada(String modelo, int potencia, boolean ligada){
        this.modelo = modelo;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return this.ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }

    public void desligar(){
        setLigada(false);
    }
}
