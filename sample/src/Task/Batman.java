package Task;

public class Batman {
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;
	private int id;
	 void setData(String n,int rs,int c,int hc,int bf,int f,int s)
	 {
		 	name=n;
			runsScored=rs;
			centuries=c;
			halfCenturies=hc;
			ballsFaced=bf;
			fours=f;
			sixes=s;
	 }
	 public float getStrikeRate()
	 {
		 return (((runsScored*100)/ballsFaced)*100)/100;
	 }
	 public int getRunsScoredInBoundaries()
	 {
		 return (4*fours+6*sixes);
	 }
	public Batman()
	{
		
	}
	public Batman(int i,String n,int rs,int c,int hc,int bf,int f,int s)
	{
		id=i;
		name=n;
		runsScored=rs;
		centuries=c;
		halfCenturies=hc;
		ballsFaced=bf;
		fours=f;
		sixes=s;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRunsScored()
	{
		return runsScored;
	}
	public void setRunsScored(int runsScored)
	{
		this.runsScored=runsScored;
	}
	public int getCenturies()
	{
		return centuries;
	}
	public void setCenturies(int centuries)
	{
		this.centuries=centuries;
	}
	public int getHalfCenturies()
	{
		return halfCenturies;
	}
	public void setHalfcenturies(int halfCenturies)
	{
		this.halfCenturies=halfCenturies;
	}
	public int getBallsFaced()
	{
		return ballsFaced;
	}
	public void setBallFaced(int ballsFaced)
	{
		this.ballsFaced=ballsFaced;
	}
	public int getFours()
	{
		return fours;
	}
	public void setFours(int fours)
	{
		this.fours=fours;
	}
	public int getSixes()
	{
		return sixes;
	}
	public void setSixes(int sixes)
	{
		this.sixes=sixes;
	}
}
