class Test implements Runnable{
	public void run(){
		try{
			System.out.println(Thread.currentThread().getName());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
public class Q2{
	public static void main(String x[]){
		Test t = new Test();
		Thread th = new Thread(t);
		th.setName("Thread1");
		th.start();
	}
}