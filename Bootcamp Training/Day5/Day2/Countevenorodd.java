package Day2;
import java.util.Scanner;
public class Countevenorodd{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int evencount = 0;
        int oddcount = 0;
        for(int i=1; i<=n; i++)
        {
            if(i%2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }
        System.out.println("Even numbers: " + evencount);
        System.out.println("Odd numbers: " + oddcount);
    }
}
