import java.util.Scanner;
import java.util.HashMap;
class Main {

  
  
  public static void main(String[] args) {
    HashMap <String, Integer> team = new HashMap<String, Integer>();
    
    System.out.println("Game start!");
    System.out.println("Select your starter");
    Scanner myStarter = new Scanner(System.in);
    String Starter = myStarter.nextLine();
    team.put(Starter, 5);
    System.out.println(team);


  }
}

