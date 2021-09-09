package com.morbidbyte.palindromeWithStack;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        System.out.println(checkPalindrome("abccba"));

        System.out.println(checkPalindrome("I did, did I?"));

        System.out.println(checkPalindrome("Golfo"));


    }

    public static boolean checkPalindrome(String string){


        LinkedList<Character> stack = new LinkedList<>();

        StringBuilder stringNotPuntuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                stringNotPuntuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedStringBuilder = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversedStringBuilder.append(stack.pop());
        }


        //compare two stringBuilders.
        return stringNotPuntuation.toString().equals(reversedStringBuilder.toString());

    }

}
