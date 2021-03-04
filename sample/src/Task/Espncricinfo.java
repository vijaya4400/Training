package Task;

public class Espncricinfo {
	private int SIZE = 50;
	private Batman[] batsmans = new Batman[50];
	private int noOfBatsmen;
	static int i=0;
	public Batman[] getBatsmans()
	{
		return batsmans;
	}
	int getNoOfBatsmen()
	{
		return noOfBatsmen;
	}
	int addBatman(int id,String name,int runsScored,int centuries,int halfCenturies,int ballsFaced,int fours,int sixes)
	{
		if(getNoOfBatsmen()<SIZE-1)
		{
			Batman ob = new Batman(id,name,runsScored,centuries,halfCenturies,ballsFaced,fours,sixes);
			batsmans[i++]=ob;
			return ob.getId();
		}
		else
		{
			return 0;
		}
	}
	Batman updateBatsmanStats(int id,int runsScored,int centuries,int halfCenturies,int fours,int sixes,int ballsFaced)
	{
		boolean status = true;
		Batman ob = new Batman();
		for(int i=0;i<batsmans.length;i++)
		{
			if(batsmans[i]!=null)
			{
				if(id==batsmans[i].getId())
				{
					status=false;
					batsmans[i].setCenturies(centuries);
					batsmans[i].setHalfCenturies(halfCenturies);
					batsmans[i].setRunsScored(runsScored);
					batsmans[i].setFours(fours);
					batsmans[i].setSixes(sixes);
					batsmans[i].setBallFaced(ballsFaced);
					ob = batsmans[i];
					break;
				}
				else
				{
					status=true;
				}
			}
		}
		if(status)
		{
			return null;
		}
		else
		{
			return ob;
		}
	}
	
	Batman getBatsman(int batsmanId)
	{
		boolean status = true;
		Batman ob = new Batman();
		for(int i=0;i<batsmans.length;i++)
		{
			if(batsmans[i]!=null)
			{
				if(batsmanId==batsmans[i].getId())
				{
					status = false;
					ob = batsmans[i];
					break;
				}
				else
				{
					status = true;
				}
			}
		}
			if(status)
			{
				return null;
			}
			else
			{
				return ob;
			}
		
	}
	public void getAllDetails()
	{
		for(int i=0;i<batsmans.length;i++)
		{
			if(batsmans[i]!=null)
			{
				System.out.println(batsmans[i].getId()+" "+batsmans[i].getName()+" "+batsmans[i].getRunsScored()+" "+batsmans[i].getCenturies()+" "+batsmans[i].getHalfCenturies()+" "+batsmans[i].getBallsFaced()+" "+batsmans[i].getFours()+" "+batsmans[i].getSixes());
			}
			else
				break;
		}
	}
	public void getDetails(Batman ob)
	{
		System.out.println(ob.getId()+" "+ob.getRunsScored()+" "+ob.getFours()+" "+ob.getSixes()+" "+ob.getBallsFaced());
	}
}
