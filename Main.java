import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String s;
		s = in.nextLine();
		int count = 0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				count++;
			}
			else
			{
				if(count != 0)
				{
					System.out.print(count+" ");
					count = 0;
				}
			}
		}
		System.out.print(count-1);
	}
}