
import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        int[] freq = new int[n + 1];

        long minPrice = Long.MAX_VALUE;

        for (int[] item : items) {
            freq[item[0]]++;
            minPrice = Math.min(minPrice, item[1]);
        }

        int[] gain = new int[n + 1];

        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                gain[i] += freq[j];
            }
            gain[i]--;
        }

        
        Arrays.sort(items, (a, b) ->
            Integer.compare(a[1], b[1])
        );

        long remaining = budget;
        long ans = 0;

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            if (price >= 2 * minPrice) {
                break;
            }

            long take = Math.min(
                gain[factor],
                remaining / price
            );

            ans += take * 2;
            remaining -= take * price;
        }

        
        ans += remaining / minPrice;

        return (int) ans;
    }
}
