public class Lifo {

 private int elementos[], i;


        Lifo(){
            elementos = new int[20];
            i = -1;
        }

        public boolean push(int quem){
            if (i < (elementos.length -1)){
                i++;
                elementos[i] = quem;
                return true;
            }
            return false;
        }

        public boolean pop(){
            if (i < 0) {
                return false;
            }
                i--;
                return true;
        }

        public int vagas(){
            return elementos.length - i -1;
        }

        public void mostrar(){
            int x;
            if (i == -1){
                System.out.println("PILHA VAZIA");
                return;
            }
            System.out.print("VEJA A PILHA: ");
            for(x = i; i >= 0; i--) {
                System.out.print(" " + elementos[i]);
            }
        }

        public int cabeca() {
            if (i < 0) {
                return -99;
            }
            return elementos[i];
        }
    }


import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){

    Lifo minha;
    String entra;
    int aux,opcao;
    minha= new Lifo();

    do {
        entra = JOptionPane.showInputDialog("SISTEMA TESTE DA PILHA" +
            "\n\n\t1. INSERIR \n\t2. RETIRAR" +
            "\n\t3. MOSTRAR" +
            "\n\t4. VAGAS\n\t5. CABECA" +
            "\n\t9. VAZAR\n\n\tINFORME SUA OPCAO ");
        opcao  = Integer.parseInt(entra);

        switch (opcao){
            case 1:
                entra = JOptionPane.showInputDialog("\n INFORME A MATRICULA");
                aux  = Integer.parseInt(entra);
                    if(minha.push(aux)) {
                System.out.println(aux + " INSERIDA COM SUCESSO ");
                }else {
                        System.out.println("\n OVERFLOW - PILHA CHEIA");
                    }
            break;

            case 2: if (minha.pop()) {
                System.out.println("\n MATRICULA RETIRADA");
            } else {
                System.out.println("\n PILHA VAZIA - IMPOSSIVEL RETIRAR");
            }
                break;

            case 3: if (minha.vagas() == 15) {
                System.out.println("\n LISTA VAZIA");
            }else {
                minha.mostrar();
            }
                break;

            case 4: System.out.println("\n QUANTIDADE DE VAGAS = " + minha.vagas());
                break;

            case 5: aux = minha.cabeca();
                if (aux == -99) {
                    System.out.println("\n LISTA VAZIA");
                }else {
                    System.out.println("\n NA CABECA ESTA " + aux);
                }
        }
    } while (opcao != 9);

        System.out.println("\n OBRIGADO POR USAR A PILHA ");
    }
}
