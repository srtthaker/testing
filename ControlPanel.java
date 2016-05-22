package War_Game;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class ControlPanel extends JFrame {
	private JButton addTroop, addTank, addArtillery, addRocketArtillery, addSPG, addCommando, addHeavyTank, endTurn;
	private JComboBox<String> Select_Troops;
	private static WarGameBoard board = new WarGameBoard();

	@SuppressWarnings("unused")
	protected ControlPanel() {
		super("Your nation is " + board.getChosen().getName());
		addTroop = new JButton("Add Troop");
		addTank = new JButton("Add Tank");
		addArtillery = new JButton("Add Artillery");
		addRocketArtillery = new JButton("Add Rocket Artillery");
		addHeavyTank = new JButton("Add Heavy Tank");
		addSPG = new JButton("Add SPG");
		addCommando = new JButton("Add Commando");
		endTurn = new JButton("End Turn");
		setSize(400, 800);
		// create a new panel with GridBagLayout manager
		JPanel newPanel = new JPanel(new GridLayout());
		setLayout(new GridLayout(40, 10));
		add(addTroop);
		add(addTank);
		add(addArtillery);
		add(addCommando);
		add(addSPG);
		add(addRocketArtillery);
		add(addHeavyTank);
		add(endTurn);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		endTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				board.switchTurn();
				setVisible(false); // you can't see me!
				dispose(); // Destroy the JFrame object
				new ControlPanel().open();
			}
		});
		addTroop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				ArrayList<District> districts = board.getChosen().getDistricts();
				String chosen = null;
				District recruit = null;
				int i = 0;
				String[] choicestoAdd = new String[100];
				for (District d : districts) {
					if (!d.isOccupied() && d.hasMajorCity()) {
						choicestoAdd[i] = d.getName();
						i++;
					}
				}

				chosen = (((String) JOptionPane.showInputDialog(null, "What district do you want to recruit troops",
						"Your nation is...", JOptionPane.QUESTION_MESSAGE, null, choicestoAdd, choicestoAdd[0])));
				if (chosen != null) {
					for (int b = 0; b < districts.size(); b++) {
						if (districts.get(b).getName().equals(chosen))
							recruit = districts.get(b);
					}
					Troop t = new Troop(board.getChosen(),
							board.getChosen().getName() + board.getChosen().getTroops().size(), 1, recruit, false);
					board.getChosen().add(t);

				}
			}
		});
		addTank.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				ArrayList<District> districts = board.getChosen().getDistricts();
				String chosen = null;
				District recruit = null;
				int i = 0;
				String[] choicestoAdd = new String[100];
				for (District d : districts) {
					if (!d.isOccupied() && d.hasMajorIndustry()) {
						choicestoAdd[i] = d.getName();
						i++;
					}
				}

				chosen = (((String) JOptionPane.showInputDialog(null, "What district do you want to recruit troops",
						"Your nation is...", JOptionPane.QUESTION_MESSAGE, null, choicestoAdd, choicestoAdd[0])));
				if (chosen != null) {
					for (int b = 0; b < districts.size(); b++) {
						if (districts.get(b).getName().equals(chosen))
							recruit = districts.get(b);
					}
					Troop t = new Tank(board.getChosen(),
							board.getChosen().getName() + board.getChosen().getTroops().size(), 1, recruit, false);
					board.getChosen().add(t);

				}
			}
		});
		addArtillery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				ArrayList<District> districts = board.getChosen().getDistricts();
				String chosen = null;
				District recruit = null;
				int i = 0;
				String[] choicestoAdd = new String[100];
				for (District d : districts) {
					if (!d.isOccupied() && d.hasMajorIndustry()) {
						choicestoAdd[i] = d.getName();
						i++;
					}
				}

				chosen = (((String) JOptionPane.showInputDialog(null, "What district do you want to recruit troops",
						"Your nation is...", JOptionPane.QUESTION_MESSAGE, null, choicestoAdd, choicestoAdd[0])));
				if (chosen != null) {
					for (int b = 0; b < districts.size(); b++) {
						if (districts.get(b).getName().equals(chosen))
							recruit = districts.get(b);
					}
					Troop t = new Artillery(board.getChosen(),
							board.getChosen().getName() + board.getChosen().getTroops().size(), 1, recruit, false);
					board.getChosen().add(t);

				}
			}
		});
		addHeavyTank.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				ArrayList<District> districts = board.getChosen().getDistricts();
				String chosen = null;
				District recruit = null;
				int i = 0;
				String[] choicestoAdd = new String[100];
				for (District d : districts) {
					if (!d.isOccupied() && d.hasMajorIndustry()) {
						choicestoAdd[i] = d.getName();
						i++;
					}
				}

				chosen = (((String) JOptionPane.showInputDialog(null, "What district do you want to recruit troops",
						"Your nation is...", JOptionPane.QUESTION_MESSAGE, null, choicestoAdd, choicestoAdd[0])));
				if (chosen != null) {
					for (int b = 0; b < districts.size(); b++) {
						if (districts.get(b).getName().equals(chosen))
							recruit = districts.get(b);
					}
					Troop t = new HeavyTank(board.getChosen(),
							board.getChosen().getName() + board.getChosen().getTroops().size(), 1, recruit, false);
					board.getChosen().add(t);

				}
			}
		});
		addSPG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				ArrayList<District> districts = board.getChosen().getDistricts();
				String chosen = null;
				District recruit = null;
				int i = 0;
				String[] choicestoAdd = new String[100];
				for (District d : districts) {
					if (!d.isOccupied() && d.hasMajorIndustry()) {
						choicestoAdd[i] = d.getName();
						i++;
					}
				}

				chosen = (((String) JOptionPane.showInputDialog(null, "What district do you want to recruit troops",
						"Your nation is...", JOptionPane.QUESTION_MESSAGE, null, choicestoAdd, choicestoAdd[0])));
				if (chosen != null) {
					for (int b = 0; b < districts.size(); b++) {
						if (districts.get(b).getName().equals(chosen))
							recruit = districts.get(b);
					}
					Troop t = new SPG(board.getChosen(),
							board.getChosen().getName() + board.getChosen().getTroops().size(), 1, recruit, false);
					board.getChosen().add(t);

				}
			}
		});
		addRocketArtillery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				ArrayList<District> districts = board.getChosen().getDistricts();
				String chosen = null;
				District recruit = null;
				int i = 0;
				String[] choicestoAdd = new String[100];
				for (District d : districts) {
					if (!d.isOccupied() && d.hasMajorIndustry()) {
						choicestoAdd[i] = d.getName();
						i++;
					}
				}

				chosen = (((String) JOptionPane.showInputDialog(null, "What district do you want to recruit troops",
						"Your nation is...", JOptionPane.QUESTION_MESSAGE, null, choicestoAdd, choicestoAdd[0])));
				if (chosen != null) {
					for (int b = 0; b < districts.size(); b++) {
						if (districts.get(b).getName().equals(chosen))
							recruit = districts.get(b);
					}
					Troop t = new RocketArtillery(board.getChosen(),
							board.getChosen().getName() + board.getChosen().getTroops().size(), 1, recruit, false);
					board.getChosen().add(t);

				}
			}
		});
		addCommando.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				ArrayList<District> districts = board.getChosen().getDistricts();
				String chosen = null;
				District recruit = null;
				int i = 0;
				String[] choicestoAdd = new String[100];
				for (District d : districts) {
					if (!d.isOccupied() && d.hasMajorIndustry()) {
						choicestoAdd[i] = d.getName();
						i++;
					}
				}

				chosen = (((String) JOptionPane.showInputDialog(null, "What district do you want to recruit troops",
						"Your nation is...", JOptionPane.QUESTION_MESSAGE, null, choicestoAdd, choicestoAdd[0])));
				if (chosen != null) {
					for (int b = 0; b < districts.size(); b++) {
						if (districts.get(b).getName().equals(chosen))
							recruit = districts.get(b);
					}
					Troop t = new Commando(board.getChosen(),
							board.getChosen().getName() + board.getChosen().getTroops().size(), 1, recruit, false);
					board.getChosen().add(t);

				}
			}
		});
		repaint();
	}

	protected void open() {
		// set look and feel to the system look and feel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ControlPanel().setVisible(true);
			}
		});
	}
}
