package engine;

public class TaskOut {
	private String title;
	private String text;
	private String[] options;
	private int id;

	public TaskOut() {
	}
	//, String answer
	public TaskOut(String title, String text, String[] options) {
		this.title = title;
		this.text = text;
		this.options = options;
	}

	public TaskOut(Task task) {
		this.title = task.getTitle();
		this.text = task.getText();
		this.options = task.getOptions();
		this.id = task.getId();
	}

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}

	public String[] getOptions() {
		return options;
	}

	public int getId() {
		return id;
	}
}
