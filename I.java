import java.util.Scanner;
class I{
    public static void main(String[]args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the code:");
        char c=a.nextLine().charAt(0);
        System.out.println(c);
        if(c=='R')
        {
            System.out.println("REd");
        }
        else if(c=='B')
        {
            System.out.println("Blue");

        }
        else if(c=='O')
        {
            System.out.println("Orange");
        }
        else 
        {
            System.out.println("invalid");
        }
    }
}