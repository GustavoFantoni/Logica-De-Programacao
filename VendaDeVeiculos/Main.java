public class Main {
    public static void main(String[] args) {
        Carro v1 = new Carro("BMW", "320i",2001, "amarelo goiaba", 47823);
        v1.imprimir();
        v1.gerarCodigo();
        v1.vender();
        v1.atualizarEstoque();



        Moto m1 = new Moto("Honda", "primitiva",200, "azul goiaba", 70);
        m1.imprimir();
        m1.gerarCodigo();
        m1.vender();
        m1.atualizarEstoque();
    }

}