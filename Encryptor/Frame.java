import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Frame extends JFrame {
	Box box;
	JTextArea originalTextArea, encryptedTextArea;
	JPanel originalTextPanel, encryptedTextPanel, buttonPanel;
	JButton encButton, decButton;
	JComboBox cbox;
	String[] cboxListe = { "Copy", "Reverse" };

	public Frame() {
		super.setTitle("Verschlüsselung");

		// Map<String, Encryptor> encMap;
		// encMap = new HashMap<String, Encryptor>();
		// encMap.put("Reverse", new ReverseEncryptor());
		// encMap.put("Copy", new CopyEncryptor());

		originalTextPanel = new JPanel(new BorderLayout());
		encryptedTextPanel = new JPanel(new BorderLayout());
		buttonPanel = new JPanel();

		// cbox = new JComboBox(encMap.keySet().toArray());
		cbox = new JComboBox(cboxListe);
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
		add(buttonPanel, BorderLayout.SOUTH);

		decButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CopyEncryptor ce = new CopyEncryptor();
				ReverseEncryptor re = new ReverseEncryptor();
				if (cbox.getSelectedItem() == "Reverse") {
					originalTextArea.setText(re
							.setEncryptStrategie(encryptedTextArea.getText()));

				} else {
					originalTextArea.setText(ce
							.setEncryptStrategie(encryptedTextArea.getText()));
				}

			}
		});

		encButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CopyEncryptor ce = new CopyEncryptor();
				ReverseEncryptor re = new ReverseEncryptor();
				if (cbox.getSelectedItem() == "Reverse") {
					encryptedTextArea.setText(re
							.setEncryptStrategie(originalTextArea.getText()));

				} else {
					encryptedTextArea.setText(ce
							.setEncryptStrategie(originalTextArea.getText()));
				}

			}
		});

	}

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		frame.setResizable(false);
	}

}
