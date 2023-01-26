import java.util.*;
import java.io.*;

public class ElementList{
    
    private String fileName;

    private int numberOfElements;

    private ArrayList<String> atomicNum = new ArrayList<>();

    private ArrayList<String> name = new ArrayList<>();

    private ArrayList<String> symbol = new ArrayList<>();

    public ElementList (String fileName) throws FileNotFoundException
    { 
        this.fileName = fileName;
        initializeLists(this.name, this.symbol, this.atomicNum, this.numberOfElements);
        
    }

    public void initializeLists(ArrayList<String> name, ArrayList<String> symbol, ArrayList<String> atomicNum, int numberOfElements){
        
        // Found this on https://stackoverflow.com/questions/19788989/error-unreported-exception-filenotfoundexception-must-be-caught-or-declared-to
        try{
            String file = getFile();
            Scanner inFile = new Scanner(new FileReader(file));
        

            int num = 0;
            while(inFile.hasNext()){

                String n;
                String s;
                String a;

                n = inFile.next();
                s = inFile.next();
                a = inFile.next();

                System.out.println("n: " + n + " s: " + s + " a: " + a);

                name.add(n);
                symbol.add(s);
                atomicNum.add(a);
                num++;

            }
            numberOfElements = num;
    
            inFile.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File does not exist");
        }
    }


    public ArrayList<String> getAtomicNumberArray(){
        return atomicNum;
    }

    public ArrayList<String> getNameArray(){
        return name;
    }

    public ArrayList<String> getSymbolArray(){
        return symbol;
    }


    public int getNumberOfElements(){
        return this.numberOfElements;
    }

    public String getAtomicNum(int index){
        return atomicNum.get(index);
    }

    public String getName(int index){
        return name.get(index);
    }

    public String getSymbol(int index){
        return symbol.get(index);
    }

    public String getFile(){
        return fileName;
    }





    
    
        
}
