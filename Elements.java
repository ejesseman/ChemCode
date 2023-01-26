class Elements{
    private String name;
    private String symbol;
    private int atomicNum;

    public Elements(String name, String symbol, int atomicNum){
        this.name = name;
        this.symbol = symbol;
        this.atomicNum = atomicNum;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public int getAtomicNum(){
        return atomicNum;
    }

    public void setAtomicNum(int atomicNum){
        this.atomicNum = atomicNum;
    }


}