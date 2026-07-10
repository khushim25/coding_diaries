import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class distinctk {
    public static void find_kth_distinct_string(int N, ArrayList<String> list, int K) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++ ) {
            String str = list.get(i);
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        ArrayList<String> uniqueStrings = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String str = list.get(i);
            if(map.get(str) == 1) {
                uniqueStrings.add(str);
            }
        }
        if(uniqueStrings.size() < K) {
            System.out.println("-1");
        } else {
            System.out.println(uniqueStrings.get(K - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GO");
        int N = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(sc.next());
        }
        int K = sc.nextInt();
        find_kth_distinct_string(N, list, K);
    }
}