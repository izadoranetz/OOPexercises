package CursoJavaBasico.aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Cacau");
        
        //criar objeto endereco
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Saches");
        endereco.setNumero("n/a");
        endereco.setComplemento("123 apto");
        endereco.setCidade("Catsville");
        endereco.setEstado("prrr");

        contato.setEndereco(endereco);

        //criar objeto telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("000");
        telefone.setNumero("1234-12345");

        //contato.setTelefone(telefone);

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("fixo");
        telefone2.setDdd("000");
        telefone2.setNumero("3125-4564");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);


        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        // if(contato != null && contato.getTelefones() != null) {
        //     System.out.println(contato.getTelefones().getDdd() + " " + contato.getTelefones().getNumero());
        // }

        if(contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
