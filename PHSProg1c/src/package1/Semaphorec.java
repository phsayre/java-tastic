package package1;

public class Semaphorec {
	public int sem = 0;
	
	//not ready to produce
	public void semWait() {
		sem = 0;
	}
	
	//ready to produce
	public void semSignal() {
		sem++;
	}
	
	//returns the value of the semaphore
	public int semStatus() {
		return sem;
	}
}
