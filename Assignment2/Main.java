
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 Numbers:");
    System.out.println("Enter No1:");
    int No1 = sc.nextInt();
    System.out.println("Enter No2:");
    int No2 = sc.nextInt();
    System.out.println("Enter No3:");
    int No3 = sc.nextInt();

    List<Integer> numList = new ArrayList();
    numList.add(No1);
    numList.add(No2);
    numList.add(No3);

    numList.sort((x, y) -> x.compareTo(y));

    System.out.println("Addition of Largest and Smallest Number is: " + (numList.get(0) + numList.get(numList.size()-1)));
  }
}