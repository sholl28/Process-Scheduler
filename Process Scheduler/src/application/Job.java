package application;

import javafx.scene.control.TextField;

public class Job {
	  
	  String name;
	  int length;
	  int arrivalTime;
	  int completionTime;
	  int startTime;
	  int turnaroundTime;
	  
	  Job(String name, int length, int arrivalTime) {
	    
	    this.name = name;
	    this.length = length;
	    this.arrivalTime = arrivalTime;
	    
	  }

	  
	  public String toString() {
	    return name + length + arrivalTime;
	  }
	  



	  public static void main(String[] args) {
	  

	  }
}