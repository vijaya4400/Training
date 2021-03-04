package Task;

public class NewBatmans {
	public static void main(String[] args)
	{
		Batman obj = new Batman();
		Batman obj1 = new Batman(123,"dhoni",10000,20,50,100,24,32);
		obj1.setId(123);
		obj1.setName("dhoni");
		obj1.setRunsScored(10000);
		obj1.setCenturies(20);
		obj1.setHalfcenturies(50);
		obj1.setBallFaced(100);
		obj1.setFours(24);
		obj1.setSixes(32);
		System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getRunsScored()+" "+obj1.getCenturies()+" "+obj1.getHalfCenturies()+" "+obj1.getBallsFaced()+" "+obj1.getFours()+" "+obj1.getSixes());
		obj1.setData("dhoni",10000,20,50,100,24,32);
		System.out.println(obj1.getStrikeRate()+" "+obj1.getRunsScoredInBoundaries());
	}

}
