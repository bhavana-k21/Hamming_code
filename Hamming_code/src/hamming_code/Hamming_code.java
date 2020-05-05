
package hamming_code;


import java.util.ArrayList;
import java.util.Scanner;

public class Hamming_code {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] code=new String[10];
        Hamming_code hc=new Hamming_code();
        ArrayList<String> al=new ArrayList<>();
         ArrayList<String> al2=new ArrayList<>();
       int c=0,l=0,c1=0,c2=0,c3=0;
        System.out.println("Enter the string length between 1-6 :");
        int len=sc.nextInt();
        System.out.println("Enter the values");
        for(int i=1;i<len;i++)
        {
           al.add(sc.next());
        }
       
    al.add(0," p1");
    int h=2;
    for(int i=1;i<4;i++)
    {
        int x=(int) Math.pow(2, i);
        al.add(x-1, "p"+h);
        h++;
    }
    System.out.println(" "+al);
        System.out.print(" P1[");
        for(int j=0;j<al.size();j=j+2)
        {
            System.out.print( ","+al.get(j));
            if(al.get(j).equals("1"))
            {
                c++;
            }
        }
        System.out.print("]");
        hc.add(c,al2);
        System.out.println("");

        System.out.print(" P2[");
        for(int j=1;j<al.size();j++)
        {
            if((l>=2 && l<4) ||(l>=6 && l<8 )||( l>=10 && l<13))
            {
            l++;
            }
            else{
            System.out.print( ","+al.get(j));
            if(al.get(j).equals("1"))
            {
                c1++;
            }
            l++;
            }
        }
        System.out.println("]");
        hc.add(c,al2);

        System.out.print(" p3[");  
        for(int j=3;j<7;j++){
        System.out.print(","+al.get(j));
        if(al.get(j).equals("1"))
        { c2++;}
        }
        System.out.print("]");
        hc.add(c2, al2);
        
        System.out.println("");
        System.out.print(" p4[");
        for(int k=7;k<al.size();k++){
        System.out.print(","+al.get(k));
        if(al.get(k).equals("1"))
        {c3++;}
        }
        System.out.println("]");
        hc.add(c3,al2);
        
        
        System.out.println("BITS::"+al2);
        al.set(0,al2.get(0));
        al.set(1,al2.get(1));  
        al.set(3,al2.get(2)); 
        al.set(7,al2.get(3)); 
        System.out.println("Hamming Code::"+al);
    }
    public void add( int count,ArrayList<String> al2){
        if(count%2==0){
            al2.add("0");
        }
        else{
            al2.add("1");
        }
    }
}
    


