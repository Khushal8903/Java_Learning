public class Table extends Thread{
	public void run(){
		try{
			for(int i=1 ; i<=10 ;i++){
				//System.out.println(10 / 0);

				System.out.println("2*"+i+"	=	"+2*i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

public class Q3{
	public static void main(String x[]){
		Table t = new Table();
		t.start();
		
	}
}