package Arrays;

public class WoodCutting {

    static int findWoodCount(int[] ht, int m) {
        int wc = 0;
        for (int j : ht) {
            if (j > m) {
                wc += (j - m);
            }
        }
        return wc;
    }

    static int machineHeight(int[] ht, int b) {
        int max = 0;
        for (int h : ht) {
            if (h > max) max = h;
        }

        int l = 0, h = max;
        int ans = -1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            int wc = findWoodCount(ht, m);

            if (wc >= b) {
                ans = m;       // store valid answer
                l = m + 1;     // try for a taller height
            } else {
                h = m - 1;     // try lower height
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ht = {20, 15, 10, 17};
        int b = 8;
        System.out.println("Max machine height: " + machineHeight(ht, b));
    }
}
