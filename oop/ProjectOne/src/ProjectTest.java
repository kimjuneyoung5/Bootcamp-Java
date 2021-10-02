
public class ProjectTest {
	public static void main(String[] args) {
		Project first_project = new Project();
		Project second_project = new Project("June");
		Project third_project = new Project("Angela", "Bad");
		
		System.out.println(third_project.getDescription());
		System.out.println(second_project.getName());
		System.out.println(first_project.getName());
		
		third_project.elevatorPitch();
	}
}
