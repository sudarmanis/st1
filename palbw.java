import java.util.*;
class palbw
{
public static void main(String argS[])
{
int n,a ,temp,re,s=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the initial no");
n=sc.nextInt();
System.out.println("enter the end no");
a=sc.nextInt();
{
for(i=n+1;i<a;i++)
{
temp=i;
for(;temp!=0;)
 {
 re=temp%10;
 s=s*10+re;
 temp=temp/10;
}
 if(s==i)
 {
 System.out.println("palindrome" +""+i);
 }
 
 s=0;
}

}}}
