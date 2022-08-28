import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Reads Three Number=\n");
        int x,y,z;
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(x==y&&x==z)
            System.out.println("All The Same");
         else if(x!=y&&x!=z)
            System.out.println("All Different");
        else
            System.out.println("Neither");
    }
}
