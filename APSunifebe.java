import javax.swing.JOptionPane;

public class APSunifebe {

    public static void main(String[] args) {
        int numero;
        int fatorial;
        int primo;
        int contaPrimos = 0;
        int contaDoze = 0;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int contador = 0;

        do {
            String entrada = JOptionPane.showInputDialog("Informe um numero (ou digite um número maior que 20 para encerrar):");
            numero = Integer.parseInt(entrada);

            if (numero > 20) {
                break; // Encerra o loop quando um número maior que 20 é digitado
            }

            // A) Fatorial
            fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            JOptionPane.showMessageDialog(null, "A) O fatorial de " + numero + " e " + fatorial);

            // B) Primo ou não
            primo = 0;
            for (int auxiliar = numero; auxiliar > 0; auxiliar--) {
                if (numero % auxiliar == 0) {
                    primo += 1;
                }
            }
            if (primo == 2) {
                contaPrimos++;
                JOptionPane.showMessageDialog(null, "B) " + numero + " e primo!");
            } else {
                JOptionPane.showMessageDialog(null, "B) " + numero + " não e primo.");
            }

            // C) Múltiplo de 5
            if (numero % 5 == 0) {
                JOptionPane.showMessageDialog(null, "C) " + numero + " e multiplo de 5.");
            } else {
                JOptionPane.showMessageDialog(null, "C) " + numero + " nao e multiplo de 5.");
            }

            // D) Atualiza o contador de doze
            if (numero == 12) {
                contaDoze++;
            }

            // Atualiza o maior número e a soma
            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
            contador++;

        } while (true);

        // Exibe os resultados finais
        JOptionPane.showMessageDialog(null, "Quantidade de numeros primos informados: " + contaPrimos);
        JOptionPane.showMessageDialog(null, "Quantidade de vezes que o 12 foi informado: " + contaDoze);
        JOptionPane.showMessageDialog(null, "Maior numero informado: " + maior);
        if (contador > 0) {
            double media = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "Media aritmetica dos numeros informados: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum numero informado para calcular a media.");
        }
    }
}
