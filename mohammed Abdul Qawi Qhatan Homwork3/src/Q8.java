import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name;
        float salary, worker_hours,hours$,Extra_hours;
        System.out.println("Enter employee Information");
        System.out.println("Enter The Employee Name\n");
        name= in.next();
        System.out.println("Enter Working Hours=\n");
        worker_hours=in.nextFloat();
        System.out.println("Enter The Hourly Rate=\n");
        hours$=in.nextFloat();
        if(worker_hours>40)
        Extra_hours=(worker_hours-40);
        else
            Extra_hours=0;
            worker_hours=(worker_hours-Extra_hours)*hours$;
            Extra_hours=Extra_hours*(hours$*1.5f);
            salary=Extra_hours+worker_hours;

                    System.out.println("___________________\n"+"| 1. name of worker : "+name+"\n"+"| 2. salary is= "+salary +"\n-------------------\n");






    }
}
