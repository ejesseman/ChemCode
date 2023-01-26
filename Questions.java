import java.util.*;

abstract class Questions {

    public String ChemicalGroupChoice(Scanner sc){
        char choice;
        String fileName;
        System.out.println("Please choose which chemical group you want to quiz yourself on!" + "\n" + "a. Noble Gases" + "\n" + "b. Halogens" + "\n" + 
        "c. Alkali Metals" + "\n" + "d. Alkaline Earth Metals" + "\n" + "e. Transition Metals" + "\n" + "f. Post-Transition Metals" + "\n" + "g. Metalloids" + "\n" +  
        "h. Nonmetals" + "\n" + "i. Lathanides" + "\n" + "j. Actinides");

        while (fileName == "null"){

            System.out.print("Choice: ");
        
            // Below line from https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/
            choice = sc.next().charAt(0);

            // Make the input lowercase by default
            choice = Character.toLowerCase(choice);

            

        
            switch(choice){
                case 'a':
                    fileName = "nobleGases.txt";
                    break;
                case 'b':
                    fileName = "halogen.txt";
                    break;
                case 'c':
                    fileName = "alkaliMetal.txt";
                    break;
                case 'd':
                    fileName = "alkalineEarthMetal.txt";
                    break;
                case 'e':
                    fileName = "transitionMetal.txt";
                    break;
                case 'f':
                    fileName = "postTransitionMetal.txt";
                    break;
                case 'g':
                    fileName = "metalloid.txt";
                    break;
                case 'h':
                    fileName = "nonmetal.txt";
                    break;
                case 'i':
                    fileName = "lanthanide.txt";
                    break;
                case 'j':
                    fileName = "actinide.txt";
                    break;
                default:
                    System.out.println("Invalid Choice");
                    System.out.println("Please try again");
                    fileName = "null";
                    break;

        }

        return fileName;

    }

    public static void propertyChoice(Scanner sc){
        char choice;
        String property;

        System.out.println("What properties do you want to quiz yourself on?\n a. Symbol (ex. N for Sodium)" + "\n" + "b. Atomic Number (ex. 1 for Hydrogen)")

        System.out.print("Choice: ");
        
        // Below line from https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/
        choice = sc.next().charAt(0);

        // Make the input lowercase by default
        choice = Character.toLowerCase(choice);

        switch (choice) {
            case 'a':
                
                break;
        
            default:
                break;
        }

        sc.close();



    }

    
    
}
