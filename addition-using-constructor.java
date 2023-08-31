import java.util.Scanner;
class addition{
    addition(int number1, int number2) {
        int result;
        result = number1 + number2;
        System.out.println("Sum: " + result);
    }

    public static void main(String[] args) {
	int num1,num2;
	Scanner s=new Scanner(System.in);
	 System.out.println("Enter the First no:");
	num1=s.nextInt();
	 System.out.println("Enter the First no:");
	num2=s.nextInt();
	addition a = new addition(num1,num2);
    }
}