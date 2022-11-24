//SYNCHRONIZATION //CLASS LEVEL LOCK
class display{
	synchronized static void printTerms(String name,int s,int e)
	{
		for(int i=s;i<=e;i++) {
			System.out.println(name+":"+i);
			try {Thread.sleep(200);}
			catch(InterruptedException ie) {}
		}
	}
	/*synchronized static*/ void igate() {
		for(int i=1;i<=25;i++) {
			System.out.println("igate solns");
			try{Thread.sleep(200);}
			catch(InterruptedException ie) {}
			
		}
	}
}
class Mythread extends Thread{
	int st,end;
	Mythread(String name,int st,int end){
		super(name);
		this.st=st;
		this.end=end;
	}
	public void run() {
		display.printTerms(getName(),st,end);
	}
}
public class prog99 {

	public static void main(String[] args) {
	Mythread th1=new Mythread("first",1,25);
	Mythread th2=new Mythread("second",51,75);
	th1.start();
	th2.start();
	display ob=new display();
	ob.igate();

	}

}



