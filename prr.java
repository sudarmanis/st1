import java.util.*;
class prr
{
public static void main(String argS[])
{
int n,a ,temp,s=0,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the initial no");
n=sc.nextInt();
System.out.println("enter the end no");
a=sc.nextInt();
{
for(i=n+1;i<a;i++)
{

for(j=2;j<=a;j++)
 {
	 if(i%j==0)
	 {
 s=s+1;
 }}
 if(s==1)
 {
 System.out.println(""+i);
 }
  s=0;

}

}}}
