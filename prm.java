import java.util.*;
class prm
{
public static void main(String argS[])
{
int a, n,sr=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
n=sc.nextInt();
for(int i=n;i<=a;i++)
{
if(a%i==0)
{
r++;
}
}
if(r==2)
{
System.out.println("yes");
}
else
{
System.out.println(" no");
}
}}
