package com.accenture.training;

public class Sorting {
    public static void main(String[] args) {
        int[] original = new int[]{9,8,7,6,5,4,3,2,1};
        int[] original2 = new int[] {1,1,2,0,0,0,3,5,5,8,2,2,1,4,9,2,0,0,0,0,0};
        ArrayDuplicate.printArray(bubbleSort(original));
    }

    private static int[] bubbleSort(int[] original) {
        if( original.length > 1) {
            int index = 0;
            do{
                if(original[index] > original[index+1]){
                    int temp = original[index];
                    original[index] = original[index+1];
                    original[index+1] = temp;
                    index = 0;
                } else {
                    index ++;
                }
            }while(index < original.length - 1);
        }
        return original;
    }
}
