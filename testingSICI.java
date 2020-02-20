import java.util.*;
import java.io.*;
public class simpleandcompound {
       public double findSimpleInterest(double Principle,double time,double rate)
       {
      return (Principle*time*rate)/100;
       }
       public double findCompoundInterest(double Principle,double time,double rate,boolean yearly)
       {
      if(yearly)
      {
      return Principle*(Math.pow(1+(rate/100),time)-1);
     
      }
      else
      {
      return Principle*(Math.pow(1+((rate/2)/100),2*time)-1);
      }
       }
}
testingSICI.java
public class testingSICI {

public static void main(String[] args) {
// TODO Auto-generated method stub
simpleandcompound cs = new simpleandcompound();
System.out.println("Simple Interest is : " + cs.findSimpleInterest(1000,2,5));
System.out.println("Compound Interest yearly is : " + cs.findCompoundInterest(1500,2,5,true));
System.out.println("Compound Interest half yearly is : " + cs.findCompoundInterest(1600,3,4,false));


}

}

