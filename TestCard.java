import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TestCard extends JFrame{
	
	/**Create a deck*/
	private DeckOfCards deck = new DeckOfCards();
	
	/**Create a list to store image icon*/
	private java.util.ArrayList<ImageIcon> list = new  java.util.ArrayList<ImageIcon>();

	/**Create four labels*/
	private JLabel jrd1 = new JLabel();
	private JLabel jrd2 = new JLabel();
	private JLabel jrd3 = new JLabel();
	private JLabel jrd4 = new JLabel();
			

	public TestCard(){
		
		/**Create image icon and add image icon to list*/
		list.add(new ImageIcon("image/1.png"));
		list.add(new ImageIcon("image/2.png"));
		list.add(new ImageIcon("image/3.png"));
		list.add(new ImageIcon("image/4.png"));
		list.add(new ImageIcon("image/5.png"));
		list.add(new ImageIcon("image/6.png"));
		list.add(new ImageIcon("image/7.png"));
		list.add(new ImageIcon("image/8.png"));
		list.add(new ImageIcon("image/9.png"));
		list.add(new ImageIcon("image/10.png"));
		list.add(new ImageIcon("image/11.png"));
		list.add(new ImageIcon("image/12.png"));
		list.add(new ImageIcon("image/13.png"));
		list.add(new ImageIcon("image/14.png"));
		list.add(new ImageIcon("image/15.png"));
		list.add(new ImageIcon("image/16.png"));
		list.add(new ImageIcon("image/17.png"));
		list.add(new ImageIcon("image/18.png"));
		list.add(new ImageIcon("image/19.png"));
		list.add(new ImageIcon("image/20.png"));
		list.add(new ImageIcon("image/21.png"));
		list.add(new ImageIcon("image/22.png"));
		list.add(new ImageIcon("image/23.png"));
		list.add(new ImageIcon("image/24.png"));
		list.add(new ImageIcon("image/25.png"));
		list.add(new ImageIcon("image/26.png"));
		list.add(new ImageIcon("image/27.png"));
		list.add(new ImageIcon("image/28.png"));
		list.add(new ImageIcon("image/29.png"));
		list.add(new ImageIcon("image/30.png"));
		list.add(new ImageIcon("image/31.png"));
		list.add(new ImageIcon("image/32.png"));
		list.add(new ImageIcon("image/33.png"));
		list.add(new ImageIcon("image/34.png"));
		list.add(new ImageIcon("image/35.png"));
		list.add(new ImageIcon("image/36.png"));
		list.add(new ImageIcon("image/37.png"));
		list.add(new ImageIcon("image/38.png"));
		list.add(new ImageIcon("image/39.png"));
		list.add(new ImageIcon("image/40.png"));
		list.add(new ImageIcon("image/41.png"));
		list.add(new ImageIcon("image/42.png"));
		list.add(new ImageIcon("image/43.png"));
		list.add(new ImageIcon("image/44.png"));
		list.add(new ImageIcon("image/45.png"));
		list.add(new ImageIcon("image/46.png"));
		list.add(new ImageIcon("image/47.png"));
		list.add(new ImageIcon("image/48.png"));
		list.add(new ImageIcon("image/49.png"));
		list.add(new ImageIcon("image/50.png"));
		list.add(new ImageIcon("image/51.png"));
		list.add(new ImageIcon("image/52.png"));
		
		/**Declare and create an deck array */
		int card[] = new int[4];
		card = deck.Display();
		
		/**Create a panel p1 for the label and set GridLayout*/
		JPanel p1 = new JPanel(new GridLayout(1, 4));
		
		/**Get the card number and then create four labels with the icons of four cards*/
		jrd1 = new JLabel(list.get(card[0]));
		jrd2 = new JLabel(list.get(card[1]));
		jrd3 = new JLabel(list.get(card[2]));
		jrd4 = new JLabel(list.get(card[3]));
		
		/**Add four labels to panel p1*/
		p1.add(jrd1);
		p1.add(jrd2);
		p1.add(jrd3);
		p1.add(jrd4);

		/**Create a panel p2 for the button and set FlowLayout*/
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		/**Create the Refresh button*/
		JButton jbt = new JButton("Refresh");
		
		/**Add the refresh button to panel p2*/
		p2.add(jbt);
		
		/**Add the panel to the frame*/
		add(p1, BorderLayout.NORTH);	
		add(p2, BorderLayout.SOUTH);

		/**Register listener*/
		jbt.addActionListener(new ButtonListener());
	}
	
	/**Handle the Refresh button*/
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){
			
			/**Declare and create an deck array */
			int card[] = new int[4];
			card = deck.Display();
			
			/**Get the card number and then set the icons of four cards*/
			jrd1.setIcon(list.get(card[0]));
			jrd2.setIcon(list.get(card[1]));
			jrd3.setIcon(list.get(card[2]));
			jrd4.setIcon(list.get(card[3]));

		}
	}
	
	/** Main method */
	public static void main(String[] args) {
		TestCard frame = new TestCard();
  
		frame.setTitle("Deck Of Cards"); //Set the frame title
		frame.pack(); //Set the frame size
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //Display the frame
	}

}
		
