public class Palin {
    public static void main(String args[]){
        int num = 12321, reverse = 0, temp, rem;
        temp = num;
        while(temp!=0){
            rem =temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;

        }
        if(num == reverse){
        System.out.println(reverse + " is a palindrome ");
    }
        else{
            System.out.println(reverse + " is not a palindrome ");
        }


    
}
}
