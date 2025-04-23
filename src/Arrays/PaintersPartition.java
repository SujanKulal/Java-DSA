package Arrays;

public class PaintersPartition {
    static boolean isPossible(int[] ar, int a, int m) {
        int painters = 1;
        int pbc = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > m) return false;

            if (pbc + ar[i] <= m) {
                pbc += ar[i];
            } else {
                painters++;
                if (painters > a) return false;
                pbc = ar[i];
            }
        }
        return true;
    }

    static int maxTime(int[] ar, int a, int b) {
        int l = 0, h = 0;
        for (int val : ar) h += val;

        int res = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (isPossible(ar, a, m)) {
                res = m;
                h = m - 1;
            } else {
                l = m + 1;  // ✅ Corrected here
            }
        }
        return res * b;
    }

    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40};
        int a = 2;
        int b = 2;
        System.out.println(maxTime(ar, a, b)); // Output should be 120
    }
}
