import javax.swing.JOptionPane;
public class APS3febe {
	public static void main(String[] args) {
		String entrada, opcao;
		int numeros[] = new int[10];
		int opcaoConv;

		for (int i = 0 ; i < 10 ; i++) {
		entrada = JOptionPane.showInputDialog("Informe um numero: ");
		numeros[i] = Integer.parseInt(entrada);
		}
		do {
			//MENU
        	opcao = JOptionPane.showInputDialog("\n\nMENU\n\n\t1. Mostrar\n\t2. Ordem Crescente\n\t3."
					+ " Ordem Descrescente\n\t4. Inverter\n\t5. Fatorial\n\t6. Primo\n\t9. Vazar\n\n");
        	opcaoConv = Integer.parseInt(opcao);
        	//MENU
        	switch (opcaoConv) {
        	case 1: Mostrar(numeros);
        		break;
        	case 2: 
        		OrdCres(numeros);
        		break;
        	case 3:
        		OrdDec(numeros);
        		break;
        	case 4:
        		Inverte(numeros);
        		break;
        	case 5:
        		int resFinal = Fatorial(numeros);
        		System.out.println("Fatorial do menor: " + resFinal);
        		break;
        	case 6:
        		int primos = 0;
        		for (int i  = 0 ; i < numeros.length ; i++) {
        			Primos(numeros[i]);
        			if (Primos(numeros[i])) {
        				primos ++;
        			}
        		}
        		System.out.println("Existem " + primos + " numeros primos na array");
				break;
        	}
		}  while (opcaoConv != 9);
        System.out.println("\nOBRIGADO POR USAR O SISTEMA");
	}
	public static void Mostrar (int numeros[]) {
		System.out.print("Sua coleção: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
	public static void OrdCres(int numeros[]) {

		for (int i = 0; i < numeros.length - 1 ; i++) {
			for (int j = 0; j < numeros.length - i - 1; j++) {
				if (numeros[j] > numeros[j + 1]) {
					int guarda = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = guarda;
				}
			}
		}
		System.out.print("\nColecao organizada de forma crescente: ");
		for (int num : numeros) {
	            System.out.print(num + " ");
	        }
	}
	public static void OrdDec(int numeros[]) {
		for (int i = 0; i < numeros.length - 1 ; i++) {
			for (int j = 0 ; j < numeros.length - i - 1 ; j++) {
				if (numeros[j] < numeros[j + 1]) {
					int guarda = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = guarda;
				}
			}
		}
		System.out.print("\nColecao organizada de forma decrescente: ");
		for (int num : numeros) {
	            System.out.print(num + " ");
	        }
	}

		public static void Inverte(int numeros[]) {
			int left = 0;
			int right = (numeros.length) - 1;
			while (left < right) {
				int temp = numeros[left];
				numeros[left] = numeros[right];
				numeros[right] = temp;
				left ++;
				right --;
			}
			System.out.println("\nNumeros em ordem invertida: ");
			for (int num : numeros) {
				System.out.print(num + " ");
			}
		}		
		public static int Menor(int numeros[]) {
			int menor = numeros[0];
    		for (int i = 1; i < numeros.length ; i++) {
    			if (numeros[i] < menor) {
    				menor = numeros[i];
    			}
    		}
    		return menor;
		}
		public static int Fatorial(int numeros[]) {
			int menor = Menor(numeros);
			int res = 1;
			for (int aux = menor; aux > 1 ; aux--) {
    			res *= aux;
    		}
    		return res;
		}
		public static boolean Primos(int numeros) {
			 for (int i = numeros - 1; i >= 2; i--) {
     	        if (numeros % i == 0) {
     	        	return false;
     	        } 
		} return true;
	}
	
	System.out.println("Hello World");
}

