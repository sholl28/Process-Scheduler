package application;
	
import java.util.ArrayList;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;



public class Main extends Application {
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		Scene scene;
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(20);
		grid.setHgap(10);
		
		ArrayList<Job> jobList = new ArrayList<Job>();
		
		jobList.add(null);
		jobList.add(null);
		jobList.add(null);
		jobList.add(null);
		jobList.add(null);
	
		
		//job0////////////////////////
		TextField job0Name = new TextField();
		job0Name.setPromptText("Job 0 Name");
		GridPane.setConstraints(job0Name, 0, 0);
		
		TextField job0Length = new TextField();
		job0Length.setPromptText("Job 0 Length");
		GridPane.setConstraints(job0Length, 0, 1);
		
		TextField job0ArrivalTime = new TextField();
		job0ArrivalTime.setPromptText("Job 0 Arrival Time");
		GridPane.setConstraints(job0ArrivalTime, 0, 2);
		
		
		
		Button createJob0 = new Button("Create job0");
		GridPane.setConstraints(createJob0, 1, 0);
		createJob0.setOnAction(e -> {
			if(job0Name.getText().trim().isEmpty() || job0Length.getText().trim().isEmpty() ||job0ArrivalTime.getText().trim().isEmpty()) {
				e.consume();
				System.out.println("Each job requires name, length, and arrival time");
			}
			else{
				try {
				int job0LengthInt = Integer.parseInt(job0Length.getText());
				int job0ArrivalTimeInt = Integer.parseInt(job0ArrivalTime.getText());
				Job job0 = new Job(job0Name.getText(), job0LengthInt, job0ArrivalTimeInt);
				jobList.set(0,job0);
				System.out.println("Job 0 created");
				} catch(Exception e1) {
					e.consume();
					System.out.println("Each job requires name, length, and arrival time");
				}
			}
		});
			
		Button removeJob0 = new Button("remove Job 0");
		GridPane.setConstraints(removeJob0, 2, 0);
		removeJob0.setOnAction(e -> {
			if(jobList.get(0) != null) {
				System.out.println("Job 0 removed");
				job0Name.clear();
				job0Length.clear();
				job0ArrivalTime.clear();
				jobList.set(0,null);
				}
			else {e.consume();}
		});
		
		
		
		//job1//////////////////////
		TextField job1Name = new TextField();
		job1Name.setPromptText("Job 1 Name");
		GridPane.setConstraints(job1Name, 0, 4);
		
		TextField job1Length = new TextField();
		job1Length.setPromptText("Job 1 Length");
		GridPane.setConstraints(job1Length, 0, 5);
		
		TextField job1ArrivalTime = new TextField();
		job1ArrivalTime.setPromptText("Job 1 Arrival Time");
		GridPane.setConstraints(job1ArrivalTime, 0, 6);
		
		Button createJob1 = new Button("Create job1");
		GridPane.setConstraints(createJob1, 1, 4);
		createJob1.setOnAction(e -> {
			if(job1Name.getText().trim().isEmpty() || job1Length.getText().trim().isEmpty() ||job1ArrivalTime.getText().trim().isEmpty()) {
				e.consume();
				System.out.println("Each job requires name, length, and arrival time");
			}
			else {
				try {
					int job1LengthInt = Integer.parseInt(job1Length.getText());
					int job1ArrivalTimeInt = Integer.parseInt(job1ArrivalTime.getText());
					Job job1 = new Job(job1Name.getText(), job1LengthInt, job1ArrivalTimeInt);
					jobList.set(1,job1);
					System.out.println("Job 1 created");
					} catch(Exception e1) {
						e.consume();
						System.out.println("Each job requires name, length, and arrival time");
					}
			}
		});
		
		Button removeJob1 = new Button("remove Job 1");
		GridPane.setConstraints(removeJob1, 2, 4);
		removeJob1.setOnAction(e -> {
			if(jobList.size() > 0 && jobList.get(1) != null)
			{
				System.out.println("Job 1 removed");
				job1Name.clear();
				job1Length.clear();
				job1ArrivalTime.clear();
				jobList.set(1,null);
			}
			else {
				e.consume();
			}
		});
		
