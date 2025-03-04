import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskService {

	Scanner sc = new Scanner(System.in);
	Status status = Status.CRIADA;
	
	private List<Task> tasks = new ArrayList<>();
	
	public TaskService() {
	}
	
	public List<Task> getTasks() {
		for(Task task : tasks) {
			System.out.println(task);
		}
		return tasks;
	}
	
}
