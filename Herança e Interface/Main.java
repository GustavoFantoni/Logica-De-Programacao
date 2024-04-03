public class Main {
    public static void main(String[] args) {
        Maria m1 = new Maria("Maria", "Rua Cunha", 28, "Feminino");
        System.out.println(m1.getNome());
        System.out.println(m1.getEndereco());
        System.out.println(m1.getIdade());
        System.out.println(m1.getSexo());
        m1.saudacao();
        m1.andar();
        m1.parar();
    }
}