		//job2//////////////////////
		TextField job2Name = new TextField();
		job2Name.setPromptText("Job 2 Name");
		GridPane.setConstraints(job2Name, 0, 8);
		
		TextField job2Length = new TextField();
		job2Length.setPromptText("Job 2 Length");
		GridPane.setConstraints(job2Length, 0, 9);
		
		TextField job2ArrivalTime = new TextField();
		job2ArrivalTime.setPromptText("Job 2 Arrival Time");
		GridPane.setConstraints(job2ArrivalTime, 0, 10);
		
		Button createJob2 = new Button("Create Job 2");
		GridPane.setConstraints(createJob2, 1, 8);
		createJob2.setOnAction(e -> {
			if(job2Name.getText().trim().isEmpty() || job2Length.getText().trim().isEmpty() || job2ArrivalTime.getText().isEmpty()) {
				e.consume();
				System.out.println("Each job requires name, length, and arrival time");
			}
			else {
				try {
					int job2LengthInt = Integer.parseInt(job2Length.getText());
					int job2ArrivalTimeInt = Integer.parseInt(job2ArrivalTime.getText());
					Job job2 = new Job(job2Name.getText(), job2LengthInt, job2ArrivalTimeInt);
					jobList.set(2,job2);
					System.out.println("Job 2 Created");
				}   catch(Exception e1) {
					e.consume();
					System.out.println("Each job requires name, length, and arrival time");
				}
			}
		});
		
		Button removeJob2 = new Button("remove Job 2");
		GridPane.setConstraints(removeJob2, 2, 8);
		removeJob2.setOnAction(e -> {
			if(jobList.size() > 0 && jobList.get(2) != null)
			{
			System.out.println("Job 2 removed");	
			job2Name.clear();	
			job2Length.clear();
			job2ArrivalTime.clear();
			jobList.set(2,null);
			}
			else {
				e.consume();
			}
		});
		
		//job3//////////////////////
		TextField job3Name = new TextField();
		job3Name.setPromptText("Job 3 Name");
		GridPane.setConstraints(job3Name, 0, 12);
		
		TextField job3Length = new TextField();
		job3Length.setPromptText("Job 3 Length");
		GridPane.setConstraints(job3Length, 0, 13);
		
		TextField job3ArrivalTime = new TextField();
		job3ArrivalTime.setPromptText("Job 3 Arrival Time");
		GridPane.setConstraints(job3ArrivalTime, 0, 14);
		
		Button createJob3 = new Button("Create Job 3");
		GridPane.setConstraints(createJob3, 1, 12);
		createJob3.setOnAction(e -> {
			if(job3Name.getText().trim().isEmpty() || job3Length.getText().trim().isEmpty() || job3ArrivalTime.getText().isEmpty()) {
				e.consume();
				System.out.println("Each job requires name, length, and arrival time");
			}
			else {
				try {
					int job3LengthInt = Integer.parseInt(job3Length.getText());
					int job3ArrivalTimeInt = Integer.parseInt(job3ArrivalTime.getText());
					Job job3 = new Job(job3Name.getText(), job3LengthInt, job3ArrivalTimeInt);
					jobList.set(3,job3);
					System.out.println("Job 3 Created");
				}   catch(Exception e1) {
					e.consume();
					System.out.println("Each job requires name, length, and arrival time");
				}
			}
		});
		
		
		Button removeJob3 = new Button("remove Job 3");
		GridPane.setConstraints(removeJob3, 2, 12);
		removeJob3.setOnAction(e -> {
			if(jobList.size() > 0 && jobList.get(3) != null)
			{
			System.out.println("Job 3 removed");	
			job3Name.clear();	
			job3Length.clear();
			job3ArrivalTime.clear();
			jobList.set(3,null);
			}
			else {
				e.consume();
			}
		});
		
		

		//job4//////////////////////
		TextField job4Name = new TextField();
		job4Name.setPromptText("Job 4 Name");
		GridPane.setConstraints(job4Name, 0, 16);
		
