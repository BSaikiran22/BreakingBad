import java.util.*;
public class GreatestOf3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value : ");
        int a = sc.nextInt();
        Scanner ci= new Scanner(System.in);
        System.out.println("Enter B value : ");
        int b= ci.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter C value : ");
        int c = s.nextInt();
        if(a==b && a==c){
            System.out.println(a +", " + b+", " + c+", " + " are equal !" );
        }
        else if(a>b && a>c){
            System.out.println(a + " is greater !");
        }
        else if(b>a && b>c){
            System.out.println(b + " is greater !");
    }
        else{
            System.out.println(c + " is greater !");
    
        }
    }
}
