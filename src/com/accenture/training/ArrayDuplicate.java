package com.accenture.training;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] original = new int[] {1,1,2,0,0,0,3,5,5,8,2,2,1,4,9,2,0,0,0,0,0};
        int[] res = ArrayDuplicate.findDuplicates(original);
        printArray(res);
    }

    private static int[] findDuplicates(int[] numbers) {
        if(numbers.length > 1){
            int[] res = new int[]{};
            int resIndex = 0;
            int actual = numbers[0];
            int index = 1;
            do {
                for(int j = index ; j < numbers.length ; j++){
                    boolean already =  false;
                    for (int p: res) {
                        if(actual == p){
                            already = true;
                            break;
                        }
                    }
                    if(actual == numbers[j] && !already) {
                        int[] temp = new int[resIndex + 1];
                        if(res.length > 0 ){
                            System.arraycopy(res,0,temp,0,res.length);
                        }
                        res = temp;
                        res[resIndex++] = actual;
                    }
                }
                actual = numbers[index++];
            } while(index < numbers.length);
            return res;
        }
        return new int[]{};
    }

    public static void printArray(int[] arr) {
        System.out.print("Result array: [");
        for(int i = 0; i < arr.length ; i++){
            if(i == 0){
                System.out.print(arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
        System.out.print("]");
    }
}