		TextField job4Length = new TextField();
		job4Length.setPromptText("Job 4 Length");
		GridPane.setConstraints(job4Length, 0, 17);
		
		TextField job4ArrivalTime = new TextField();
		job4ArrivalTime.setPromptText("Job 4 Arrival Time");
		GridPane.setConstraints(job4ArrivalTime, 0, 18);
		
		Button createJob4 = new Button("Create Job 4");
		GridPane.setConstraints(createJob4, 1, 16);
		createJob4.setOnAction(e -> {
			if(job4Name.getText().trim().isEmpty() || job4Length.getText().trim().isEmpty() || job4ArrivalTime.getText().isEmpty()) {
				e.consume();
				System.out.println("Each job requires name, length, and arrival time");
			}
			else {
				try {
					int job4LengthInt = Integer.parseInt(job4Length.getText());
					int job4ArrivalTimeInt = Integer.parseInt(job4ArrivalTime.getText());
					Job job4 = new Job(job4Name.getText(), job4LengthInt, job4ArrivalTimeInt);
					jobList.set(4,job4);
					System.out.println("Job 4 Created");
				}   catch(Exception e1) {
					e.consume();
					System.out.println("Each job requires name, length, and arrival time");
				}
			}
		});
		
		Button removeJob4 = new Button("remove Job 4");
		GridPane.setConstraints(removeJob4, 2, 16);
		removeJob4.setOnAction(e -> {
			if(jobList.size() > 0 && jobList.get(4) != null)
			{
			System.out.println("Job 4 removed");	
			job4Name.clear();	
			job4Length.clear();
			job4ArrivalTime.clear();
			jobList.set(4,null);
			}
			else {
				e.consume();
			}
		});

		
		Button printJobList = new Button("See current job list");
		GridPane.setConstraints(printJobList, 0, 20);
		printJobList.setOnAction(e -> {
			System.out.println("---Job List---");
			for(Job eachJob : jobList) {
				if(eachJob == null) {
					System.out.println("null");
				}
				else {
				System.out.println(eachJob.toString());
				}
		}});
		
		Button fcfsButton = new Button("First Come First Serve");
		GridPane.setConstraints(fcfsButton, 1, 20);
		fcfsButton.setOnAction(e -> {
			ArrayList<Job> fcfsList = new ArrayList<Job>(5);
			fcfsList = (ArrayList<Job>) jobList.clone();
			Scheduler.fcfs(fcfsList);
		});
		
		Text fcfsDescription = new Text("\n Simple scheduling that runs the jobs based on arrival time and nothing else. "
				+ " \n Shorter jobs with higher arrival times may be starved waiting on longer jobs to finish.");
		GridPane.setConstraints(fcfsDescription, 1, 21);
		fcfsDescription.setWrappingWidth(175);
		
		
		Button sjnButton = new Button("Shortest Job Next");
		GridPane.setConstraints(sjnButton, 2, 20);
		sjnButton.setOnAction(e -> {
			ArrayList<Job> sortedList = new ArrayList<Job>(3);
			sortedList = (ArrayList<Job>) jobList.clone();
			Scheduler.sjn(sortedList);
		});
		
		Text sjnDescription = new Text("Non-preemptive approach that first sorts jobs by length. \n Then runs each based on arrival time. Shorter jobs that arrive early finish first." );
		GridPane.setConstraints(sjnDescription, 2, 21);
		sjnDescription.setWrappingWidth(175);
		
		grid.getChildren().addAll(job0Name,job0Length,job0ArrivalTime,createJob0,removeJob0,
								  job1Name,job1Length,job1ArrivalTime,createJob1,removeJob1,
								  job2Name,job2Length,job2ArrivalTime,createJob2,removeJob2,
								  job3Name,job3Length,job3ArrivalTime,createJob3,removeJob3,
								  job4Name,job4Length,job4ArrivalTime,createJob4,removeJob4,
								  printJobList,fcfsButton,sjnButton,fcfsDescription, sjnDescription);
		

		
		scene = new Scene(grid,520,950);
		
		
		arg0.setTitle("Process Scheduler");
		arg0.setScene(scene);
		arg0.show();
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
