import java.lang.Exception;
public class multiThread extends Thread {
	private int count;

	public void run() {
		int i=0;
		while (i<10) {
			this.count++;
			System.out.println(count + " is the no of time " + this.getName());
			try
			{
				sleep(500);
			}
			catch(Exception e){
				System.out.println("error occured");
			}
			i++;
		}
	}

	public static void main(String[] args) {
		multiThread t1 = new multiThread();
		multiThread t2 = new multiThread();
		t1.setName("CSThread");
		t2.setName("ITThread");

		t1.start();
		t2.start();

	}

}
