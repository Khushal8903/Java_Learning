/*
Q2. Create two threads using the Runnable interface.
 Each thread should print "Task is running" five times.
Input :- No input.
Output :- Message printed multiple times by both threads.
Thread-A : Task is running
Thread-B : Task is running
Thread-A : Task is running
Thread-B : Task is running
*/

class Test extends Thread{
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName() + " : Task is running");
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.print(e);
		}
	}
}
public class Q7{
	public static void main(String x[]){
		Test t = new Test();
		t.setName("Thread-A");
		t.start();
		Test t1 = new Test();
		t1.setName("Thread-B");
		t1.start();
	}
}