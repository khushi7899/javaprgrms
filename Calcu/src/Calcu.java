import java.util.*;
public class Calcu {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("Select any operation to perform it : \nSum(+) \nSubstraction(-) \nMultiplication(*) \nDivide(/) \nExit(E) ");
            System.out.println("Enter the operation to perform the task");
            char option = sc.next().charAt(0);
            switch (option)
            {
                case '+':
                    System.out.println("Enter the first number to add: ");
                    a = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    b = sc.nextInt();
                    int sum = a + b;
                    System.out.println("The sum is :" + sum);
                    break;

                case '-':
                    System.out.println("Enter the first number to subtract: ");
                    a = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    b = sc.nextInt();
                    int sub = a - b;
                    System.out.println("The sum is :" + sub);
                    break;
                case '*':
                    System.out.println("Enter the first number to multiply: ");
                    a = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    b = sc.nextInt();
                    int prod = a * b;
                    System.out.println("The sum is :" + prod);
                    break;
                case '/':
                    System.out.println("Enter the first number to divide: ");
                    a = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    b = sc.nextInt();
                    double div = a / b;
                    System.out.println("The sum is :" + div);
                    break;

                case 'E':
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }

        }
    }
}
