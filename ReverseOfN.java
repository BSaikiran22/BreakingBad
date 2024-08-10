import java.util.*;
public class ReverseOfN {
    public static void main(String[] args) {
        //int num = 1234, reverse = 0, rem ;
        System.out.println("Enter a number to reverse : ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int rem;
        while(num!=0){
            rem = num % 10;
            reverse = reverse * 10 + rem ;
            num = num / 10 ;
        }
        System.out.println("Reversed Number : " + reverse);

    }
    
}
