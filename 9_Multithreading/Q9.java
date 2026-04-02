/*
Q4. Write a Java program where the main thread waits for a child thread to complete its execution using the join() method.
Explanation :
This problem helps you understand:
Thread coordination
How one thread waits for another
Real-time use of join()
*/
class Test1 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Thread :"+Thread.currentThread().getName() + " = "+ i);
		}
	}
}
class Test2 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Thread :"+Thread.currentThread().getName() + " = "+ i);
		}
	}
}
class Test3 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Thread :"+Thread.currentThread().getName() + " = "+ i);
		}
	}
}

public class Q9{
	public static void main(String x[]){
		try{
			Test1 t1 = new Test1();
			Test2 t2 = new Test2();
			Test3 t3 = new Test3();
			t1.setName("Thread1");
			t2.setName("Thread2");
			t3.setName("Thread3");
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}