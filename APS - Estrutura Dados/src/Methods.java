public class Methods {
    private Nodo prim;
    private Nodo prox;
    public int contador = 0;

    public Methods() {
        prim = null;
        prox = null;
    }

    public void newNodo(int mat, int idd) {
        Nodo aux = new Nodo(mat, idd);
        if (prim == null) {
            prim = aux;
        }
        else {
            prox.proximo = aux;
        }
        prox = aux;
        contador++;
    }
    public int[] removePrim () {
        int[] aux = {-999, -999};
        if (prim != null) {
            aux[0] = prim.matricula;
            aux[1] = prim.idade;
            prim = prim.proximo;
            contador--;
            if (prim == null) {
                prox = null;
            }
        }
        return aux;
    }

    public void show () {
        if (prim == null) {
            System.out.println("Fila vazia!");
        }
        Nodo aux = prim;
        while (aux != null) {
            System.out.println("Matricula: " + aux.matricula + " Idade: " + aux.idade);
            aux = aux.proximo;
        }
    }

    public void reverse() {
        Nodo aux = prox;

        while (aux != null) {
            System.out.println("Matricula: " + aux.matricula + " Idade: " + aux.idade);
            aux = aux.anterior;
        }
    }

    public int[] search(int infoMat) {
        Nodo aux = prim;
        while (aux != null) {
            if (infoMat == aux.matricula) {
                int[] arr = {aux.matricula, aux.idade};
                return arr;
            }
            aux = aux.proximo;
        }
        return null;
    }

    public int middleAge() {
        Nodo aux = prim;
        int soma = 0;
        int media = 0;
        if (prim == null) {
            return -999;
        }
        while (aux != null) {
            soma += aux.idade;
            aux = aux.proximo;
        }
        media = soma / contador;
        return media;
    }

    public void reset() {
        prim = null;
        prox = null;
    }
    public int matUlt() {
        if (prim == null) {
            return -999;
        }
        return prox.matricula;
    }
    public int matPrim() {
        if (prim == null) {
            return -999;
        }
        return prim.matricula;
    }
}
