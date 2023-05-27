import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args) {

        System.out.println("Enter the value of x and y: ");
        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        System.out.println("Before Swapping num1 is " +num1+ " num2 is " +num2);
        int res = num1;
        num1= num2;
        num2 = res;

        System.out.println("After Swapping num1 is " +num1+ " num2 is " +num2);
    }
}
