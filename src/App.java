import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }
    
    /**
     * Document what this method does here!
     * @param getUserName 
     */
    public void printInstructions(int getUserName) {
    System.out.println("This is my very random madlibz");
    }
    
    // add and implement the other methods you need in this area below!
    
  public String getUserName() {
 System.out.println("Enter your name below");
 try (Scanner userinput = new Scanner(System.in)) {
    String getUsername = userinput.nextLine();
    return getUsername;
 }
}


 public void printGreeting(String userName) {
 System.out.println("Hello" + userName);
 }
 public void doMadlib() {
    System.out.println("Last night, I went to the most" + adj1 + "party thrown by none other than" + noun1 + ", also formally known as Sean Puff Diddy combs. The venue was filled with" + pnoun1 + "hanging from the ceiling. Everyone dressed like a " + adj2 + ", and the mood was totally" + adj3. +  "At the entrance, there was a giant" + noun2 + "shaped like a" + noun3 + ", where people could take photos. The music was blasting, and the DJ was playing" + pnoun3 + "so loud, even the" + pnoun4 + "outside could hear them! There were tables full of" + pnoun5 + "and" + noun4 + ",and drinks that tasted like" + adj4 + ".Diddy gave a speech about this" + adj5 + "career and thanked his" + adj6 + "fans. Then, the crowd went wild then a surprise guest," + noun5 + ", arrived riding a" + noun6 + ". The night ended with" + pnoun6 + "falling from the ceiling, and everyone left feeling" + adj7 + ". It was definently a party to remember.");
    
    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
