import java.util.Scanner;
class Main {
  // identifys your team, items etc
  int teamSlot = -1;
  int itemSlot = -1;
  String[] team;
  String[] items;
  public static void main(String[] args) {
    System.out.println("Game start!");
    Main.selectStarter();
  }
  public static void selectStarter(){
    System.out.println("Select your starter creature");
    Scanner myStarter = new Scanner(System.in);
    String Starter = myStarter.nextLine();

  }
}
