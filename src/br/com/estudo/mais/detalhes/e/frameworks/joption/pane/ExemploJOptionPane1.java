package br.com.estudo.mais.detalhes.e.frameworks.joption.pane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ExemploJOptionPane1 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");

	}

}
