package me.leonadel.retosjava;

public class SortAlgorithms {
	public static void main(String []args) {
		int[] list = {25,43,63,24,12};
		System.out.println("Unsorted:");
		for(int i=0; i<list.length; i++) System.out.println(list[i]);
		list=bubbleSort(list);
		System.out.println("Sorted:");
		for(int i=0; i<list.length; i++) System.out.println(list[i]);
	}
	
	//Ordenamiento burbuja de menor a mayor
	public static int[] bubbleSort(int[] array) {
		boolean swap=true;
		int i,aux;
		if(array.length<1) return array;
		
		do {
			swap=false;
			for(i=0; i<array.length-1; i++) {
				if(array[i]>array[i+1]) {
					aux=array[i];
					array[i]=array[i+1];
					array[i+1]=aux;
					swap=true;
				}
			}
		} while(swap);
		return array;
	}
}
