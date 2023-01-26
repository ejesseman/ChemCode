import java.util.*;

public class Symbol extends ElementMap implements Game{

    private HashMap<Object, Object> symbolMap = new HashMap<>();
    private ArrayList<String> key = new ArrayList<>();
    private ArrayList<String> keyValue = new ArrayList<>();


    public Symbol(ArrayList<String> key, ArrayList<String> keyValue){
        this.key = key;
        this.keyValue = keyValue;
        createHashMap(this.key, this.keyValue, this.symbolMap);
    }



    public void play(Scanner answr, ElementList list){

        String choice = "yes";
        int chances = 5;
        int num = symbolMap.size();
 
        System.out.println(num);
 
         while (choice.equals("yes")){

             /// Generate a random element/symbol/atomic number
             int randomKey = (int)(Math.random()*num);
 
             String keyName = key.get(randomKey);

             String keyValue = symbolMap.get(keyName).toString();

             keyValue = keyValue.toLowerCase();
 
             while (chances >= 0){
                 System.out.println("Number of chances: " + chances);

                 String question = guessOrder(list);

                 System.out.println(question + keyName + "?");
 
                 String answer;
 
                 System.out.print("Your Answer: ");
                 answer = answr.next();
                 answer = answer.toLowerCase();
 
                 if (answer.equals(keyValue)){
                     System.out.println("Correct!");
                     break;
                 } else{

                    chances--;
                    if (chances > 1){
                        System.out.println("No, sorry. Please try again");
                    } else if (chances == 0){
                     System.out.println("No, sorry. The answer is " + keyValue);
                    }
                }
 
                 
             }
 
             System.out.print("Would you like to try again? (Yes/No): ");
 
             choice = answr.next();
 
             choice = choice.toLowerCase();
 
         }
    }

    public String guessOrder(ElementList list){

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> prop = new ArrayList<>();

        String question = "Null";

        name = list.getNameArray();
        prop = list.getSymbolArray();

        if (key.equals(name)){
            question = "What is symbol for the element ";

        } else if (key.equals(prop)){
            question = "What element has the symbol ";
        }

        return question;

    }


    public HashMap<Object, Object> getHashMap()
    {
        return symbolMap;
    }

    public ArrayList<String> getKeyList()
    {
        return key;
    }




    
}
