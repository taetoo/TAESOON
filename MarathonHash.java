package com.company;
import java.util.*;
// 완주하지 못한 선수 문제 깃 테스트
// 제발 푸쉬되라....
// 내 원격에 풀 성공 기원

public class MarathonHash {
    public String solution(String[] participant, String[] completion) {
        // HashMap = key와 value의 조합 = 전화번호부! ( key: 철수 > 철수의 전화번호 : value )
        // 요소를 찾을 때 매번 검색하기 보다는 보다 효율적으로 검색할 수 있게 도와주는 자료구조

        // 01 - HashMap 만들기 (participant 기준)
        // 02 - HashMap 빼기 (completion)
        // 03 - value가 0이 아닌 마지막 주자 찾기

        String answer = "";

        // String 형태의 key와 Int 형태의 value인 map 생성
        HashMap<String, Integer> map = new HashMap<>();

        // key = participant에 있던 모든 정보를 map에 넣어주기(map.put())
        // value = map에서 만약 player가 없다면 0으로 하고 +1, 있으면 이전 값에 +1로 세팅 -> 동명이인이 있을 경우 고려
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) +1); // getOrderDefault():찾는 value가 존재하면 해당 value의 값을 반환하고,없으면 기본값을 반환해주는 함수

        // completion에 있던 모든 정보를 map에 넣어주고, player가 기존에 가지고 있는 값을 가져와서(mpa.get()) -1 해주기.
        // 즉, 참가한 선수를 완주한 선수의 상태로 만들기 위해 1 -> 0으로 바꿔주기
        for (String player : completion)
            // map의 key = player, value = 기존 값 -1
            map.put(player, map.get(player)-1);

        // map의 key값을 모두 꺼내와서(map.keySet()) key는 값에 담고,
        // key라는 값이 0이 아닐 경우에 해당하는 key(선수이름)을 answer값에 담아주기
        // 완주를 못한 1명만 찾는 것이기 때문에 break를 넣어 효율적으로 구현 !
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MarathonHash se = new MarathonHash();
        String [] part = {"leo", "kiki", "eden"};
        String [] comp = {"kiki", "eden"};
        System.out.println(se.solution(part,comp));
    }
}

