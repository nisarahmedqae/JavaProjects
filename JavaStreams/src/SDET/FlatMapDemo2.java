package SDET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Batman", "Superman", "Aquaman");
		List<String> teamB = Arrays.asList("Thor", "Spiderman", "Hulk");
		List<String> teamC = Arrays.asList("Deadpool", "Wolverine", "Xavier");

		List<List<String>> playersWorldCup = new ArrayList<List<String>>();
		playersWorldCup.add(teamA);
		playersWorldCup.add(teamB);
		playersWorldCup.add(teamC);

		List<String> names = playersWorldCup.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
		System.out.println(names);
	}

}
