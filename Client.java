/**
 * This is a Client class created for the Rummy game
 * 
 * 
 */

import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class Client extends JFrame{
	
	
	/**
     * Creates new form Gui of Client
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
    private JTextField PortField;
    private JLabel PortLabel;
    private JLabel PortNumberFiled;
    private JTextField ScoreField;
    private JLabel ScoreLabel;
    private JButton SendMessage;
    private JButton StraightFlushButton;
    private JLabel StraightFlushLabel;
    private JPanel StraightFlushPane;
    private JButton StraightFlushPaneButton;
    private JPanel StraightFlushSet;
    private JMenuItem Winner_List;
    private JLabel cardPileLabel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JMenuItem jMenuItem1;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JMenu HelpMenu;
    private JTextField IPTextField;
    private JMenuItem LogIn;
    private JMenuItem Logout;
    private JLabel MainLabel;
    private JMenu MainMenu;
    private JMenuBar Menu;
    private JScrollPane OnlineField;
    private JLabel OnlineLabel;
    private JPanel DiscardPilePane;
    private JPanel DealPanel;
    private JButton ConnectButton;
    private JPanel ConnectPane;
    
	private JTextArea textarea;
	private JTextArea private_textarea;
	
    private JButton discard_button;
	private JButton button;
	private JButton dealcard_button;
	private JButton dealfromcardpile_button;
	private JButton dealfromdiscardpile_button;
	
	private JTextField userText;
	private JTextField chat_w_text;
	private JTextField chat_w_content;
	
	private JLabel chat_w_label;
	private JLabel chat_w_meglabel;
	private DefaultListModel listModel; 
	private JList userList;
	
	private JScrollPane left;
	private JScrollPane right;
    private JScrollPane private_chat_Panel;
	private JPanel south;
	private JPanel chat_w_Panel;
	private JPanel card_button_box;
	private JPanel north;
	

/**
 * data members to deal with game playing	
 */
    private boolean isConnected = false; 
    
	private Socket client;
	private ObjectOutputStream output;
	private ObjectInputStream input;
    private MessageWorker m;
    private Hand clientHand;
    private JButton tempButton;
    private int tempIndex;
    private int tempAllKindIndex = 0;
    private int tempStraightFlushIndex = 0;
    private ArrayList<JButton> tempStraightFlush;
	//Key--username, Value--User
	private Map<String, User> map = new HashMap<String, User>();
	private Hand SFHand = new Hand();
	private Hand AKHand = new Hand();
	
	//CONSTRUCTOR
	public Client(){
		initComponents();
		this.setVisible(true);
	}
	
	//Method to initialize the GUI
	private void initComponents(){
		//GUI          
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
        jTextField1 = new JTextField();
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
        CardPilePane = new JPanel();
        Card33 = new JButton();
        
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
        tempStraightFlush = new ArrayList<JButton>();
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");
        setBackground(new java.awt.Color(204, 204, 255));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1365, 720));
        getContentPane().setLayout(null);
        
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

 //       userText.setText("Message");
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
        SendMessage.setBounds(10, 480, 230, 32);
        SendMessage.addActionListener(new ActionListener(){
      	  public void actionPerformed(ActionEvent arg0){
          	send();
          }
        });
        
/*******************************************************************************/
        
//        ConnectPane.setBackground(new java.awt.Color(204, 204, 255));
//        ConnectPane.setLayout(null);
//        ConnectPane.add(IPTextField);
//        IPTextField.setBounds(16, 32, 85, 30);
//
//        PortNumberFiled.setText("IP Address");
//        ConnectPane.add(PortNumberFiled);
//        PortNumberFiled.setBounds(15, 11, 80, 14);
//
//        PortLabel.setText("Port Number");
//        ConnectPane.add(PortLabel);
//        PortLabel.setBounds(140, 10, 80, 14);
//        ConnectPane.add(PortField);
//        PortField.setBounds(135, 32, 80, 30);
//
////        jLabel1.setText("Name");
////        ConnectPane.add(jLabel1);
////        jLabel1.setBounds(247, 11, 50, 14);
////        ConnectPane.add(jTextField1);
////        jTextField1.setBounds(230, 32, 90, 30);
//
//        getContentPane().add(ConnectPane);
//        ConnectPane.setBounds(250, 40, 350, 80);
        
        
        userList.setEnabled(false);
