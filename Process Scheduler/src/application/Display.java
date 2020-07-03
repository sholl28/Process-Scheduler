package application;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Optional;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.Node; 



public class Display {
	
	
	public static void ShowResults(ArrayList<Job> results) {
		
		Stage window = new Stage();
		
		Group root = new Group();
	
		GridPane resultsGrid = new GridPane();
		resultsGrid.setLayoutX(1030);
		resultsGrid.setLayoutY(325);
		resultsGrid.setHgap(50);
		
		


	//job0 bar and legend
	if(results.size() > 0) {
	if(results.get(0) != null) {
		Rectangle job0Rec = new Rectangle(results.get(0).length * 10, 25, Color.BLUE);
		job0Rec.setX(results.get(0).startTime * 10);
		job0Rec.setY(0);
		
		Label job0Key = new Label("JOB " + results.get(0).name + "=" );
		job0Key.setLayoutX(1050);
		job0Key.setLayoutY(0);
		
		Rectangle job0KeyRec = new Rectangle(100, 25, Color.BLUE);
		job0KeyRec.setX(1100);
		job0KeyRec.setY(0);
		
		Text job0NameResults = new Text(results.get(0).name);
		resultsGrid.add(job0NameResults, 0, 1);
		
		Label job0CompletionTimeResults = new Label("" + results.get(0).completionTime);
		resultsGrid.add(job0CompletionTimeResults, 1, 1);
		
		Label job0TurnaroundTimeResults = new Label("" + results.get(0).turnaroundTime);
		resultsGrid.add(job0TurnaroundTimeResults, 2, 1);
		
		root.getChildren().addAll(job0Rec, job0Key, job0KeyRec);
	}}
	else {}
	
	
	//job1 bar and legend
	if(results.size() > 1) {

	if(results.get(1) != null) {
		Rectangle job1Rec = new Rectangle(results.get(1).length * 10, 25, Color.RED);
		job1Rec.setX(results.get(1).startTime*10);
		job1Rec.setY(50);
		
		Label job1Key = new Label("JOB " + results.get(1).name + "=");
		job1Key.setLayoutX(1050);
		job1Key.setLayoutY(50);
		
		Rectangle job1KeyRec = new Rectangle(100, 25, Color.RED);
		job1KeyRec.setX(1100);
		job1KeyRec.setY(50);
		
		Text job1NameResults = new Text(results.get(1).name);
		resultsGrid.add(job1NameResults, 0, 2);
		
		Label job1CompletionTimeResults = new Label("" + results.get(1).completionTime);
		resultsGrid.add(job1CompletionTimeResults, 1, 2);
		
		Label job1TurnaroundTimeResults = new Label("" + results.get(1).turnaroundTime);
		resultsGrid.add(job1TurnaroundTimeResults, 2, 2);
		
		root.getChildren().addAll(job1Rec, job1Key, job1KeyRec);
	}}
	else {}
	
	//job2 bar and legend
	if(results.size() > 2) {

	if(results.get(2) != null) {
		Rectangle job2Rec = new Rectangle(results.get(2).length * 10, 25, Color.GREEN);
		job2Rec.setX(results.get(2).startTime*10);
		job2Rec.setY(100);
		
		Label job2Key = new Label("JOB " + results.get(2).name + "=");
		job2Key.setLayoutX(1050);
		job2Key.setLayoutY(100);
		
		Rectangle job2KeyRec = new Rectangle(100, 25, Color.GREEN);
		job2KeyRec.setX(1100);
		job2KeyRec.setY(100);
		
		Text job2NameResults = new Text(results.get(2).name);
		resultsGrid.add(job2NameResults, 0, 3);
		
		Label job2CompletionTimeResults = new Label("" + results.get(2).completionTime);
		resultsGrid.add(job2CompletionTimeResults, 1, 3);
		
		Label job2TurnaroundTimeResults = new Label("" + results.get(2).turnaroundTime);
		resultsGrid.add(job2TurnaroundTimeResults, 2, 3);
		
		root.getChildren().addAll(job2Rec, job2Key, job2KeyRec);
	}}
	else {}
	
	//job3 bar and legend
	if(results.size() > 3) {

	if(results.get(3) != null) {
		Rectangle job3Rec = new Rectangle(results.get(3).length * 10, 25, Color.ORANGE);
		job3Rec.setX(results.get(3).startTime*10);
		job3Rec.setY(150);
		
		Label job3Key = new Label("JOB " + results.get(3).name + "=");
		job3Key.setLayoutX(1050);
		job3Key.setLayoutY(150);
		
		Rectangle job3KeyRec = new Rectangle(100, 25, Color.ORANGE);
		job3KeyRec.setX(1100);
		job3KeyRec.setY(150);
		
		root.getChildren().addAll(job3Rec, job3Key, job3KeyRec);
		
		Text job3NameResults = new Text(results.get(3).name);
		resultsGrid.add(job3NameResults, 0, 4);
		
		Label job3CompletionTimeResults = new Label("" + results.get(3).completionTime);
		resultsGrid.add(job3CompletionTimeResults, 1, 4);
		
		Label job3TurnaroundTimeResults = new Label("" + results.get(3).turnaroundTime);
		resultsGrid.add(job3TurnaroundTimeResults, 2, 4);
	}}
	else {}
	
	//job4 bar and legend
		if(results.size() > 4) {

		if(results.get(4) != null) {
			Rectangle job4Rec = new Rectangle(results.get(3).length * 10, 25, Color.BLUEVIOLET);
			job4Rec.setX(results.get(4).startTime*10);
			job4Rec.setY(200);
			
			Label job4Key = new Label("JOB " + results.get(4).name + "=");
			job4Key.setLayoutX(1050);
			job4Key.setLayoutY(200);
			
			Rectangle job4KeyRec = new Rectangle(100, 25, Color.BLUEVIOLET);
			job4KeyRec.setX(1100);
			job4KeyRec.setY(200);
			
			root.getChildren().addAll(job4Rec, job4Key, job4KeyRec);
			
			Text job4NameResults = new Text(results.get(4).name);
			resultsGrid.add(job4NameResults, 0, 5);
			
			Label job4CompletionTimeResults = new Label("" + results.get(4).completionTime);
			resultsGrid.add(job4CompletionTimeResults, 1, 5);
			
			Label job4TurnaroundTimeResults = new Label("" + results.get(4).turnaroundTime);
			resultsGrid.add(job4TurnaroundTimeResults, 2, 5);
		}}
		else {}
		
		//report
		
		Label completionTimeResultsLabel = new Label("Completion Time");
//		completionTimeResultsLabel.setLayoutX(1050);
//		completionTimeResultsLabel.setLayoutY(300);
		resultsGrid.add(completionTimeResultsLabel, 1, 0);
		
		Label turnaroundTimeResultsLabel = new Label("Turnaround Time");
//		turnaroundTimeResultsLabel.setLayoutX(1160);
//		turnaroundTimeResultsLabel.setLayoutY(300);
		resultsGrid.add(turnaroundTimeResultsLabel, 2, 0);
		
		
		
		double sum = 0;
		double avgTurnaroundTime;
		for(Job eachJob : results) {
			sum += eachJob.turnaroundTime;
		}
		
		avgTurnaroundTime = sum / results.size();
		
		DecimalFormat df = new DecimalFormat("#.00"); 
		df.format(avgTurnaroundTime);
		
		Label avgTurnaroundTimeLabel = new Label("Average Turnaround Time = " + df.format(avgTurnaroundTime));
		avgTurnaroundTimeLabel.setLayoutX(1050);
		avgTurnaroundTimeLabel.setLayoutY(425);
		
	
	Line clock0s  = new Line(0,   0, 0,   475); //(start x, start y, end x, end y)
	
	Line clock3s  = new Line(30,  0, 30,  475);
	clock3s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock5s  = new Line(50,  0, 50,  475);
	
	Line clock7s  = new Line(70,  0, 70,  475);
	clock7s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock10s = new Line(100, 0, 100, 475);
	
	Line clock13s  = new Line(130,  0, 130,  475);
	clock13s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock15s = new Line(150, 0, 150, 475);
	
	Line clock17s = new Line(170, 0, 170, 475);
	clock17s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock20s = new Line(200, 0, 200, 475);
	
	Line clock23s = new Line(230, 0, 230, 475);
	clock23s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock25s = new Line(250, 0, 250, 475);
	
	Line clock27s = new Line(270, 0, 270, 475);
	clock27s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock30s = new Line(300, 0, 300, 475);
	
	Line clock33s = new Line(330, 0, 330, 475);
	clock33s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock35s = new Line(350, 0, 350, 475);
	
	Line clock37s = new Line(370, 0, 370, 475);
	clock37s.getStrokeDashArray().addAll(2d, 15d);

	Line clock40s = new Line(400, 0, 400, 475);
	
	Line clock43s = new Line(430, 0 ,430, 475);
	clock43s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock45s = new Line(450, 0, 450, 475);
	
	Line clock47s = new Line(470, 0 , 470, 475);
	clock47s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock50s = new Line(500, 0, 500, 475);
	
	Line clock53s = new Line(530, 0, 530, 475);
	clock53s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock55s = new Line(550, 0, 550, 475);
	
	Line clock57s = new Line(570, 0, 570, 475);
	clock57s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock60s = new Line(600, 0, 600, 475);
	
	Line clock63s = new Line(630, 0, 630, 475);
	clock63s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock65s = new Line(650, 0, 650, 475);
	
	Line clock67s = new Line(670, 0, 670, 475);
	clock67s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock70s = new Line(700, 0, 700, 475);
	
	Line clock73s = new Line(730, 0, 730, 475);
	clock73s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock75s = new Line(750, 0, 750, 475);
	
	Line clock77s = new Line(770, 0, 770, 475);
	clock77s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock80s = new Line(800, 0, 800, 475);
	
	Line clock83s = new Line(830, 0, 830, 475);
	clock83s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock85s = new Line(850, 0, 850, 475);
	
	Line clock87s = new Line(870, 0, 870, 475);
	clock87s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock90s = new Line(900, 0, 900, 475);
	
	Line clock93s = new Line(930, 0, 930, 475);
	clock93s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock95s = new Line(950, 0, 950, 475);
	
	Line clock97s = new Line(970, 0, 970, 475);
	clock97s.getStrokeDashArray().addAll(2d, 15d);
	
	Line clock100s = new Line(1000,0,1000,475);
	
	Text text0s = new Text("0");
	text0s.setX(0);
	text0s.setY(490);
	
	Text text3s = new Text("3");
	text3s.setX(27);
	text3s.setY(475);

	Text text5s = new Text("5");
	text5s.setX(47);
	text5s.setY(490);
	
	Text text7s = new Text("7");
	text7s.setX(67);
	text7s.setY(475);

	Text text10s = new Text("10");
	text10s.setX(95);
	text10s.setY(490);
	
	Text text13s = new Text("13");
	text13s.setX(125);
	text13s.setY(475);
	
	Text text15s = new Text("15");
	text15s.setX(145);
	text15s.setY(490);
	
	Text text17s = new Text("17");
	text17s.setX(165);
	text17s.setY(475);
	
	Text text20s = new Text("20");
	text20s.setX(195);
	text20s.setY(490);
	
	Text text23s = new Text("23");
	text23s.setX(225);
	text23s.setY(475);
	
	Text text25s = new Text("25");
	text25s.setX(245);
	text25s.setY(490);
	
	Text text27s = new Text("27");
	text27s.setX(265);
	text27s.setY(475);
	
	Text text30s = new Text("30");
	text30s.setX(295);
	text30s.setY(490);
	
	Text text33s = new Text("33");
	text33s.setX(325);
	text33s.setY(475);
	
	Text text35s = new Text("35");
	text35s.setX(345);
	text35s.setY(490);
	
	Text text37s = new Text("37");
	text37s.setX(365);
	text37s.setY(475);
	
	Text text40s = new Text("40");
	text40s.setX(390);
	text40s.setY(490);
	
	Text text43s = new Text("43");
	text43s.setX(425);
	text43s.setY(475);
	
	Text text45s = new Text("45");
	text45s.setX(445);
	text45s.setY(490);
	
	Text text47s = new Text("47");
	text47s.setX(465);
	text47s.setY(475);
	
	Text text50s = new Text("50");
	text50s.setX(495);
	text50s.setY(490);
	
	Text text53s = new Text("53");
	text53s.setX(530);
	text53s.setY(475);
	
	Text text55s = new Text("55");
	text55s.setX(550);
	text55s.setY(490);
	
	Text text57s = new Text("57");
	text57s.setX(570);
	text57s.setY(475);
	
	Text text60s = new Text("60");
	text60s.setX(600);
	text60s.setY(490);
	
	Text text63s = new Text("63");
	text63s.setX(620);
	text63s.setY(475);
	
	Text text65s = new Text("65");
	text65s.setX(650);
	text65s.setY(490);
	
	Text text67s = new Text("67");
	text67s.setX(670);
	text67s.setY(475);
	
	Text text70s = new Text("70");
	text70s.setX(700);
	text70s.setY(490);

	Text text73s = new Text("73");
	text73s.setX(720);
	text73s.setY(475);
	
	Text text75s = new Text("75");
	text75s.setX(750);
	text75s.setY(490);
	
	Text text77s = new Text("77");
	text77s.setX(770);
	text77s.setY(475);
	
	Text text80s = new Text("80");
	text80s.setX(800);
	text80s.setY(490);
	
	Text text83s = new Text("83");
	text83s.setX(820);
	text83s.setY(475);
	
	Text text85s = new Text("85");
	text85s.setX(850);
	text85s.setY(490);
	
	Text text87s = new Text("87");
	text87s.setX(870);
	text87s.setY(475);
	
	Text text90s = new Text("90");
	text90s.setX(900);
	text90s.setY(490);
	
	Text text93s = new Text("93");
	text93s.setX(920);
	text93s.setY(475);
	
	Text text95s = new Text("95");
	text95s.setX(950);
	text95s.setY(490);
	
	Text text97s = new Text("97");
	text97s.setX(970);
	text97s.setY(475);
	
	Text text100s = new Text("100");
	text100s.setX(1000);
	text100s.setY(490);
	
	
	
	
	root.getChildren().addAll(
											 clock0s, clock3s, clock5s,clock7s,clock10s,clock13s,
									         clock15s,clock17s,clock20s,clock23s,clock25s, clock27s,
									         clock30s,clock33s,clock35s,clock37s,clock40s, clock43s,
									         clock45s,clock47s,clock50s,clock53s,clock55s,clock57s, clock60s, clock63s,
									         clock65s,clock67s,clock70s,clock73s, clock75s, clock77s,clock80s, clock83s,
									         clock85s,clock87s, clock90s, clock93s, clock95s,clock97s,clock100s,
									         text0s,  text3s,  text5s, text7s,  text10s, text13s, 
									         text15s, text17s, text20s, text23s, text25s, text27s, text30s, text33s, text35s, text37s,
									         text40s, text43s, text45s, text47s, text50s, text53s, text55s, text57s,
									         text60s, text63s, text65s,  text67s, text70s, text73s, text75s, text77s,
									         text80s, text83s, text85s,  text87s, text90s, text93s, text95s, text97s, text100s,avgTurnaroundTimeLabel,
									         resultsGrid);
	Scene processorScene = new Scene(root,1350,500);
	window.setScene(processorScene);
	window.showAndWait();
	}
	
	
}




