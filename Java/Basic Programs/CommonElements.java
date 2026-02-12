public class CommonElements {
    public static void main(String[] args) {
        int[] a={1,5,7,2};
        int[] b={3,9,8,2};
        int i=0;
        for (int j=0;j<a.length;j++) {
            if (a[i]==b[j]) {
                System.out.println("Common element is: "+ a[i]);
                break;
            }
            else i++;
        }
    }
}
