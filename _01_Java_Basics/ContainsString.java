package _01_Java_Basics;

import java.util.HashMap;
import java.util.Map;

public class ContainsString {
    public static boolean sePoateFormaCuvantul(String cuvantDecupat, String cuvantDeCreat) {
        Map<Character, Integer> map = new HashMap<>();

        if (cuvantDecupat.length() < cuvantDeCreat.length()) return false;

        for (int i = 0; i < cuvantDecupat.length(); i ++) {
            if (!map.containsKey(i))
                map.put(cuvantDecupat.charAt(i), 0);
            else {
                map.put(cuvantDecupat.charAt(i), map.get(cuvantDecupat.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < cuvantDeCreat.length(); i++) {
            if (map.containsKey(i))
                map.put(cuvantDecupat.charAt(i), map.get(cuvantDecupat.charAt(i)) - 1);
            }
        
            for (int i : map.values())
                if (i < 0) return false;
              

        return true;
    }

    public static boolean sePoateFormaCuvantul2(String cuvantDecupat, String cuvantDeCreat) {
        Map<Character, Integer> map = new HashMap<>();

        for(char litera: cuvantDecupat.toCharArray()) {
            map.put(litera, map.getOrDefault(map, 0) + 1);
        }

        for(char litera: cuvantDeCreat.toCharArray()) {
            if (!map.containsKey(litera) || map.get(litera) == 0)
                return false;
            map.put(litera, map.get(litera) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "adda";
        String str = "dada";
        System.out.println(sePoateFormaCuvantul(s, str));
    }
}
