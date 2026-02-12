public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] a = {1,7,4,3,5};
        int n = a.length;
        System.out.println("Second smallest element is: " + secondSmallest(a, n));
    }
    public static int secondSmallest(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }
}
