package OutrosExercicios.HerancaVeiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("ABC-1234", 2019));
        veiculos.add(new Veiculo("DFE-7896", 2018));
        veiculos.add(new Caminhao("TYR-4569", 2019, 5));
        veiculos.add(new Caminhao("AHO-6589", 2022,7));
        veiculos.add(new Onibus("OPS-4569", 2019, 40));

        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        caminhoes.add(new Caminhao("AOP-9863", 2016, 5));
        caminhoes.add(new Caminhao("ADH-7896", 2019,7));

        System.out.println("Veículos");

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }

        System.out.println("------------------");

        System.out.println("Caminhões");

        for (Caminhao caminhao : caminhoes) {
            caminhao.exibirDados();
        }

    }
}
