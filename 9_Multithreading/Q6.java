/*
Q1. Write a Java program to create three threads using the Thread class.
 Each thread should print numbers from 1 to 5 along with its thread name.
Input :- No user input.
          Threads start automatically.
Output :- Numbers from 1 to 5 printed by different threads.
	   Order may vary.

Thread-0 : 1
Thread-1 : 1
Thread-2 : 1
Thread-0 : 2
Thread-2 : 2
Thread-1 : 2
*/
class Test extends Thread{
	public void run(){
		for(int i=1 ; i<=5 ;i++){
			System.out.println(Thread.currentThread().getName() +":"+ i);
			
		}
	}
}

public class Q6{
	public static void main(String x[]){
		try{
		Test t = new Test();
		Test t1 = new Test();
		Test t2 = new Test();
		t.setName("Thread-0");
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t.start();
		t.join();
		t1.start();
		t2.start();
		}catch(Exception e){
			System.out.print(e);
			
		}
	}
}