package com.company;
//Main 커밋 테스트 branch
public class Main {
    public int solution(int[] arr1, int[] arr2) {
//        int answer = 0;

//        #01 일반 for문과 if문 사용
//        for (int i = 0; i < arr1.length; i++ ) {
//            if (arr2[i] >= 29) {
//                arr2[i] = 21;
//            }
//            answer += arr2[i]-arr1[i];
//        }
//        return answer;
//
//       #02 일반 for문과 삼항연산자
         int answer = 0;
         int sum = 0;

         for (int i = 0; i < arr1.length; i++ ) {
             sum += (arr2[i] >= 29) ? arr2[i]=21 - arr1[i] : arr2[i] - arr1[i];
         }
        return sum;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }
}