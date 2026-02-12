class RepeatingNumber{
    public static void main(String[] args) {
        int[] a= {4,3,6,2,1,1};
        int i=1 ;
        for (int j=0;j<a.length;j++) {
            if (a[i]==a[j]) {
                System.out.println("Repeating number is: "+ a[i]);
                break;
            }
            else i++;
            }
        }
        
    }
