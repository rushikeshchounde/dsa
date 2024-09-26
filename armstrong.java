// Java program of arstrong.......
import java.util.Scanner;  
import java.lang.Math;  
public class Main  
{  

static boolean isArmstrong(int n)   
{   
int c, lm=0, las=0, d=0;   

c=n;   

while(c>0)    
{   
c= c/10;   
lm++;   
}   
c = n;   
while(c>0)   
{   

las= c % 10;   

d +=  (Math.pow(las, lm));   

c = c/10;   
}  

if(n==d)   

return true;      

else return false;   
}   

public static void main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the limit: ");  

num=sc.nextInt();  
System.out.println("Armstrong Number up to "+ num + " are: ");  
for(int i=0; i<=num; i++)  

if(isArmstrong(i))  

System.out.print(i+ ", ");  
}   
}  
