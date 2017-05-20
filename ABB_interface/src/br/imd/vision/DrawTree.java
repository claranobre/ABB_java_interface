package br.imd.vision;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.xml.soap.Node;

public class DrawTree extends JPanel {

	public Node node;

	public static ArrayList<String> listX = new ArrayList<String>();
	public static ArrayList<String> listY = new ArrayList<String>();

	public DrawTree(Node node) {
		this.node = node;
	}
}