import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JRadioButton;

public class pouls{
    private ImageIcon background_Imagessssss;
    private Icon background_Imagesssss;
    
    pouls(){
        JFrame frame = new JFrame();
        frame.setSize(1500,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JPanel login = new JPanel();
        login.setSize(300,400);
        login.setBackground(Color.WHITE);
        login.setLayout(null);
        login.setBounds(350, 170, 700, 400);
        ImageIcon background_Imageskk = new ImageIcon("puls.jpg.png");
        Image ll = background_Imageskk.getImage();
        Image temp_imgs = ll.getScaledInstance(400,400,Image.SCALE_SMOOTH);
        background_Imageskk = new ImageIcon(temp_imgs);
        JLabel backgroundd = new JLabel("",background_Imageskk,JLabel.CENTER);
        backgroundd.setBounds(0,30,300,300);
        backgroundd.setVisible(true);
        login.add(backgroundd);
        
        JTextField username = new JTextField("");
        username.setBounds(320,60,300,40);
        login.add(username);
        
        JPasswordField t = new JPasswordField("");
        t.setBounds(320,180,300,40);
        login.add(t);
        JLabel name = new JLabel("NID :");
        name.setBounds(320,22,100,50);
        name.setFont(new Font("Dialog",Font.PLAIN,18));
        name.setVisible(true);
        login.add(name);
        JLabel nam = new JLabel("Password :");
        nam.setBounds(320,140,100,50);
        nam.setFont(new Font("Dialog",Font.PLAIN,18));
        nam.setVisible(true);
        login.add(nam);
        ImageIcon background_Image = new ImageIcon("oo.jpg");
        Image img = background_Image.getImage();
        Image temp_img = img.getScaledInstance(1700,1200,Image.SCALE_SMOOTH);
        background_Image = new ImageIcon(temp_img);
        JLabel background = new JLabel("",background_Image, JLabel.CENTER);
        background.setBounds(0,0,1400,750);
        frame.add(background);

        background.setVisible(true);
        background.add(login);
        

        JButton button1 = new JButton();
        button1.setBounds(430, 260, 85, 30);
        button1.setText("Login");
        button1.setFocusable(false);
        button1.setEnabled(false);
        button1.setEnabled(false);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        login.add(button1);
        button1.addActionListener(w -> {
            JFrame framest = new JFrame();
            framest.setSize(1500,1000);
            framest.setVisible(true);
        });
        DocumentListener documentListenerr = new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                checkText();
            }
            public void removeUpdate(DocumentEvent e) {
                checkText();
            }
            public void insertUpdate(DocumentEvent e) {
                checkText();
            }
            public void checkText() {
                String text1 = username.getText();
                char[] password1 = t.getPassword();
                if (text1.isEmpty() || password1.length == 0) {
                    button1.setEnabled(false);
                } else {
                    button1.setEnabled(true);
                }
                
            }
            
        };
        t.getDocument().addDocumentListener(documentListenerr);
        username.getDocument().addDocumentListener(documentListenerr);
        button1.setHorizontalTextPosition(JButton.CENTER);
        button1.setVerticalTextPosition(JButton.BOTTOM);
        button1.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.setVisible(true);
        System.out.println("login success");
        JButton button2 = new JButton();
        button2.setBounds(350, 300, 120, 30);
        button2.setText("Doctor register");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFocusable(false);
        login.add(button2);
        button2.addActionListener(e -> {
            JFrame frames = new JFrame();
            frames.setSize(1500,1000);
            frames.setVisible(true);
            frames.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ImageIcon background_Imagessd = new ImageIcon("oo.jpg");
        Image imgs = background_Imagessd.getImage();
        Image temp_imgss = imgs.getScaledInstance(1500,1200,Image.SCALE_SMOOTH);
        background_Imagessd= new ImageIcon(temp_imgss);
        JLabel backgrounds = new JLabel("",background_Imagessd, JLabel.CENTER);
        backgrounds.setBounds(0,0,1400,900);
        frames.add(backgrounds);

        JPanel loginndd = new JPanel();
        loginndd.setSize(700,700);
        loginndd.setBackground(Color.WHITE);
        loginndd.setLayout(null);
        loginndd.setBounds(170, 50,1000, 650);
        loginndd.setVisible(true);
        frames.add(loginndd);
        backgrounds.add(loginndd);
        JButton selectImageButton = new JButton("Choose Image");
        selectImageButton.setBounds(580, 560, 120, 30);
        selectImageButton.setFocusable(false);
        
        selectImageButton.setVerticalTextPosition(JButton.BOTTOM);
        selectImageButton.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        selectImageButton.setBackground(Color.WHITE);
        selectImageButton.setBorder(BorderFactory.createEtchedBorder());
        loginndd.add(selectImageButton);
selectImageButton.addActionListener(l -> {
    // Create a file chooser dialog
    JFileChooser fileChooser = new JFileChooser();
    // Set the file filter to show only image files
    fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
        public boolean accept(java.io.File f) {
            return f.getName().toLowerCase().endsWith(".jpg") || f.getName().toLowerCase().endsWith(".jpeg") 
                   || f.getName().toLowerCase().endsWith(".png") || f.isDirectory();
        }
        public String getDescription() {
            return "Image files (*.jpg, *.jpeg, *.png)";
        }
    });
    // Show the file chooser dialog and get the selected file
    int result = fileChooser.showOpenDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        java.io.File selectedFile = fileChooser.getSelectedFile();
        // Do something with the selected file
        System.out.println("Selected image file: " + selectedFile.getAbsolutePath());
    }
});
// Add the button to a container
// ...
JLabel ldr = new JLabel("Doctor image :");
ldr.setBounds(440,550,150,50);
ldr.setFont(new Font("Dialog",Font.PLAIN,18));
loginndd.add(ldr);
        JButton bla = new JButton();
        bla.setBounds(100, 0, 0, 0);
        loginndd.add(bla);
        ImageIcon background_Imagesnd = new ImageIcon("docto.png");
        Image llllllsl = background_Imagesnd.getImage();
        Image temp_imgsbn = llllllsl.getScaledInstance(400,720,Image.SCALE_SMOOTH);
        background_Imagesnd = new ImageIcon(temp_imgsbn);
        JLabel backgroundddf = new JLabel("",background_Imagesnd, JLabel.CENTER);
        backgroundddf.setBounds(0,0,400,720);
        loginndd.add(backgroundddf);
        JLabel labeldn = new JLabel("Register:");
        labeldn.setBounds(670,26,100,50);
        labeldn.setFont(new Font("Dialog",Font.PLAIN,20));
        loginndd.add(labeldn);
        JLabel labeldnn = new JLabel("First Name :");
        labeldnn.setBounds(440,100,150,50);
        labeldnn.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnn);
        JLabel labeldnnn = new JLabel("Last Name :");
        labeldnnn.setBounds(440,150,150,50);
        labeldnnn.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnnn);
        JLabel labeldnnnn = new JLabel("Email :");
        labeldnnnn.setBounds(440,200,150,50);
        labeldnnnn.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnnnn);
        JLabel labeldnnnnn = new JLabel("Password :");
        labeldnnnnn.setBounds(440,250,150,50);
        labeldnnnnn.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnnnnn);
        JLabel labeldnns = new JLabel("NID :");
        labeldnns.setBounds(440,300,150,50);
        labeldnns.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnns);
        JLabel labeldnnf = new JLabel("Contact no :");
        labeldnnf.setBounds(440,350,150,50);
        labeldnnf.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnnf);
        JLabel labeldnnh = new JLabel("Gender :");
        labeldnnh.setBounds(440,400,150,50);
        labeldnnh.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnnh);
        JLabel labeldnng = new JLabel("Degree :");
        labeldnng.setBounds(440,450,150,50);
        labeldnng.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnng);
        JLabel labeldnnl = new JLabel("Specialist :");
        labeldnnl.setBounds(440,500,150,50);
        labeldnnl.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndd.add(labeldnnl);
        ButtonGroup bt = new ButtonGroup();
        JRadioButton bb = new JRadioButton("Male");
        bb.setBounds(580,417,70,20);
        bb.setFocusable(false);
        bb.setFont(new Font("Dialog",Font.PLAIN,18));
        bt.add(bb);
        loginndd.add(bb);
        JRadioButton pizzRadioButtonnd = new JRadioButton("Female");
        pizzRadioButtonnd.setBounds(670,417,90,20);
        pizzRadioButtonnd.setFocusable(false);
        pizzRadioButtonnd.setFont(new Font("Dialog",Font.PLAIN,18));
        bt.add(pizzRadioButtonnd);
        loginndd.add(pizzRadioButtonnd);
        JTextField passworddn = new JTextField("");
        passworddn.setBounds(580,110,250,30);
        
        loginndd.add(passworddn);
        
        JTextField passwordsn = new JTextField("");
        passwordsn.setBounds(580,160,250,30);
        loginndd.add(passwordsn);
        JTextField passwordkn = new JTextField("");
        passwordkn.setBounds(580,210,250,30);
        loginndd.add(passwordkn);
        JPasswordField passwordnf = new JPasswordField("");
        passwordnf.setBounds(580,260,250,30);
        loginndd.add(passwordnf);
        JTextField passwordng = new JTextField("");
        passwordng.setBounds(580,310,250,30);
        loginndd.add(passwordng);
        JTextField passwordne = new JTextField("");
        passwordne.setBounds(580,360,250,30);
        loginndd.add(passwordne);
        JTextField passwordnr = new JTextField("");
        passwordnr.setBounds(650,410,250,30);
        
        JTextField passwordnw = new JTextField("");
        passwordnw.setBounds(580,460,250,30);
        loginndd.add(passwordnw);
        JTextField passwordnww = new JTextField("");
        passwordnww.setBounds(580,510,250,30);
        loginndd.add(passwordnww);
        JButton buttonq = new JButton();
        buttonq.setBounds(820, 550, 80, 30);
        buttonq.setText("Sign up");
        buttonq.setFocusable(false);
        buttonq.setBackground(Color.BLACK);
        buttonq.setForeground(Color.WHITE); 
        
        buttonq.setHorizontalTextPosition(JButton.CENTER);  
        buttonq.setVerticalTextPosition(JButton.BOTTOM);
        buttonq.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonq.setEnabled(false);
        
        buttonq.setBorder(BorderFactory.createEtchedBorder());
        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                checkText();
            }
            public void removeUpdate(DocumentEvent e) {
                checkText();
            }
            public void insertUpdate(DocumentEvent e) {
                checkText();
            }
            public void checkText() {
                String text1 = passworddn.getText();
                String text2 = passwordkn.getText();
                String text3 = passwordsn.getText();
                String text4 = passwordne.getText();
                String text5 = passwordng.getText();
                
                String text7 = passwordnw.getText();
                
                char[] password12 = passwordnf.getPassword();
                String text13 = passwordnww.getText();
                
                if (text1.isEmpty() || text2.isEmpty() || text3.isEmpty() || text4.isEmpty() || text5.isEmpty() || text7.isEmpty() ||  password12.length == 0 ||text13.isEmpty()) {
                    buttonq.setEnabled(false);
                    
                } else {
                    buttonq.setEnabled(true);
                }
                
          }
        
        };
        
        passwordnf.getDocument().addDocumentListener(documentListener);
        passworddn.getDocument().addDocumentListener(documentListener);
        passwordkn.getDocument().addDocumentListener(documentListener);
        passwordsn.getDocument().addDocumentListener(documentListener);
        passwordne.getDocument().addDocumentListener(documentListener);
        passwordng.getDocument().addDocumentListener(documentListener);
        passwordnw.getDocument().addDocumentListener(documentListener);
        passwordnww.getDocument().addDocumentListener(documentListener);
    
       
        buttonq.addActionListener(q -> {
            JFrame gg = new JFrame();
            gg.setSize(1500,1000);
            gg.setVisible(true);
            ImageIcon background_Imagessqr = new ImageIcon("oo.jpg");
        Image imgsrq = background_Imagessqr.getImage();
        Image temp_imgssm = imgsrq.getScaledInstance(1500,1200,Image.SCALE_SMOOTH);
        background_Imagessqr = new ImageIcon(temp_imgssm);
        JLabel backgroundees = new JLabel("",background_Imagessqr, JLabel.CENTER);
        backgroundees.setBounds(0,0,1400,900);
        gg.add(backgroundees);
        JPanel p = new JPanel();
        p.setSize(700,700);
        p.setBackground(Color.WHITE);
        p.setLayout(null);
        p.setBounds(220, 80,920, 580);
        p.setVisible(true);
        
        gg.add(p);
        backgroundees.add(p);
        JButton buttonw = new JButton();
        buttonw.setBounds(260, 430, 150, 30);
        buttonw.setText("View Patient Details");
        buttonw.setFocusable(false);
        buttonw.setHorizontalTextPosition(JButton.CENTER);
        buttonw.setVerticalTextPosition(JButton.BOTTOM);
        buttonw.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonw.setBackground(Color.BLACK);
        buttonw.setForeground(Color.WHITE);
        buttonw.setBorder(BorderFactory.createEtchedBorder());
        p.add(buttonw);
        JButton buttonwe = new JButton();
        buttonwe.setBounds(420, 430, 130, 30);
        buttonwe.setText("Add New Patient");
        buttonwe.setFocusable(false);
        buttonwe.setHorizontalTextPosition(JButton.CENTER);
        buttonwe.setVerticalTextPosition(JButton.BOTTOM);
        buttonwe.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonwe.setBackground(Color.BLACK);
        buttonwe.setForeground(Color.WHITE);
        buttonwe.setBorder(BorderFactory.createEtchedBorder());
        p.add(buttonwe);
        JButton buttonwee = new JButton();
        buttonwee.setBounds(770, 530, 110, 30);
        buttonwee.setText("Log Out");
        buttonwee.setFocusable(false);
        buttonwee.setHorizontalTextPosition(JButton.CENTER);
        buttonwee.setVerticalTextPosition(JButton.BOTTOM);
        buttonwee.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonwee.setBackground(Color.BLACK);
        buttonwee.setForeground(Color.WHITE);
        buttonwee.setBorder(BorderFactory.createEtchedBorder());
        p.add(buttonwee);
        JPanel pp = new JPanel();
        pp.setSize(320,700);
        pp.setBackground(Color.WHITE);
        pp.setLayout(null);
        pp.setBounds(30, 30,320, 320);
        pp.setVisible(true);
        pp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        p.add(pp);
        JLabel esam = new JLabel("Doctor");
        esam.setBounds(100,260,150,50);
        esam.setFont(new Font("Dialog",Font.PLAIN,35));
        pp.add(esam);
        JLabel esamm = new JLabel("Name :");
        esamm.setBounds(20,200,150,50);
        esamm.setFont(new Font("Dialog",Font.PLAIN,18));
        pp.add(esamm);
        JPanel ppp = new JPanel();
        ppp.setSize(300,700);
        ppp.setBackground(Color.WHITE);
        ppp.setLayout(null);
        ppp.setBounds(360, 30,530, 320);
        ppp.setVisible(true);
        ppp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p.add(ppp);
        JLabel esammm = new JLabel("NID");
        esammm.setBounds(50,30,150,50);
        esammm.setFont(new Font("Dialog",Font.PLAIN,18));
        ppp.add(esammm);
        JLabel esammmM = new JLabel("Gender");
        esammmM.setBounds(220,30,150,50);
        esammmM.setFont(new Font("Dialog",Font.PLAIN,18));
        ppp.add(esammmM);
        JLabel esammmMm = new JLabel("Contact no");
        esammmMm.setBounds(390,30,150,50);
        esammmMm.setFont(new Font("Dialog",Font.PLAIN,18));
        ppp.add(esammmMm);
        ImageIcon background_Imagesnjt = new ImageIcon("hj.png");
        Image lllllllhk = background_Imagesnjt.getImage();
        Image temp_imgsnyy = lllllllhk.getScaledInstance(550,20,Image.SCALE_SMOOTH);
        background_Imagesssss = new ImageIcon(temp_imgsnyy);
        JLabel backgroundddru = new JLabel("",background_Imagesssss, JLabel.CENTER);
        backgroundddru.setBounds(20,110,490,20);
        ppp.add(backgroundddru);
        JLabel esammmMmm = new JLabel("Degree");
        esammmMmm.setBounds(50,150,150,50);
        esammmMmm.setFont(new Font("Dialog",Font.PLAIN,18));
        ppp.add(esammmMmm);
        JLabel esammmMmmm = new JLabel("Specialist");
        esammmMmmm.setBounds(220,150,150,50);
        esammmMmmm.setFont(new Font("Dialog",Font.PLAIN,18));
        ppp.add(esammmMmmm);
        ImageIcon background_Imagesnjtt = new ImageIcon("hj.png");
        Image lllllllhkk = background_Imagesnjtt.getImage();
        Image temp_imgsnyyy = lllllllhkk.getScaledInstance(550,20,Image.SCALE_SMOOTH);
        background_Imagesssss = new ImageIcon(temp_imgsnyyy);
        JLabel backgroundddruu = new JLabel("",background_Imagesssss, JLabel.CENTER);
        backgroundddruu.setBounds(20,220,490,20);
        ppp.add(backgroundddruu);
        JLabel esammmMmmmm = new JLabel("Email");
        esammmMmmmm.setBounds(50,250,150,50);
        esammmMmmmm.setFont(new Font("Dialog",Font.PLAIN,18));
        ppp.add(esammmMmmmm);
        loginndd.add(buttonq);
        
        });
        JButton buttonw = new JButton();
        buttonw.setBounds(880, 600, 80, 30);
        buttonw.setText("Back");
        buttonw.setFocusable(false);
        buttonw.setHorizontalTextPosition(JButton.CENTER);
        buttonw.setVerticalTextPosition(JButton.BOTTOM);
        buttonw.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonw.setBackground(Color.BLACK);
        buttonw.setForeground(Color.WHITE);
        buttonw.setVisible(true);
        buttonw.setBorder(BorderFactory.createEtchedBorder());
        
        loginndd.add(buttonw);
        loginndd.add(buttonq);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frames.setVisible(true);
            }
        });
        buttonw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frames.setVisible(false);
                frame.setVisible(true);
            }
        });
    });
    
        button2.setHorizontalTextPosition(JButton.CENTER);
        button2.setVerticalTextPosition(JButton.BOTTOM);
        button2.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.setVisible(true);
        
        JButton button3 = new JButton();
        button3.setBounds(480, 300, 120, 30);
        button3.setText("User register");
        button3.setFocusable(false);
        login.add(button3);
        button3.addActionListener(e -> {
        JFrame framess = new JFrame();
        framess.setSize(1500,1000);
        framess.setVisible(true);
        JRadioButton pizzRadioButton = new JRadioButton("I have any major operation");
        pizzRadioButton.setBounds(470,505,237,20);
        pizzRadioButton.setFocusable(false);
        pizzRadioButton.setFont(new Font("Dialog",Font.PLAIN,18));
        JRadioButton pizzRadioButtonn = new JRadioButton("I have Diabetics");
        pizzRadioButtonn.setBounds(470,545,155,20);
        pizzRadioButtonn.setFocusable(false);
        pizzRadioButtonn.setFont(new Font("Dialog",Font.PLAIN,18));
        JLabel label = new JLabel("Register:");
        label.setBounds(700,26,100,50);
        label.setFont(new Font("Dialog",Font.PLAIN,20));
        JLabel labe = new JLabel("NID:");
        labe.setBounds(360,100,100,50);
        labe.setFont(new Font("Dialog",Font.PLAIN,18));
        JLabel lab = new JLabel("First Name:");
        lab.setBounds(360,160,100,50);
        lab.setFont(new Font("Dialog",Font.PLAIN,18));
        JLabel la = new JLabel("last Name:");
        la.setBounds(360,220,100,50);
        la.setFont(new Font("Dialog",Font.PLAIN,18));
        JLabel ld = new JLabel("Gender:");
        ld.setBounds(360,280,100,50);
        ld.setFont(new Font("Dialog",Font.PLAIN,18));
        JLabel llb = new JLabel("Date Of Birth:");
        llb.setBounds(360,340,120,50);
        llb.setFont(new Font("Dialog",Font.PLAIN,18));
        JLabel lls = new JLabel("Age:");
        lls.setBounds(360,400,100,50);
        lls.setFont(new Font("Dialog",Font.ROMAN_BASELINE,18));
        JLabel llss = new JLabel("Blood Group:");
        llss.setBounds(360,460,120,50);
        llss.setFont(new Font("Dialog",Font.ROMAN_BASELINE,18));
        JLabel llk = new JLabel("Address:");
        llk.setBounds(750,100,100,50);
        llk.setFont(new Font("Dialog",Font.ROMAN_BASELINE,18));
        JLabel lln = new JLabel("Contact no:");
        lln.setBounds(750,220,100,50);
        lln.setFont(new Font("Dialog",Font.ROMAN_BASELINE,18));
        JLabel lllll = new JLabel("Emergancy Contact No:");
        lllll.setBounds(750,310,200,50);
        lllll.setFont(new Font("null",Font.LAYOUT_NO_LIMIT_CONTEXT,18));
        JLabel llll = new JLabel("Email:");
        llll.setBounds(750,400,100,50);
        llll.setFont(new Font("Dialog",Font.ROMAN_BASELINE,18));
        JLabel lll = new JLabel("Password:");
        lll.setBounds(750,460,100,50);
        lll.setFont(new Font("Dialog",Font.ROMAN_BASELINE,18));
        ImageIcon background_Imagess = new ImageIcon("oo.jpg");
        Image imgs = background_Imagess.getImage();
        Image temp_imgss = imgs.getScaledInstance(1500,1200,Image.SCALE_SMOOTH);
        background_Imagess= new ImageIcon(temp_imgss);
        JLabel backgrounds = new JLabel("",background_Imagess, JLabel.CENTER);
        backgrounds.setBounds(0,0,1400,900);
        framess.add(backgrounds);
        ImageIcon background_Imagesn = new ImageIcon("cc.png");
        Image lllllll = background_Imagesn.getImage();
        Image temp_imgsn = lllllll.getScaledInstance(350,680,Image.SCALE_SMOOTH);
        background_Imagess = new ImageIcon(temp_imgsn);
        JLabel backgrounddd = new JLabel("",background_Imagess, JLabel.CENTER);
        backgrounddd.setBounds(0,0,350,680);
        framess.add(backgrounddd);
        JTextField passwordn = new JTextField("");
        passwordn.setBounds(470,110,200,30);
        JTextField passwords = new JTextField("");
        passwords.setBounds(470,170,200,30);
        JTextField passwordss = new JTextField("");
        passwordss.setBounds(470,230,200,30);
        JTextField passwordsss = new JTextField("");
        passwordsss.setBounds(470,410,60,30);
        JTextField passwordssss = new JTextField("");
        passwordssss.setBounds(470,470,200,30);
        JTextField passwordsssss = new JTextField("");
        passwordsssss.setBounds(850,110,200,100);
        JTextField passwordssssss = new JTextField("");
        passwordssssss.setBounds(850,230,200,30);
        JTextField passwordsssssss = new JTextField("");
        passwordsssssss.setBounds(850,350,200,40);
        JTextField passwordssssssss = new JTextField("");
        passwordssssssss.setBounds(850,410,200,30);
        JPasswordField passwordsssssssss = new JPasswordField("");
        passwordsssssssss.setBounds(850,470,200,30);
        ButtonGroup btt = new ButtonGroup();
        JRadioButton pizzRadioButtonw = new JRadioButton("Male");
        pizzRadioButtonw.setBounds(470,295,70,20);
        pizzRadioButtonw.setFocusable(false);
        pizzRadioButtonw.setFont(new Font("Dialog",Font.PLAIN,18));
        btt.add(pizzRadioButtonw);
        JRadioButton pizzRadioButtonnq = new JRadioButton("Female");
        pizzRadioButtonnq.setBounds(550,295,90,20);
        pizzRadioButtonnq.setFocusable(false);
        pizzRadioButtonnq.setFont(new Font("Dialog",Font.PLAIN,18));
        btt.add(pizzRadioButtonnq);
        JTextField  passwordsssssssssssss = new JTextField ("");
        passwordsssssssssssss.setBounds(470,350,130,30);
        JButton button = new JButton();
        
        button.setBounds(850, 550, 80, 30);
        button.setText("Back");
        button.setFocusable(false);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        
        button.setBorder(BorderFactory.createEtchedBorder());
        
        String[] male = {"male","female"};
        JComboBox comboBox = new JComboBox(male);
        JPanel loginnd = new JPanel();
        loginnd.setSize(700,700);
        loginnd.setBackground(Color.WHITE);
        loginnd.setLayout(null);
        loginnd.setBounds(130, 50,1100, 650);
        loginnd.setVisible(true);
        framess.add(loginnd);

        backgrounds.add(loginnd);
        loginnd.add(pizzRadioButtonw);
        loginnd.add(pizzRadioButtonnq);
        loginnd.add(label);
        loginnd.add(labe);
        loginnd.add(lab);
        loginnd.add(la);
        loginnd.add(ld);
        loginnd.add(llb);
        loginnd.add(lls);
        loginnd.add(llss);
        loginnd.add(llk);
        loginnd.add(lln);
        loginnd.add(lllll);
        loginnd.add(llll);
        loginnd.add(lll);
        loginnd.add(backgrounddd);
        loginnd.add(passwordn);
        loginnd.add(passwords);
        loginnd.add(passwordss);
        loginnd.add(passwordsss);
        loginnd.add(passwordssss);
        loginnd.add(passwordsssss);
        loginnd.add(passwordssssss);
        loginnd.add(passwordsssssss);
        loginnd.add(passwordssssssss);
        loginnd.add(passwordsssssssss);

        loginnd.add(passwordsssssssssssss);
        loginnd.add(pizzRadioButton);
        loginnd.add(pizzRadioButtonn);
        loginnd.add(button);
        loginnd.add(comboBox);
        JButton buttonn = new JButton();
        buttonn.setBounds(950, 550, 80, 30);
        buttonn.setText("Sign Up");
        buttonn.setFocusable(false);
        buttonn.setEnabled(false);
        buttonn.setHorizontalTextPosition(JButton.CENTER);
        buttonn.setVerticalTextPosition(JButton.BOTTOM);
        buttonn.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonn.setBackground(Color.BLACK);
        buttonn.setForeground(Color.WHITE);
        buttonn.setBorder(BorderFactory.createEtchedBorder());
        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                checkText();
            }
            public void removeUpdate(DocumentEvent e) {
                checkText();
            }
            public void insertUpdate(DocumentEvent e) {
                checkText();
            }
            public void checkText() {
                String text1 = passwordn.getText();
                String text2 = passwords.getText();
                String text3 = passwordss.getText();
                String text4 = passwordsss.getText();
                String text5 = passwordssss.getText();
                String text6 = passwordsssss.getText();
                String text7 = passwordssssss.getText();
                String text8 = passwordsssssss.getText();
                String text9 = passwordssssssss.getText();
                char[] password10 = passwordsssssssss.getPassword();
                
                String text12 = passwordsssssssssssss.getText();
                if (text1.isEmpty() || text2.isEmpty() || text3.isEmpty() || text4.isEmpty() || text5.isEmpty() || text6.isEmpty() || text7.isEmpty() || text8.isEmpty()|| text9.isEmpty() ||password10.length == 0 ||  text12.isEmpty()) {
                    buttonn.setEnabled(false);
                } else {
                    buttonn.setEnabled(true);
                }
                
            
          }
        
        };
        passwordn.getDocument().addDocumentListener(documentListener);
        passwords.getDocument().addDocumentListener(documentListener);
        passwordss.getDocument().addDocumentListener(documentListener);
        passwordsss.getDocument().addDocumentListener(documentListener);
        passwordssss.getDocument().addDocumentListener(documentListener);
        passwordsssss.getDocument().addDocumentListener(documentListener);
        passwordssssss.getDocument().addDocumentListener(documentListener);
        passwordsssssss.getDocument().addDocumentListener(documentListener);
        passwordssssssss.getDocument().addDocumentListener(documentListener);
        passwordsssssssss.getDocument().addDocumentListener(documentListener);
        
        passwordsssssssssssss.getDocument().addDocumentListener(documentListener);
        
        buttonn.addActionListener(j -> {
            JFrame ggd = new JFrame();
            ggd.setSize(1500,1000);
            ggd.setVisible(true);
            ImageIcon background_Imagessss = new ImageIcon("oo.jpg");
        Image imgss = background_Imagessss.getImage();
        Image temp_imgsss = imgss.getScaledInstance(1500,1200,Image.SCALE_SMOOTH);
        background_Imagessss = new ImageIcon(temp_imgsss);
        JLabel backgroundss = new JLabel("",background_Imagessss, JLabel.CENTER);
        backgroundss.setBounds(0,0,1400,900);
        ggd.add(backgroundss);
        JPanel loginndf = new JPanel();
        loginndf.setSize(700,700);
        loginndf.setBackground(Color.WHITE);
        loginndf.setLayout(null);
        loginndf.setBounds(30, 30,250, 350);
        loginndf.setVisible(true);
        ggd.add(loginndf);
        backgroundss.add(loginndf);
        ImageIcon background_Imagesnj = new ImageIcon("patient pulse .png");
        Image lllllllh = background_Imagesnj.getImage();
        Image temp_imgsny = lllllllh.getScaledInstance(250,250,Image.SCALE_SMOOTH);
        background_Imagessss = new ImageIcon(temp_imgsny);
        JLabel backgroundddr = new JLabel("",background_Imagessss, JLabel.CENTER);
        backgroundddr.setBounds(-5,0,250,250);
        loginndf.add(backgroundddr);
        JPanel loginndfj = new JPanel();
        loginndfj.setSize(700,700);
        loginndfj.setBackground(Color.WHITE);
        loginndfj.setLayout(null);
        loginndfj.setBounds(300, 30,600, 350);
        loginndfj.setVisible(true);
        ggd.add(loginndfj);
        backgroundss.add(loginndfj);
        JLabel lad = new JLabel("NID");
        lad.setBounds(50,45,100,50);
        lad.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndfj.add(lad);
        JLabel ladd = new JLabel("Gender");
        ladd.setBounds(260,45,100,50);
        ladd.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndfj.add(ladd);
        JLabel laddd = new JLabel("Date of Birth");
        laddd.setBounds(460,45,100,50);
        laddd.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndfj.add(laddd);
        ImageIcon background_Imagesnjt = new ImageIcon("hj.png");
        Image lllllllhk = background_Imagesnjt.getImage();
        Image temp_imgsnyy = lllllllhk.getScaledInstance(550,20,Image.SCALE_SMOOTH);
        background_Imagesssss = new ImageIcon(temp_imgsnyy);
        JLabel backgroundddru = new JLabel("",background_Imagesssss, JLabel.CENTER);
        backgroundddru.setBounds(30,130,550,20);
        loginndfj.add(backgroundddru);
        JLabel ladddd = new JLabel("Age");
        ladddd.setBounds(50,170,100,50);
        ladddd.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndfj.add(ladddd);
        JLabel laddddd = new JLabel("Blood Group");
        laddddd.setBounds(260,170,150,50);
        laddddd.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndfj.add(laddddd);
        JLabel ladddddd = new JLabel("Address");
        ladddddd.setBounds(460,170,150,50);
        ladddddd.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndfj.add(ladddddd);
        ImageIcon background_Imagesnjtt = new ImageIcon("hj.png");
        Image lllllllhkk = background_Imagesnjtt.getImage();
        Image temp_imgsnyyy = lllllllhkk.getScaledInstance(550,20,Image.SCALE_SMOOTH);
        background_Imagessssss = new ImageIcon(temp_imgsnyyy);
        JLabel backgroundddruu = new JLabel("",background_Imagessssss, JLabel.CENTER);
        backgroundddruu.setBounds(30,245,550,20);
        loginndfj.add(backgroundddruu);
        JLabel laddddddd = new JLabel("Contact no");
        laddddddd.setBounds(50,270,150,50);
        laddddddd.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndfj.add(laddddddd);
        JLabel ladddddddd = new JLabel("Emergency Contact no");
        ladddddddd.setBounds(260,270,200,50);
        ladddddddd.setFont(new Font("Dialog",Font.PLAIN,18));
        loginndfj.add(ladddddddd);
        JPanel loginndff = new JPanel();
        loginndff.setSize(700,700);
        loginndff.setBackground(Color.WHITE);
        loginndff.setLayout(null);
        loginndff.setBounds(30, 395,871, 330);
        loginndff.setVisible(true);
        ggd.add(loginndff);
        backgroundss.add(loginndff);
        
        JLabel laddddddddd = new JLabel("Present Medicine List");
        laddddddddd.setBounds(20,20,400,50);
        laddddddddd.setFont(new Font("Bold",Font.PLAIN,25));
        loginndff.add(laddddddddd);
        JLabel ladddddddddd = new JLabel("Allergic to :(Medicine & Food)");
        ladddddddddd.setBounds(500,20,400,50);
        ladddddddddd.setFont(new Font("Bold",Font.PLAIN,25));
        loginndff.add(ladddddddddd);
        JLabel laddddddddddd = new JLabel("Napa");
        laddddddddddd.setBounds(20,160,400,50);
        laddddddddddd.setFont(new Font("Bold",Font.PLAIN,18));
        loginndff.add(laddddddddddd);
        JLabel ladddddddddddd = new JLabel("N/A");
        ladddddddddddd.setBounds(500,160,400,50);
        ladddddddddddd.setFont(new Font("Bold",Font.PLAIN,18));
        loginndff.add(ladddddddddddd);
        JTextField passwordsssssk = new JTextField("Napa");
        passwordsssssk.setBounds(20,220,200,70);
        loginndff.add(passwordsssssk);
        JTextField passwordssssskk = new JTextField("N/A");
        passwordssssskk.setBounds(500,220,200,70);
        loginndff.add(passwordssssskk);
        
        JButton buttonny = new JButton();
        buttonny.setBounds(225, 235, 80, 30);
        buttonny.setText("Update");
        buttonny.setFocusable(false);

        buttonny.setHorizontalTextPosition(JButton.CENTER);
        buttonny.setVerticalTextPosition(JButton.BOTTOM);
        buttonny.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonny.setBackground(Color.BLACK);
        buttonny.setForeground(Color.WHITE);
        buttonny.setBorder(BorderFactory.createEtchedBorder());
        loginndff.add(buttonny);
        JButton buttonnyy = new JButton();
        buttonnyy.setBounds(705, 235, 80, 30);
        buttonnyy.setText("Update");
        buttonnyy.setFocusable(false);

        buttonnyy.setHorizontalTextPosition(JButton.CENTER);
        buttonnyy.setVerticalTextPosition(JButton.BOTTOM);
        buttonnyy.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonnyy.setBackground(Color.BLACK);
        buttonnyy.setForeground(Color.WHITE);
        buttonnyy.setBorder(BorderFactory.createEtchedBorder());
        loginndff.add(buttonnyy);
        JTextField passwordssssskkn = new JTextField("");
        passwordssssskkn.setBounds(940,30,280,40);
        backgroundss.add(passwordssssskkn);
        JButton buttonnyyw = new JButton();
        buttonnyyw.setBounds(1240, 35, 80, 30);
        buttonnyyw.setText("Search");
        buttonnyyw.setFocusable(false);

        buttonnyyw.setHorizontalTextPosition(JButton.CENTER);
        buttonnyyw.setVerticalTextPosition(JButton.BOTTOM);
        buttonnyyw.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonnyyw.setBackground(Color.BLACK);
        buttonnyyw.setForeground(Color.WHITE);
        buttonnyyw.setBorder(BorderFactory.createEtchedBorder());
        backgroundss.add(buttonnyyw);
        JPanel loginndffw = new JPanel();
        loginndffw.setSize(700,700);
        loginndffw.setBackground(Color.WHITE);
        loginndffw.setLayout(null);
        loginndffw.setBounds(940, 100,400, 360);
        loginndffw.setVisible(true);
        ggd.add(loginndffw);
        backgroundss.add(loginndffw);
        JLabel laddddddddddddd = new JLabel("Patient Medical History");
        laddddddddddddd.setBounds(20,10,400,50);
        laddddddddddddd.setFont(new Font("Bold",Font.PLAIN,18));
        loginndffw.add(laddddddddddddd);
        JTextField passwordssssskknr = new JTextField("Details");
        passwordssssskknr.setBounds(20,300,280,40);
        loginndffw.add(passwordssssskknr);
        JButton buttonnyywq = new JButton();
        buttonnyywq.setBounds(305, 305, 80, 30);
        buttonnyywq.setText("Upload");
        buttonnyywq.setFocusable(false);

        buttonnyywq.setHorizontalTextPosition(JButton.CENTER);
        buttonnyywq.setVerticalTextPosition(JButton.BOTTOM);
        buttonnyywq.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonnyywq.setBackground(Color.BLACK);
        buttonnyywq.setForeground(Color.WHITE);
        buttonnyywq.setBorder(BorderFactory.createEtchedBorder());
        loginndffw.add(buttonnyywq);
        JPanel loginndffwe = new JPanel();
        loginndffwe.setSize(700,700);
        loginndffwe.setBackground(Color.WHITE);
        loginndffwe.setLayout(null);
        loginndffwe.setBounds(940, 485,400, 240);
        loginndffwe.setVisible(true);
        ggd.add(loginndffwe);
        backgroundss.add(loginndffwe);
        JTextField passwordssssskknrt = new JTextField("Details");
        passwordssssskknrt.setBounds(20,180,280,40);
        loginndffwe.add(passwordssssskknrt);
        JButton buttonnyywqq = new JButton();
        buttonnyywqq.setBounds(305, 185, 80, 30);
        buttonnyywqq.setText("View");
        buttonnyywqq.setFocusable(false);

        buttonnyywqq.setHorizontalTextPosition(JButton.CENTER);
        buttonnyywqq.setVerticalTextPosition(JButton.BOTTOM);
        buttonnyywqq.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        buttonnyywqq.setBackground(Color.BLACK);
        buttonnyywqq.setForeground(Color.WHITE);
        buttonnyywqq.setBorder(BorderFactory.createEtchedBorder());
        loginndffwe.add(buttonnyywqq);
        });
        loginnd.add(buttonn);
        buttonn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                framess.setVisible(true);
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framess.setVisible(false);
                frame.setVisible(true);
            }
        });
    });
        
        button3.setHorizontalTextPosition(JButton.CENTER);
        button3.setVerticalTextPosition(JButton.BOTTOM);
        button3.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBorder(BorderFactory.createEtchedBorder());
        button3.setVisible(true);
        
    }

    
}



