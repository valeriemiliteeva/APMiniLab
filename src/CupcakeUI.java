
import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.border.EtchedBorder;



public class CupcakeUI extends JFrame {
	/**
	 * 
	 */
	private CircleQueue cqueue; // circle queue object
	private int count; // number of objects in circle queue
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField txtSearchTerm;
	
	// Control variables for data
	
	
	private int posIndex = 0;
	/*
	 * Circle queue constructor
	 */
	

	/*
	 * Add any array of objects to the queue
	 */
	public void addCQueue(Object[] objects) {
		ConsoleMethods.println("Add " + objects.length);
		for (Object o : objects) {
			cqueue.add(o);
			ConsoleMethods.println("Add: " + cqueue.getObject() + " " + cqueue);
			this.count++;
		}
		ConsoleMethods.println();
	}

	/*
	 * Show key objects/properties of circle queue
	 */
	public String showCQueue() {
		String hold="";
		ConsoleMethods.println("Size: " + count);
		ConsoleMethods.println("First Element: " + cqueue.getFirstObject());
		ConsoleMethods.println("Last Element: " + cqueue.getLastObject());
		ConsoleMethods.println("Full cqueue: " + cqueue);
		ConsoleMethods.println();
		
		
		//hold=Integer.toString(count)+cqueue.getFirstObject().toString()+cqueue.getLastObject().toString()+cqueue.toString();
		
		return hold;
	}

	/*
	 * Delete/Clear all object in circle queue
	 */
	public void deleteCQueue() {
		int length = this.count;
		ConsoleMethods.println("Delete " + length);

		for (int i = 0; i < length; i++) {
			ConsoleMethods.println("Delete: " + cqueue.delete() + " " + cqueue);
			this.count--;
		}
	}

	
	
	/*
	 * Illustrate different Objects that can be placed on same Queue
	 */
	public static void main(String[] args)

	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CupcakeUI frame = new CupcakeUI();
					
					frame.setVisible(true);
					
					JTextArea ta = new JTextArea();
					JScrollPane sp = new JScrollPane(ta);  
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		

	}



	
	public CupcakeUI() {
		
		
		CircleQueueDriver trial = new CircleQueueDriver();
		
		
		String wow="";
		// add different types of objects to the same opaque queue
		trial.addCQueue(Animal.animalData());
		trial.addCQueue(Cupcakes.cupCakeData());
		trial.addCQueue(Alphabet.alphabetData());
		trial.addCQueue(Car.carData());
		 //display queue objects in queue order
		trial.showCQueue();

		// sort queue objects by specific element within the object and display in sort
		// order
//		Animal.key = Animal.KeyType.name;
//		Cupcakes.key = Cupcakes.KeyType.flavor;
//		Alphabet.key = Alphabet.KeyType.letter;
//		Car.key = Car.KeyType.make;
//		trial.cqueue.insertionSort();
//		trial.showCQueue();

		//selectionSort tester
		Animal.key = Animal.KeyType.name;
		Cupcakes.key = Cupcakes.KeyType.flavor;
		Alphabet.key = Alphabet.KeyType.letter;
		Car.key = Car.KeyType.make;
		//trial.cqueue.selectionSort();
		trial.showCQueue();
		
		// display queue objects
		Animal.key = Animal.KeyType.combo;
		Cupcakes.key = Cupcakes.KeyType.combo;
		Alphabet.key = Alphabet.KeyType.combo;
		Car.key = Car.KeyType.combo;
		wow=trial.showCQueue();
		
		// delete queue objects
		trial.deleteCQueue();
		
		
		count = 0;
		cqueue = new CircleQueue();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 300, 800, 457);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSearchTerm = new JTextField();
		txtSearchTerm.setBackground(new Color(205, 250, 190));
		txtSearchTerm.setBounds(100, 5, 466, 55);
		txtSearchTerm.setText("ALEX UI- ABHINAV CANT LEARN IT");
		JTextArea txtrBox1 = new JTextArea();
		  
		//yes
		txtrBox1.setBackground(new Color(176, 224, 230));
		txtrBox1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		txtrBox1.setBounds(29, 72, 750, 302);
		txtrBox1.setText(wow);
		contentPane.add(txtrBox1);
		txtrBox1.setLineWrap(true);
		//ok maybe
		//txtSearchTerm.setText(wow+"\r\n"+"gg");
		
		contentPane.add(txtSearchTerm);
		txtSearchTerm.setColumns(10);
		
	
	
	
	}


	
	
		
	
	
	
	



}
	

