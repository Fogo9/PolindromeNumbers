# **POLINDROME NUMBERS**

## INFORMATION

* **Program to check if a given number is a palindrome.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **temp**, **number**, **reversenumber** and **lastnumber** are defined with int.

* The boolean variable is used to determine whether the result is true or false.

* The browser class is defined to receive values ​​from the user.

## CODES

```Java

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


```

```Java

                public static void main(String[] args){

                Scanner input = new Scanner(System.in);

                int number;

                System.out.print("Enter The Number : ");

                number = input.nextInt();

                System.out.println(isPolindrome(number));

            }
        }

```

```bash

    Enter The Number : 343
    true
    Enter The Number : 1570
    false

```

<br />

# LINK

* Click here https://github.com/Fogo9/PolindromeNumbers.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
