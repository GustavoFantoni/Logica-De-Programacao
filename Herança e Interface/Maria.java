public class Maria extends Pessoa implements IacoesPessoa{
    public Maria(String nome, String endereco, int idade, String sexo) {
        super(nome, endereco, idade, sexo);
    }
    @Override
    public void andar() {
        System.out.println("Estou andando(a)");
    }
    @Override
    public void parar() {
        System.out.println("Estou parado(a)");
    }
}
