import java.util.Scanner;

public class yash{
    int y = 10;
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int num = sc.nextInt();
        factorial(num);
        
    }
    public static void factorial(int num){
        int fact = 1;   // add comment in the code 
        for(int i=1;i<=num;i++){  // fro loop to claculate the factorial 
            fact = fact * i;
        }
        System.out.println("the factorsial of "+num+" is "+fact);  // print heare the organal factorial
    }
}