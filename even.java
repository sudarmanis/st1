import java.util.*;
class even
{
public static void main(String argS[])
{
int a, b,n;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(n=a+1;n<b;n++)
{
if(n%2==1)
{
System.out.println("even"+n);
}
}
}
}
