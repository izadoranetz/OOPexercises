package OutrosExercicios.HerancaVeiculo;

public class Veiculo {
    protected String placa;
    protected int ano;

    // constructor with parameters
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }
    
    // default constructor
    public Veiculo () {}
    
    //getters
    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
    
    //setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public void exibirDados(){
        System.out.println("Ano de fabricação é: " + ano + ". E a placa é: " + placa);
    }
}
