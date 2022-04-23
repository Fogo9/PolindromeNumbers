import java.util.Scanner;

public class polindromenumbers{

    static boolean isPolindrome(int number){

        int temp = number, reversenumber = 0, lastnumber;

        while(temp != 0){

            lastnumber = temp % 10;

            reversenumber = (reversenumber * 10) + lastnumber;

            temp /= 10;


        }
        if(number == reversenumber){

            return true;

        }else{

            return false;

        }

    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter The Number : ");

        number = input.nextInt();

        System.out.println(isPolindrome(number));
    }
}
