
public class Task {

	private Integer id;
	private String tarefa;
	private String responsável;
	private Status status;
	
	public Task() {
	}

	public Task(Integer id, String tarefa, String responsável, Status status) {
		this.id = id;
		this.tarefa = tarefa;
		this.responsável = responsável;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public String getResponsável() {
		return responsável;
	}

	public void setResponsável(String responsável) {
		this.responsável = responsável;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Id: " + id + " - Tarefa: " + tarefa + " - Responsável: " + responsável + " - Status: " + status;
	}
}
