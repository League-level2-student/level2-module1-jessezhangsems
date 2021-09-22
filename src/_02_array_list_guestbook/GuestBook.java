package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GuestBook implements ActionListener {
	public static void main(String[] args) {
		GuestBook gb=new GuestBook();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton addname = new JButton();
	JButton viewnames = new JButton();
	ArrayList<String> list = new ArrayList<String>();

	public GuestBook() {
		frame.setVisible(true);
		panel.add(addname);
		panel.add(viewnames);
		panel.add(label);
		frame.add(panel);
		label.setText("Guestbook");
		addname.addActionListener(this);
		viewnames.addActionListener(this);
		addname.setText("Add name!");
		viewnames.setText("View names.");
		frame.pack();
		

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == addname) {
			String input = JOptionPane.showInputDialog("Please insert a name.");
			list.add(input);

		}
		if (arg0.getSource() == viewnames) {
			String guest = "";
			for (int i = 0; i < list.size(); i++) {
				guest += "Guest #" + (i+1) + ": " + list.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, guest);
		}
	}

}
