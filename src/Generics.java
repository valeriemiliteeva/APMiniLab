
public abstract class Generics implements Comparable<Generics> {
	public static final String type = "Generic";
	private String subType;

	protected void setType(String type) {
		this.subType = type;
	}

	public String getType() {
		return subType;
	}

	// force toString
	public abstract String toString();

	// object comparison
	public int compareTo(Generics o) {

		return this.toString().compareTo(o.toString());
	}

}
