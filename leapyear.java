import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
Scanner myobj = new Scanner(System.in);
System.out.println("Enter leap year:");
int year;
year = myobj.nextInt();
if(year%4==0)
{
System.out.println("leap year");
}
else
{
System.out.println("non leap year");
}
}
}
