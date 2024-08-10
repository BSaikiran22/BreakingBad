import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a NUmber : ");
    int num = sc.nextInt();
    int count = 0;
    if ( num < 2){
        System.out.println("Not a Prime Number");
    }
    for (int i = 2; i <= num; i++) {
        if(num % i == 0){
            count ++;
        }
    }
    if(count > 2){
        System.out.println(num + " Not a Prime Number");
    }
    else{
        System.out.println(num + " is a Prime Number");
    
        }
    
    
        }
  
}
