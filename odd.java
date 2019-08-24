import java.util.*;
class odd
{
public static void main(String argS[])
{
int a, b,n;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(n=a+1;n<b;n++)
{
if(n%2==0)
{
System.out.println("even"+n);
}
}
}
}
