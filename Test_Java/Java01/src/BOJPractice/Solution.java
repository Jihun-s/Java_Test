package BOJPractice;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int[][] lines = { {0, 6}, {0, 6}, {0, 6} };  // 입력값 배열
        int answer = 0, size1 = 0, size2 = 0, size3 = 0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(int i = lines[0][0]; i<=lines[0][1]; i++){
            if(i>=lines[1][0]&&i<=lines[1][1]){
                list1.add(i);
            }
            if(!(i>lines[1][0]&&i<lines[1][1])
                &&(i>=lines[2][0]&&i<=lines[2][1])){
                list2.add(i);
            }
        }
        for(int i = lines[2][0]; i<=lines[2][1]; i++){
            if(!(i>lines[0][0]&&i<lines[0][1])
               &&(i>=lines[1][0]&&i<=lines[1][1]))
                list3.add(i);
        }
        if(list1.size()!=0)
            size1 = list1.size()-1;
        if(list2.size()!=0)
            size2 = list2.size()-1;
        if(list3.size()!=0)
            size3 = list3.size()-1;
        answer = size1 + size2 + size3;
        
        System.out.println(list1);  // 결과 출력
    }
}