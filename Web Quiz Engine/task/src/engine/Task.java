package engine;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Task {

	private String title;
	private String text;
	private String[] options;
	private int id;
	private String answer;

	public Task() {
	}
//, String answer
	public Task(String title, String text, String[] options, int answer) {
		this.title = title;
		this.text = text;
		this.options = options;
		this.answer = String.valueOf(answer);
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

	public void setId(int id) {
		this.id = id;
	}

//	@JsonIgnore
	public String getAnswer() {
		return answer;
	}
}
