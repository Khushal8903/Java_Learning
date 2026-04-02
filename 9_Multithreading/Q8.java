/*
Q3. Write a Java program to create three threads and assign them different priorities.
 Display the priority and name of each thread.
Explanation: This question explains:
Thread priority concept


MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY
How priority affects execution (not guaranteed)
*/
class Test1 extends Thread{
	public void run(){
		System.out.println("Thread = " + Thread.currentThread().getPriority());
	}
}
class Test2 extends Thread{
	public void run(){
		System.out.println("Thread = "+ Thread.currentThread().getPriority());
	}
}
class Test3 extends Thread{
	public void run(){
		System.out.println("Thread = "+ Thread.currentThread().getPriority());
	}
}

public class Q8{
	public static void main(String x[]){
	
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}