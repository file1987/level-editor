/*
 * Created by JFormDesigner on Sun Jan 25 18:23:53 CST 2015
 */

package com.studio.elephant.level.editor.views;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.event.*;
import com.jgoodies.forms.factories.*;

import com.jgoodies.forms.layout.FormLayout;

/**
 * @author file
 */
public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
		initComponents();
	}


	private void createLevelMenuItemActionPerformed(ActionEvent e) {
		if(e.getSource()==createLevelMenuItem){
			InputCreateLevel dialog =  new InputCreateLevel(this);
			dialog.setVisible(true);
		}
	}

	private void lvlTreeValueChanged(TreeSelectionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		menuBar = new JMenuBar();
		fileMenu = new JMenu();
		createLevelMenuItem = new JMenuItem();
		importMmenuItem = new JMenuItem();
		editMenu = new JMenu();
		lvlScrollPane = new JScrollPane();
		lvlTree = new JTree();

		//======== this ========
		setTitle("level editor");
		setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 12));
		setBackground(new Color(0, 153, 255));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
			"87dlu",
			"266dlu"));

		//======== menuBar ========
		{
			menuBar.setBackground(new Color(255, 255, 102));

			//======== fileMenu ========
			{
				fileMenu.setText("File      ");

				//---- createLevelMenuItem ----
				createLevelMenuItem.setText("\u65b0\u5efa");
				createLevelMenuItem.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						createLevelMenuItemActionPerformed(e);
					}
				});
				fileMenu.add(createLevelMenuItem);

				//---- importMmenuItem ----
				importMmenuItem.setText("\u5bfc\u5165");
				fileMenu.add(importMmenuItem);
			}
			menuBar.add(fileMenu);

			//======== editMenu ========
			{
				editMenu.setText("Edit");
			}
			menuBar.add(editMenu);
		}
		setJMenuBar(menuBar);

		//======== lvlScrollPane ========
		{

			//---- lvlTree ----
			lvlTree.addTreeSelectionListener(new TreeSelectionListener() {
				@Override
				public void valueChanged(TreeSelectionEvent e) {
					lvlTreeValueChanged(e);
				}
			});
			lvlScrollPane.setViewportView(lvlTree);
		}
		contentPane.add(lvlScrollPane, CC.xy(1, 1));
		setSize(620, 490);
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem createLevelMenuItem;
	private JMenuItem importMmenuItem;
	private JMenu editMenu;
	private JScrollPane lvlScrollPane;
	private JTree lvlTree;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
