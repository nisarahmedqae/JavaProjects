package Others;

public class demo {

	public static void main(String[] args) {
// parenthesis ()
// brackets []
// curly braces {}

		String[] chotaArr = { "nisar", "kayenat", "ahmed", "fatma" };
		//System.out.println(chotaArr.length);

		for (int i = 0; i < 4; i++) {
			// System.out.println(chotaArr[i]); // value[2]
		}

		int value[] = { 620, 502, 727, 12, 14, 6,122, 666 };

		// extended for loop
		for(String kuchbhiNaam : chotaArr) {
			System.out.println(kuchbhiNaam);
		}
		
	}

}
