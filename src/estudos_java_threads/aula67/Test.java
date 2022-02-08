package estudos_java_threads.aula67;

public class Test {

	public static void main(String[] args) {

		MinhaThread thread = new MinhaThread("Thread #1", 1200);
		//thread.start();
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 600);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 100);
	}

}
