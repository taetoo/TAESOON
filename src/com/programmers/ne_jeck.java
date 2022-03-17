package com.programmers;

import java.util.Arrays;

public class ne_jeck {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i < a.length; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }
    public static void  main(String[] args){
        ne_jeck se = new ne_jeck();
        int a [] ={1,2,3,4};
        int b [] ={-3,-1,0,2};
        System.out.println((se.solution(a,b)));
    }
}