//      OnlineTextArea.setColumns(20);
//      OnlineTextArea.setRows(5);
      OnlineField.setViewportView(userList);
//      OnlineTextArea.getAccessibleContext().setAccessibleName("ChatPane");

      getContentPane().add(OnlineField);
      OnlineField.setBorder(new TitledBorder("Online Users")); 
      OnlineField.setBounds(10, 40, 235, 96);

//      ConnectButton.setText("Connect");
//      getContentPane().add(ConnectButton);
//      ConnectButton.setBounds(630, 70, 100, 47);
//        
//        private_textarea = new JTextArea();
//        private_textarea.setEditable(false);
//        private_textarea.setForeground(Color.blue);
//	    private_textarea.setBackground(Color.PINK);
//	    private_textarea.setLineWrap(true);
        

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
     

      CardInHandPand.setBackground(new java.awt.Color(204, 204, 204));

      /***************************************************************************
       * Card in hand card17-card26 JLabel
       */
      Card17.setIcon(new ImageIcon("b1fv.png")); // NOI18N
//    Card17.setEnabled(false);
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
			tempIndex = 1;
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
      StraightFlushLabel.setForeground(new java.awt.Color(0, 0, 255));
      StraightFlushLabel.setText("Straight");
      getContentPane().add(StraightFlushLabel);
      StraightFlushLabel.setBounds(740, 120, 60, 30);

      StraightFlushSet.setBackground(new java.awt.Color(204, 204, 255));
      StraightFlushSet.setPreferredSize(new java.awt.Dimension(310, 105));

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

      AllKindSet.setBackground(new java.awt.Color(255, 255, 51));

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

      DiscardPilePane.setBackground(new java.awt.Color(255, 102, 102));
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
      jLabel3.setText("Discard Pile");
      getContentPane().add(jLabel3);
      jLabel3.setBounds(800, 10, 90, 30);

      cardPileLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      cardPileLabel.setForeground(new java.awt.Color(0, 0, 255));
      cardPileLabel.setText("Card Pile");
      getContentPane().add(cardPileLabel);
      cardPileLabel.setBounds(1150, 10, 70, 30);

      
      StraightFlushButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      StraightFlushButton.setForeground(new java.awt.Color(51, 51, 255));
      StraightFlushButton.setText("Straight Flush");
      getContentPane().add(StraightFlushButton);
      StraightFlushButton.setBounds(1090, 330, 150, 40);
      StraightFlushButton.getAccessibleContext().setAccessibleName("Straight FlushButton");
      StraightFlushButton.addActionListener(new ActionListener(){
      	public void actionPerformed(ActionEvent e){
//    		handleStraightFlushPane();
    		Melding SFmeld = new Melding();
			for(int i =0; i < SFHand.sizeOfHand(); i++){
				Card tempC = SFHand.getCard(i);
				System.out.println("SFHand :" + tempC.toString());
				SFmeld.addCard(tempC);
			}
    		Hand sendH = new Hand();
    		int meldtype = SFmeld.evaluateMelding();
    		if(meldtype == 2){
    			for(int i =0; i < SFHand.sizeOfHand(); i++){
    				Card tempC = SFHand.getCard(i);
    				int index = clientHand.findCard(tempC);
      				System.out.println("SFHand2 :" + tempC.toString());
    				sendH.addCard(clientHand.removeCard(index));
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
 
	            Hand cmdH = new Hand();
	            for(int j = 0; j < sendH.sizeOfHand(); j++){
	            	System.out.println("sendHand :" + sendH.getCard(j).toString());
	            	cmdH.addCard(sendH.getCard(j));
	            }
    			cmdH.setUsername(getTitle());
    			cmdH.setCommandLine("ADDTO_SF_PANE");
	            sendMessage(cmdH); 
	            
    		}
    		else{
      			AKHand.removeHand();
      			Card27.setIcon(new ImageIcon("b1fv.png"));
      			Card28.setIcon(new ImageIcon("b1fv.png"));
      			Card30.setIcon(new ImageIcon("b1fv.png"));
      			Card29.setIcon(new ImageIcon("b1fv.png"));
      			displayHandOnBoard();
		    	JOptionPane.showMessageDialog(null, "Not Straight Flush!!!");
    		}
    	}
    });

      
      AllkindButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      AllkindButton.setForeground(new java.awt.Color(102, 0, 255));
      AllkindButton.setText("All Kind");
      AllkindButton.addActionListener(new ActionListener(){
      	public void actionPerformed(ActionEvent e){
//      		handleStraightFlushPane();
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
      				int index = clientHand.findCard(tempC);
      				sendH.addCard(clientHand.removeCard(index));
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
  					AKPCard4.setIcon(AKHand.getCard(3).getIcon());
  		    		AKCard4.setIcon(new ImageIcon("b1fv.png"));
  				}
  				//Broadcast to public 
  	            Hand cmdH = new Hand();
  	            for(int j = 0; j < sendH.sizeOfHand(); j++){
  	            		cmdH.addCard(sendH.getCard(j));
  	            }
      			cmdH.setUsername(getTitle());
      			cmdH.setCommandLine("ADDTO_AK_PANE");
  	            sendMessage(cmdH); 
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
      //AllkindButton.setEnabled(false);
      AllkindButton.setBounds(1090, 160, 140, 40);
      AllkindButton.getAccessibleContext().setAccessibleName("AllKindButton");

      discard_button.setForeground(new java.awt.Color(255, 51, 0));
      discard_button.setText("Discard");
      discard_button.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
        	  tempButton.setIcon(new ImageIcon("b1fv.png"));
              Card c = clientHand.removeCard(tempIndex);
              DiscardPile.getInstance().addCard(c);
              Card33.setIcon(c.getIcon());
              Hand topcardH = new Hand();
              topcardH.setCommandLine("UPDATEDISCARDPILE");
              topcardH.addCard(c);
              topcardH.setUsername(getTitle());
              sendMessage(topcardH);
              displayHandOnBoard();    
              Hand cmdH = new Hand();
              cmdH.setCommandLine("DEALED");
              cmdH.setUsername(getTitle());
              sendMessage(cmdH);
              DiscardPile.getInstance().addCard(c);

          }
      });
      
      getContentPane().add(discard_button);
      discard_button.setBounds(100, 520, 70, 50);

      dealcard_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      dealcard_button.setForeground(new java.awt.Color(0, 153, 153));
      dealcard_button.setText("Start");  
      dealcard_button.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
        	  dealCards();
        	  dealcard_button.setEnabled(false);
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
          public void actionPerformed(ActionEvent evt) {
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
          public void actionPerformed(ActionEvent evt) {
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
      DealPanel.add(dealfromdiscardpile_button);
      
      getContentPane().add(DealPanel);
      DealPanel.setBounds(10, 570, 150, 90);

      AddToPanel.setBackground(new java.awt.Color(0, 153, 153));
      AddToPanel.setLayout(null);
      
      AllkindMeldingButton.setText("All Kind Melding");
      AllkindMeldingButton.setEnabled(false);
      AllkindMeldingButton.addActionListener(new ActionListener(){
      	public void actionPerformed(ActionEvent e){
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

      MainLabel.setIcon(new ImageIcon("pokerGun.png")); // NOI18N
      MainLabel.setPreferredSize(new java.awt.Dimension(1365, 720));
      getContentPane().add(MainLabel);
      MainLabel.setBounds(4, 4, 1350, 690);

      MainMenu.setText("Menu");

      Winner_List.setText("Winner List");
      MainMenu.add(Winner_List);

      LogIn.setText("Disconnect");
      LogIn.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
				closeConnect();
    	  }
      });
      MainMenu.add(LogIn);
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
      HelpMenu.add(jMenuItem1);
    jMenuItem1.setText("About");
    HelpMenu.add(jMenuItem1);
    jMenuItem1.addActionListener(new ActionListener(){
  	  public void actionPerformed(ActionEvent e){
  		  JOptionPane.showMessageDialog(null, "This is a Rummy Game created by:\nQian Wang\nAnthony Manetti\nPlaimanus Lueondee\nZe Li");
  	  }
    });
      Menu.add(HelpMenu);

      setJMenuBar(Menu);

      getAccessibleContext().setAccessibleName("");

      pack();
      

	      
	      listModel = new DefaultListModel();  
	      userList = new JList(listModel); 
	      

	      //How to show the screen in the middle of the computer screen
	      int screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;  
	      int screen_height = Toolkit.getDefaultToolkit().getScreenSize().height;  
	      setLocation((screen_width - getWidth()) / 2,  (screen_height - getHeight()) / 2); 
	      setResizable(false);
	      setVisible(true);
	      addWindowListener(new WindowListener(){

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
				if (isConnected) {
					closeConnect();
				}
				System.exit(0);
			}
	      });
	}
	
	/**
	 * helps dealing with straight flush
	 */
	  public void handleStraightFlush(){
	    	if(SFHand.sizeOfHand() == 0){
	    		Card27.setIcon(clientHand.getCard(tempIndex).getIcon());
	        	SFHand.addCard(clientHand.getCard(tempIndex));
	        	tempButton.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(SFHand.sizeOfHand() == 1){
	    		Card28.setIcon(clientHand.getCard(tempIndex).getIcon());
	        	SFHand.addCard(clientHand.getCard(tempIndex));
	        	tempButton.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(SFHand.sizeOfHand() == 2){
	    		Card30.setIcon(clientHand.getCard(tempIndex).getIcon());
	        	SFHand.addCard(clientHand.getCard(tempIndex));
	        	tempButton.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(SFHand.sizeOfHand() == 3){
	    		Card29.setIcon(clientHand.getCard(tempIndex).getIcon());
	        	SFHand.addCard(clientHand.getCard(tempIndex));
	        	tempButton.setIcon(new ImageIcon("b1fv.png"));
	    	}else{
	    		JOptionPane.showMessageDialog(null, "Invalid, Full Staight Flush Field!!");
	    	}
	    }
	  public void handleAllkindMelding(){
			if(AKHand.sizeOfHand() == 0){       		
				Card31.setIcon(clientHand.getCard(tempIndex).getIcon());
		    	AKHand.addCard(clientHand.getCard(tempIndex));
		    	tempButton.setIcon(new ImageIcon("b1fv.png"));
				}else if(AKHand.sizeOfHand() == 1){
				Card34.setIcon(clientHand.getCard(tempIndex).getIcon());
		    	AKHand.addCard(clientHand.getCard(tempIndex));
		    	tempButton.setIcon(new ImageIcon("b1fv.png"));
				}else if(AKHand.sizeOfHand() == 2){
					AKCard3.setIcon(clientHand.getCard(tempIndex).getIcon());
			    	AKHand.addCard(clientHand.getCard(tempIndex));
			    	tempButton.setIcon(new ImageIcon("b1fv.png"));
				}else if(AKHand.sizeOfHand() == 3){
					AKCard4.setIcon(clientHand.getCard(tempIndex).getIcon());
			    	AKHand.addCard(clientHand.getCard(tempIndex));
			    	tempButton.setIcon(new ImageIcon("b1fv.png"));
				}else{
					JOptionPane.showMessageDialog(null, "Invalid, Full AllKind Field!!");
				}
	    }

	 public void doCards(JButton b){
	    	if(isConnected){
	            AllkindMeldingButton.setEnabled(true);
	            AddtoStraightFlushButton.setEnabled(true);
	            AllKindPaneButton.setEnabled(true);
	            StraightFlushPaneButton.setEnabled(true); 
	            b.setSelected(true);
	            }
		    tempButton = b;
		    b.requestFocusInWindow();	
			    
		}
	
	 /**
	  * helps sending message to show the user is ready
	  */
	public void dealCards(){
		Hand cmdHand = new Hand();
		cmdHand.setCommandLine("DEALCARDS");
		cmdHand.setUsername(getTitle());
		sendMessage(cmdHand);
		Hand sendH = new Hand();
		sendH.setUsername(getTitle());
		sendH.setCommandLine("ALL");
		sendH.setMessage(" already start the game.");
		sendMessage(sendH);
		dealcard_button.setEnabled(false);
	}
	
	
	/**
	 *Helps dealing card from card pile
	 */
	public void dealFromCardPile(){
		if(CardPile.getInstance().sizeOfCardpiles() >= 1){
		Hand cmdHand = new Hand();
		cmdHand.setCommandLine("DEALFROMCARDPILE");		
		cmdHand.setUsername(getTitle());
//		cmdHand.addCard(CardPile.getInstance().dealcard());
		sendMessage(cmdHand);
		Hand sendH = new Hand();
		sendH.setUsername(getTitle());
		sendH.setCommandLine("ALL");
		sendH.setMessage(" deal one card from cardpile.");
		sendMessage(sendH);
		dealfromcardpile_button.setEnabled(false);
		dealfromdiscardpile_button.setEnabled(false);
		}else{
			dealfromcardpile_button.setEnabled(false);
		}
	}

	/**
	 * helps dealing from discard pile
	 */
	public void dealFromDiscardPile(){
		if(DiscardPile.getInstance().getSize() >= 1){
		Hand cmdHand = new Hand();
		cmdHand.setCommandLine("DEALFROMDISCARDPILE");
		cmdHand.setUsername(getTitle());
		sendMessage(cmdHand);
		Hand sendH = new Hand();
		sendH.setUsername(getTitle());
		sendH.setCommandLine("ALL");
		sendH.setMessage(" deal one card from discardpile.");
		sendMessage(sendH);
		dealfromcardpile_button.setEnabled(false);
		dealfromdiscardpile_button.setEnabled(false);
		}else{
			dealfromdiscardpile_button.setEnabled(false);
		}
	}
	
	/**
	 * helps reset the user name
	 * @param name
	 */
	public void setFramename(String name){
		setTitle(name);
		repaint();
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	
	public String dispatcherPrivateUsers(String str){
		String t = "";
		if(!str.isEmpty()){
		StringTokenizer stringtoken = new StringTokenizer(str, ", //@");
		while(stringtoken.hasMoreElements()){
			t += stringtoken.nextElement() + "/";
			}
		}
		return t;
	}
	
	/**
	 * method to deal with closing connection
	 *
	 */
	
	public synchronized void closeConnect() {
		try {
			Hand h = new Hand();
			h.setCommandLine("CLOSE");
			sendMessage(h);
			if (input != null) {
				input.close();
			}
			if (input != null) {
				input.close();
			}
			if (client!= null) {
				client.close();
			}
			isConnected = false;
		} catch (IOException e1) {
			e1.printStackTrace();
			isConnected = true;
		}
	}
	
	/**
	 * deal with message sending for chatting
	 */
	public void send() {
		if (!isConnected) {
			JOptionPane.showMessageDialog(this, "Not connected", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		String message = userText.getText().trim();
		if (message == null || message.equals("")) {
			JOptionPane.showMessageDialog(this,"No empty msg", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (message.equals("Bye.")){
			closeConnect();
		}
		Hand sendH = new Hand();
		sendH.setUsername(getTitle());
		sendH.setCommandLine("ALL");
		sendH.setMessage(message);
		sendMessage(sendH);
//		textarea.append("Me" + " : " + message + "\r\n");
		userText.setText(null);
	}
	
	public void sendPrivate(){
		if (!isConnected) {
			JOptionPane.showMessageDialog(this, "Not connected", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		String users = dispatcherPrivateUsers(chat_w_text.getText().trim());
		if(users == null || users.equals("")){
			JOptionPane.showMessageDialog(this, "No empty user", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		String message = chat_w_content.getText().trim();
		if (message == null || message.equals("")) {
			JOptionPane.showMessageDialog(this,"No empty msg", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (message.equals("Bye.")){
			closeConnect();
		}
		Hand prH = new Hand();
		prH.setUsername(getTitle());
		prH.setCommandLine("PRIVATE");
		prH.setClientList(users);
		prH.setMessage(message);
		sendMessage(prH);
		private_textarea.append("Me" + " : " + message + "\r\n");
		chat_w_content.setText(null);
	}
	
	public void sendMessage(Hand mesgH){
		try {
			output.writeObject(mesgH);
			output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * helps connect with the server
	 * @param hostIP
	 * @param port
	 * @param name
	 */
	
	public void listenSocket(String hostIP, int port, String name){
        System.out.println("Establishing connection. Please wait ...");
        try
        {
        	client = new Socket(hostIP, port);
            System.out.println("Connected: " + client);
            
            output = new ObjectOutputStream(client.getOutputStream());
            input =  new ObjectInputStream(client.getInputStream());
            
            Hand userH = new Hand();
            userH.setUsername(name);
            userH.setIPaddress(client.getLocalAddress().toString());
            System.out.println(userH.getUsername() + userH.getIPaddress() + "trying to connect to server!");

			sendMessage(userH);
			this.setFramename(name);
			m = new MessageWorker(input, textarea);
			m.start();
			isConnected = true;
        }
        catch(UnknownHostException uhe)
        {
			textarea.append("Port: " + port + "    IP address: " + hostIP
					+ "   Host unknown." + "\r\n");
			isConnected = false;
        }
        catch(IOException ioe)
        {
			textarea.append("Port: " + port + "    IP address: " + hostIP+ "   fails to connect." + "\r\n");
			isConnected = false;
        }            
	}
	
	private class MessageWorker extends Thread{
		private ObjectInputStream inV;
		private JTextArea txtV;

		public MessageWorker(ObjectInputStream in, JTextArea txt) {
			inV = in;
			txtV = txt;
		}

		public synchronized void closeConnection(){
			listModel.removeAllElements();
			try {
				Hand h = new Hand();
				h.setCommandLine("CLOSE");
				sendMessage(h);
				if (inV != null) {
					inV.close();
				}
				if (inV != null) {
					inV.close();
				}
				if (client!= null) {
					client.close();
				}
				isConnected = false;
			} catch (IOException e1) {
				e1.printStackTrace();
				isConnected = true;
			}
		}

		public void run() {
			Hand line = null;
			while (true) {
				try {
					line = (Hand) inV.readObject();
					//command line always sent as the marker character
					String command = line.getCommandLine();
					if(command == null){
						continue;
					}
					else if (command.equals("CLOSE"))
					{
						txtV.append("Server shut.\r\n");
						closeConnection();
						return;
					} else if (command.equals("ADD")) {
						String username = "";
						String userIP = "";
						if ((username = line.getUsername()) != null
								&& (userIP = line.getIPaddress()) != null) {
							User user = new User(username, userIP);
							map.put(username, user);
							listModel.addElement(username);
						}
					} else if (command.equals("DELETE")) {
						String username = line.getUsername();
						User user = (User) map.get(username);
						map.remove(user);
						listModel.removeElement(username);
					} else if (command.equals("USERLIST")) {
						int size = Integer.parseInt(line.getClientSize());
						String username = null;
						String userIp = null;
						StringTokenizer strtoken = new StringTokenizer(line.getClientList(), "/@");
						for (int i = 0; i < size; i++) {
							username = strtoken.nextToken();
							userIp = strtoken.nextToken();
							User user = new User(username, userIp);
							map.put(username, user);
							listModel.addElement(username);
						}
					} else if(command.equals("PRIVATE")){
						private_textarea.append(line.getUsername() + " : " + line.getMessage() + "\r\n");
					} else if(command.equals("DEALCARDS")){
						clientHand = line;
						displayHandOnBoard();
					} else if(command.equals("DEALED")){
						dealfromcardpile_button.setEnabled(true);
						dealfromdiscardpile_button.setEnabled(true);
					}else if(command.equals("DEALFROMCARDPILE")){
						clientHand.addCard(line.getCard(0));
						displayHandOnBoard();
					}else if(command.equals("UPDATEDISCARDPILE")){
						Card c;
						c = line.getCard(0); //new topcard for discardpile.
		                Card33.setIcon(c.getIcon());
					}else if(command.equals("EMPTY_DIS")){
						Card33.setIcon(new ImageIcon("b1fv.png"));
					}else if(command.equals("ADDTO_SF_PANE")){
						if(line.sizeOfHand() == 3){
	    		    		Card5.setIcon(line.getCard(0).getIcon());
	    		    		Card6.setIcon(line.getCard(1).getIcon());
	    		    		Card7.setIcon(line.getCard(2).getIcon());
						}
						if(line.sizeOfHand() == 4){
							SFPCard4.setIcon(line.getCard(3).getIcon());
						}
					}else if(command.equals("ADDTO_AK_PANE")){
						if(line.sizeOfHand() == 3){
	    		    		AKPCard1.setIcon(line.getCard(0).getIcon());
	    		    		AKPCard2.setIcon(line.getCard(1).getIcon());
	    		    		AKPCard3.setIcon(line.getCard(2).getIcon());
						}
						if(line.sizeOfHand() == 4){
							AKPCard4.setIcon(line.getCard(3).getIcon());
						}
					}else {
						txtV.append(line.getUsername() + " : " + line.getMessage() + "\r\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
//	public Hand sortHand(Hand h)
//	{
//		//build a new array list and deleting one maxCard element from the handlist to the new list
//		//sort the the hand according the the rank and the suit sort only for the neat
//		Hand h2 = new Hand();
//		Card maxCard;
//		while (h.sizeOfHand() > 0)
//		{
//			maxCard = h.getCard(0);
//			for(int i = 1; i < h.sizeOfHand(); i++)
//			{
//				if(h.getCard(i).getRank().compareTo(maxCard.getRank()) > 0 
//						|| h.getCard(i).getRank().compareTo(maxCard.getRank()) == 0 
//						&& h.getCard(i).getSuit().compareTo(maxCard.getSuit()) > 0)
//				{
//					maxCard = h.getCard(i);
//				}
//			} 
//			h.removeCard(h.findCard(maxCard));
//		    h2.addCard(maxCard);
//		}
//		
//		return h2;
//	}
	
	/**
	 * helps showing the cards in the players hands
	 * 
	 */
	   private void displayHandOnBoard(){
		   System.out.println(clientHand.displayHand());		    
	       clientHand.sortHand();
	       System.out.println(clientHand.displayHand());	
	    	
	    	if(clientHand.sizeOfHand() == 0){
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
	    	}else if(clientHand.sizeOfHand() == 1){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
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
	    	}else if(clientHand.sizeOfHand() == 2){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(new ImageIcon("b1fv.png"));
	    		Card20.setIcon(new ImageIcon("b1fv.png"));
	    		Card21.setIcon(new ImageIcon("b1fv.png"));
	    		Card22.setIcon(new ImageIcon("b1fv.png"));
	    		Card23.setIcon(new ImageIcon("b1fv.png"));
	    		Card24.setIcon(new ImageIcon("b1fv.png"));
	    		Card25.setIcon(new ImageIcon("b1fv.png"));
	    		Card26.setIcon(new ImageIcon("b1fv.png"));
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 3){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(new ImageIcon("b1fv.png"));
	    		Card21.setIcon(new ImageIcon("b1fv.png"));
	    		Card22.setIcon(new ImageIcon("b1fv.png"));
	    		Card23.setIcon(new ImageIcon("b1fv.png"));
	    		Card24.setIcon(new ImageIcon("b1fv.png"));
	    		Card25.setIcon(new ImageIcon("b1fv.png"));
	    		Card26.setIcon(new ImageIcon("b1fv.png"));
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 4){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(clientHand.getCard(3).getIcon());
	    		Card21.setIcon(new ImageIcon("b1fv.png"));
	    		Card22.setIcon(new ImageIcon("b1fv.png"));
	    		Card23.setIcon(new ImageIcon("b1fv.png"));
	    		Card24.setIcon(new ImageIcon("b1fv.png"));
	    		Card25.setIcon(new ImageIcon("b1fv.png"));
	    		Card26.setIcon(new ImageIcon("b1fv.png"));
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 5){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(clientHand.getCard(3).getIcon());
	    		Card21.setIcon(clientHand.getCard(4).getIcon());
	    		Card22.setIcon(new ImageIcon("b1fv.png"));
	    		Card23.setIcon(new ImageIcon("b1fv.png"));
	    		Card24.setIcon(new ImageIcon("b1fv.png"));
	    		Card25.setIcon(new ImageIcon("b1fv.png"));
	    		Card26.setIcon(new ImageIcon("b1fv.png"));
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 6){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(clientHand.getCard(3).getIcon());
	    		Card21.setIcon(clientHand.getCard(4).getIcon());
	    		Card22.setIcon(clientHand.getCard(5).getIcon());
	    		Card23.setIcon(new ImageIcon("b1fv.png"));
	    		Card24.setIcon(new ImageIcon("b1fv.png"));
	    		Card25.setIcon(new ImageIcon("b1fv.png"));
	    		Card26.setIcon(new ImageIcon("b1fv.png"));
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 7){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(clientHand.getCard(3).getIcon());
	    		Card21.setIcon(clientHand.getCard(4).getIcon());
	    		Card22.setIcon(clientHand.getCard(5).getIcon());
	    		Card23.setIcon(clientHand.getCard(6).getIcon());
	    		Card24.setIcon(new ImageIcon("b1fv.png"));
	    		Card25.setIcon(new ImageIcon("b1fv.png"));
	    		Card26.setIcon(new ImageIcon("b1fv.png"));
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 8){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(clientHand.getCard(3).getIcon());
	    		Card21.setIcon(clientHand.getCard(4).getIcon());
	    		Card22.setIcon(clientHand.getCard(5).getIcon());
	    		Card23.setIcon(clientHand.getCard(6).getIcon());
	    		Card24.setIcon(clientHand.getCard(7).getIcon());
	    		Card25.setIcon(new ImageIcon("b1fv.png"));
	    		Card26.setIcon(new ImageIcon("b1fv.png"));
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 9){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(clientHand.getCard(3).getIcon());
	    		Card21.setIcon(clientHand.getCard(4).getIcon());
	    		Card22.setIcon(clientHand.getCard(5).getIcon());
	    		Card23.setIcon(clientHand.getCard(6).getIcon());
	    		Card24.setIcon(clientHand.getCard(7).getIcon());
	    		Card25.setIcon(clientHand.getCard(8).getIcon());
	    		Card26.setIcon(new ImageIcon("b1fv.png"));
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 10){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(clientHand.getCard(3).getIcon());
	    		Card21.setIcon(clientHand.getCard(4).getIcon());
	    		Card22.setIcon(clientHand.getCard(5).getIcon());
	    		Card23.setIcon(clientHand.getCard(6).getIcon());
	    		Card24.setIcon(clientHand.getCard(7).getIcon());
	    		Card25.setIcon(clientHand.getCard(8).getIcon());
	    		Card26.setIcon(clientHand.getCard(9).getIcon());
	    		CIHPCard11.setIcon(new ImageIcon("b1fv.png"));
	    	}else if(clientHand.sizeOfHand() == 11){
	    		Card17.setIcon(clientHand.getCard(0).getIcon());
	    		Card18.setIcon(clientHand.getCard(1).getIcon());
	    		Card19.setIcon(clientHand.getCard(2).getIcon());
	    		Card20.setIcon(clientHand.getCard(3).getIcon());
	    		Card21.setIcon(clientHand.getCard(4).getIcon());
	    		Card22.setIcon(clientHand.getCard(5).getIcon());
	    		Card23.setIcon(clientHand.getCard(6).getIcon());
	    		Card24.setIcon(clientHand.getCard(7).getIcon());
	    		Card25.setIcon(clientHand.getCard(8).getIcon());
	    		Card26.setIcon(clientHand.getCard(9).getIcon());
	    		CIHPCard11.setIcon(clientHand.getCard(10).getIcon());
	    	}
			this.repaint();
	    }
	
//	public static void main(String[] args) throws IOException{
//	      Client c = new Client();
//		  JPanel pop_message = new JPanel();
//		  JTextField ip = new JTextField("127.0.0.1");
//		  JTextField port = new JTextField("2222");
//		  JTextField username = new JTextField("d");
//		  
//		  pop_message.add(new JLabel("IP:"));
//		  pop_message.add(ip);
//          pop_message.add(Box.createVerticalStrut(30)); 
//		  pop_message.add(new JLabel("Port:"));
//		  pop_message.add(port);
//		  pop_message.add(new JLabel("Username: "));
//		  pop_message.add(username);
//		  int result = JOptionPane.showConfirmDialog(null, pop_message, 
//		               "Please Enter: ", JOptionPane.OK_CANCEL_OPTION);
//		      if (result == JOptionPane.OK_OPTION) {
//			      String address = ip.getText();
//			      int portN = Integer.parseInt(port.getText());
//			      String name = "Client Mode: "+username.getText();
//			      c.listenSocket(address, portN, name);
//		      }
//		      else
//		    	  JOptionPane.showMessageDialog(null, "Input invalid!!");
//		
//		//RummyClient c = new RummyClient();
//	      
//	}
}