import java.math.BigInteger;

public class Sum
{
	public int SumOfDigitsOfANumber()
	{
		BigInteger two = new BigInteger("2");
		BigInteger poweroftwo = two.pow(1000);
		String power = poweroftwo.toString();
		int out=0;
		for(int i=0;i<power.length();i++)
		{
			char c = power.charAt(i);
			out += (c-'0');

		}
		return out;
	}
	//public static void main(String args[])
	//{
	//	Sum s=new Sum();
	//	int result=s.SumOfDigitsOfANumber();
	//	System.out.print(result);
	//}
}