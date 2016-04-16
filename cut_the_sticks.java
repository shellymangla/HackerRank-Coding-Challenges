import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min,cnt=0;
        int lengths[] = new int[n];
       

        for (int i = 0; i < n; i++)
            lengths[i] = sc.nextInt();

        sc.close();
        Arrays.sort(lengths);

        for (int i = 0; i < n; i++) {
            if (lengths[i] == 0)
                continue;
            else {
                min = lengths[i];
                
                for (int j = i; j < n; j++) {    // This loop isn't working like it should
                    lengths[j] -= min;
                    cnt++;
                 // System.out.print(lengths[j] + " ");  // For debugging purposes
                }
                System.out.println(cnt);
                cnt=0;
             // System.out.println("");
            }
        }

            }
}
