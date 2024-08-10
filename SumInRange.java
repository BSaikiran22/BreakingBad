import java.util.*;
public class SumInRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value : ");
        int a = sc.nextInt();
        System.out.println("Enter B value : ");
        int b = sc.nextInt();
        int sum = 0;
        for(int i=a; i<=b; i++){
            sum += i;
        }
        System.out.print("Sum  between "+ a + " and " + b +" is : "+ sum);
}
}