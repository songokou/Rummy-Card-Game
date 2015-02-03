/**
 * This is a Client class created for the Rummy game
 * 
 * 
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;
import java.io.*;
import java.net.*;
import java.util.*;

public class Server extends JFrame{
	/**
	 * All the data members:
	 */
	private ServerSocket server;
	private Socket in_C = null;
	
	private ArrayList<In_Client> clientList = new ArrayList<In_Client>();
	
	private boolean isStart = false;
    private CardPile cardpile;
    private DiscardPile discardpile;
    private Hand serverHand;	
    private Hand AKHand = new Hand();
    private Hand SFHand = new Hand();
    private JButton tempButton;
    private int tempIndex;

    /**
     * Creates new form Server
     */
	 // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel AddToLabel;
    private JPanel AddToPanel;
    private JButton AddtoStraightFlushButton;
    private JLabel AllKindLabel;
    private JPanel AllKindPane;
    private JButton AllKindPaneButton;
    private JPanel AllKindSet;
    private JButton AllkindButton;
    private JButton AllkindMeldingButton;
    private JButton Card17;
    private JButton Card18;
    private JButton Card19;
    private JButton Card20;
    private JButton Card21;
    private JButton Card22;
    private JButton Card23;
    private JButton Card24;
    private JButton Card25;
    private JButton Card26;
    private JButton Card27;
    private JButton Card28;
    private JButton Card29;
    private JButton Card30;
    private JButton Card31;
    private JButton Card32;
    private JButton Card33;
    private JButton Card34;
    private JButton Card35;
    private JButton Card36;
    private JButton Card5;
    private JButton Card6;
    private JButton Card7;
    
    private JButton AKPCard1;
    private JButton AKPCard2;
    private JButton AKPCard3;
    private JButton AKPCard4;
    
    private JButton AKPCard5;
    private JButton AKPCard6;
    private JButton AKPCard7;
    private JButton AKPCard8;
    private JButton AKPCard9;    
    private JButton AKPCard10;
    private JButton AKPCard11;
    private JButton AKPCard12;
    private JButton AKPCard13;
    private JButton AKPCard14;
    private JButton AKPCard15;
    private JButton AKPCard16;
    
    
    private JButton AKCard3;
    private JButton AKCard4;

    private JButton SFPCard4;
    private JButton SFPCard5;
    private JButton SFPCard6;
    private JButton SFPCard7;
    private JButton SFPCard8;
    private JButton SFPCard9;
    private JButton SFPCard10;
    private JButton SFPCard11;
    private JButton SFPCard12;
    private JButton SFPCard13;
    private JButton SFPCard14;
    private JButton SFPCard15;
    private JButton SFPCard16;
    private JScrollPane SFPScrollPane;
    

    private JButton CIHPCard11;
    private JLabel CardInHandLabel;
    private JPanel CardInHandPand;
    private JTextField CardLeftField;
    private JLabel CardLeftLabel;
    private JPanel CardPilePane;
    private JLabel ChatLabel;
    private JScrollPane ChatPane;
 // Chat window and message send field   
    private JTextField userText;    
    private JTextArea textarea;
    
    private JButton ConnectButton;
    private JPanel ConnectPane;
    
    private JButton dealfromcardpile_button;  //	private JButton dealcard_button;

    private JPanel DealPanel;
    
    private JButton discard_button;
    private JPanel DiscardPilePane;
    
    private JMenu HelpMenu;
    private JTextField IPTextField;
    private JMenuItem LogIn;
    private JMenuItem Logout;
    private JLabel MainLabel;
    private JMenu MainMenu;
    private JMenuBar Menu;
    private JScrollPane OnlineField;
    private JLabel OnlineLabel;
	private DefaultListModel listModel; 
    private JList userList;
    private JTextField PortField;
    private JLabel PortLabel;
    private JLabel PortNumberFiled;
    private JTextField ScoreField;
    private JLabel ScoreLabel;
    private JButton SendMessage;
    private JButton dealcard_button;
    private JButton StraightFlushButton;
    private JLabel StraightFlushLabel;
    private JPanel StraightFlushPane;
    private JButton StraightFlushPaneButton;
    private JPanel StraightFlushSet;
    private JMenuItem Winner_List;
    private JLabel cardPileLabel;
    private JButton dealfromdiscardpile_button;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JMenuItem jMenuItem1;
    private JScrollPane jScrollPane1;
    private JTextField userName;
    private StraightFlush straightflush;
    private AllKind allkind;
    // End of variables declaration//GEN-END:variables
  
    public Server() {
      
        initComponents();
        this.setVisible(true);
	    this.addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				closeServer();
			}
	      });
        
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OnlineLabel = new JLabel();
        ChatLabel = new JLabel();
        userText = new JTextField();
        ChatPane = new JScrollPane();
        textarea = new JTextArea();
        SendMessage = new JButton();
        ConnectPane = new JPanel();
        IPTextField = new JTextField();
        PortNumberFiled = new JLabel();
        PortLabel = new JLabel();
        PortField = new JTextField();
        jLabel1 = new JLabel();
        userName = new JTextField();
        OnlineField = new JScrollPane();
//        OnlineTextArea = new JTextArea();
        listModel = new DefaultListModel();
        userList = new JList(listModel);
        ConnectButton = new JButton();
        AllKindPane = new JPanel();
        jScrollPane1 = new JScrollPane();
        StraightFlushPane = new JPanel();
        Card5 = new JButton();
        Card6 = new JButton();
        Card7 = new JButton();
        CardInHandPand = new JPanel();
        Card17 = new JButton();
        Card18 = new JButton();
        Card19 = new JButton();
        Card20 = new JButton();
        Card21 = new JButton();
        Card22 = new JButton();
        Card23 = new JButton();
        Card24 = new JButton();
        Card26 = new JButton();
        Card25 = new JButton();
        AllKindLabel = new JLabel();
        CardInHandLabel = new JLabel();
        StraightFlushLabel = new JLabel();
        StraightFlushSet = new JPanel();
        Card27 = new JButton();
        Card28 = new JButton();
        Card30 = new JButton();
        Card29 = new JButton();
        AllKindSet = new JPanel();
        Card31 = new JButton();
        Card34 = new JButton();
        DiscardPilePane = new JPanel();
        Card35 = new JButton();
        Card32 = new JButton();
        Card36 = new JButton();
        
        AKPCard1 = new JButton();
        AKPCard2 = new JButton();
        AKPCard3 = new JButton();
        AKPCard4 = new JButton();
        AKPCard5 = new JButton();
        AKPCard6 = new JButton();
        AKPCard7 = new JButton();
        AKPCard8 = new JButton();
        AKPCard9 = new JButton();
        AKPCard10 = new JButton();
        AKPCard11 = new JButton();
        AKPCard12 = new JButton();
        AKPCard13 = new JButton();
        AKPCard14 = new JButton();
        AKPCard15 = new JButton();
        AKPCard16 = new JButton();
        
        
        AKCard3 = new JButton();
        AKCard4 = new JButton();
      
        SFPCard4 = new JButton();
        SFPCard5 = new JButton();
        SFPCard6 = new JButton();
        SFPCard7 = new JButton();
        SFPCard8 = new JButton();
        SFPCard9 = new JButton();
        SFPCard10 = new JButton();
        SFPCard11= new JButton();
        SFPCard12 = new JButton();
        SFPCard13 = new JButton();
        SFPCard14 = new JButton();
        SFPCard15 = new JButton();
        SFPCard16 = new JButton();
        
        CIHPCard11 = new JButton();
        CardPilePane = new JPanel();
        Card33 = new JButton();
        jLabel3 = new JLabel();
        cardPileLabel = new JLabel();
        StraightFlushButton = new JButton();
        AllkindButton = new JButton();
        discard_button = new JButton();
        dealcard_button = new JButton();
        ScoreLabel = new JLabel();
        ScoreField = new JTextField();
        CardLeftLabel = new JLabel();
        CardLeftField = new JTextField();
        DealPanel = new JPanel();
        jLabel2 = new JLabel();
        dealfromcardpile_button = new JButton();
        dealfromdiscardpile_button = new JButton();
        AddToPanel = new JPanel();
        AllkindMeldingButton = new JButton();
        AddtoStraightFlushButton = new JButton();
        AllKindPaneButton = new JButton();
        StraightFlushPaneButton = new JButton();
        AddToLabel = new JLabel();
        MainLabel = new JLabel();
        Menu = new JMenuBar();
        MainMenu = new JMenu();
        Winner_List = new JMenuItem();
        Logout = new JMenuItem();
        LogIn = new JMenuItem();
        HelpMenu = new JMenu();
        jMenuItem1 = new JMenuItem();

        straightflush = StraightFlush.getInstance();
        allkind = AllKind.getInstance();

        setTitle("Client Name");
        setBackground(new java.awt.Color(204, 204, 255));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1365, 720));
        getContentPane().setLayout(null);
