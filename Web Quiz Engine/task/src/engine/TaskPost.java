package engine;

public class TaskPost {
    private boolean success;
    private String feedback;

    public TaskPost() {
    }


    public TaskPost(boolean success, String feedback) {
        this.success = success;
        this.feedback = feedback;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getFeedback() {
        return feedback;
    }

//    public String getAnswer() {
//        return answer;
//    }
}
