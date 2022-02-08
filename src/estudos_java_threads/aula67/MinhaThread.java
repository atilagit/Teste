package estudos_java_threads.aula67;

public class MinhaThread extends Thread {

	private String name;
	private int time;

	public MinhaThread(String name, int time) {
		this.name = name;
		this.time = time;
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(name + " contador " + i);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name + " terminou a execução");
	}
}
