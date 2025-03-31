package Arrays;

public class CeilAndFloor {
    static int ceil(int[] a, int key) {
        int s = 0, e = a.length - 1, ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (a[m] == key) {
                return a[m]; // Key found, return it directly
            } else if (a[m] < key) {
                s = m + 1; // Move right
            } else {
                ans = a[m]; // Possible ceil
                e = m - 1; // Move left
            }
        }
        return ans; // If no ceil found, return -1
    }

    static int floor(int[] a, int key) {
        int s = 0, e = a.length - 1, ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (a[m] == key) {
                return a[m]; // Key found, return it directly
            } else if (a[m] < key) {
                ans = a[m]; // Possible floor
                s = m + 1; // Move right
            } else {
                e = m - 1; // Move left
            }
        }
        return ans; // If no floor found, return -1
    }

    public static void main(String[] args) {
        int[] a = {12, 24, 45, 56, 74, 93};

        int key = 54;
        System.out.println("Floor: " + floor(a, key));
        System.out.println("Ceil: " + ceil(a, key));

    }
}