/******************************************************************************
 * Online Active client list and chat window
 */
        OnlineLabel.setFont(OnlineLabel.getFont().deriveFont((float)17));
        OnlineLabel.setForeground(new java.awt.Color(0, 204, 51));
        OnlineLabel.setText("Online ");
        getContentPane().add(OnlineLabel);
        OnlineLabel.setBounds(35, 12, 70, 25);

        ChatLabel.setFont(ChatLabel.getFont().deriveFont((float)17));
        ChatLabel.setForeground(new java.awt.Color(0, 204, 204));
        ChatLabel.setText("Chat");
        getContentPane().add(ChatLabel);
        ChatLabel.setBounds(40, 150, 50, 21);
        ChatLabel.getAccessibleContext().setAccessibleName("ChatLabel");

       // userText.setText("Message");
        getContentPane().add(userText);
        userText.setBounds(10, 440, 235, 36);
        userText.getAccessibleContext().setAccessibleName("textarea");
	    userText.addActionListener(new ActionListener() {  
	            public void actionPerformed(ActionEvent e) {  
	                send();  
	            }  
	        }); 

        textarea.setEditable(false);
        textarea.setColumns(20);
        textarea.setRows(5);
        ChatPane.setViewportView(textarea);
        textarea.getAccessibleContext().setAccessibleName("ChatPane");

        getContentPane().add(ChatPane);
        ChatPane.setBorder(new TitledBorder("ChatWindow")); 
        ChatPane.setBounds(10, 180, 235, 252);

        SendMessage.setText("Send Message");
        getContentPane().add(SendMessage);
        SendMessage.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                send();  
            }  
        }); 
        SendMessage.setBounds(10, 480, 230, 32);
/*******************************************************************************/

//
        userList.setEnabled(false);
//        OnlineTextArea.setColumns(20);
//        OnlineTextArea.setRows(5);
        OnlineField.setViewportView(userList);
//        OnlineTextArea.getAccessibleContext().setAccessibleName("ChatPane");

        getContentPane().add(OnlineField);
        OnlineField.setBorder(new TitledBorder("Online Users")); 
        OnlineField.setBounds(10, 40, 235, 96);

//        ConnectButton.setText("Connect");
////        getContentPane().add(ConnectButton);
//        ConnectButton.setBounds(630, 70, 100, 47);

        AllKindPane.setBackground(new java.awt.Color(102, 255, 255));
        AllKindPane.setPreferredSize(new java.awt.Dimension(300, 0));

        AKPCard1.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard1);
        
        AKPCard2.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard2);
        
        AKPCard3.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard3);
        
        AKPCard4.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard4);
        
        AKPCard5.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard5);
        
        AKPCard6.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard6);
        
        AKPCard7.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard7);
        
        AKPCard8.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard8);
        
        AKPCard9.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard9);
        
        AKPCard10.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard10);
        
        AKPCard11.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard11);

        AKPCard12.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard12);
        
        AKPCard13.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard13);
        
        AKPCard14.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard14);
        
        AKPCard15.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard15);
        
        AKPCard16.setIcon(new ImageIcon("b1fv.png"));
        AllKindPane.add(AKPCard16);
        
        AllKindPane.setBackground(new java.awt.Color(102, 255, 255));
        AllKindPane.setPreferredSize(new java.awt.Dimension(370, 1000));
        jScrollPane1 = new JScrollPane(AllKindPane);
        jScrollPane1.setViewportView(AllKindPane);
        getContentPane().add(jScrollPane1);

        //jScrollPane1.setLayout(null);
        jScrollPane1.setBounds(240, 140, 370, 350);
        StraightFlushPane.setBackground(new java.awt.Color(204, 255, 204));
        StraightFlushPane.setPreferredSize(new java.awt.Dimension(300, 0));
        
        Card5.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushPane.add(Card5);

        Card6.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushPane.add(Card6);

        Card7.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushPane.add(Card7);
        
        SFPCard4.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushPane.add(SFPCard4);SFPCard4.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushPane.add(SFPCard4);
        
        SFPCard5.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard5);
        
        SFPCard6.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard6);
        
        SFPCard7.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard7);
        
        SFPCard8.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard8);
        
        SFPCard9.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard9);
        
        SFPCard10.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard10);
        
        SFPCard11.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard11);
        
        SFPCard12.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard12);
        
        SFPCard13.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard13);
        
        SFPCard14.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard14);
        
        SFPCard15.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard15);
        
        SFPCard16.setIcon(new ImageIcon("b1fv.png"));
        StraightFlushPane.add(SFPCard16);
        
        StraightFlushPane.setPreferredSize(new java.awt.Dimension(370, 1000));

        SFPScrollPane = new JScrollPane(StraightFlushPane);
        SFPScrollPane.setViewportView(StraightFlushPane);
        getContentPane().add(SFPScrollPane);
        //StraightFlushPane.setBounds(0, 0, 370, 330);
        SFPScrollPane.setBounds(602, 140, 370, 350);
       
/***************************************************************************
 * Card in hand card17-card26 JLabel
 */
        CardInHandPand.setBackground(new Color(204, 204, 204));

        Card17.setIcon(new ImageIcon("b1fv.png")); // NOI18N
//        Card17.setEnabled(false);
        Card17.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
            	doCards(Card17);
            	tempIndex = 0;
           }  
        }); 
        CardInHandPand.add(Card17);

        Card18.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card18.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {  
        		doCards(Card18);
        	  
            }  
        });
        CardInHandPand.add(Card18);

        Card19.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card19.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
                   doCards(Card19);
      			   tempIndex = 2;
        	}
        });
        CardInHandPand.add(Card19);

        Card20.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card20.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		doCards(Card20);
      			tempIndex = 3;
        	}
        });
        CardInHandPand.add(Card20);

        Card21.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card21.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		doCards(Card21);
      			tempIndex = 4;
        	}
        });
        CardInHandPand.add(Card21);

        Card22.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card22.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		doCards(Card22);
      			    tempIndex = 5;
        	}
        });
        CardInHandPand.add(Card22);

        Card23.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card23.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		doCards(Card23);
      			tempIndex = 6;
        	}
        });
        CardInHandPand.add(Card23);

        Card24.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card24.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		doCards(Card24);
        		tempIndex = 7;
        	}
        });
        CardInHandPand.add(Card24);

        Card25.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card25.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		doCards(Card25);
        		tempIndex = 8;
        	}
        });
        CardInHandPand.add(Card25);
        
        Card26.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        Card26.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		doCards(Card26);
        		tempIndex = 9;
        	}
        });
        CardInHandPand.add(Card26);
        
        CIHPCard11.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        CIHPCard11.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		doCards(CIHPCard11);
        		tempIndex = 10;
        	}
        });
        CardInHandPand.add(CIHPCard11);

        getContentPane().add(CardInHandPand);
        CardInHandPand.setBounds(165, 530, 1015, 120);
        CardInHandPand.getAccessibleContext().setAccessibleName("CardInHand");
