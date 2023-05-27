public class LargestNum {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 78;
        int num3 = 20;
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +" is largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is largest");
        }else{
            System.out.println(num3+ " is largest");
        }
    }
}
