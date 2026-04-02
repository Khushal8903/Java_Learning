class Test implements Runnable{
	public void run(){
	try{
		Table2 t2 = new Table2();
		t2.set(2);
		t2.start();
		t2.join();
		Table3 t3 = new Table3();
		t3.set(3);
		t3.start();
	}catch(Exception e){
		System.out.println(e);
	}
	}
}
class Table2 extends Thread{
	int n;
	public void set(int n){
	this.n=n;	
	}

	public void run(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println(n"*"+i+"	=	"+n*i);
					Thread.sleep(1000);
					if(i==5){
						Thread.sleep(10000);
					}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
class Table3 extends Thread{
	int n;
	public void set(int n){
	this.n=n;	
	}

	public void run(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println(n"*"+i+"	=	"+n*i);
					Thread.sleep(1000);
					
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
public class Q4{
	public static void main(String x[]){
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
	}
} 