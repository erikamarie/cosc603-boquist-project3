package edu.ncsu.monopoly;

public class CardCell extends Cell {
    private int type;
	public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public Boolean playAction(String msg) {
    	return true;
    }
    
    public int getType() {
        return type;
    }
}
