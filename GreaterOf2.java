/*import java.util.*;
public class GreaterOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Both numbers are equal");
        }

        else if (a > b) {
            System.out.println("The greater number is: " + a);
            } 
        else {
             System.out.println("The greater number is: " + b);  
        }
     }
    
}*/
public class GreaterOf2{
    public static void main(String args[]){
        int a=20;
        int b=30;
        if(a==b){
            System.out.println("Both numbers are equal");
        }
        else {
            System.out.println(Math.max(a,b));
            }
            }
    }