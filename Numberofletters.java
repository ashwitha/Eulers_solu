import java.util.ArrayList;
import java.util.HashMap;

public class Numberofletters
{

	private static HashMap<Integer, String> map = new HashMap<Integer, String>();
	static{
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");
		map.put(20, "twenty");
		map.put(30, "thirty");
		map.put(40, "forty");
		map.put(50, "fifty");
		map.put(60, "sixty");
		map.put(70, "seventy");
		map.put(80, "eighty");
		map.put(90, "ninety");
		map.put(100, "hundred");
		map.put(1000, "onethousand");
	};

	public int numberoflettersinnumberrange()
	{

		ArrayList<String> words = new ArrayList<String>();

		for(int i = 1; i<= 1000; i++)
		{
			if(i != 1000)
			{
				String hundString = findHundredString(i);
				int hun = i/100;
				int number = i - hun*100;
				String finalString = "";
				String word = processBetween1To100(number);
				if(hundString == null || hundString.equals(""))
				{
					finalString = word;
				}
				else
				{
					if(word == null || word.equals(""))
					{
						finalString = hundString;
					}
					else
					{
						finalString = hundString+"and"+ word;
					}

				}
				finalString = finalString.trim();
				System.out.println(finalString);
				words.add(finalString);
			}
			else
			{
				String st = map.get(1000);
				System.out.println(st);
				words.add(st.trim());
			}

		}
		System.out.println(words.size());

		int length = 0;
		for(String word : words)
		{
			length += word.length();
		}
		System.out.println("Answer--> "+length);
		return length;

	}

	private static String findHundredString(int i) 
	{
		int hundredPlace = i/100;
		String hundString = "";
		if(hundredPlace > 0)
		{
			String prefixHundredString = map.get(hundredPlace);
			String postfixhundredthString = map.get(100);
			hundString = prefixHundredString + postfixhundredthString;
		}
		return hundString;
	}

	private static String processBetween1To100(int i)
	{
		String word  = "";
		if(i >0)
		{
			word = map.get(i);
			if(word == null)
			{
				int tenthPlace = i/10;
				int unitPlace = i%10;
				String tenthString = map.get(tenthPlace*10);
				String unitString = map.get(unitPlace);
				word = tenthString + unitString;
			}
		}

		return word;

	}

}
