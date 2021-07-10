package juegodepersonajes;

import javax.swing.*;

class Juegodepersonajes {

	public static void main(String[] args) {
		String humano, inteligente, murio;
		boolean ok;
		ok = true;
		
		JOptionPane.showMessageDialog(null, "", "Juego de personajes: Rick & Morty", 
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/rym.jpg")));
		JOptionPane.showMessageDialog(null, "Aviso:\nLos siguientes personajes no participan:\n-Personapajaro (Mr. Birdperson)\n-Squanchy\n-Jessica\n-Revolio Clockberg Jr.\n-Tammy Gueterman\n-Arthricia\n-Mr. Goldenfold", "Elegi un personaje y responde las siguientes preguntas", 
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/characters.jpeg")));
		
		humano = JOptionPane.showInputDialog("Es humano?\n(Contestar si / no)");
		inteligente = JOptionPane.showInputDialog("Es inteligente?\n(si / no)");
		murio = JOptionPane.showInputDialog("ha muerto alguna vez?");
		
		if (humano.equalsIgnoreCase("si") && inteligente.equalsIgnoreCase("si") && murio.equalsIgnoreCase("si")) {
			JOptionPane.showMessageDialog(null, "", "El personaje es Rick Sanchez", 
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/rick.jpeg")));
			
		} else if (humano.equalsIgnoreCase("si") && inteligente.equalsIgnoreCase("si") && murio.equalsIgnoreCase("no"))  {
			JOptionPane.showMessageDialog(null, "", "El personaje es Beth Sanchez",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/beth.jpeg")));
			
		} else if (humano.equalsIgnoreCase("si") && inteligente.equalsIgnoreCase("no") && murio.equalsIgnoreCase("si"))  {
			JOptionPane.showMessageDialog(null, "", "El personaje es Morty Smith",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/morty.png")));
			
		} else if (humano.equalsIgnoreCase("si") && inteligente.equalsIgnoreCase("no") && murio.equalsIgnoreCase("no"))  {
			JOptionPane.showMessageDialog(null, "", "El personaje es Jerry  Smith",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/jerry.jpeg")));
			
		} else if (humano.equalsIgnoreCase("no") && inteligente.equalsIgnoreCase("si") && murio.equalsIgnoreCase("si"))  {
			JOptionPane.showMessageDialog(null, "", "El personaje es Kronbopulos Michael",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/k-michael.gif")));
			
		} else if (humano.equalsIgnoreCase("no") && inteligente.equalsIgnoreCase("si") && murio.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "", "El personaje es Snuffles. Tambien conocido como Snowball",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/snowball.jpeg")));
			
		} else if (humano.equalsIgnoreCase("no") && inteligente.equalsIgnoreCase("no") && murio.equalsIgnoreCase("si"))  {
			JOptionPane.showMessageDialog(null, "", "El personaje es MR Meeseeks!",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/mrmeeseeks.jpeg")));
			
		} else if (humano.equalsIgnoreCase("no") && inteligente.equalsIgnoreCase("no") && murio.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "", "El personaje es Mr. Poopybuttholes",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/noobnoob.jpeg")));
			
		} else { 
			ok = false;
			JOptionPane.showMessageDialog(null, "", "Por favor ingresa las respueastas en un formato correcto: si / no.\nDe otro modo mis poderes no funcionan",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/cronenbergs.png")));
		}
		
		if (ok == false) {
			
		} else {
			JOptionPane.showMessageDialog(null, "", "Gracias por jugar x)",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegodepersonajes.class.getResource("/img/rymsaludofinal.jpeg")));
		}
		
	}
}
