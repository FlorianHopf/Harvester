import javax.swing.JOptionPane;

public class Harvester_lv1 {

	public static void main(String[] args) {
		
		String eingabe = JOptionPane.showInputDialog("Geben Sie die Anzahl der Reihen und Spalten ein");
		String[] daten = eingabe.split(" ");
		
		int zeilen = Integer.parseInt(daten[0]);
		int spalten = Integer.parseInt(daten[1]);
			
		int counter = 0;
		int[][] list = new int[zeilen][spalten];
	
		for(int z = 0; z < zeilen; z++) {
			for(int sp = 0; sp < spalten; sp++) {
				counter++;
				list[z][sp] = counter;
			}
		}
		
		for(int z = 0; z < zeilen; z++) {
			if(z % 2 == 0) {
				for(int sp = 0; sp < spalten; sp++) {
					System.out.print(list[z][sp] + " ");	
				}
			} else {
				for(int sp = spalten - 1; sp >= 0; sp--) {
					System.out.print(list[z][sp] + " ");	
				}
			}	
		}			
	}
		
}

