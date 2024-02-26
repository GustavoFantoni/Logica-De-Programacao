public class Lifo {

    private int pilha[];
    private int topo;

    Lifo(){
        pilha = new int [10];
        topo = -1;
    }

        public boolean push (int quem) {
        if (topo == (pilha.length - 1)){
            return false;
        }

        topo++;
        pilha[topo] = quem;
        return true;
    }

    public boolean pop(){
        if(topo == -1) {
            return false;
        }
            topo--;
        return true;
            //return pilha [topo +1];
    }

    public void reset(){
        topo = -1;
    }

    public int mostarCabeca(){
        if(topo == -1){
            return -999;
        }
        return pilha[topo];
    }

    public void mostrar(){
        int aux;

        if(topo == -1){
            System.out.println("Lista vazia");
        }
        for (aux = topo; topo >= 0; topo--){
            System.out.println("" + pilha[topo]);
        }
    }

    public int vagas()
    {return pilha.length - topo - 1;
    }

    public int cabeca()
    {if (topo < 0)
        return -99;
        return pilha[topo];
    }

}


import javax.swing.JOptionPane;

public class UsaLifo {
    public static void main(String[] args) {

        Lifo minha;
        String entra;

            int aux,opcao;
            minha= new Lifo();
            do {entra = JOptionPane.showInputDialog("SISTEMA TESTE DA PILHA"+
                    "\n\n\t1. INSERIR\n\t2. RETIRAR"+
                    "\n\t3. MOSTRAR"+
                    "\n\t4. VAGAS\n\t5. CABECA"+
                    "\n\t9. VAZAR\n\n\tINFORME SUA OPCAO ");
                opcao  = Integer.parseInt(entra);
                switch (opcao)
                {case 1: entra = JOptionPane.showInputDialog("\nINFORME A MATRICULA");
                    aux  = Integer.parseInt(entra);
                    if(minha.push(aux))
                        System.out.println(aux + " INSERIDA COM SUCESSO ");
                    else
                        System.out.println("\nOVERFLOW - PILHA CHEIA");
                    break;
                    case 2: if (minha.pop())
                        System.out.println("\nMATRICULA RETIRADA");
                    else
                        System.out.println("\nPILHA VAZIA - IMPOSSIVEL RETIRAR");
                        break;
                    case 3: if (minha.vagas() == 15)
                        System.out.println("\nLISTA VAZIA");
                    else
                        minha.mostrar();
                        break;
                    case 4: System.out.println("\nQUANTIDADE DE VAGAS = "+minha.vagas());
                        break;
                    case 5: aux = minha.cabeca();
                        if (aux == -99)
                            System.out.println("\nLISTA VAZIA");
                        else
                            System.out.println("\nNA CABECA ESTA "+aux);

                }
            } while (opcao != 9);

            System.out.println("\nOBRIGADO POR USAR A PILHA ");
        }

    }
