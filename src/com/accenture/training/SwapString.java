package com.accenture.training;

public class SwapString {
    public static void main(String[] args){
        /*String str = "Welcome";*/
        if( args.length > 0 && args[0] != null && !args[0].equals("")) {
            String str = args[0];
            System.out.println("Original string: " + str );
            System.out.println("Is Palindrome?: " + SwapString.palindromeCheck(str) );
            System.out.println("Is Palindrome (Ignoring spaces)?: " + SwapString.palindromeCheckIgnoreSpace(str) );
            /*String swapped = SwapString.recursiveSwap(str);
            System.out.println("Swapped string:" + swapped);*/
        } else {
            System.out.println("Parametros incorrectos");
        }
    }

    private static String swapString(String original) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < original.length(); i++){
            sb.append(original.charAt(original.length() - i - 1));
        }
        return sb.toString();
    }

    private static String recursiveSwap(String original) {
        if(original.length()== 1){
            return original;
        } else {
            return original.charAt(original.length() - 1) + recursiveSwap(original.substring(0, original.length() - 1));
        }
    }

    private static boolean palindromeCheck(String original) {
        return original.toLowerCase().equals(recursiveSwap(original.toLowerCase()));
    }

    private static boolean palindromeCheckIgnoreSpace(String original) {
        original = original.replace(" ","");
        return original.toLowerCase().equals(recursiveSwap(original.toLowerCase()));
    }
}
