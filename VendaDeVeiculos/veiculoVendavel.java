public class veiculoVendavel extends Veiculo implements Ivenda  {



    public int qtdvendidos = 0;
    public veiculoVendavel(String marca, String modelo,  int ano, String cor, int preco) {
        super(marca, modelo, ano, cor, preco);
    }

    public double gerarCodigo() {
        return Math.random();
    }

    public void atualizarEstoque() {
        System.out.println("Baixa de Estoque");
    }

    @Override
    public void vender() {
        System.out.println("Veiculo Vendido");
    }
}
