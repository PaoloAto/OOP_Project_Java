
public class Pokemon {
	private String sName;
	private float fCatch;
	private float fEncounter;
	private int nFame;
	private int nReduce;
	private boolean isRare;
	
	public Pokemon (String sName,float fCatch,float fEncounter,int nFame,int nReduce,boolean isRare)
	{
		this.sName = sName;
		this.fCatch = fCatch;
		this.fEncounter = fEncounter;
		this.nFame = nFame;
		this.nReduce = nReduce;
		this.isRare = isRare;
	}
	
	public String getsName() {
		return sName;
	}
	
	public float getfCatch() {
		return fCatch;
	}
	
	public float getfEncounter() {
		return fEncounter;
	}
	
	public int getnFame() {
		return nFame;
	}

	public int getnReduce() {
		return nFame += nReduce;
	}
	
	public boolean isRare() {
		return isRare;
	}
	

}
