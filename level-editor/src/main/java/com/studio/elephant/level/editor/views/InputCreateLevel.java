/*
 * Created by JFormDesigner on Mon Jan 26 10:10:38 CST 2015
 */

package com.studio.elephant.level.editor.views;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author file
 */
public class InputCreateLevel extends JDialog {
	public InputCreateLevel(Frame owner) {
		super(owner);
		initComponents();
	}

	public InputCreateLevel(Dialog owner) {
		super(owner);
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		rowsLabel = new JLabel();
		rowsTextField = new JTextField();
		colslabel = new JLabel();
		colstextField = new JTextField();
		buttonBar = new JPanel();
		okButton = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(Borders.createEmptyBorder("7dlu, 7dlu, 7dlu, 7dlu"));
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setLayout(new FormLayout(
					"67dlu, $lcgap, 120dlu",
					"31dlu, $lgap, 36dlu"));

				//---- rowsLabel ----
				rowsLabel.setText("rows:");
				rowsLabel.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 18));
				contentPanel.add(rowsLabel, CC.xy(1, 1, CC.RIGHT, CC.CENTER));

				//---- rowsTextField ----
				rowsTextField.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 18));
				contentPanel.add(rowsTextField, CC.xy(3, 1));

				//---- colslabel ----
				colslabel.setText("cols:");
				colslabel.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 18));
				contentPanel.add(colslabel, CC.xy(1, 3, CC.RIGHT, CC.CENTER));

				//---- colstextField ----
				colstextField.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 18));
				contentPanel.add(colstextField, CC.xy(3, 3));
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(Borders.BUTTON_BAR_PAD);
				buttonBar.setLayout(new FormLayout(
					"8*($lcgap, default), $glue, $button",
					"pref"));

				//---- okButton ----
				okButton.setText("OK");
				buttonBar.add(okButton, CC.xy(16, 1));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		setSize(370, 205);
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JLabel rowsLabel;
	private JTextField rowsTextField;
	private JLabel colslabel;
	private JTextField colstextField;
	private JPanel buttonBar;
	private JButton okButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
