package application;

import java.util.ArrayList;
import java.util.Objects;

public class Scheduler {

	public static ArrayList<Job> fcfs(ArrayList<Job> fcfsList) {
		
		fcfsList.removeIf(Objects::isNull);

		int j = 0;
		Job temp;
		while(j != 8) {
			j++;
			for(int i = 0; i < fcfsList.size() - j; i++) {
				if(fcfsList.get(i).arrivalTime > fcfsList.get(i+1).arrivalTime) {
					temp = fcfsList.get(i);
					fcfsList.set(i, fcfsList.get(i+1));
					fcfsList.set(i+1, temp);
				}
			}
		}
		
		ArrayList<Job> results = new ArrayList<Job>();
		results = (ArrayList<Job>) fcfsList.clone();
		
		

		int clock = 0;
		
		
		for(Job eachJob : results) {
			while(clock >= eachJob.arrivalTime == false) {
				clock += 1;
			}
			eachJob.startTime = clock;
			clock += eachJob.length;
			eachJob.completionTime = clock;
			eachJob.turnaroundTime = eachJob.completionTime - eachJob.arrivalTime;
		}
		
		Display.ShowResults(results);
		return results;
	}
	
	public static ArrayList<Job> sjn(ArrayList<Job> sortedList ) {
		
		
		sortedList.removeIf(Objects::isNull);
		
		//ordering jobs by length
		
		int j = 0;
		Job tmp;
		while (j != 8) { 
			j++;
			for (int i = 0; i < sortedList.size() - j; i++) {
				if (sortedList.get(i).length > sortedList.get(i + 1).length) {
						tmp = sortedList.get(i);  //hold jobList[0]
						sortedList.set(i, sortedList.get(i+1));  //set jobList[1] to [0]
						sortedList.set(i+1, tmp);
					}
				}
			}
		
		ArrayList<Job> results = new ArrayList<Job>(3);
		
		//running sortedList (ordered by length) through. if job has not arrived yet, clock + 1
		int clock = 0;
		while(results.size() != sortedList.size()) {
			for(Job eachJob : sortedList) {
				while(clock >= eachJob.arrivalTime == false) {
					clock +=1;
				}
				if(eachJob != null && !results.contains(eachJob)) {
					if(clock >= eachJob.arrivalTime) {
						eachJob.startTime = clock;
						eachJob.completionTime = clock + eachJob.length;
						clock = eachJob.completionTime;
						eachJob.turnaroundTime = eachJob.completionTime - eachJob.arrivalTime;
						results.add(eachJob);
					}
				}
			}
		}
		
		Display.ShowResults(results);
		

		return results;
	}
}
	



	

