import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers:");
    int x = sc.nextInt();
    int y = sc.nextInt();

    if (y == 0)
    {
      System.out.println("...");
  
    }
    else
    {
      double ratio = (double) x / y;
        if (1 < ratio && ratio <= 8)
        {
          System.out.println("Ratio Ok");
        }
    }
    // TODO: Problem 2
    System.out.println("enter two numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (b == 0)
    {
      System.out.println("error");
    }
    else
    {
      if (a % b == 0)
      {
        System.out.println("it is a factor");
      }
    }
    // TODO: Problem 3
    
  
  
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    // implement solution here
    return false;
  }
}
