package estudos_java_threads.aula69;

public class MinhaThreadRunnable implements Runnable {

	private String name;
	private int time;

	public MinhaThreadRunnable(String name, int tempo) {
		this.name = name;
		this.time = tempo;
//		Thread t = new Thread(this);
//		t.start();
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(name + " contador " + i);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " terminou a execução");
	}

}
