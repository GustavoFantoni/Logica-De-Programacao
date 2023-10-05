import javax.swing.JOptionPane;
public class Switch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, numero[], menor = 0, opcao, mediafinal = 0, impar = 0, maior = 0, posicao = 0, fatorial = 1;
		String entrada;
		numero = new int[20];
		for (i = 0 ; i < 20 ; i++) {
		entrada = JOptionPane.showInputDialog("Informe um numero: ");
		numero[i] = Integer.parseInt(entrada);
		if(i == 0) {
			menor = numero[i];
		}
		}
		entrada = JOptionPane.showInputDialog("ESCOLHA SUA OPCAO"+
				 "\n\n\t1. MEDIA\n\t2. IMPARES" +
				 "\n\t3. MAIOR\n\t4. FATORIAL"+
				 "\n\t9. VAZAR\n\n\tQUAL A OPERACAO VOCE QUER ");
				opcao = Integer.parseInt(entrada);
				switch (opcao) {
				case 1: 
					for (i = 0 ; i < 20 ; i++) {
						mediafinal += numero[i];
					}
					mediafinal = mediafinal / numero.length;
					System.out.println("A MEDIA DOS NUMEROS E: " + mediafinal);
					break;
				case 2: 
						for (i = 0 ; i < 20 ; i++) {
							if ((numero[i] % 2) != 0) {
								impar++;
							}		
						}
						System.out.println("Quantidade de numero impares: " + impar);
						break;
				case 3: 
					for (i = 0 ; i < 20 ; i++) {
						if (maior < numero[i]) {
							maior = numero[i];
							posicao = i;
						}
					}
					System.out.println("Maior numero: " + maior);
					System.out.println("Posicao array: " + posicao);
					break;
				case 4 : 
						for (i = 0 ; i < 20 ; i++) {
							if (menor > numero[i]) {
								menor = numero[i];
							}
						}
						for (i = menor ; i > 20 ; i--) {
							fatorial *= i;
						}
						System.out.println("Fatorial do menor numero: " + fatorial);
						break;
				case 9:
					System.out.println("Voce selecionou sair");
					break;
					default: System.out.println("Opcao invalida!");
				}		
	}
}
