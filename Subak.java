class Subak {
    public String solution(int n) {
        String answer = "";

        // n만큼 반복문 돌려서 순서대로 문자열 더해주기
        for (int i = 0; i < n; i++) {
            // 인덱스 값인 i가 짝수일 때, "수" 출력
            if (i % 2 == 0) {
                answer += "수";
                // 위의 조건이 아닐 때, "박" 출력
            } else {
                answer += "박";
            }
        }
        return answer;
    }
    public static void  main(String[] args){
        Subak se = new Subak();
        System.out.println(se.solution(9));
    }
}
