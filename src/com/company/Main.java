package com.company;


public class Main {

    public static void main(String[] args) {
        
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++){
                array[i] = array.length-1-i;
        }

        System.out.println();
        for(int x:array){

                System.out.println("array["+ x + "] = " + array[x]);
        }
    }
}
