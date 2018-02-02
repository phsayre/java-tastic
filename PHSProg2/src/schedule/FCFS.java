package schedule;

/*
 * Variables to implement

Process name (given)

Arrival Time (given)

Service Time - TS (given)

Exiting/Terminating Time

Turnaround time - TAT or TT

TT/Ts

The average of all the  TT  

The average of all the   TT/Ts

Number of times preempted (if any)
 */

public class FCFS {
	
	public FCFS() {
		//the arrival times of each process
		int arrivalA = 0;
		int arrivalB = 1;
		int arrivalC = 2;
		int arrivalD = 4;
		int arrivalE = 6;
		int arrivalF = 8;
		//the service times of each process
		int serviceA = 3;
		int serviceB = 6;
		int serviceC = 4;
		int serviceD = 8;
		int serviceE = 4;
		int serviceF = 2;
		//arrays holding the service and arrival info
		int[] serviceArray = new int[] {serviceA, serviceB, serviceC, serviceD, serviceE, serviceF};
		int[] arrivalArray = new int[] {arrivalA, arrivalB, arrivalC, arrivalD, arrivalE, arrivalF};
	}
	
	//return the name of the algorithm
	public String getName() { return "First Come First Serve"; }
	
	//return the arrival time of the process
	public int getArrivalTime(int process) {
		return arrivalArray[process];
	}
	
	public int getServiceTime() { return calculateServiceTime(); }
	
	private int calculateServiceTime(int[] procArray) {
		
		return 0;
	}
}
