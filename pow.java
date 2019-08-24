import java.util.*;
class pow
{
public static void main(String argS[])
{
int a,m=2,r=1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
while(m!=0)
{
r=r*a;
m--;
}
System.out.println(""+r);
}
}
