import java.util.Scanner;
class function{
  public static void main(String args[]){
    char userChoice;
    
    System.out.print("Want to know the latest news ??? ");
    Scanner myvar = new Scanner(System.in);
    userChoice = myvar.next().charAt(0);
    
    if(userChoice == 'y' || userChoice == 'Y' ){
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
      System.out.println("Java Paper is comming Soon +__+ parh le bhau ");
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
      
    } 
    else if (userChoice == 'n' || userChoice == 'N'){
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
      System.out.println("          Ghar ja beta phir -__- ");
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
   
    }
    else {
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
      System.out.println("      ;__; why are you doing this ");
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
      
    }
    System.out.println("");
    System.out.println("~ Shaktimaan BugBaba");
  }

}