package edu.sulima;

import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.util.List;

public class Task7 {
    public static String getIpv4(Long decNumber){
        String binaryString = StringUtils.leftPad(Long.toBinaryString(decNumber), 32, "0");
        List<String> octetList = List.of(binaryString.substring(0, 8),
                binaryString.substring(8, 16),
                binaryString.substring(16, 24),
                binaryString.substring(24, 32));
        StringBuilder stringBuilder = new StringBuilder();
        for(String octet: octetList){
            Integer decOctet = Integer.parseInt(octet, 2);
            stringBuilder.append(decOctet);
            stringBuilder.append(".");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
