package seedu.duke.data.task;

public class Task {
    public String description;
    public boolean isDone;
    
    /** 
     * Constructs a new Task with the specified description and marking the done progress as not completed.
     * @param description   The description from the input by the user.
     */
    public Task(String description) {
        this.description = description.trim();
        this.isDone = false;
    }
   
    /** 
     * Returns the done status in a symbol format.
     * @return String   The done status in a symbol format with a tick symbol as done or a cross symbol as not done.
     */
    public String getStatusIcon() {
        return (this.isDone ? "[\u2713] " : "[\u2718] ");
    }

    /** 
     * Returns the task in String format.
     * @return String   The task in a string format.
     */
    public String toString(){
        return getStatusIcon() + this.description;
    }

    public void setDone(){
        this.isDone = true;
    }
}