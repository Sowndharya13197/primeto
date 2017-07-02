import java.io.*;
import java.util.Scanner;
public class Primeto {
    public static void main(String args[])
    {int n,m,i,j,count=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    m=s.nextInt();
    //if(i<=m)
    //{
    for(i=n;i<=m;i++)
    {
        for(j=2;j<n;j++)
    { 
        if(i%j==0) 
       {count=1;
      break;
       
       }
   else
       {
           count=0;
       }}
        if(count==0)
        {
   System.out.println(i);
       } }
  
   
}

       }
     
   
    

