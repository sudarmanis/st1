import java.util.*;
class pal
{
public static void main(String argS[])
{
int n ,temp,re,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the initial no");
n=sc.nextInt();
{
temp=n;
 while(temp!=0)
 {
 re=temp%10;
 s=s*10+re;
 temp=temp/10;
 }
 if(s==n)
 {
 System.out.println("palindrome"+s);
 }
 else
 {
	 System.out.println(" not palindrome"+n);
}
}}
}