/********************************************************************************/
        
        AllKindLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AllKindLabel.setForeground(new java.awt.Color(0, 0, 255));
        AllKindLabel.setText("All Kind");
        getContentPane().add(AllKindLabel);
        AllKindLabel.setBounds(360, 124, 70, 20);

        CardInHandLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CardInHandLabel.setForeground(new java.awt.Color(0, 0, 255));
        CardInHandLabel.setText("Card In Hand");
        getContentPane().add(CardInHandLabel);
        CardInHandLabel.setBounds(590, 490, 100, 20);
/*********************************************************************************
 * Melding windows: StraightFlush set and AllKind set
 */
        StraightFlushLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StraightFlushLabel.setForeground(new Color(0, 0, 255));
        StraightFlushLabel.setText("Straight");
        getContentPane().add(StraightFlushLabel);
        StraightFlushLabel.setBounds(740, 120, 60, 30);

        StraightFlushSet.setBackground(new Color(204, 204, 255));
        StraightFlushSet.setPreferredSize(new Dimension(330, 105));

        Card27.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushSet.add(Card27);

        Card28.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushSet.add(Card28);

        Card30.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushSet.add(Card30);

        Card29.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        StraightFlushSet.add(Card29);

        getContentPane().add(StraightFlushSet);
        StraightFlushSet.setBounds(980, 380, 370, 110);
        StraightFlushSet.getAccessibleContext().setAccessibleName("StraightSet");
/*********************************************************************************/

        AllKindSet.setBackground(new Color(255, 255, 51));

        Card31.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        AllKindSet.add(Card31);

        Card34.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        AllKindSet.add(Card34);

        AKCard3.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        AllKindSet.add(AKCard3);
        
        AKCard4.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        AllKindSet.add(AKCard4);

        getContentPane().add(AllKindSet);
        AllKindSet.setBounds(960, 210, 370, 110);
/*********************************************************************************/
        DiscardPilePane.setBackground(new Color(255, 102, 102));
        DiscardPilePane.setLayout(null);

        Card35.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        DiscardPilePane.add(Card35);
        Card35.setBounds(220, 10, 70, 100);

        Card32.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        DiscardPilePane.add(Card32);
        Card32.setBounds(20, 20, 70, 96);

        Card36.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        DiscardPilePane.add(Card36);
        Card36.setBounds(220, 10, 70, 100);

        getContentPane().add(DiscardPilePane);
        DiscardPilePane.setBounds(900, 10, 110, 130);
        DiscardPilePane.getAccessibleContext().setAccessibleName("DiscardPile");

        CardPilePane.setBackground(new java.awt.Color(0, 153, 153));
        CardPilePane.setLayout(null);

        Card33.setIcon(new ImageIcon("b1fv.png")); // NOI18N
        CardPilePane.add(Card33);
        Card33.setBounds(20, 20, 71, 96);

        getContentPane().add(CardPilePane);
        CardPilePane.setBounds(1020, 10, 110, 130);
        CardPilePane.getAccessibleContext().setAccessibleName("CardPilePane");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Card Pile");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(800, 10, 90, 30);

        cardPileLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cardPileLabel.setForeground(new java.awt.Color(0, 0, 255));
        cardPileLabel.setText("Discard Pile");
        getContentPane().add(cardPileLabel);
        cardPileLabel.setBounds(1150, 10, 70, 30);

        StraightFlushButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StraightFlushButton.setForeground(new java.awt.Color(51, 51, 255));
        StraightFlushButton.setText("Straight Flush");
        StraightFlushButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
//        		handleStraightFlushPane();
        		Melding SFmeld = new Melding();
    			for(int i =0; i < SFHand.sizeOfHand(); i++){
    				Card tempC = SFHand.getCard(i);
    				SFmeld.addCard(tempC);
    			}
        		Hand sendH = new Hand();
        		int meldtype = SFmeld.evaluateMelding();
        		if(meldtype == 2){
        			for(int i =0; i < SFHand.sizeOfHand(); i++){
        				Card tempC = SFHand.getCard(i);
        				int index = serverHand.findCard(tempC);
        				sendH.addCard(serverHand.removeCard(index));
        			}
        			displayHandOnBoard();
    				if(SFHand.sizeOfHand() == 3
    						|| SFHand.sizeOfHand() == 4){
    		    		Card5.setIcon(SFHand.getCard(0).getIcon());
    		    		Card27.setIcon(new ImageIcon("b1fv.png"));
    		    		Card6.setIcon(SFHand.getCard(1).getIcon());
    		    		Card28.setIcon(new ImageIcon("b1fv.png"));
    		    		Card7.setIcon(SFHand.getCard(2).getIcon());
    		    		Card30.setIcon(new ImageIcon("b1fv.png"));
    		    		//TODO the fourth one add to SF pane
    				}
    				if(SFHand.sizeOfHand() == 4){
    		    		SFPCard4.setIcon(SFHand.getCard(3).getIcon());
    		    		Card29.setIcon(new ImageIcon("b1fv.png"));
    				}
    				//Broadcast to public

    	            for (int i = clientList.size() - 1; i >= 0; i--) {  
    	            	Hand cmdH = new Hand();
    	            	for(int j = 0; j < sendH.sizeOfHand(); j++){
    	            		cmdH.addCard(sendH.getCard(j));
    	            	}
        				cmdH.setUsername(getTitle());
        				cmdH.setCommandLine("ADDTO_SF_PANE");
    	            	sendMessage(clientList.get(i).getWriter(), cmdH); 
    	            }
    	            SFHand.removeHand();
        		}
        		else{
          			SFHand.removeHand();
          			Card27.setIcon(new ImageIcon("b1fv.png"));
          			Card28.setIcon(new ImageIcon("b1fv.png"));
          			Card30.setIcon(new ImageIcon("b1fv.png"));
          			Card29.setIcon(new ImageIcon("b1fv.png"));
          			displayHandOnBoard();
    		    	JOptionPane.showMessageDialog(null, "Not Straight Flush!!!");
        		}
        	}
        });
        getContentPane().add(StraightFlushButton);
        StraightFlushButton.setBounds(1090, 330, 150, 40);
        StraightFlushButton.getAccessibleContext().setAccessibleName("Straight FlushButton");
       
        
        
        AllkindButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AllkindButton.setForeground(new java.awt.Color(102, 0, 255));
        AllkindButton.setText("All Kind");
        AllkindButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
