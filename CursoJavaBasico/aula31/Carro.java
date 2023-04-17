package CursoJavaBasico.aula31;

public class Carro {
    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {}

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " km.");
    }

    public double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    public double calcularCombustivel(double km){
        double qtdCombustivel =  km/this.consumoCombustivel;
        return qtdCombustivel;
    }
}
