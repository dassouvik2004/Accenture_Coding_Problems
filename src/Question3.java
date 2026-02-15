/*
You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0
 */
import java.util.Scanner;
public class Question3 {
    public static int check(String pass){
        if(pass==null)
            return 0;
        if(pass.length()<4)
            return 0;
        if(pass.charAt(0) >= '0' && pass.charAt(0) <= '9')
            return 0;
        int num = 0, cap = 0;
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i) == ' ' || pass.charAt(i) == '/')
                return 0;
            if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')
                cap++;
            if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9')
                num++;
        }
        if(cap > 0 && num > 0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = sc.next();
        int result = check(password);
        if(result==1)
            System.out.println("Valid password!");
        else
            System.out.println("Invalid password!");
    }
}
