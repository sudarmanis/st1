import java.util.*;
class odd
{
public static void main(String argS[])
{
int a, b,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the initial no");
a=sc.nextInt();
System.out.println("enter the end no");
b=sc.nextInt();
for(n=a;n<=b;n++)
{
if(n%2==0)
{
System.out.println("even"+n);
}
}
}
}
