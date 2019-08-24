import java.util.*;
class armbw
{
public static void main(String argS[])
{
int n,a ,temp,s=0,i,re;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
a=sc.nextInt();
{
for(i=n+1;i<a;i++)
{
temp=i;
for(;temp!=0;)
 {
	re=temp%10;
 s=s+re*re*re;
 temp=temp/10;
 }

 if(s==i)
 {
 System.out.println(""+i);
 }
  s=0;

}
}
}}
