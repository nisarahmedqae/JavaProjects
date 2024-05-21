package genericDataType;

//2. Code Reusability
public class GenericClass {

	public static void main(String[] args) {
		Box<String> stringBox = new Box<>();
		stringBox.setItem("Hello");
		System.out.println(stringBox.getItem());

		Box<Integer> intBox = new Box<>();
		intBox.setItem(123);
		System.out.println(intBox.getItem());
	}
}

class Box<T> {
	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
}