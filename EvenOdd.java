import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 ==0 ){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
