import java.io.*:
import java.util.*;
class largest
{
  public static void main(String args[])
{
  int x,y,z;
  System.out.println("enter the three integers");
  Scanner sc=newScanner(System.in);
  x=sc.nextInt();
  y=sc.nextInt();
  z=sc.nextInt();
if( x > y && x > z)
{
  System.out.println("x is greater");
  }
elseif(y > x && y > z)
{
  System.out.println("y is greater");
  }
else(z > x && z > y)
{
  System.out.println("z is greater");
  }
}
}
