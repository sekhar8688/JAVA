package p1;

public class Day25 {
	
private int Cid;
private String Cname;
private Long Cnum;
public void setData(int x,String y,long z)
{
	Cid = x;
	Cname = y;
	Cnum = z;
}
public int GetDataCid()
{
	return Cid;
}
public String GetDataCname()
{
	return Cname;
}
public long GetDataCnum()
{
	return Cnum;
}
	

	public static void main(String[] args) {
		Day25 d = new Day25();
		d.setData (1,"Sekhar",897822l);
		System.out.println(d.GetDataCid());
		System.out.println(d.GetDataCname());
		System.out.println(d.GetDataCnum());
		
		// TODO Auto-generated method stub

	}

}
