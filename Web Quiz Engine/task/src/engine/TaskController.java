package engine;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "There is no such ID")
class ThereIsNoSuchUserException extends RuntimeException {
}

@RestController
public class TaskController {
	private List<Task> tasks = new ArrayList<>();

	public TaskController() {
	}

	@PostMapping(path = "/api/quizzes/{id}/solve")
	public TaskPost addTask(@PathVariable int id, @RequestParam Map<String, String> body){
		if (body.get("answer").equals(tasks.get(id).getAnswer())) {
			return (new TaskPost(true, "Congratulations, you're right!"));
		} else {
			return (new TaskPost(false, "Wrong answer! Please, try again."));
		}
	}

	@PostMapping(path = "/api/quizzes")
	public TaskOut addTask(@RequestBody Task task){
		if (tasks.size() > 0) {
			int id = tasks.get(tasks.size() - 1).getId();
			tasks.add(task);
			tasks.get(tasks.size() - 1).setId(id + 1);
		}
		else {
			tasks.add(task);
		}
		return new TaskOut(task);
	}

	@GetMapping(path = "/api/quizzes")
	public List<Task> getTaskAll(){
		return tasks;
	}

	@GetMapping(path = "/api/quizzes/{id}")
	public TaskOut getTask(@PathVariable int id) {

		if (id >= tasks.size()) {
			throw new ThereIsNoSuchUserException();
		}
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).getId() == id) {
				return new TaskOut(tasks.get(i));
			}
		}
		return null;
	}
}
