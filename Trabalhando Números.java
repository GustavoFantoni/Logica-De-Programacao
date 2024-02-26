import javax.swing.JOptionPane;
public class randomNUMBER {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		int numero;
		double minimo = 1;
		double maximo = 100;
		double numeroAleatorio = minimo + (Math.random() * (maximo - minimo));
		double inteiro = (int) Math.floor(numeroAleatorio);
		do {
		 entrada = JOptionPane.showInputDialog("Digite um numero: ");
		 numero = Integer.parseInt(entrada);
		if (numero > inteiro) {
			 System.out.println("Menor");
		 }else if (numero < inteiro) {
			 System.out.println("Maior");
		 } else {
		 System.out.println("Acertouu");
		 break;
		 }
	 } 
		 while (true);
	}
}