//        		handleStraightFlushPane();
        		Melding AKmeld = new Melding();
    			for(int i =0; i < AKHand.sizeOfHand(); i++){
    				Card tempC = AKHand.getCard(i);
    				AKmeld.addCard(tempC);
    			}
        		Hand sendH = new Hand();
        		int meldtype = AKmeld.evaluateMelding();
        		if(meldtype == 1){
        			for(int i =0; i < AKHand.sizeOfHand(); i++){
        				Card tempC = AKHand.getCard(i);
        				int index = serverHand.findCard(tempC);
        				sendH.addCard(serverHand.removeCard(index));
        			}
        			displayHandOnBoard();
    				if(AKHand.sizeOfHand() == 3
    						|| AKHand.sizeOfHand() == 4){
    		    		AKPCard1.setIcon(AKHand.getCard(0).getIcon());
    		    		Card31.setIcon(new ImageIcon("b1fv.png"));
    		    		AKPCard2.setIcon(AKHand.getCard(1).getIcon());
    		    		Card34.setIcon(new ImageIcon("b1fv.png"));
    		    		AKPCard3.setIcon(AKHand.getCard(2).getIcon());
    		    		AKCard3.setIcon(new ImageIcon("b1fv.png"));
    		    		//TODO the fourth one add to SF pane
    				}
    				if(AKHand.sizeOfHand() == 4){
    					AKPCard4.setIcon(AKHand.getCard(1).getIcon());
    		    		AKCard4.setIcon(new ImageIcon("b1fv.png"));
    				}
    				//Broadcast to public

    	            for (int i = clientList.size() - 1; i >= 0; i--) {  
    	            	Hand cmdH = new Hand();
    	            	for(int j = 0; j < sendH.sizeOfHand(); j++){
    	            		cmdH.addCard(sendH.getCard(j));
    	            	}
        				cmdH.setUsername(getTitle());
        				cmdH.setCommandLine("ADDTO_AK_PANE");
    	            	sendMessage(clientList.get(i).getWriter(), cmdH); 
    	            }
    	            AKHand.removeHand();
        		}
        		else{
          			AKHand.removeHand();
          			Card31.setIcon(new ImageIcon("b1fv.png"));
          			Card34.setIcon(new ImageIcon("b1fv.png"));
          			AKCard3.setIcon(new ImageIcon("b1fv.png"));
          			AKCard4.setIcon(new ImageIcon("b1fv.png"));
          			displayHandOnBoard();
    			    JOptionPane.showMessageDialog(null, "Not ALL Kind!!!");
          		}
        	}
        });
            
        getContentPane().add(AllkindButton);
        AllkindButton.setBounds(1090, 160, 140, 40);
        AllkindButton.getAccessibleContext().setAccessibleName("AllKindButton");

        
        
        discard_button.setForeground(new java.awt.Color(255, 51, 0));
        discard_button.setText("Discard");
        discard_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tempButton.setIcon(new ImageIcon("b1fv.png"));
                Card c = serverHand.removeCard(tempIndex);
                DiscardPile.getInstance().addCard(c);
                Card33.setIcon(c.getIcon());
                for (int i = clientList.size() - 1; i >= 0; i--) {  
                    Hand topcardH = new Hand();
                    topcardH.setCommandLine("UPDATEDISCARDPILE");
                    topcardH.addCard(c);
                	topcardH.setUsername(getTitle());
                    sendMessage(clientList.get(i).getWriter(), topcardH);
                }
                displayHandOnBoard();
                Hand cmdH = new Hand();
                cmdH.setCommandLine("DEALED");
                cmdH.setUsername(getTitle());
                sendMessage(clientList.get(0).getWriter(), cmdH);
                DiscardPile.getInstance().addCard(c);

            }
        });
        getContentPane().add(discard_button);
        discard_button.setBounds(90, 520, 70, 50);

        dealcard_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dealcard_button.setForeground(new java.awt.Color(0, 153, 153));
        dealcard_button.setText("Start");
        dealcard_button.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		isStart = true;
                for (int i = clientList.size() - 1; i >= 0; i--) {  
                	Hand msgH = new Hand();
                	msgH.setCommandLine("PUBLIC");
                	msgH.setUsername(getTitle());
                	msgH.setMessage(" already start the game.");
                    sendMessage(clientList.get(i).getWriter(), msgH);
                }
                dealcard_button.setEnabled(false);
                dealCardsForUser();
        	}
        });
        
        getContentPane().add(dealcard_button);
        dealcard_button.setBounds(10, 520, 70, 50);

        ScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ScoreLabel.setForeground(new java.awt.Color(0, 153, 100));
        ScoreLabel.setText("Scores");
        getContentPane().add(ScoreLabel);
        ScoreLabel.setBounds(1240, 10, 70, 30);

        ScoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ScoreField);
        ScoreField.setBounds(1240, 40, 70, 30);

        CardLeftLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CardLeftLabel.setForeground(new java.awt.Color(0, 153, 100));
        CardLeftLabel.setText("Card Left");
        getContentPane().add(CardLeftLabel);
        CardLeftLabel.setBounds(1240, 80, 80, 30);

        CardLeftField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardLeftFieldActionPerformed(evt);
            }
        });
        getContentPane().add(CardLeftField);
        CardLeftField.setBounds(1240, 120, 70, 30);

        DealPanel.setBackground(new java.awt.Color(102, 255, 102));
        DealPanel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("DealFrom");
        DealPanel.add(jLabel2);

        dealfromcardpile_button.setText("Card Pile");
        dealfromcardpile_button.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		dealFromCardPile();
        	}
        });
        DealPanel.add(dealfromcardpile_button);

        dealfromdiscardpile_button.setText("Discard Pile");
        dealfromdiscardpile_button.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		if(DiscardPile.getInstance().getSize() == 0){
        			JOptionPane.showMessageDialog(null, "Discard Pile is empty!");
        			dealfromdiscardpile_button.setEnabled(false);
        		}else{
        			if(DiscardPile.getInstance().getSize() > 1){
            			Card sectop = DiscardPile.getInstance().getSecTopCard();
                		for (int i = clientList.size() - 1; i >= 0; i--) {  
                        	Hand msgH = new Hand();
                        	msgH.addCard(sectop);
                        	msgH.setCommandLine("UPDATEDISCARDPILE");
                        	msgH.setUsername(getTitle());
                        	msgH.setMessage(serverHand.getUsername()+" deal from discard pile");
                            sendMessage(clientList.get(i).getWriter(), msgH);
                        }
        			}
        			if(DiscardPile.getInstance().getSize() == 1){
        				Card33.setIcon(new ImageIcon("b1fv.png"));
                		for (int i = clientList.size() - 1; i >= 0; i--) {  
                        	Hand msgH = new Hand();
                        	msgH.setCommandLine("EMPTY_DIS");
                        	msgH.setUsername(getTitle());
                        	msgH.setMessage(serverHand.getUsername()+" deal from discard pile");
                            sendMessage(clientList.get(i).getWriter(), msgH);
                        }
        			}

        			Card top = DiscardPile.getInstance().getTopCard();
        			Card33.setIcon(top.getIcon());
    				serverHand.addCard(top);
    				displayHandOnBoard();
            		for (int i = clientList.size() - 1; i >= 0; i--) {  
                    	Hand sendH = new Hand();
                    	sendH.setCommandLine("ALL");
                    	sendH.setUsername(getTitle());
                    	sendH.setMessage(serverHand.getUsername()+" deal card" + top.toString()+" from discard pile");
                        sendMessage(clientList.get(i).getWriter(), sendH);
                    }
        		}
                dealcard_button.setEnabled(false);
                //TODO discardpile
                
        	}
        });
        DealPanel.add(dealfromdiscardpile_button);

        getContentPane().add(DealPanel);
        DealPanel.setBounds(10, 570, 150, 90);
/***********************************************************************
 * AddTo: AllKindMelding, StraightFlush, AllKindPaneButton, StraightFlushButton
 */
        AddToPanel.setBackground(new java.awt.Color(0, 153, 153));
        AddToPanel.setLayout(null);

        AllkindMeldingButton.setText("All Kind Melding");
        AllkindMeldingButton.setEnabled(false);
        AllkindMeldingButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){//should have four cards present
        		handleAllkindMelding();
        	}
        });
        AddToPanel.add(AllkindMeldingButton);
        AllkindMeldingButton.setBounds(25, 0, 100, 30);

        AddtoStraightFlushButton.setText("Straight Flush Melding");
        AddtoStraightFlushButton.setEnabled(false);
        AddToPanel.add(AddtoStraightFlushButton);
        AddtoStraightFlushButton.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			handleStraightFlush();
    		}
        });
        AddtoStraightFlushButton.setBounds(25, 40, 100, 30);

        AllKindPaneButton.setText("All Kind Pane");
        AllKindPaneButton.setEnabled(false);
        AddToPanel.add(AllKindPaneButton);
        AllKindPaneButton.setBounds(25, 80, 100, 30);

        StraightFlushPaneButton.setText("Straight Flush Pane");
        StraightFlushPaneButton.setEnabled(false);
        AddToPanel.add(StraightFlushPaneButton);
        StraightFlushPaneButton.setBounds(25, 120, 100, 30);

        AddToLabel.setBackground(new java.awt.Color(255, 255, 255));
        AddToLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddToLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddToLabel.setText("TO");
        AddToPanel.add(AddToLabel);
        AddToLabel.setBounds(10, 40, 50, 40);

        getContentPane().add(AddToPanel);
        AddToPanel.setBounds(1180, 500, 150, 160);
