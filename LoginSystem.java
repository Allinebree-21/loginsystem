import java.util.Scanner;
public class LoginSystem
{
    public static void main(String args[])
    {
        String username, password;
        Scanner bbit = new Scanner(System.in);
        System.out.print("Enter username:");
        username = bbit.nextLine();
        System.out.print("Enter password:");
        password = bbit.nextLine();
        if((username=="brii") || (password=="123"))
        {
            System.out.println("Authentication Successful");
        }
        else 
        {
            System.out.println("Authentication Failed");
        }
    }
}
