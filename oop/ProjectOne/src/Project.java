
public class Project {
	public String name;
	public String description;
	
	public Project() {
		this.name = "default name";
		this.description = "default";
	}
	
	public Project(String name) {
		this.name = name;
		this.description = "default";
	}
	
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	//Getter and Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void elevatorPitch() {
		System.out.print(name);
		System.out.println(description);
	}
}
