import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter Reads Three Number=\n");
        Scanner in=new Scanner(System.in);
        int x,y,z;
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(x<=y&&y<=z)
            System.out.println("In order="+x+" "+y+" "+z);
        else if(x>=y&&y>=z)
            System.out.println("In order="+x+" "+y+" "+z);
        else
            System.out.println("not in order");
    }
}
