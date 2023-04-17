package OutrosExercicios.HerancaVeiculo;

public class Caminhao extends Veiculo {
    private int eixos;

    // constructor
    public Caminhao(String placa, int ano,  int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    // getter
    public int getEixos() {
        return this.eixos;
    }

    // setter
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }


    // método para exibir dados
    public void exibirDados(){
        System.out.println("Ano de fabricação é: " + ano + ". E a placa é: " + placa + " e o número de eixos é " + eixos);
    }


}
