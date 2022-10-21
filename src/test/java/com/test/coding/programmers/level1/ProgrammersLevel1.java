package com.test.coding.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ProgrammersLevel1 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/12906
     */
    @Test
    void 같은_숫자는_싫어(){
        int[] arr = {};
        int[] answer = {};
        int arrLen = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i <= arrLen-2 ; i++){
            if(i <  arrLen-2){
                if(arr[i] != arr[i+1]){
                    list.add(arr[i]);
                }
            } else if(i == arrLen-2){
                if(arr[i] != arr[i+1]){
                    list.add(arr[i]);
                    list.add(arr[i+1]);
                } else{
                    list.add(arr[i+1]);
                }
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
