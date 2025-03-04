import java.util.ArrayList;
import java.util.InputMismatchException;
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
	
	public Task novaTarefa() {
		Integer id = 0;
		
		try {
			System.out.println();
			System.out.println("Digite um NÚMERO INTEIRO");
			System.out.print("Id: ");
			id = sc.nextInt();
							
			for(Task task : tasks) {
				if(task.getId() == id) {
				System.out.println("ID já existente.");
				System.out.println("Id: ");
				id = sc.nextInt();
				}
			}
		}
		catch(InputMismatchException e) {
			throw new InputMismatchException("Valor inválido.");
		}
						
		System.out.print("Tarefa: ");
		sc.nextLine();
		String tarefa = sc.nextLine();
		System.out.print("Responsável: ");
		String responsável = sc.nextLine();
							
		Task novaTarefa = new Task(id, tarefa, responsável, status);
		tasks.add(novaTarefa);
		
		return novaTarefa;
	}
	
	public String deletarTarefa(int id) {
		String resultado = null;
		try {
			for(Task task : tasks) {
				if (task.getId().equals(id)) {
					tasks.remove(task);
					resultado = "Tarefa deletada.";
				}
				else {
					resultado =  "valor inválido.";
				}
			}
		}
		catch(RuntimeException e) {
			resultado = "Valor inválido.";
		}
		return resultado;
	}
	
	public List<Task> listarTarefas() {
		System.out.println();
		System.out.print("Nome do funcionário: ");
		String nome = sc.next();
		for(Task task : tasks) {
			if (task.getResponsável().equals(nome)) {
				System.out.println(task);
			}
		}
		return tasks;
	}
	
	public void atualizarStatus() {
		System.out.println();
		System.out.print("Digite o id da tarefa a ser atualizada: ");
		int id = sc.nextInt();
		for(Task task : tasks) {
			if (task.getId().equals(id)) {
				System.out.println("Qual o novo status da tarefa?");
				System.out.println("1 - Em processamento | 2 - Concluída | 3 - Atrasada | 4 - Cancelada");
				System.out.print("Digite o número correspondente:");
				int status = sc.nextInt();
				if(status == 1) {
					task.setStatus(Status.EM_PROCESSAMENTO);
				}
				if(status == 2) {
					task.setStatus(Status.CONCLUIDA);
				}
				if(status == 3) {
					task.setStatus(Status.ATRASADA);
				}
				if(status == 4) {
					task.setStatus(Status.CANCELADA);
				}
			}
		}
	}
}
