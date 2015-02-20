package core;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Algorithms algo = new Algorithms();
		
	/*	//INSERTION SORT
		int insertion[] = { 2, 3, 4, 5, -3, -1, -4, -2 };
		insertion = algo.insertionSort(insertion);
		imprimeVetorInteiro(insertion);
		
		*/
		
		//SELECTION SORT
		int selection[] = { 2, 3, 4, 5, -3, -1, -4, -2 };
		selection = algo.selectionSort(selection);
		imprimeVetorInteiro(selection);
		
		
		//BUBBLE SORT
	/*	int bubble[] = { 2, 3, 4, 5, -3, -1, -4, -2 };
		bubble = algo.bubbleSort(bubble);
		imprimeVetorInteiro(bubble);*/
		
		
		//BINARY SEARCH
	/*	int selection[] = { 2, 3, 4, 5, -3, -1, -4, -2 };
		selection = algo.selectionSort(selection);
		System.out.println("Busca binária encontrou o valor no índice " + algo.binarySearch(selection, 5)  + "!");*/
		
		
		//MERGESORT
	/*	int merge[] = { 2, 3, 4, 5, -3, -1, -4, -2 };
		merge = algo.mergeSort(merge, 0, merge.length - 1);
		imprimeVetorInteiro(merge);*/
		
		
		//QUICKSORT
	/*	int quick[] = { 2, 3, 4, 5, -3, -1, -4, -2 };
		quick = algo.quickSort(quick, 0, quick.length - 1);
		imprimeVetorInteiro(quick);*/

	}
	
	
	static void imprimeVetorInteiro(int vetor[]) {
		System.out.print("O vetor ordenado é: " );
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

}
