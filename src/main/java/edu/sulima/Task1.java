package edu.sulima;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<Integer> getIntegersFromList(List<Object> list){

        List<Integer> newList = new ArrayList<>();
        for(Object object: list){
            if(object instanceof Integer){
                newList.add((Integer)object);
            }
        }
        return newList;
    }
}
