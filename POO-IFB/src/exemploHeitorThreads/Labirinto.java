package exemploHeitorThreads;

import java.util.Random;

public class Labirinto implements Runnable{
	
	String [][] m;
	int n;
	int xp, yp, xm, ym;
	
	public Labirinto(int n) {
		super();
		this.n = n;
		m = new String[n][n];
		this.gerarLabirinto();
	}
	
	private void gerarLabirinto() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = "_";
			}
		}
		Random r = new Random();
		xp = r.nextInt(n);
		yp = r.nextInt(n);
		xm = r.nextInt(n);
		ym = r.nextInt(n);
		m[xp][yp] = "P";
		m[xm][ym] = "M";
	}
	
	public void imprimeLabirinto() {
		
		System.out.println("\n\n\n\n");
		for (int i = 0; i < m.length; i++) {
			System.out.println();
			System.out.print("| ");
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j]+" | ");
			}
		}
	}
	
	public void andaMonstrinho() {
		if (new Random().nextBoolean()) {
			if (xm > xp) {
				comandoMonstrinho("8");
			}else {
				comandoMonstrinho("2");
			}
		}else {
			if (ym > yp) {
				comandoMonstrinho("4");
			}else {
				comandoMonstrinho("6");
			}
		}
	}
	
	public void comandoMonstrinho(String c) {
		switch (c) {
		case "4":
			if(ym >0) {
				m[xm][ym] = "_";
				ym--;
				m[xm][ym] = "M";
			}
			break;
		case "6":
			if(ym<n-1) {
				m[xm][ym] = "_";
				ym++;
				m[xm][ym] = "M";
			}
			break;
		case "8":
			if(xm> 0) {
				m[xm][ym] = "_";
				xm--;
				m[xm][ym] = "M";
			}
			break;
		case "2":
			if(xm<n-1) {
				m[xm][ym] = "_";
				xm++;
				m[xm][ym] = "M";
			}
			break;

		default:
			break;
		}
		
	}

	public void recebeComando(String c) {
		switch (c) {
		case "4":
			if(yp > 0) {
				m[xp][yp] = "_";
				yp--;
				m[xp][yp] = "P";
			}
			break;
		case "6":
			if(yp < n-1) {
				m[xp][yp] = "_";
				yp++;
				m[xp][yp] = "P";
			}
			break;
		case "8":
			if(xp > 0) {
				m[xp][yp] = "_";
				xp--;
				m[xp][yp] = "P";
			}
			break;
		case "2":
			if(xp < n-1) {
				m[xp][yp] = "_";
				xp++;
				m[xp][yp] = "P";
			}
			break;

		default:
			break;
		}
		
	}
	
	public boolean naoAchou() {
		
		return !((xp == xm) && (yp == ym));
	}

	@Override
	public void run() {
		while(this.naoAchou()) {
		try {
			Thread.sleep(500);
			this.andaMonstrinho();
			this.imprimeLabirinto();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		System.out.println("\n\n\n-----------------------------");
		System.out.println("-        FIM DE JOGO        -");
		System.out.println("-----------------------------");
	}
}
