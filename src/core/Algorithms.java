package core;

import java.util.Arrays;

public class Algorithms {

	// INSERTION SORT
	public int[] insertionSort(int parametro[]) {
		int nome[] = parametro;
		int num = 0;
		for (int i = 0; i < nome.length; i++) {
			num = nome[i];
			for (int j = i - 1; (j >= 0) && (nome[j] > num); j--) {
				nome[j + 1] = nome[j];
				nome[j] = num;
			}
		}
		return nome;
	}

	// SELECTION SORT
	public int[] selectionSort(int parametro[]) {
		int index_min;
		int aux;

		int v[] = parametro;

		for (int i = 0; i < v.length - 1; i++) {
			index_min = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[index_min]) {
					index_min = j;
				}
			}
			if (index_min != i) {
				aux = v[index_min];
				v[index_min] = v[i];
				v[i] = aux;
			}
		}
		return v;
	}

	public int[] bubbleSort(int parametro[]) {
		int v[] = parametro;

		for (int i = v.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (v[j - 1] > v[j]) {
					int aux = v[j];
					v[j] = v[j - 1];
					v[j - 1] = aux;
				}
			}
		}
		return v;
	}

	// MERGESORT
	// http://geeksonjava.com/algorithms/sort/merge-sort.php
	public int[] mergeSort(int input[], int start, int end) {
		int mid = (start + end) / 2;
		if (start < end) {
			/** DIVIDE: Split from start to mid */
			mergeSort(input, start, mid);

			/** DIVIDE: Split from mid + 1 to end */
			mergeSort(input, mid + 1, end);

			/** CONQUER: Sort & Merge the two arrays */
			merge(input, new int[input.length], start, mid, end);
		}
		return input;
	}

	private static void merge(int input[], int inputCopy[], int start, int mid,
			int end) {
		/**
		 * So we have 2 arrays to be SORTED and MERGED. To go through every
		 * element we need to find the start of each array.
		 */
		int firstArrStart = start, secondArrStart = mid + 1;
		/**
		 * We create a copy of the area that we want to work on as We will be
		 * modifying it as we read it and we need to make decisions on the data
		 * before modification
		 */
		for (int i = start; i <= end; i++)
			inputCopy[i] = input[i];
		/** See post content for explanation of merge routine */
		while (secondArrStart <= end && firstArrStart <= mid)
			if (inputCopy[firstArrStart] >= inputCopy[secondArrStart])
				input[start++] = inputCopy[secondArrStart++];
			else
				input[start++] = inputCopy[firstArrStart++];

		while (firstArrStart <= mid)
			input[start++] = inputCopy[firstArrStart++];

		while (secondArrStart <= end)
			input[start++] = inputCopy[secondArrStart++];
	}

	public int[] quickSort(int[] v, int ini, int fim) {
		int meio;
		if (ini < fim) {
			meio = partition(v, ini, fim);
			quickSort(v, ini, meio);
			quickSort(v, meio + 1, fim);
		}
		return v;
	}

	public static int partition(int[] v, int ini, int fim) {
		int pivo, topo, i;
		pivo = v[ini];
		topo = ini;

		for (i = ini + 1; i <= fim; i++) {
			if (v[i] < pivo) {
				v[topo] = v[i];
				v[i] = v[topo + 1];
				topo++;
			}
		}
		v[topo] = pivo;
		return topo;
	}

	// BINARY SEARCH
	public int binarySearch(int[] array, int valor) {
		int esq = 0;
		int dir = array.length - 1;
		int valorMeio;

		while (esq <= dir) {
			valorMeio = esq + ((dir - esq) / 2);
			if (array[valorMeio] < valor) {
				esq = valorMeio + 1;
			} else if (array[valorMeio] > valor) {
				dir = valorMeio - 1;
			} else {
				return valorMeio;
			}
		}
		return -1;
	}

}
