package POJO_Classes.Donuts;

import java.util.List;

public class Donuts {

	private String id;
	private String type;
	private String name;
	private double ppu;
	private Koopmans koopmans;
	private List<Topping> topping;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPpu() {
		return ppu;
	}

	public void setPpu(double ppu) {
		this.ppu = ppu;
	}

	public Koopmans getkoopmans() {
		return koopmans;
	}

	public void setKoopmans(Koopmans koopmans) {
		this.koopmans = koopmans;
	}

	public List<Topping> getTopping() {
		return topping;
	}

	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}
}
