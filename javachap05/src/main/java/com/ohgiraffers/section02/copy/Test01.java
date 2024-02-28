package com.ohgiraffers.section02.copy;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        int[] original ={1,2,3,4,5,5,6,7,8,9,10};
        
        int[] copy = Arrays.copyOf(original,5);

        for ( int i : copy ){
            System.out.print(i + " ");
        }



    }
}
