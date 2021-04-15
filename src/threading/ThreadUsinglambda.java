package threading;

public class ThreadUsinglambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable obj1 = new Runnable() {
//			public void run()
//		Runnable obj1 = () -> {
//				for (int i=0;i<5;i++) {
//					System.out.println("hi" + i);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			};
		
//		Runnable obj2 = new Runnable() {
//			public void run() {
//		Runnable obj2 = () -> {
//				for (int i=0;i<5;i++) {
//					System.out.println("hello" + i);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			};
		
		Thread t1= new Thread(() -> {
			for (int i=0;i<5;i++) {
				System.out.println("hi" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		Thread t2 = new Thread(() -> {
			for (int i=0;i<5;i++) {
				System.out.println("hello" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
