import java.util.Scanner;
//** thanks for the help of my friend Felipe, he teached me how to add colors into my text to make it more fun */
//** Its declaring that the string RED will print out that string that i am choosing to come out as the color red */
//** the computer doesnt automatically read the word red and print the text out as the color red, it needs the colors actual description for it to print it out as the color i want it to be  */
public class App {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }

    /**
     * this is the introduction of my madlibs 
     * It tells the user that its my very random madlibs and how there is very innapropiate
     * its prinitng the instructions of my madlib.
     * @param getUserName
     */
    public void printInstructions() {
        System.out.println(YELLOW + "This is my very random madlib" + RESET);
        System.out.println(BLUE + "Very innapropriate content below." + RESET);
    }

    //** this allows the user to put in their name and later on allow the user to play the madlib */

    public String getUserName() {
        System.out.println(CYAN + "Enter your name below" + RESET);
        Scanner userinput = new Scanner(System.in);
        String getUsername = userinput.nextLine();
        return getUsername;

    }
//** this allows the madlib to say hello to the user and later are the instructions below */
    public void printGreeting(String userName) {
        System.out.println(CYAN + "Hello " + userName + RESET);
    }
//** this allows the user to actually insert adjectives, nouns, and plural nouns into the madlib and allows them to play and get the story to come out in their own style *
//** this also prints out the madlib as you typed it out to be */
    public void doMadlib() {

        Scanner input = new Scanner(System.in);
        String repeat;
        do {
            System.out.println("Type a Adjective:");
            String adj1 = input.nextLine();
            System.out.println("Type a Noun:");
            String noun1 = input.nextLine();
            System.out.println("Type a plural noun:");
            String pnoun1 = input.nextLine();
            System.out.println("Type a different Adjective:");
            String adj2 = input.nextLine();
            System.out.println("Type a different Adjective:");
            String adj3 = input.nextLine();
            System.out.println("Type a different Noun:");
            String noun2 = input.nextLine();
            System.out.println("Type a different Noun:");
            String noun3 = input.nextLine();
            System.out.println("Type a plural noun:");
            String pnoun3 = input.nextLine();
            System.out.println("Type a plural noun:");
            String pnoun4 = input.nextLine();
            System.out.println("Type a plural noun:");
            String pnoun5 = input.nextLine();
            System.out.println("Type a different Noun:");
            String noun4 = input.nextLine();
            System.out.println("Type a different Adjective:");
            String adj4 = input.nextLine();
            System.out.println("Type a different Adjective:");
            String adj5 = input.nextLine();
            System.out.println("Type a different Adjective:");
            String adj6 = input.nextLine();
            System.out.println("Type a different Noun:");
            String noun5 = input.nextLine();
            System.out.println("Type a different Noun:");
            String noun6 = input.nextLine();
            System.out.println("Type a plural noun:");
            String pnoun6 = input.nextLine();
            System.out.println("Type a different Adjective:");
            String adj7 = input.nextLine();
            System.out.println(PURPLE + "Last night, I went to the most" + adj1 + " party thrown by none other than"
                    + noun1
                    + ",  also formally known as Sean Diddy combs. The venue was filled with" + pnoun1
                    + " hanging from the ceiling. Everyone dressed like a " + adj2 + ", and the mood was totally" + adj3
                    + ". At the entrance, there was a giant" + noun2 + "shaped like a" + noun3
                    + ", where people could take photos. The music was blasting, and the DJ was playing" + pnoun3
                    + "so loud, even the" + pnoun4 + "outside could hear them! There were tables full of" + pnoun5
                    + "and"
                    + noun4 + ",and drinks that tasted like " + adj4 + ". Diddy gave a speech about this" + adj5
                    + "career and thanked his" + adj6 + " fans. Then, the crowd went wild then a surprise guest,"
                    + noun5
                    + ", arrived riding a" + noun6 + " . The night ended with" + pnoun6
                    + "falling from the ceiling, and everyone left feeling" + adj7
                    + ". It was definently a party to remember." + RESET);

            // ** https://chatgpt.com/share/66facb21-51d4-800c-ad44-2e3c9c3dd724
            // ** This allows the participant who is inserting the madlib play again or not.
            // Bye typing in yes, you will restart the process, by typing in no, or anything
            // else, it will stop the madlib completely.
            System.out.print(RED + "Do you want to play again?  (yes/no): " + RESET);
            repeat = input.nextLine();
        } while (repeat.equalsIgnoreCase("yes"));
        System.out.println(BLUE + "Bye!" + RESET);
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
