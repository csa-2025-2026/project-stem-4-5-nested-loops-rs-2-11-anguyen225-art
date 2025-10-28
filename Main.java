import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("hello", 5);
    printNums();

    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("how many rows of numbers do you want?");
    num = sc.nextInt();
    uprightNumberTriangle(num);

    starTree();

  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)  // for each letter in the word... (loop)
    {
      String letter = word.substring(i, i + 1);
      for (int j = 0; j < N; j++)                  // print that letter N times (loop)
      {
        System.out.print(letter);
      }
      System.out.println();
    }
  }

  public static void printNums()
  {
    for (int rowNum = 10; rowNum >= 1; rowNum--)
    {
      for (int count = 1; count <= rowNum; count++)
      {
        System.out.print(rowNum + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int val = 1; val <= N; val++)
    {
      for (int number = 1; number <= val; number++)
      {
        System.out.print(number + " ");
      }
      System.out.println();
    }
  }

  public static void starTree()
  {
    for (int num = 9; num >= 1; num--)
    {
      for (int number = 1; number <= num; number++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void multTable()
  {
    // code solution here
  }
}
