package gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel; 
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class GameWindow extends JFrame {
    
    //testimiseks
    public static void main(String[] args) {
        new GameWindow(); 
    }
    
    private final JPanel statusPanel; 
    private final JPanel gridPanel;
    private final JPanel buttonsPanel; 
    
    //instance fields
    
    public GameWindow() {
        
        this.setSize(1200,800); 
        
        GridBagConstraints gbc = new GridBagConstraints();  
        GridBagLayout gbl = new GridBagLayout();
        //gbl.setConstraints(this, gbc);        
        this.setLayout(gbl);       
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0.5; 
        gbc.anchor = GridBagConstraints.NORTH;
        this.statusPanel = new JPanel();         
        statusPanel.setBackground(Color.red); //ÄRA VÕTTA - HERE BE STATUS
        setupStatusPanel();         
        this.add(statusPanel, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 1; 
        gbc.weightx = 1;
        gbc.weighty = 2;         
        gbc.anchor = GridBagConstraints.CENTER;
        this.gridPanel = new JPanel(); 
        gridPanel.setBackground(Color.yellow); //ÄRA VÕTTA - HERE BE GRIDS
        setupGridPanel();
        this.add(gridPanel, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 2;        
        gbc.weightx = 1;
        gbc.weighty = 0.2;         
        gbc.anchor = GridBagConstraints.SOUTH;
        this.buttonsPanel = new JPanel();
        buttonsPanel.setBackground(Color.blue); //ÄRA VÕTTA - HERE BE BUTTONS, YARRRRRRR
        setupButtonsPanel();
        this.add(buttonsPanel, gbc);
        
        

        
        //proovi..         
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    //constructor
    
    
    //sets up status bar
    private final void setupStatusPanel() {
 
    }
    
    //sets up gamepanel
    private final void setupGridPanel() {
        
    }
    
    //sets up buttons
    private final void setupButtonsPanel() {
        
    }    
    
    //setup 
    
    
    //actionListeners here? 
    
    
    //upda

}
