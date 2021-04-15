package threading;

class H implements Runnable {
@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("hi" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

	class Hell implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			System.out.println("Hello" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1 =new H();
		Runnable obj2 =new Hell();
		
		Thread t1= new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
}
