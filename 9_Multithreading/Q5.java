class Test1 implements Runnable{
	public void run(){
		try{
			System.out.println(Thread.currentThread().getName());
			for(int i=1;i<=10 ; i++){
					System.out.println(i);
					Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
class Test2 implements Runnable{
	public void run(){
		try{
			System.out.println(Thread.currentThread().getName());
			for(int i=1;i<=10 ; i++){
					System.out.println(i);
					Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
public class Q5{
	public static void main(String x[]){
		Test1 t1 = new Test1();
		Thread th1 = new Thread(t1 , "Thread One");
		
		Test2 t2 = new Test2();
		Thread th2 = new Thread(t2 , "Threaad Two");
		
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.setPriority(Thread.MIN_PRIORITY);
		
		th1.start();
		th2.start();
	}
}