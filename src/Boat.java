
public class Boat {
	
private String sName;
private float fCosts;

private int nMoves;

public Boat (String sName,float fCosts,int nMoves)
{
	this.sName = sName;
	this.fCosts = fCosts; 
	this.nMoves = nMoves;
	
}
public int getMoves() {
	return nMoves;
}

public String getsName() {
	return sName;
}
public float getfCosts() {
	return fCosts;
}

}
