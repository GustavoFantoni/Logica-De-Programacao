public class Arvore {
    Nodo raiz = null;

    public void inserir(int numero, Nodo lugar) {
        System.out.println(" " + numero);
        if (raiz == null) {
            raiz = new Nodo(numero);
        } else if (numero < lugar.numero) {
            if (lugar.esquerda == null) {
                lugar.esquerda = new Nodo(numero);
            } else {
                inserir(numero, lugar.esquerda);
            }
        } else if (numero > lugar.numero) {
            if (lugar.direita == null) {
                lugar.direita = new Nodo(numero);
            } else {
                inserir(numero, lugar.direita);
            }
        }
    }
}
