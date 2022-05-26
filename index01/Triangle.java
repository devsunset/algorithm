package index01;

public class Triangle {

    public static void main(String[] args){
        int cnt = 5;
        tringleLB(cnt);
        tringleLU(cnt);
        tringleRU(cnt);
        tringleRB(cnt);
        spira(7);
        npira(cnt);
    }

    public static void tringleLB(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public static void tringleLU(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public static void tringleRU(int n){
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public static void tringleRB(int n){
       for(int i=n;i > 0;i--) {
           for (int k=0;k<i-1; k++){
               System.out.print(" ");
           }
           for (int j=n-i;j>=0; j--){
               System.out.print("*");
           }
           System.out.println();
       }
        System.out.println("----------------------");  
    }

    public static void spira(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print('*');
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public static void npira(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print(i % 10);
            System.out.println();
        }
        System.out.println("----------------------");
    }
}
