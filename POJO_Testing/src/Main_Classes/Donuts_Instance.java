package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO_Classes.Donuts.Batter;
import POJO_Classes.Donuts.Koopmans;
import POJO_Classes.Donuts.Donuts;
import POJO_Classes.Donuts.Topping;

public class Donuts_Instance {

	public static void main(String[] args) throws JsonProcessingException {
		// Create Batter instances and set values
		Batter regularBatter = new Batter();
		regularBatter.setId("1001");
		regularBatter.setType("Regular");

		Batter chocolateBatter = new Batter();
		chocolateBatter.setId("1002");
		chocolateBatter.setType("Chocolate");

		// Create Batters instance and set the list of batters
		List<Batter> batterList = new ArrayList<>();
		batterList.add(regularBatter);
		batterList.add(chocolateBatter);

		Koopmans koopmans = new Koopmans();
		koopmans.setBatter(batterList);

		// Create Topping instances and set values
		Topping noneTopping = new Topping();
		noneTopping.setId("5001");
		noneTopping.setType("None");

		Topping glazedTopping = new Topping();
		glazedTopping.setId("5002");
		glazedTopping.setType("Glazed");

		// Create a list of toppings
		List<Topping> toppingList = new ArrayList<>();
		toppingList.add(noneTopping);
		toppingList.add(glazedTopping);

		// Create Donut instances and set values
		Donuts donut1 = new Donuts();
		donut1.setId("0001");
		donut1.setType("donut");
		donut1.setName("Cake");
		donut1.setPpu(0.55);
		donut1.setKoopmans(koopmans);
		donut1.setTopping(toppingList);

		Donuts donut2 = new Donuts();
		donut2.setId("0002");
		donut2.setType("donut");
		donut2.setName("Chocolate Cake");
		donut2.setPpu(0.65);
		donut2.setKoopmans(koopmans);
		donut2.setTopping(toppingList);

		// Create DonutList instance and set the list of donuts
		List<Donuts> donutsList = new ArrayList<>();
		donutsList.add(donut1);
		donutsList.add(donut2);

		// Print serialized JSON data for demonstration
		ObjectMapper mapper = new ObjectMapper();
		String serializedData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(donutsList);
		System.out.println("Serialized Data: \n" + serializedData);
	}
}
