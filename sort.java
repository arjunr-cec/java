import java.util.Arrays;
import java.util.Scanner;
class sort
{
public static void main(String args[])
{
int n,j;
String temp;
Scanner s=new Scanner(System.in);
System.out.println("enter no of names:");
n=s.nextInt();
String names[]=new String[n];
Scanner s1=new Scanner (System.in);
System.out.println("enter all the names");
for(int i=0;i<n;i++)
{
names[i]=s1.nextLine();
}
for(int i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(names[i].compareTo(names[j])>0)
{
temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
System.out.println("names in sorted order:");
for(int i=0;i<n-1;i++)
{
System.out.println(names[i]+",");
}
System.out.println(names[n-1]);
}
}
