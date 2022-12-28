package Methods;

public class Sleep {

    public static void main(String[] args) throws InterruptedException {


        int n=8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(i==0 || i==n-1 || j==(n-1)/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");
            Thread.sleep(100);
            for (int j = 0; j < n; j++) {
                if(j==0||j==n-1||i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");
            Thread.sleep(100);
            for (int j = 0; j < n; j++) {
                if(j==0|| i==n-1 ||i==0 || i==(n-1)/2 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");
            Thread.sleep(100);
            for (int j = 0; j < n; j++) {
                if(j==0 && i!=n-1|| j==n-1 && i!=n-1 || i==n-1 && j>0 && j<n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("   ");
            Thread.sleep(100);
            for (int j = 0; j < n; j++) {
                if(j==0 || i==0 && j!=n-1 || j==n-1 && i<(n-1)/2 && i!=0 || i==(n-1)/2 && j!=n-1 || i==j && i>(n-1)/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");
            Thread.sleep(100);
            for (int j = 0; j < n; j++) {
                if(j==0 && i!=0 && i!=n-1|| j== n-1 && i!=0 && i!=n-1||i==0 && j!=0 && j!=n-1 || i==n-1 && j!=n-1 && j!=0 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");
            Thread.sleep(100);
            for (int j = 0; j < n; j++) {
                if(j==0||j==n-1||i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}

