package javaxm3.sbww;

import java.util.*;
//所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
//
//编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。
//

public class MyLeetCode0215 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> map = new HashSet<>();
        List<String> aus = new LinkedList<>();
        for (int i = 0; i <= s.length()-10; i++) {
            String a = "";
            for (int j = 0; j < 10; j++) {
                a+=s.charAt(i+j);
            }
            if(map.contains(a))
            {
                if (!aus.contains(a)) aus.add(a);
            }else {
                map.add(a);
            }
        }
        return aus;
    }
}
