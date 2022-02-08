package estudos_java_threads.aula68;

public class Test2 {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);
//		Thread t1 = new Thread(thread1);
//		t1.start();

		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 1000);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 100);
	}

}
