import java.io.*;
import java.util.*;

class Main {
    public static void Introduction(){
        System.out.println("Welcome to Periodic Guess!" + "\n" +
        "Here, we'll test your knowledge about the elements in terms of their symbols and atomic numbers." + "\n" +
        "The rules are simple, you first choose which chemical group you want to quiz yourself on and on which property (atomic number or symbol)." +
        "\n" + "You will have exactly 5 chances to guess the right answer." + "\n" +
        "After answering all of the elements, the program will ask if you want to try again. If not, it will then ask if you want to try a different chemical group."
        + "\n" + "And just to make things more interesting, we are also giving you the option of choose whether you want to guess the elements properties or the element itself based on those properties.");

    }

    public static String ChemicalGroupChoice(Scanner sc){
        int choice;
        String fileName = "null";
        System.out.println("Please choose which chemical group you want to quiz yourself on!" + "\n" + "1. Noble Gases" + "\n" + "2. Halogens" + "\n" + 
        "3. Alkali Metals" + "\n" + "4. Alkaline Earth Metals" + "\n" + "5. Transition Metals" + "\n" + "6. Post-Transition Metals" + "\n" + "7. Metalloids" + "\n" +  
        "8. Nonmetals" + "\n" + "9. Lathanides" + "\n" + "10. Actinides");

        while (fileName == "null"){
            System.out.print("Choice: ");
        
            choice = sc.nextInt();
        
            switch(choice){
                case 1:
                    fileName = "nobleGases.txt";
                    break;
                case 2:
                    fileName = "halogen.txt";
                    break;
                case 3:
                    fileName = "alkaliMetal.txt";
                    break;
                case 4:
                    fileName = "alkalineEarthMetal.txt";
                    break;
                case 5:
                    fileName = "transitionMetal.txt";
                    break;
                case 6:
                    fileName = "postTransitionMetal.txt";
                    break;
                case 7:
                    fileName = "metalloid.txt";
                    break;
                case 8:
                    fileName = "nonmetal.txt";
                    break;
                case 9:
                    fileName = "lanthanide.txt";
                    break;
                case 10:
                    fileName = "actinide.txt";
                    break;
                default:
                    System.out.println("Invalid Choice");
                    System.out.println("Please try again");
                    break;

            }
        }

        return fileName;

    }

    public static void propertyOrderChoice(Scanner sc, ElementList list, ArrayList<String> element, ArrayList<String> prop){
        int propChoice = 0;
        int orderChoice = 0;

        element = list.getNameArray();

        System.out.println("What properties do you want to quiz yourself on?" + "\n" + "1. Symbol (ex. N for Sodium)" + "\n" + "2. Atomic Number (ex. 1 for Hydrogen)");

        /// To ensure a correct choice
        /// Credit: https://www.geeksforgeeks.org/g-fact-64/
            
            System.out.print("Choice: ");

            propChoice = sc.nextInt();

            while (propChoice == 0 || orderChoice == 0)

                switch (propChoice) {
                    case 1:

                        prop = list.getSymbolArray();

                        System.out.println("Now what order? Do you want to: " + "\n" + "1. Guess the symbol of an element?" + "\n" +
                        "2. Guess the element based on its symbol?");

                        System.out.print("Choice: ");

                        orderChoice = sc.nextInt();

                        if (orderChoice == 1){
                            Symbol symbol = new Symbol(element, prop);
                            symbol.play(sc, list);

                        }

                        else if (orderChoice == 2){

                            Symbol symbol = new Symbol(prop, element);
                            symbol.play(sc, list);

                        } else{
                            System.out.println("Invalid Choice");
                            System.out.println("Please try again");
                        }

                
                        break;

                    case 2:
                        prop = list.getAtomicNumberArray();

                        System.out.println("Now what order? Do you want to: " + "\n" + "1. Guess the atomic number of an element?" + "\n" +
                        "2. Guess the element based on its atomic number?");

                        System.out.print("Choice: ");

                        orderChoice = sc.nextInt();

                        if (orderChoice == 1){
                            AtomicNum aNum = new AtomicNum(element, prop);

                            aNum.play(sc,list);

                        }

                        else if (orderChoice == 2){

                            AtomicNum aNum = new AtomicNum(prop, element);

                            aNum.play(sc,list);

                        }

                
                        break;
        
                    default:
                        System.out.println("Invalid Choice");
                        System.out.println("Please try again");
                        break;
                }


    }
    public static void main (String [] args) throws FileNotFoundException{

        Introduction();

        ArrayList<String> prop = new ArrayList<>();
        ArrayList<String> element = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String cont = "yes";

        while(cont.equals("yes")){

            String file = ChemicalGroupChoice(sc);

            ElementList list = new ElementList(file);

            propertyOrderChoice(sc, list, element, prop);
    
            System.out.println("Do you want to select a different chemical Group, property, or order? (yes/no)");

            cont = sc.next(); 
        }

    





    }
    
}
