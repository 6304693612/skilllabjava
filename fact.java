import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number:");
        int a=sc.nextInt();
        double sum=1;
        for (int i=1;i<=a;i++)
        {
            sum=sum*i;
        }
        System.out.println(sum);
        
    }
    
}