package edu.sulima;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static String sortGuests(String string){
        string = string.toUpperCase();
        List<String> dividedGuests = List.of(string.split(";"));
        int n = dividedGuests.size();
        List<List<String>> newDividedGuests = dividedGuests.stream()
                .map(str -> List.of(str.split(":")))
                .sorted((g1, g2) -> {
                    for(int i = 0; i < n; i++){
                        Integer s = g1.get(1).compareTo(g2.get(1));
                        if(s != 0) return s;
                        s = g1.get(0).compareTo(g2.get(0));
                        return s;
                    }
                    return 0;
                })
                .collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        for(List<String> guest: newDividedGuests){
            stringBuilder.append("(");
            stringBuilder.append(guest.get(1));
            stringBuilder.append(", ");
            stringBuilder.append(guest.get(0));
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }
}
