package index02;

public class ArrayStructure {

    static void swap(int [] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        for(int i=0;i<a.length / 2 ; i++){
            swap(a,i,a.length-i -1);
        }
    }

    public static void main(String[] args){
       int[] a = new int[5];
       a[0] = 1;
       a[1] = 2;
       a[2] = 3;
       a[3] = 4;
       a[4] = 5 ;

       for (int i = 0; i < a.length; i++){
           System.out.println(a[i]);
       }
       System.out.println("--------------");

        int[] b = {1,2,3,4,5};

        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }

        System.out.println("--------------");

        int[] c = b.clone();

        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }

        System.out.println("--------------");

        int max = c[0];
        for (int i =1; i < c.length ; i++){
            if (c[i] > max) {
                max = c[i];
            }
        }

        System.out.println(max);

        System.out.println("--------------");

        reverse(c);

        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }

    }
}
