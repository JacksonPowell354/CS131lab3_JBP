package Interfaces_JBP;
import Interfaces_JBP.Task.Status;

public class Application {

	public static void main(String[] args) {
Priority p = new Task();

Task t1 = new Task("Workout",5,Status.COMPLETE);
Task t2 = new Task("Go hiking",10, Status.IN_PROCESS);
Task t3 = new Task("Apply for jobs",1,Status.IN_PROCESS);
Task t4 = new Task("Build table",5,Status.NOT_STARTED);
Process p1 = new Process("'Run Security Check'",1);
Process p2 = new Process("'Update Driver'",5);
Process p3 = new Process("'Remove Unused Space'",1);

System.out.println(t1.toString());
System.out.println(t2.toString());
System.out.println(t3.toString());

System.out.println(p1.toString());
System.out.println(p2.toString());
System.out.println(p3.toString());

int a = t1.compareTo(t2);
int b=t2.compareTo(t3);
int c=t3.compareTo(t4);

if (a==1) {System.out.println("'Workout' is more important than 'Go Hiking' " + b);
}
else System.out.println("'Go Hiking is more important than Workout" +c);
if (b==1) {System.out.println("Go Hiking is more important than 'Apply for Jobs'");
}
else System.out.println("'Apply for Jobs' is more important than 'Go Hiking'");
if (c==1) {System.out.println("'Apply for Jobs Table' is more important than 'Build Table'");
}
else System.out.println("'Build Table' is more important than 'Apply for Jobs'");

}//end main

}//end class
