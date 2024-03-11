public class Nodo {
    public Nodo anterior;
    public Nodo proximo;
    public int matricula;
    public int idade;


    public Nodo(int entraMat, int entraIdd) {
        anterior = null;
        proximo = null;
        matricula = entraMat;
        idade = entraIdd;
    }
}
