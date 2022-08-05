package Interfaces_JBP;

public class Task implements Priority, Comparable<Task>{
 enum Status{
	NOT_STARTED,
	IN_PROCESS,
	COMPLETE
	
}//end enum status
private String name;
private int priority;
public Status status;
//end instance fields
public Task() {
	this.name="";
	this.priority=0;
}//end empty argument constructor

public Task(String name,int priority,Status status) {
	this.name=name;
	this.priority=priority;
	this.status=status;
	
	if(this.priority < MIN_PRIORITY)
		this.priority = MIN_PRIORITY;

else if(this.priority > MAX_PRIORITY)
	this.priority = MAX_PRIORITY;

else if(this.priority > MIN_PRIORITY && this.priority < MAX_PRIORITY)
        this.priority = MED_PRIORITY;
	
}//end preferred constructor



public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

public int getPriority() {
	return priority;
}
public void setPriority(int priority) {
	this.priority = priority;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
}//end toString

public int compareTo(Task ram)

{
Task that = (Task)ram;
 int thisResult = (int)this.priority;

 int thatResult = (int)that.priority;

 if(Math.abs(thisResult-thatResult) < 0.0001)

return 0;
            

 else if(thisResult - thatResult < 0)

 return -1;

 else

   return 1;

}//end compareTo

@Override
public void setPriority() {
	
	
}

@Override
public int getPriority(int priority) {
	
	return 0;
}

              

}//end class
