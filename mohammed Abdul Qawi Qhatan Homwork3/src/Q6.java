import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Reads Three Number=\n");
        int x,y,z;
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(x<y&&y<z)
            System.out.println("increasing="+x+" "+y+" "+z);
        else if(x>y&&y>z)
            System.out.println("decreasing="+x+" "+y+" "+z);
        else
            System.out.println("Neither");

    }
}
