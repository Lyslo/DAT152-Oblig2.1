package Model;

public class Product {
	private String name;
	private String description;
	private double price;

	public Product(String name, String description, double price) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return shortText(description);
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String shortText(String description) {

		String cutString;

		if (description.length() > 10) {
			cutString = description.substring(0, 10) + "...";
		} else {
			return description;
		}

		return cutString;
	}

}
