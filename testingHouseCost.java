import java.util.*;
public class HouseConstructionCost {
public double estimateCost(String material,double area,boolean fullyAutomated)
{
if(material.equals("standardMaterial") && fullyAutomated == false)
{
return 1200*area;
}
else if(material.equals("aboveStandardMaterial") && fullyAutomated == false)
{
return 1500*area;
}
else if(material.equals("highStandardMaterial") && fullyAutomated == false)
{
return 1800*area;
}
else
{
return 2500*area;
}
}
}
testingHouseCost.java
public class testingHouseCost {

public static void main(String[] args) {
// TODO Auto-generated method stub
HouseConstructionCost hs = new HouseConstructionCost();
System.out.println("The cost for the construction is: \n Rs " + hs.estimateCost("standardMaterial", 300.0, false));
System.out.println("The cost for the construction is: \n Rs" + hs.estimateCost("aboveStandardMaterial", 100.0, false));
System.out.println("The cost for the construction is:  \n Rs" + hs.estimateCost("highStandardMaterial", 150.0, false));
System.out.println("The cost for the construction is: \n Rs" + hs.estimateCost("highStandardMaterial", 200.0, true));
}

}