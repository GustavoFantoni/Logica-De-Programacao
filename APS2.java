import javax.swing.JOptionPane;

public class APS2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String entraMat, entraIdade, opcao;
        int opcaoConv, comprimento, compIdade, cpm, guardaIdd, cpmMatri, matrTemp;
        int Idades[] = new int[20];
        int Matriculas[] = new int[20];

        for (int i = 0; i < 20; i++) {
            entraMat = JOptionPane.showInputDialog("Informe sua Matricula: ");
            entraIdade = JOptionPane.showInputDialog("Informe sua Idade: ");
            

            Matriculas[i] = Integer.parseInt(entraMat);
            Idades[i] = Integer.parseInt(entraIdade);
        }
        
        do {
        	//MENU
        	opcao = JOptionPane.showInputDialog("ESCOLHA SUA OPCAO" +
                    "\n\n\t1. MOSTRAR\n\t2. ORDENAR CRESCENTE POR MATRICULA" +
                    "\n\t3. ORDENAR DECRESCENTE POR IDADE\n\t4. INVERTER" +
                    "\n\t5. PROCURAR IDADE\n\t6. PROCURAR MATRICULA" + 
                    "\n\t7. REPETE \n\t99. VAZAR");
        	opcaoConv = Integer.parseInt(opcao);
        	//MENU
        	
        	
        	switch (opcaoConv) {
        	
        	
        	// MOSTRA DADOS [DA MESMA SEQUÊNCIA EM QUE FORAM DIGITADOS]
        	case 1:
	        System.out.println("Matriculas: ");
	        for (int matricula : Matriculas) {
	            System.out.print(matricula + " ");
	        }
	        System.out.println(); // Usei para pular linha no console
	        System.out.println("Idades: ");
	        for (int idade : Idades) {               //VARIÁVEL idade PERCORRE A ARRAY Idades, PARA DEPOIS PRINTAR.        [FOR EACH]
	            System.out.print(idade + " ");
	        }
	        System.out.println();
	        break;
	      
	        // ORGANIZA MATRÍCULAS
        	case 2:
        		comprimento = Matriculas.length;
        		for (int i = 0 ; i < comprimento - 1 ; i++) {             // Usado para percorer a array  (loop externo)
        			for (int j = 0 ; j < comprimento - i - 1 ; j++) {    // Usado para comparar os itens (loop interno)
        				if (Matriculas[j] > Matriculas[j + 1]) {        // Verifica se o indice atual é maior que o sucessor
        					int varTemporaria = Matriculas[j];         // Guarda o valor atual em uma variavel temporária
        					Matriculas[j] = Matriculas[j + 1];        // Substitui o elemento atual pelo próximo elemento.
        					Matriculas[j + 1] = varTemporaria;       // Coloca o elemento temporário no lugar do próximo elemento.
        				}
        			}
        		}
        		 System.out.println("Matriculas organizadas de forma crescente: ");
     	        for (int matricula : Matriculas) {
     	            System.out.print(matricula + " ");
     	        }
     	        
     	        
     	        //ORGANIZO AS IDADES JUNTAMENTE COM AS MATRÍCULAS, PORÉM NÃO MOSTRO ELAS
     	        cpm = Idades.length;
     	        for (int i = 0 ; i < cpm - 1 ; i++) {
     	        	for (int j = 0 ; j < cpm - i - 1 ; j++) {
     	        		if (Idades[j] > Idades [j + 1] ) {
     	        			guardaIdd = Idades[j];
     	        			Idades[j] = Idades[j + 1];
     	        			Idades[j + 1] = guardaIdd;
     	        		}
     	        	}
     	        }
     	        
     	        
     	       System.out.println();
        	break;
        	
        	// ORGANIZA IDADES
        	case 3: 
        		compIdade = Idades.length;
        		for (int i = 0; i < compIdade - 1; i++) {
        		    for (int j = 0; j < compIdade - i - 1; j++) {
        		        if (Idades[j] < Idades[j + 1]) {
        		            int varTempIdade = Idades[j];
        		            Idades[j] = Idades[j + 1];
        		            Idades[j + 1] = varTempIdade;
        		        }
        		    }
        		}
        		System.out.println("Idades Organizadas de forma Decrescente: ");
     	        for (int idade : Idades) {
     	            System.out.print(idade + " ");
     	        }
     	        
     	     //ORGANIZO AS MATRICULAS JUNTAMENTE COM AS IDADES, PORÉM NÃO MOSTRO ELAS
     	        cpmMatri = Matriculas.length;
     	        for (int i = 0; i < cpmMatri - 1; i++) {
     	        	for (int j = 0 ; j < cpmMatri - i - 1 ; j++) {
     	        		if (Matriculas[j] < Matriculas[j + 1]) {
     	        			matrTemp = Matriculas[j];
     	        			Matriculas[j] = Matriculas[j + 1];
     	        			Matriculas[j + 1] = matrTemp;
     	        		}
     	        	}
     	        }

     	       System.out.println();
        	break;
        	
        	
	        //INVERTER IDADES E MATRÍCULAS
        	case 4:
                int left = 0;
                int right = Idades.length - 1;

                while (left < right) {
                    int guardaLeft = Idades[left];
                    Idades[left] = Idades[right];
                    Idades[right] = guardaLeft;
                    left++;
                    right--;
                }
                System.out.println("Ordem de Idades Invertida: ");
                for (int idade : Idades) {
                    System.out.print(idade + " ");
                }
                System.out.println();

                int leftMat = 0;
                int rightMat = Matriculas.length - 1;

                while (leftMat < rightMat) {
                    int guardaLeftMat = Matriculas[leftMat];
                    Matriculas[leftMat] = Matriculas[rightMat];
                    Matriculas[rightMat] = guardaLeftMat;
                    leftMat++;
                    rightMat--;
                }
                System.out.println("Ordem de Matriculas Invertida:");
                for (int mat : Matriculas) {
                    System.out.print(mat + " ");
                }
                System.out.println();
                break;
                
                
                
            // MATRICULA MOSTRA IDADE	
        	case 5:
        	    String infMatricula = JOptionPane.showInputDialog("Informe a Matricula para saber a IDADE: ");
        	    int ValorInf = Integer.parseInt(infMatricula);
        	    boolean MatEncontrada = false;

        	    int indice = 0;

        	    for (int matricula : Matriculas) {
        	        if (matricula == ValorInf) {
        	            System.out.println("Idade da Matricula: " + ValorInf + " eh igual a: " + Idades[indice]);
        	            MatEncontrada = true;
        	        }
        	        indice++; 
        	    }

        	    if (!MatEncontrada) {
        	        System.out.println("Matricula nao encontrada.");
        	    }
        	    break;
        	    
        	    
        	//INDICE MATRICULA
        	case 6:
        		String NumMat = JOptionPane.showInputDialog("Informe A MATRICULA para saber seu indice: ");
        		int NumMatConvertido = Integer.parseInt(NumMat);
        		int comp = Matriculas.length;
        		for (int i = 0 ; i < comp ; i++) {
        			if (Matriculas[i] == NumMatConvertido) {
        				System.out.println("Indice desta matricula: " + i);
        			}
        		}
        		break;

        	//REPETIDO
        	case 7:
        		boolean matriculasRepetidas = false;
        		int compr = Matriculas.length;
        		for (int i = 0; i < compr; i++) {
        		    boolean matriculaRepetida = false;

        		    for (int j = i + 1; j < compr; j++) {
        		        if (Matriculas[i] == Matriculas[j]) {
        		            matriculaRepetida = true;
        		            matriculasRepetidas = true;
        		        }
        		    }

        		    if (matriculaRepetida) {
        		        System.out.println("Matrícula repetida: " + Matriculas[i]);
        		    }
        		}

        		if (!matriculasRepetidas) {
        		    System.out.println("Não foram encontradas matrículas repetidas.");
        		}

	    
        	}
	        } while (opcaoConv != 99);
	        System.out.println("\nOBRIGADO POR USAR O SISTEMA");
        	
    }
}
