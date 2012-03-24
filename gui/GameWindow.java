package gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel; 
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameWindow extends JFrame implements ActionListener {
    
    //testimiseks
    public static void main(String[] args) {
        new GameWindow(); 
    }
    
    //instance fields    
    private final JPanel statusPanel; 
    private final JPanel gridPanel;
    private final JPanel buttonsPanel; 
    

    //statusPanel components
    //TODO - labels and stuff
    
    //gridPanel components
    private final JButton[][] gridPanelButtons; 
    private final int gridPanelHorizontal;
    private final int gridPanelVertical;
    
    
    
    //buttonsPanel components
    private final JButton winpointsButton; 
    private final String WINPOINTS_COMMAND = "WINPOINTS";
    private final JButton mothershipButton;
    private final String MOTHERSHIP_COMMAND = "MOTHERSHIP"; 
    private final JButton fleetButton; 
    private final String FLEET_COMMAND = "FLEET"; 
    private final JButton researchButton; 
    private final String RESEARCH_COMMAND = "RESEARCH"; 
    private final JButton planetsButton; 
    private final String PLANETS_COMMAND = "PLANETS"; 
    private final JButton turnButton;
    private final String TURN_COMMAND = "TURN";
    
    public GameWindow() {
        
        //statusPanel component init
        
        
        //gridPanel component init
        gridPanelHorizontal = 9;
        gridPanelVertical = 7; 
        gridPanelButtons = new JButton[gridPanelVertical][gridPanelHorizontal];
        
        
        //buttonsPanel component init
        winpointsButton = new JButton(); 
        mothershipButton = new JButton(); 
        fleetButton = new JButton(); 
        researchButton = new JButton(); 
        planetsButton = new JButton(); 
        turnButton = new JButton();         
        
        //gameWindow init
        this.setSize(1196,793); //TODO - muuta - hetkel nii hea, musta vähe
        
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
        statusPanel.setBackground(Color.black); 
        setupStatusPanel();         
        this.add(statusPanel, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 1; 
        gbc.weightx = 1;
        gbc.weighty = 2;         
        gbc.anchor = GridBagConstraints.CENTER;
        this.gridPanel = new JPanel(); 
        gridPanel.setBackground(Color.black); //TODO - pane sama värv mis ruutudel
        setupGridPanel();
        this.add(gridPanel, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 2;        
        gbc.weightx = 1;
        gbc.weighty = 0.2;         
        gbc.anchor = GridBagConstraints.SOUTH;
        this.buttonsPanel = new JPanel();
        setupButtonsPanel();
        this.add(buttonsPanel, gbc);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
        
    //sets up status bar
    private final void setupStatusPanel() {
        statusPanel.setBorder(null); //TODO
    }
    
    //sets up gamepanel
    private final void setupGridPanel() {
        gridPanel.setBorder(null); //TODO
        
        gridPanel.setLayout(new GridLayout(gridPanelVertical, gridPanelHorizontal));
        
        for (int i = 0; i < gridPanelVertical; i++) {
            for (int j = 0; j < gridPanelHorizontal; j++) {
                gridPanelButtons[i][j] = new JButton(); 
                gridPanelButtons[i][j].setActionCommand( //TODO - tee ümber
                        Integer.toString(i) + Integer.toString(j));
                gridPanelButtons[i][j].addActionListener(this); 
                gridPanelButtons[i][j].setFocusable(false);               
                //TODO - ikoon
                //TODO - actionlistener
                //TODO - mis actioncommand? 
                //kas sõltuvalt sellest, mis praegu on tsenterdatud?
                //arvutab offsetid selle põhjal? 
                
                gridPanel.add(gridPanelButtons[i][j]);
                
                //TODO - ikoonid ja asjad hiljem eks? 
                //selleks kutsu sedasama update meetodit vms välja? 
                //TODO - default center - mothership
            }            
        }
               
        //actionlistners
    }
    
    //saab keskmise ruudu argumendiks? 
    //kui keskmine ruut ei saa "keskel" olla, siis paneb sinna kuhu võimalik
    //ehk kõigepealt arvutab ümber keskmise ruudu!!!
    //ja siis rekursiivselt kutsub iseenda uuesti välja vms? 
    public final void centerGridPanel() {
        
    }
    
    //see eeldab, et tsenderdamine on juba leitud.. 
    private final void updateGridPanel() {
        
    }
    
    //sets up buttons
    private final void setupButtonsPanel() {
        buttonsPanel.setBorder(null); //TODO - pane hea border
        
        buttonsPanel.setLayout(new GridLayout(2,3));
        
        winpointsButton.setText("Win Points"); 
        winpointsButton.setActionCommand(WINPOINTS_COMMAND); 
        winpointsButton.addActionListener(this); 
        winpointsButton.setFocusable(false);
        buttonsPanel.add(winpointsButton); 
        
        mothershipButton.setText("Mothership");
        mothershipButton.setActionCommand(MOTHERSHIP_COMMAND); 
        mothershipButton.addActionListener(this); 
        mothershipButton.setFocusable(false);
        buttonsPanel.add(mothershipButton);        
        
        fleetButton.setText("Fleet");
        fleetButton.setActionCommand(FLEET_COMMAND);
        fleetButton.addActionListener(this);
        fleetButton.setFocusable(false);
        buttonsPanel.add(fleetButton);      
        
        researchButton.setText("Research"); 
        researchButton.setActionCommand(RESEARCH_COMMAND);
        researchButton.addActionListener(this);
        researchButton.setFocusable(false);
        buttonsPanel.add(researchButton); 
        
        planetsButton.setText("Planets");
        planetsButton.setActionCommand(PLANETS_COMMAND);
        planetsButton.addActionListener(this);
        planetsButton.setFocusable(false);
        buttonsPanel.add(planetsButton);        
        
        turnButton.setText("Turn");
        turnButton.setActionCommand(TURN_COMMAND);
        turnButton.addActionListener(this);
        turnButton.setFocusable(false);
        buttonsPanel.add(turnButton);
    }    
    
    public void actionPerformed(ActionEvent e) {
        //TODO
    }
    

}
