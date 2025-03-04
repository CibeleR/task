import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TaskService taskService = new TaskService();
		
		int menu = 0;
		
		while (menu != 5) {
			
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("TAREFAS");
			taskService.getTasks();
			
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1 - Criar");
			System.out.println("2 - Deletar");
			System.out.println("3 - Buscar lista de tarefas por funcionário");
			System.out.println("4 - Atualizar status da tarefa");
			System.out.println("5 - Fechar programa");
			System.out.println();
			System.out.println("O que você deseja fazer?");
			System.out.print("Digite o ID da ação: ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				taskService.novaTarefa();
			}
			
			if(menu == 2) {
				System.out.print("Id da tarefa a ser deletada: ");
				int id = sc.nextInt();
				taskService.deletarTarefa(id);
			}
			
		}
		sc.close();
		
	}
}
