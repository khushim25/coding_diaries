import java.util.*;

public class giftcheck {
    public static void find_youngest_member(int n, int m, int[][] gifts) {
        //line one is basically n -> fam mem , m -> num of gift
        // m times lines has two integers each -> a fam mem give gift to b fam mem
        //  we can use hashmaps to keep cound of givft given
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            map.put(i, 0);
        }
        
        for(int i = 0; i < m; i++) {
            int giftGiven = gifts[i][0];
            int giftTaken = gifts[i][1];
            map.put(giftGiven, map.get(giftGiven) - 1);
            map.put(giftTaken, map.get(giftTaken) + 1);
        }

        for(int i = 1; i <= n; i++) {
            if(map.get(i) == n-1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("-1");
        // Write your logic here.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gifts = new int[m][2];
        for (int i = 0; i < m; i++) {
            gifts[i][0] = scanner.nextInt();
            gifts[i][1] = scanner.nextInt();
        }
        find_youngest_member(n, m, gifts);
    }
}