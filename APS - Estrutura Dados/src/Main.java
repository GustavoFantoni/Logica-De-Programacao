import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Methods m1 = new Methods();

        int escolhaMenu;
        do {
            String escolhaMenuString = JOptionPane.showInputDialog("[ 1 ] Nova Matrícula \n [ 2 ] Remove o Primeiro \n [ 3 ] Mostrar Fila \n [ 4 ] Mostrar Fila Invertida \n [ 5 ] Procurar \n [ 6 ] Média Idade \n [ 7 ] Resetar Fila \n [ 8 ] Mostrar Ultima Matrícula \n [ 9 ] Mostrar Primeira Matrícula \n [ 10 ] Vazar  ");
            escolhaMenu = Integer.parseInt(escolhaMenuString);


            switch (escolhaMenu) {
                case 1:
                    String informaNovoCadastro = JOptionPane.showInputDialog("Informe a matrícula: ");
                    int converteMatricula = Integer.parseInt(informaNovoCadastro);
                    String informaNovoIdade = JOptionPane.showInputDialog("Informe a Idade: ");
                    int converteIdade = Integer.parseInt(informaNovoIdade);
                    m1.newNodo(converteMatricula, converteIdade);
                    break;

                case 2:
                    int[] saida = m1.removePrim();
                    System.out.println("Funcionário Removido: \n Matrícula: " + saida[0] + " Idade: " + saida[1] );
                    break;

                case 3:
                    System.out.println("A fila está assim: ");
                    m1.show();
                    break;

                case 4:
                    System.out.println("Fila invertida: ");
                    m1.reverse();
                    break;

                case 5:
                    String digitaMatricula = JOptionPane.showInputDialog("Informe a matricula: ");
                    int convMat = Integer.parseInt(digitaMatricula);
                    int[] resultado = m1.search(convMat);
                    if (resultado != null) {
                        System.out.println("Matricula: " + resultado[0] + " Idade: " + resultado[1]);
                    } else {
                        System.out.println("Matrícula não encontrada!");
                    }
                    break;

                case 6:
                    System.out.println("Média de idades: " + m1.middleAge());
                    break;

                case 7:
                    m1.reset();
                    System.out.println("Fila Vazia!");
                    break;

                case 8:
                    System.out.println("Última matrícula da fila: " + m1.matUlt());
                    break;

                case 9:
                    System.out.println("Primeira matrícula da fila: " + m1.matPrim());
                    break;

                case 10:
                    System.out.println("Obrigado por usar o sistema! ");
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Informe um número válido: ");
                    break;
            }

        } while (escolhaMenu != 10);

    }
}
