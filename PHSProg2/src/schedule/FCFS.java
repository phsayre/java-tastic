package schedule;
/*
 * Philip Sayre 2018
 */

public class FCFS {
	
	//the arrival times of each process
	private int arrivalA;
	private int arrivalB;
	private int arrivalC;
	private int arrivalD;
	private int arrivalE;
	private int arrivalF;
	//the service times of each process
	private int serviceA;
	private int serviceB;
	private int serviceC;
	private int serviceD;
	private int serviceE;
	private int serviceF;
	//arrays holding the service and arrival info
	private int[] serviceArray;
	private int[] arrivalArray;
	
	//constructor to set our variables
	FCFS() {
		 arrivalA = 0;
		 arrivalB = 1;
		 arrivalC = 2;
		 arrivalD = 4;
		 arrivalE = 6;
		 arrivalF = 8;
		 serviceA = 3;
		 serviceB = 6;
		 serviceC = 4;
		 serviceD = 8;
		 serviceE = 4;
		 serviceF = 2;
		 arrivalArray = new int[] {arrivalA, arrivalB, arrivalC, arrivalD, arrivalE, arrivalF};
		 serviceArray = new int[] {serviceA, serviceB, serviceC, serviceD, serviceE, serviceF};
	}
	
	//return the name of the algorithm
	public String algorithmName() { return "First Come First Serve"; }
	
	//return the arrival time of the process
	public int arrivalTime(int process) { return arrivalArray[process]; }
	
	//return the service time
	public int serviceTime() {
		int i = 0;
		int serviceTime = 0;
		while (i < serviceArray.length) {
			serviceTime += serviceArray[i];
			i++;
		}
		return serviceTime;
	}
	
	//return the exiting/terminating time of the process
	public int finishTime(int process)
	{
		int finishTime = 0;
		int i = process;
		while(i >= 0) {
			finishTime += serviceArray[i];
			i--;
		}
		return finishTime;
	}
	
	//return the turnaround time of the process
	public int turnaroundTime(int process) {
		if(process == 0) {
			return serviceArray[0];
		}
		int prevProcessFinish = finishTime(process - 1);
		int turnaroundTime = (prevProcessFinish - arrivalArray[process] + serviceArray[process]);
		return turnaroundTime;
	}
	
	//return normalized turnaround time
	public int normTurnaroundTime(int process) {
		int turnaroundTime = turnaroundTime(process);
		int normTurnaroundTime = (turnaroundTime/serviceArray[process]);
		return normTurnaroundTime;
	}
	
}
