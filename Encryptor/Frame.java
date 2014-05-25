import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Frame extends JFrame {
	Box box;
	JTextArea originalTextArea, encryptedTextArea;
	JPanel originalTextPanel, encryptedTextPanel, buttonPanel;
	JButton encButton, decButton;
	JComboBox cbox;
	JLabel keyLabel = new JLabel("Key");
	JTextField keyFeld = new JTextField(2);
	Map<String, Encryptor> encMap;

	Encryptor encryptor;
	Object selectedStrategy;

	public Frame() {
		super.setTitle("Verschlüsselung");

		// HASH-MAP für JComboBox
		encMap = new HashMap<String, Encryptor>();
		encMap.put("Reverse", new ReverseEncryptor());
		encMap.put("Copy", new CopyEncryptor());
		encMap.put("Caesar", new CaesarEncryptor());

		// LAYOUT
		originalTextPanel = new JPanel(new BorderLayout());
		encryptedTextPanel = new JPanel(new BorderLayout());
		buttonPanel = new JPanel();

		cbox = new JComboBox(encMap.keySet().toArray());
		buttonPanel.add(cbox);

		originalTextArea = new JTextArea();
		encryptedTextArea = new JTextArea();

		encButton = new JButton("Encrypt");
		decButton = new JButton("Decrypt");

		originalTextArea.setPreferredSize(new Dimension(400, 120));

		add(originalTextPanel, BorderLayout.NORTH);
		originalTextPanel.add(originalTextArea);
		originalTextArea.setBorder(new TitledBorder("Decrypted"));

		encryptedTextArea.setPreferredSize(new Dimension(400, 120));

		add(encryptedTextPanel, BorderLayout.CENTER);
		encryptedTextPanel.add(encryptedTextArea);
		encryptedTextPanel.setBorder(new TitledBorder("Encrypted"));

		buttonPanel.add(decButton);
		buttonPanel.add(encButton);
		buttonPanel.add(keyLabel);
		buttonPanel.add(keyFeld);
		keyFeld.setEnabled(false);
		add(buttonPanel, BorderLayout.SOUTH);

		// INITIALISIERUNG
		keyFeld.setText("0");
		getStrategyFromJComboBox();

		// LISTENER
		decButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				originalTextArea.setText(encryptor.setEncryptStrategie(
						encryptedTextArea.getText(),
						Integer.parseInt(keyFeld.getText())));
				if (cbox.getSelectedItem() == "Caesar") {
					// CAESAR DECRYPTION
					originalTextArea.setText(encryptor.setEncryptStrategie(
							encryptedTextArea.getText(),
							26 - Integer.parseInt(keyFeld.getText())));
				}

			}
		});

		encButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				encryptedTextArea.setText(encryptor.setEncryptStrategie(
						originalTextArea.getText(),
						Integer.parseInt(keyFeld.getText())));

			}
		});

		cbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbox.getSelectedItem() == "Caesar") {
					keyFeld.setEnabled(true);
				} else
					keyFeld.setEnabled(false);
				getStrategyFromJComboBox();

			}
		});

	}

	public void getStrategyFromJComboBox() {
		this.selectedStrategy = cbox.getSelectedItem();
		this.encryptor = encMap.get(selectedStrategy);
	}

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		frame.setResizable(false);
	}

}
