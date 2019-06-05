package exemploHeitorThreads;

public class Programa implements Runnable{

	private String id;
	private boolean metade;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean isMetade() {
		return metade;
	}
	@Override
	public void run() {
		metade = false;
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Programa " + id + " - comando "+ i);
			if(i == 5) {
				metade = true;
			}
		}
		
	}

}