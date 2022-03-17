package com.programmers;

class min_wallet {
    public int solution(int[][] sizes) {
        int min = 0;
        int max = 0;

        // 배열의 정렬(큰수로)
        for(int i = 0; i < sizes.length; i++){
           int a = Math.max(sizes[i][0],sizes[i][1]); //배열의 0번째 인덱스가 큰 수로 정렬(각각 인덱스마다 적용 (1,10) > (10, 1))
           int b = Math.min(sizes[i][0],sizes[i][1]); //배열의 1번째 인덱스 정렬
           sizes[i][0] = a;
           sizes[i][1] = b;
        }
        // 정렬된 배열에서 큰수 찾아서 max, min 변수에 재할당;
        for(int i = 0; i < sizes.length; i++){
            max = Math.max(max, sizes[i][0]); // 0번째 인덱스에서 가장 큰수
            min = Math.max(min, sizes[i][1]); // 1번째 인덱스에서 가장 큰수
        }
        return max * min;  //가장 큰 수에서 가장 작은수
    }
    public static void  main(String[] args){
        min_wallet se = new min_wallet();
        int sizes [][] ={{60,50},{30,70},{60,30},{80,40}};
        System.out.println(se.solution(sizes));
    }



}
