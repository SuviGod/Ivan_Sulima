package edu.sulima;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static Integer getNextBigger(Integer givenNumber){
        List<Integer> numberInList = new ArrayList<>();
        while(givenNumber != 0) {
            numberInList.add(givenNumber % 10);
            givenNumber /= 10;
        }
        Integer answer = -1;
        for(int i = 0; i < numberInList.size() - 1; i++) {
            for (int j = i + 1; j < numberInList.size(); j++) {
                if (numberInList.get(i) > numberInList.get(j)) {
                    for(int r = i; r < j; r++){
                        Integer temp = numberInList.get(r);
                        numberInList.set(r, numberInList.get(r+1));
                        numberInList.set(r + 1, temp);
                    }
                    answer = 0;
                    for (int k = 0; k < numberInList.size(); k++) {
                        answer += numberInList.get(k) * (int) Math.pow(10, k);
                    }
                }
            }
        }
        return answer;
    }
}
