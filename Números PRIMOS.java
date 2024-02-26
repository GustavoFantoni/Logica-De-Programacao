import javax.swing.JOptionPane;
public class numerosPRIMOS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		int numero;
		int primo;
		entrada = JOptionPane.showInputDialog("Digite um numero: ");
		numero = Integer.parseInt(entrada);
		 primo = 0;
         for (int auxiliar = numero; auxiliar > 0; auxiliar--) {
             if (numero % auxiliar == 0) {
                 primo += 1;
             }
         }
         if (primo == 2) {
             JOptionPane.showMessageDialog(null, "B) " + numero + " é primo!");
         } else {
             JOptionPane.showMessageDialog(null, "B) " + numero + " não é primo.");
         }
	}
}
