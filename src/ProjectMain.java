import java.util.Scanner;

public class ProjectMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Your answer is:");
        System.out.println(num1 + num2);
    }
}