/*************************************************************************/
        MainLabel.setIcon(new ImageIcon("pokerGun.png")); // NOI18N
        MainLabel.setPreferredSize(new java.awt.Dimension(1365, 720));
        getContentPane().add(MainLabel);
        MainLabel.setBounds(4, 4, 1350, 690);

        MainMenu.setText("Menu");

        Winner_List.setText("Winner List");
        MainMenu.add(Winner_List);

        Logout.setText("Log Out");
        MainMenu.add(Logout);
        Logout.addActionListener(new ActionListener(){
          	public void actionPerformed(ActionEvent e){
          		System.exit(0);
          	}
          });
        

        Menu.add(MainMenu);

        HelpMenu.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new ActionListener(){
        	  public void actionPerformed(ActionEvent e){
        		  JOptionPane.showMessageDialog(null, "This is a Rummy Game created by:\nQian Wang\nAnthony Manetti\nPlaimanus Lueondee\nZe Li");
        	  }
          });
        HelpMenu.add(jMenuItem1);

        Menu.add(HelpMenu);

        setJMenuBar(Menu);

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
 /********************************************************************************
  * All the method listed as follows:
  */
    public void setUsername(String str){
    	this.setTitle(str);
    	this.repaint();
    }
    
    public void doCards(JButton b){
    	if(isStart){
            AllkindMeldingButton.setEnabled(true);
            AddtoStraightFlushButton.setEnabled(true);
            AllKindPaneButton.setEnabled(true);
            StraightFlushPaneButton.setEnabled(true); 
            b.setSelected(true);
            }
	    tempButton = b;
	    b.requestFocusInWindow();	    
	}
    
    public void handleStraightFlush(){
    	if(SFHand.sizeOfHand() == 0){
    		Card27.setIcon(serverHand.getCard(tempIndex).getIcon());
        	SFHand.addCard(serverHand.getCard(tempIndex));
        	tempButton.setIcon(new ImageIcon("b1fv.png"));
    	}else if(SFHand.sizeOfHand() == 1){
    		Card28.setIcon(serverHand.getCard(tempIndex).getIcon());
        	SFHand.addCard(serverHand.getCard(tempIndex));
        	tempButton.setIcon(new ImageIcon("b1fv.png"));
    	}else if(SFHand.sizeOfHand() == 2){
    		Card30.setIcon(serverHand.getCard(tempIndex).getIcon());
        	SFHand.addCard(serverHand.getCard(tempIndex));
        	tempButton.setIcon(new ImageIcon("b1fv.png"));
    	}else if(SFHand.sizeOfHand() == 3){
    		Card29.setIcon(serverHand.getCard(tempIndex).getIcon());
        	SFHand.addCard(serverHand.getCard(tempIndex));
        	tempButton.setIcon(new ImageIcon("b1fv.png"));
    	}else{
    		JOptionPane.showMessageDialog(null, "Invalid, Full Staight Flush Field!!");
    	}
    }
    
    public void handleStraightFlushPane(){
    }
    public void handleAllkindMelding(){
		//tempButton.setEnabled(false);
		if(AKHand.sizeOfHand() == 0){       		
		Card31.setIcon(serverHand.getCard(tempIndex).getIcon());
    	AKHand.addCard(serverHand.getCard(tempIndex));
    	tempButton.setIcon(new ImageIcon("b1fv.png"));
		}else if(AKHand.sizeOfHand() == 1){
		Card34.setIcon(serverHand.getCard(tempIndex).getIcon());
    	AKHand.addCard(serverHand.getCard(tempIndex));
    	tempButton.setIcon(new ImageIcon("b1fv.png"));
		}else if(AKHand.sizeOfHand() == 2){
			AKCard3.setIcon(serverHand.getCard(tempIndex).getIcon());
	    	AKHand.addCard(serverHand.getCard(tempIndex));
	    	tempButton.setIcon(new ImageIcon("b1fv.png"));
		}else if(AKHand.sizeOfHand() == 3){
			AKCard4.setIcon(serverHand.getCard(tempIndex).getIcon());
	    	AKHand.addCard(serverHand.getCard(tempIndex));
	    	tempButton.setIcon(new ImageIcon("b1fv.png"));
		}else{
			JOptionPane.showMessageDialog(null, "Invalid, Full AllKind Field!!");
		}
    }
    
	public void send(){
        if (clientList.size() == 0) {  
        	//Use JOptionPane show Error message
            JOptionPane.showMessageDialog(this, "No Active User!", "ERROR",  
                    JOptionPane.ERROR_MESSAGE);  
            return;  
        }  
        String message = userText.getText().trim();  
        if (message == null || message.equals("")) {  
            JOptionPane.showMessageDialog(this, "No empty msg!", "ERROR",  
                    JOptionPane.ERROR_MESSAGE);  
            return;  
        }  
        sendServerMessage(message);
        textarea.append("Server: " + userText.getText() + "\r\n");  
        userText.setText(null);  
	}
	
	/**
	 * the method that builds the connection between server and clients
	 * @param port
	 */
	public void listenSocket(int port){
		
		server = null; 

	    try { 

	         server = new ServerSocket(port); 
	         System.out.println ("Connection Socket Created");
	         System.out.println ("Socket open on Port: " +
	                             server.getLocalPort());
	         InetAddress addr = InetAddress.getLocalHost();
	         System.out.println("Java InetAddress localHost info: " + addr);
	         System.out.println("Local Host Name: " + addr.getHostName());
	         //TODO server timeout showed some example in EchoServer2d.java
	         try { 
	              while (true)
	                 {
	                  System.out.println ("Waiting for Connection");
	                  in_C = server.accept();    
	                   In_Client client = new In_Client(in_C);  
	                   client.start(); 
	                   clientList.add(client);  
	                   listModel.addElement(client.getUser().getName());  
	                   textarea.append(client.getUser().getName() + client.getUser().getIp() +" is online\r\n");  
	                 }
	             } 
	         catch (IOException e) 
	             { 
	        	  showMessage("Accept failed");
	              System.err.println("Accept failed."); 
	              System.exit(1); 
	             } 
	        } 
	    catch (IOException e) 
	        { 
	    	 showMessage("MSg 1: Could not listen on port: 10008.");
	         System.err.println("MSg 1: Could not listen on port: 10008."); 
	         System.exit(1); 
	        } 
	    finally
	        {
	         try {
	              closeServer(); 
	             }
	         catch (Exception e)
	             { 
	        	  showMessage("MSG 2: Could not close port: 10008.");
	              System.err.println("MSG 2: Could not close port: 10008."); 
	              System.exit(1); 
	             } 
	        }		
	}

    public void closeServer() {  
        try {  
        	//close all the socket connected with server
            for (int i = clientList.size() - 1; i >= 0; i--) {  
            	Hand cmdH = new Hand();
            	cmdH.setCommandLine("CLOSE");
            	sendMessage(clientList.get(i).getWriter(), cmdH); 
                clientList.get(i).reader.close();  
                clientList.get(i).writer.close();  
                clientList.get(i).socket.close();  
                clientList.remove(i);  
            }   
                server.close(); 
            listModel.removeAllElements(); 
        } catch (IOException e) {  
            e.printStackTrace();   
        }  
    }
    
	public void showMessage(final String mesg){
		SwingUtilities.invokeLater(
	            new Runnable()
	            {
	                public void run()
	                {
	                	textarea.append(mesg);
	                }
	            }
	        );
	}
	
	/**
	 * helps send message across
	 * @param output
	 * @param mesgH
	 */
	
	public void sendMessage(ObjectOutputStream output, Hand mesgH){
		try {
			output.writeObject(mesgH);
			output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    public void sendServerMessage(String message) { 
    	//sent message to all the client connected with server
        for (int i = clientList.size() - 1; i >= 0; i--) {  
        	Hand cmdH = new Hand();
        	cmdH.setUsername(this.getTitle());
        	cmdH.setCommandLine("PUBLIC");
        	cmdH.setMessage(message + "");
        	sendMessage(clientList.get(i).getWriter(), cmdH);  
        }  
        
    }
    
    /***
     * a private class created to deal with with client
     */
/************************************************************************/	
    private class In_Client extends Thread {  
        private Socket socket;  
        private ObjectInputStream reader;  
        private ObjectOutputStream writer;  
        private User user;  
  
        public ObjectInputStream getReader() {  
            return reader;  
        }  
  
        public ObjectOutputStream getWriter() {  
            return writer;  
        }  
  
        public User getUser() {  
            return user;  
        }  
  
        public In_Client(Socket socket1) {  
            try {  
                this.socket = socket1;  
                reader = new ObjectInputStream(socket.getInputStream()); 
                writer = new ObjectOutputStream(socket.getOutputStream()); 
                
                //read the first line which provide the name and IP of client to server
                Hand inf = (Hand) reader.readObject();  
//                StringTokenizer st = new StringTokenizer(inf, "@");  

                
                user = new User(inf.getUsername(), inf.getIPaddress());  
                
                //sent the message out to the client attempt to do the connection
                Hand msgH = new Hand();
                msgH.setMessage(user.getName() + user.getIp() + "connects with server!");
                sendMessage(writer, msgH);

                //also sent the clientlist info to this client
                if (clientList.size() > 0) {  
                    String temp = "";  
                    //convert the whole list to a string
                    for (int i = clientList.size() - 1; i >= 0; i--) {  
                        temp += (clientList.get(i).getUser().getName() + "/" + clientList  
                                .get(i).getUser().getIp())  
                                + "@";  
                    }  
                    //sent out the client size and string with a command line at the front
                    Hand msgH1 = new Hand();
                    msgH1.setClientSize(String.valueOf(clientList.size()));
                    msgH1.setCommandLine("USERLIST");
                    String servername = getTitle() + "(Server)/" + InetAddress.getLocalHost() + "@";
                    msgH1.setClientList(servername + temp);
                    sendMessage(writer, msgH1);
//                    writer.writeObject("USERLIST@" + clientList.size() + "@" + temp);  
//                    writer.flush();  
                }  
                
                //finally sent all the user that a new client added
                for (int i = clientList.size() - 1; i >= 0; i--) { 
                	Hand clientH = new Hand();
                	clientH.setCommandLine("ADD");
                	clientH.setUsername(user.getName());
                	clientH.setIPaddress(user.getIp());
                    sendMessage(clientList.get(i).getWriter(), clientH);
//                	clientList.get(i).getWriter().writeObject(clientH);  
//                	clientList.get(i).getWriter().flush();  
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
        }  
  
        public void run() {
            Hand message = null;  
            while (true) {  
                try {  
                    message = (Hand) reader.readObject();
                    if (message.getCommandLine().equals("CLOSE"))
                    {  
                        textarea.append(this.getUser().getName()  
                                + this.getUser().getIp() + " is offline!\r\n");  
                        reader.close();  
                        writer.close();  
                        socket.close();  
  
                        //sent message"DELETE@username" to all the client
                        for (int i = clientList.size() - 1; i >= 0; i--) {  
                        	Hand deleteH = new Hand();
                        	deleteH.setClientList("DELETE");
                        	deleteH.setUsername(user.getName());
                            sendMessage(clientList.get(i).getWriter(), deleteH);
//                            clientList.get(i).getWriter().writeObject(deleteH);  
//                            clientList.get(i).getWriter().flush();  
                        }  
  
                        //remove the offline client from the GUI listModel list
                        listModel.removeElement(user.getName());
  
                        //remove the offline client from the clientlist
                        for (int i = clientList.size() - 1; i >= 0; i--) {  
                            if (clientList.get(i).getUser() == user) {  
                                //In_Client temp = clientList.get(i);  
                                clientList.remove(i);
                                return;  
                            }  
                        }  
                    } else {  
                        dispatcherMessage(message);
                    }  
                } catch (IOException e) {  
                    e.printStackTrace();  
                } catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
            }  
        }
        
        /**
         * this method is used to dispatch the message sent by client
         * @param message
         */
        public void dispatcherMessage(Hand h) {  
        	String meg;
            //source--which client sent this message
            String source = h.getUsername();  
            //owner--"ALL" the charater to show the type of chat
            String owner = h.getCommandLine();  
            //content--messages sent by the client
            String content = h.getMessage();   
            if (owner.equals("ALL")) { 
                meg = source + " : " + content;  
                textarea.append(meg + "\r\n"); 
                for (int i = clientList.size() - 1; i >= 0; i--) {  
                	Hand msgH = new Hand();
                	msgH.setCommandLine("PUBLIC");
                	msgH.setUsername(source);
                	msgH.setMessage(content);
                    sendMessage(clientList.get(i).getWriter(), msgH);
//                    clientList.get(i).getWriter().writeObject(msgH);  
//                    clientList.get(i).getWriter().flush();  
                }  
            }
            if(owner.equals("PRIVATE")){
            	meg = source + " : " + content;
            	textarea.append(meg + "\r\n");
            	StringTokenizer strtoken = new StringTokenizer(h.getClientList(), "/");
            	while(strtoken.hasMoreTokens()){
            		int index = findClient(strtoken.nextToken());
            		if(index != -1){
            			Hand msgH = new Hand();
            			msgH.setCommandLine("PRIVATE");
            			msgH.setUsername(source);
            			msgH.setMessage(content);
                        sendMessage(clientList.get(index).getWriter(), msgH);
//            			clientList.get(index).getWriter().writeObject(msgH);
//            			clientList.get(index).getWriter().flush();
            		}
            	}
            }
            //num==2, 10 cards per person; num == 3-4, 7 cards per person; num == 5-6, 6 cards per person
            if(owner.equals("DEALCARDS")){
        		int index = findClient(source);
        		if(index != -1){
        			clientList.get(index).getUser().setisStart(true);
        		}
        		dealCardsForUser();
            }
            if(owner.equals("DEALFROMCARDPILE")){
            	int index = findClient(source);
            	if(index != -1){
            		cardpile = CardPile.getInstance();
            		Hand dealCardH = new Hand();
            		dealCardH.addCard(cardpile.dealcard());
            		dealCardH.setCommandLine("DEALFROMCARDPILE");
            		sendMessage(clientList.get(index).getWriter(), dealCardH);
//            		if(index +1 <= clientList.size() -1){
//            			Hand dealedH = new Hand();
//            			dealedH.setCommandLine("DEALED");
//            			sendMessage(clientList.get(index+1).getWriter(), dealedH);
//            		}
            	}
            	if(index == clientList.size() -1){
            		dealfromcardpile_button.setEnabled(true);
            		dealfromdiscardpile_button.setEnabled(true);
            	}
            }
            if(owner.equals("DEALED")){
            	int index = findClient(source);
            	if(index != -1){
            		if(index +1 <= clientList.size() -1){
            			Hand dealedH = new Hand();
            			dealedH.setCommandLine("DEALED");
            			sendMessage(clientList.get(index+1).getWriter(), dealedH);
            		}
            	}
            	if(index == clientList.size() -1){
            		dealfromcardpile_button.setEnabled(true);
            		dealfromdiscardpile_button.setEnabled(true);
            	}
            }
            if(owner.equals("DEALFROMDISCARDPILE")){
            	int index = findClient(source);
            	if(index != -1){
            		if(DiscardPile.getInstance().getSize() >= 1){
            			Card newTop = DiscardPile.getInstance().getSecTopCard();
            			Hand dealHand = new Hand();
            			dealHand.addCard(DiscardPile.getInstance().getTopCard());
            			dealHand.setCommandLine("DEALFROMDISCARDPILE");
                		sendMessage(clientList.get(index).getWriter(), dealHand);
            			textarea.append(source + " dealed one card from discardpile.\n");
            	        for (int i = clientList.size() - 1; i >= 0; i--) {  
            	        	Hand msgH = new Hand();
            	        	msgH.setCommandLine("PUBLIC");
            	        	msgH.setUsername(source);
            	        	msgH.setMessage(" deal one card from discardpile.");
            	            sendMessage(clientList.get(i).getWriter(), msgH);
            	            Hand updateH = new Hand();
            	            updateH.setCommandLine("UPDATEDISCARDPILE");
            	            updateH.setUsername(source);
//            	            discardpile = DiscardPile.getInstance();
            	            if(newTop == null){
            	            	updateH.setCommandLine("EMPTY_DIS");
            	            	textarea.append("DiscardPile is empty!\n");
            	            }else {
            	            	updateH.addCard(newTop);
            	            	textarea.append("DiscardPile topcard update as: "+ newTop.toString() + "\n");
            	            }
            	            sendMessage(clientList.get(i).getWriter(), updateH);
            	        }
                		if(index +1 < clientList.size() -1){
                			Hand dealedH = new Hand();
                			dealedH.setCommandLine("DEALED");
                			sendMessage(clientList.get(index+1).getWriter(), dealedH);
                		}
                    	if(index == clientList.size() -1){
                    		dealfromcardpile_button.setEnabled(true);
                    		dealfromdiscardpile_button.setEnabled(true);
                    	}
            		}
            	}
            }
            if(owner.equals("UPDATEDISCARDPILE")){
				Card c;
				c = h.getCard(0); //new topcard for discardpile.
                Card33.setIcon(c.getIcon());
                for (int i = clientList.size() - 1; i >= 0; i--) {  
                    Hand topcardH = new Hand();
                    topcardH.setCommandLine("UPDATEDISCARDPILE");
                    topcardH.addCard(c);
                	topcardH.setUsername(getTitle());
                    sendMessage(clientList.get(i).getWriter(), topcardH);
                }
            }
            if(owner.equals("ADDTO_AK_PANE")){
            	if(h.sizeOfHand() == 3
						|| h.sizeOfHand() == 4){
		    		AKPCard1.setIcon(h.getCard(0).getIcon());
		    		AKPCard2.setIcon(h.getCard(1).getIcon());
		    		AKPCard3.setIcon(h.getCard(2).getIcon());
		    		//TODO the fourth one add to SF pane
				}
				if(h.sizeOfHand() == 4){
					AKPCard4.setIcon(h.getCard(3).getIcon());
				}
				//Broadcast to public

	            for (int i = clientList.size() - 1; i >= 0; i--) {  
	            	Hand cmdH = new Hand();
	            	for(int j = 0; j < h.sizeOfHand(); j++){
	            		cmdH.addCard(h.getCard(j));
	            	}
    				cmdH.setUsername(getTitle());
    				cmdH.setCommandLine("ADDTO_AK_PANE");
	            	sendMessage(clientList.get(i).getWriter(), cmdH); 
	            }
    		}
            if(owner.equals("ADDTO_SF_PANE")){
            	if(h.sizeOfHand() == 3
						|| h.sizeOfHand() == 4){
		    		Card5.setIcon(h.getCard(0).getIcon());
		    		Card6.setIcon(h.getCard(1).getIcon());
		    		Card7.setIcon(h.getCard(2).getIcon());
		    		//TODO the fourth one add to SF pane
				}
				if(h.sizeOfHand() == 4){
					SFPCard4.setIcon(h.getCard(3).getIcon());
				}
				//Broadcast to public

	            for (int i = clientList.size() - 1; i >= 0; i--) {  
	            	Hand cmdH = new Hand();
	            	for(int j = 0; j < h.sizeOfHand(); j++){
	            		cmdH.addCard(h.getCard(j));
	            	}
    				cmdH.setUsername(getTitle());
    				cmdH.setCommandLine("ADDTO_SF_PANE");
	            	sendMessage(clientList.get(i).getWriter(), cmdH); 
	            }
    		}
        } 
    }

/**
 * helps deal card from card pile for the server
 */
    
	public void dealFromCardPile(){
		if(CardPile.getInstance().sizeOfCardpiles() >= 1){
		serverHand.addCard(CardPile.getInstance().dealcard());
		displayHandOnBoard();
        for (int i = clientList.size() - 1; i >= 0; i--) {
        	Hand updateH = new Hand();
        	updateH.setCommandLine("ALL");
        	updateH.setUsername(getTitle());
        	updateH.setMessage(getTitle()+" deal one card from cardpile.");
            sendMessage(clientList.get(i).getWriter(), updateH);
        }
		dealfromcardpile_button.setEnabled(false);
		dealfromdiscardpile_button.setEnabled(false);
		discard_button.setEnabled(true);
		}else{
			dealfromdiscardpile_button.setEnabled(false);
		}		
	}
	
	
	/**
	 * draw a card from discard pile
	 */
    public void drawCardFromDiscardPile(){
    	if(checkStart()&&isStart==true){
    		cardpile = CardPile.getInstance();
    		Hand serH = new Hand();
    		Card tempCard = discardpile.getTopCard();
    		serverHand.addCard(tempCard);
    		serH.setCommandLine("DEALFROMDISCARDPILE");
    		serH.setMessage(getTitle()+" has dealt from the discard pile");
    		Hand cardHand = new Hand();
    		cardHand.addCard(tempCard);
    		int currentcards = serverHand.sizeOfHand();
    		//if(currentcards == 1){
    			Card18.setIcon(tempCard.getIcon());
    //		}
    		for (int i = 0;i<clientList.size();i++){
                sendMessage(clientList.get(i).getWriter(), serH);
                sendMessage(clientList.get(i).getWriter(),cardHand);
    		}
    	}
    }
    
    
    /**
     * give cards to all users based on the number of users
     */
    public void dealCardsForUser(){
		if(checkStart() && isStart == true){
			cardpile = CardPile.getInstance();
			int num = clientList.size() + 1;
//    		Hand serverh = cardpile.dealcards(10);
//    		serverHand = serverh;
    		
//    		textarea.append(serverh.displaySortedHand() + "\n");
			if(num == 2){
	    		Hand serverh = cardpile.dealcards(10);
	    		serverHand = serverh;
	    		displayHandOnBoard();
	    		
        		Hand msgH = cardpile.dealcards(10);
        		msgH.sortHand();
    			msgH.setCommandLine("DEALCARDS");    
                sendMessage(clientList.get(0).getWriter(), msgH);
			}else if (num == 3 || num == 4){
	    		Hand serverh = cardpile.dealcards(7);
	    		serverHand = serverh;
	    		displayHandOnBoard();
	    		
				for(int i = 0; i<clientList.size(); i++){
            		Hand msgH = cardpile.dealcards(7);
            		msgH.sortHand();
        			msgH.setCommandLine("DEALCARDS");    
                    sendMessage(clientList.get(i).getWriter(), msgH);
				}
			}else if(num == 5 || num == 6){
	    		Hand serverh = cardpile.dealcards(6);
	    		serverHand = serverh;
	    		displayHandOnBoard();
				for(int i = 0; i<clientList.size(); i++){
            		Hand msgH = cardpile.dealcards(6);
            		msgH.sortHand();
        			msgH.setCommandLine("DEALCARDS");    
                    sendMessage(clientList.get(i).getWriter(), msgH);
				}
			}
			dealfromcardpile_button.setEnabled(true);
		}
    }
    
    /*
     * 
     * helps showing the cards in server_user's hands
     */
    
    private void displayHandOnBoard(){
    	serverHand.sortHand();
    	if(serverHand.sizeOfHand() == 0){
    		Card17.setIcon(new ImageIcon("b1fv.png"));
    		Card18.setIcon(new ImageIcon("b1fv.png"));
    		Card19.setIcon(new ImageIcon("b1fv.png"));
    		Card20.setIcon(new ImageIcon("b1fv.png"));
    		Card21.setIcon(new ImageIcon("b1fv.png"));
    		Card22.setIcon(new ImageIcon("b1fv.png"));
    		Card23.setIcon(new ImageIcon("b1fv.png"));
    		Card24.setIcon(new ImageIcon("b1fv.png"));
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 1){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(new ImageIcon("b1fv.png"));
    		Card19.setIcon(new ImageIcon("b1fv.png"));
    		Card20.setIcon(new ImageIcon("b1fv.png"));
    		Card21.setIcon(new ImageIcon("b1fv.png"));
    		Card22.setIcon(new ImageIcon("b1fv.png"));
    		Card23.setIcon(new ImageIcon("b1fv.png"));
    		Card24.setIcon(new ImageIcon("b1fv.png"));
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 2){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(new ImageIcon("b1fv.png"));
    		Card20.setIcon(new ImageIcon("b1fv.png"));
    		Card21.setIcon(new ImageIcon("b1fv.png"));
    		Card22.setIcon(new ImageIcon("b1fv.png"));
    		Card23.setIcon(new ImageIcon("b1fv.png"));
    		Card24.setIcon(new ImageIcon("b1fv.png"));
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 3){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(new ImageIcon("b1fv.png"));
    		Card21.setIcon(new ImageIcon("b1fv.png"));
    		Card22.setIcon(new ImageIcon("b1fv.png"));
    		Card23.setIcon(new ImageIcon("b1fv.png"));
    		Card24.setIcon(new ImageIcon("b1fv.png"));
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 4){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(serverHand.getCard(3).getIcon());
    		Card21.setIcon(new ImageIcon("b1fv.png"));
    		Card22.setIcon(new ImageIcon("b1fv.png"));
    		Card23.setIcon(new ImageIcon("b1fv.png"));
    		Card24.setIcon(new ImageIcon("b1fv.png"));
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 5){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(serverHand.getCard(3).getIcon());
    		Card21.setIcon(serverHand.getCard(4).getIcon());
    		Card22.setIcon(new ImageIcon("b1fv.png"));
    		Card23.setIcon(new ImageIcon("b1fv.png"));
    		Card24.setIcon(new ImageIcon("b1fv.png"));
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 6){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(serverHand.getCard(3).getIcon());
    		Card21.setIcon(serverHand.getCard(4).getIcon());
    		Card22.setIcon(serverHand.getCard(5).getIcon());
    		Card23.setIcon(new ImageIcon("b1fv.png"));
    		Card24.setIcon(new ImageIcon("b1fv.png"));
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 7){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(serverHand.getCard(3).getIcon());
    		Card21.setIcon(serverHand.getCard(4).getIcon());
    		Card22.setIcon(serverHand.getCard(5).getIcon());
    		Card23.setIcon(serverHand.getCard(6).getIcon());
    		Card24.setIcon(new ImageIcon("b1fv.png"));
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 8){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(serverHand.getCard(3).getIcon());
    		Card21.setIcon(serverHand.getCard(4).getIcon());
    		Card22.setIcon(serverHand.getCard(5).getIcon());
    		Card23.setIcon(serverHand.getCard(6).getIcon());
    		Card24.setIcon(serverHand.getCard(7).getIcon());
    		Card25.setIcon(new ImageIcon("b1fv.png"));
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 9){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(serverHand.getCard(3).getIcon());
    		Card21.setIcon(serverHand.getCard(4).getIcon());
    		Card22.setIcon(serverHand.getCard(5).getIcon());
    		Card23.setIcon(serverHand.getCard(6).getIcon());
    		Card24.setIcon(serverHand.getCard(7).getIcon());
    		Card25.setIcon(serverHand.getCard(8).getIcon());
    		Card26.setIcon(new ImageIcon("b1fv.png"));
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 10){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(serverHand.getCard(3).getIcon());
    		Card21.setIcon(serverHand.getCard(4).getIcon());
    		Card22.setIcon(serverHand.getCard(5).getIcon());
    		Card23.setIcon(serverHand.getCard(6).getIcon());
    		Card24.setIcon(serverHand.getCard(7).getIcon());
    		Card25.setIcon(serverHand.getCard(8).getIcon());
    		Card26.setIcon(serverHand.getCard(9).getIcon());
    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
    	}else if(serverHand.sizeOfHand() == 11){
    		Card17.setIcon(serverHand.getCard(0).getIcon());
    		Card18.setIcon(serverHand.getCard(1).getIcon());
    		Card19.setIcon(serverHand.getCard(2).getIcon());
    		Card20.setIcon(serverHand.getCard(3).getIcon());
    		Card21.setIcon(serverHand.getCard(4).getIcon());
    		Card22.setIcon(serverHand.getCard(5).getIcon());
    		Card23.setIcon(serverHand.getCard(6).getIcon());
    		Card24.setIcon(serverHand.getCard(7).getIcon());
    		Card25.setIcon(serverHand.getCard(8).getIcon());
    		Card26.setIcon(serverHand.getCard(9).getIcon());
    		CIHPCard11.setIcon(serverHand.getCard(10).getIcon());
    	}
		this.repaint();
    }
    
    
    public boolean checkStart(){
    	for(int i = 0; i< clientList.size(); i++){
    		if(!clientList.get(i).getUser().getisStart())
    			return false;
    	}
    	return true;
    }
    
    public int findClient(String clientname){
    	int num = -1;
    	for(int i = clientList.size()-1; i>=0; i--){
    		if(clientList.get(i).getUser().getName().equals(clientname)){
    			num = i;
    		}
    	}
    	return num;
    }
/******************************************************************************/   

//    }
    private void ConnectToServerPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectToServerPerformed

       // TODO add your handling code here:
      //This is for connect to server button action performed
    }//GEN-LAST:event_ConnectToServerPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartButtonActionPerformed

    private void DiscardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscardButtonActionPerformed

    private void ScoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreFieldActionPerformed

    private void CardLeftFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardLeftFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardLeftFieldActionPerformed

    /**
     * @param args the command line arguments
     */


//	 public static void main(String[] args) throws IOException {
//		      Server sally = new Server();
//
//			  JPanel pop_message = new JPanel();
//			  JTextField port = new JTextField(6);
//			  JTextField username = new JTextField(10);
//			  
//	          pop_message.add(Box.createVerticalStrut(30)); 
//			  pop_message.add(new JLabel("Port:"));
//			  pop_message.add(port);
//			  pop_message.add(new JLabel("Username: "));
//			  pop_message.add(username);
//			  int result = JOptionPane.showConfirmDialog(null, pop_message, 
//			               "Please Enter: ", JOptionPane.OK_CANCEL_OPTION);
//			      if (result == JOptionPane.OK_OPTION) {
//				      int portN = Integer.parseInt(port.getText());
//				      String name = username.getText();
//				      sally.setUsername(name);
//				      sally.listenSocket(portN);
//			      }
//			      else
//			    	  JOptionPane.showMessageDialog(null, "Input invalid!!");
//   }

	
}
