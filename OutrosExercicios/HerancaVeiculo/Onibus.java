package OutrosExercicios.HerancaVeiculo;

public class Onibus extends Veiculo {
    private int assentos;

    // constructor
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    // getter
    public int getAssentos() {
        return this.assentos;
    }

    // setter
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibirDados(){
        System.out.println("Ano de fabricação é: " + ano + ". E a placa é: " + placa + " e o número de assentos é " + assentos);
    }

    

}
