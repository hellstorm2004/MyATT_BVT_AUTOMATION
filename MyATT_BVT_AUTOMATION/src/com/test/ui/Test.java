package com.test.ui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import com.core.testSuite.MainSuite;
import com.test.helper.LoginType;
import com.test.helper.TestRunValues;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sm187t
 */
public class Test extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2041530668946251779L;
	/**
	 * Creates new form NewJFrame
	 */
	public Test() {
		initComponents();
	}

	private void initComponents() {

		jLabel2 = new JLabel();
		jLabel1 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jTextField2 = new JTextField();
		jTextField3 = new JTextField();
		jTextField4 = new JTextField();
		jTextField5 = new JTextField();
		jTextField6 = new JTextField();
		jTextField1 = new JTextField();
		jLabel8 = new JLabel();
		jTextField7 = new JTextField();
		jLabel9 = new JLabel();
		jLabel11 = new JLabel();
		jLabel10 = new JLabel();
		jLabel12 = new JLabel();
		jLabel13 = new JLabel();
		jTextField8 = new JTextField();
		jTextField9 = new JTextField();
		jTextField10 = new JTextField();
		jTextField12 = new JTextField();
		jTextField11 = new JTextField();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jLabel2.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel2.setText("Wireless User ID: ");

		jLabel1.setFont(new Font("Segoe UI", 1, 24)); 
		jLabel1.setText("Build Validation Toolkit");

		jLabel3.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel3.setText("SLID with Wireless User ID: ");

		jLabel4.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel4.setText("uVerse MID: ");

		jLabel5.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel5.setText("SLID with uVerse User ID: ");

		jLabel6.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel6.setText("Wireline User ID: ");

		jLabel7.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel7.setText("SLID with Wireline User ID: ");

		jButton1.setFont(new Font("Verdana", 1, 12)); 
		jButton1.setText("Submit");
		
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				actionPerformedResults(actionEvent);
			}
		});

		jButton2.setFont(new Font("Verdana", 1, 12)); 
		jButton2.setText("Close");
		
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				actionPerformedResults(actionEvent);
			}
		});

		jTextField1.setToolTipText("Enter the Wireless CTN");

		jLabel8.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel8.setText("Wireless Password: ");

		jLabel9.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel9.setText("SLID with Wireless Password: ");

		jLabel11.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel11.setText("SLID with uVerse Password: ");

		jLabel10.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel10.setText("uVerse Password: ");

		jLabel12.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel12.setText("Wireline Password: ");

		jLabel13.setFont(new Font("Trebuchet MS", 1, 14)); 
		jLabel13.setText("SLID with Wireline Password: ");

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(21, 21, 21)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jButton2)
								.addComponent(jLabel1)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
																		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																				.addComponent(jLabel3)
																				.addComponent(jLabel4)
																				.addComponent(jLabel5))
																				.addGap(145, 145, 145))
																				.addGroup(layout.createSequentialGroup()
																						.addComponent(jLabel2)
																						.addGap(210, 210, 210)))
																						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
																								.addComponent(jTextField4)
																								.addComponent(jTextField3)
																								.addComponent(jTextField2)
																								.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
																								.addGroup(layout.createSequentialGroup()
																										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																												.addComponent(jLabel6)
																												.addComponent(jLabel7))
																												.addGap(147, 147, 147)
																												.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																														.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
																														.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))
																														.addGap(66, 66, 66)
																														.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																																.addComponent(jLabel13)
																																.addComponent(jLabel8)
																																.addComponent(jLabel12)
																																.addComponent(jLabel11)
																																.addComponent(jLabel10)
																																.addComponent(jLabel9))))
																																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
																																.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
																																		.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																																		.addComponent(jTextField7)
																																		.addComponent(jTextField12)
																																		.addComponent(jTextField11)
																																		.addComponent(jTextField10, GroupLayout.Alignment.TRAILING)
																																		.addComponent(jTextField9, GroupLayout.Alignment.TRAILING)
																																		.addComponent(jTextField8, GroupLayout.Alignment.TRAILING))
																																		.addGap(42, 42, 42))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(21, 21, 21)
						.addComponent(jLabel1)
						.addGap(24, 24, 24)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel8)
												.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(25, 25, 25)
												.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9)
														.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addGap(37, 37, 37)
														.addComponent(jLabel4))
														.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel10)
																.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																.addGap(29, 29, 29)
																.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																		.addComponent(jLabel5)
																		.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(jLabel11)
																		.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addGap(34, 34, 34)
																		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																				.addComponent(jLabel6)
																				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(jLabel12)
																				.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																				.addGap(29, 29, 29)
																				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel7)
																						.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																						.addComponent(jLabel13)
																						.addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
																						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																								.addComponent(jButton1)
																								.addComponent(jButton2))
																								.addGap(30, 30, 30))
				);

		pack();
	}// </editor-fold>

	private void actionPerformedResults(ActionEvent actionEvent) {
		
		if (actionEvent.getSource() == jButton2) {
			dispose ();
		}
		
		if (actionEvent.getSource() == jButton1) {
			
			LoginType loginType = LoginType.getInstance();
			TestRunValues testRunValues = LoginType.getTestRunValues();
						
			testRunValues.setWirelessID(jTextField1.getText());
			testRunValues.setSlidWithWirelessUserID(jTextField2.getText());
			testRunValues.setuVerseMID(jTextField3.getText());
			testRunValues.setSlidwithUVerseID(jTextField4.getText());
			testRunValues.setWirelineID(jTextField5.getText());
			testRunValues.setSlidWithWirelineUserID(jTextField6.getText());
			
			testRunValues.setWirelessPassword(jTextField7.getText());
			testRunValues.setSlidwithWirelessPassword(jTextField8.getText());
			testRunValues.setuVersePassword(jTextField9.getText());
			testRunValues.setSlidwithUVersePassword(jTextField10.getText());
			testRunValues.setWirelinePassword(jTextField11.getText());
			testRunValues.setSlidwithWirelinePassword(jTextField12.getText());
			
			MainSuite mainSuite = new MainSuite();
			mainSuite.runTest();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Test().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify
	private JButton jButton1;
	private JButton jButton2;

	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;

	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JTextField jTextField9;
	private JTextField jTextField10;
	private JTextField jTextField11;
	private JTextField jTextField12;
	// End of variables declaration
}
