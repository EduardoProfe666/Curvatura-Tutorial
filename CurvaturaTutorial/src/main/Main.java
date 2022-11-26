package main;

import java.awt.EventQueue;

import componentes.PruebaOval;

public class Main {	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaOval frame = new PruebaOval();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
