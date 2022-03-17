package com.programmers;

class test {
    public String solution(String phone) {
        String answer = "";
        char charAdd ='0';
        char charAdd2 ='-';

        String zero = phone.substring(0,0)+charAdd+phone.substring(0,10);
        answer = zero.substring(0,3) + charAdd2 + zero.substring(3,7) + charAdd2 + zero.substring(7,11);

        return answer;
    }

    public static void main(String[] args) {
        test method = new test();
        System.out.println(method.solution("1062509911"));
    }
}


