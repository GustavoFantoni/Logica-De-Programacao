public class Veiculo {
        protected String marca;
        protected String modelo;
        protected int ano;
        protected  String cor;
        protected int preco;

    public Veiculo(String marca, String modelo, int ano, String cor, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    public void calcularValor() {
            System.out.println("Preço: " + preco );
        }

    public void imprimir() {
        System.out.println("Marca: " + marca );
        System.out.println("Modelo: " + modelo );
        System.out.println("Ano: " + ano );
        System.out.println("Cor: " + cor );
        System.out.println("Preco: " + preco );
    }
}
