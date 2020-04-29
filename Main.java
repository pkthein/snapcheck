import java.lang.Math;
import java.util.Scanner; 

public class Main {
  public static String solution(String input) {
    /*
    I just assumed that constraint are someting that user are handling
    and something I have to explicitly handel. As a result, I will not be
    length checking or using regex to make sure tha tonly a-z is inisde
    input string.
    */
    String[] inputArr = input.split(" ");
    input = String.join("", inputArr);

    double n = Math.pow(input.length(), 0.5);
    int row = (int) Math.floor(n);
    int col = (int) Math.ceil(n);

    String ret[] = new String[col];

    for (int i = 0; i < input.length(); i++) {
      if (i < col) {
        ret[i] = "" + input.charAt(i);
      } else {
        ret[i % col] += input.charAt(i);
      }
    }

    return String.join(" ", ret);
  }

  public static void main(String[] args) {
    /*if user wants to input the string via scanner*/
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    /*if user wants to input the strign via args from cli*/
    // String input = args[0];

    /*if user wants to input the string directly*/
    // String input = "haveaniceday";
    // String input = "if man was meant to stay on the ground god would have given us roots";
    
    System.out.println(solution(input));
  }
}
