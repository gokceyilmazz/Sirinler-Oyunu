
package sirinleroyun;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Oyun extends JPanel implements KeyListener,ActionListener {
    
   JPanel panel = new JPanel();
   static Puan puan = new Puan();
   static Gozluklu gozluklu=new Gozluklu();
   static Tembel tembelsirin =new Tembel();
   static Gargamel gargamel =new Gargamel();
   static Azman azman =new Azman();
   static Altin altin1 = new Altin();
   static Altin altin2 = new Altin();
   static Altin altin3 = new Altin();
   static Altin altin4 = new Altin();
   static Altin altin5 = new Altin();
   static Mantar mantar = new Mantar();
    Timer timer = new Timer(5000,this);
    Thread th = new Thread();
    
    
    private BufferedImage image,image2,image3,image4,image5,imgmantar,imgcoin,imgazman,imggargamel;
    
    private BufferedImage sagok,asagiok,yukariok;
    
    public static int [][] labirent = new int [11][13]; 

    public int counter=0;
   
    public String secilenoyuncu,yergargamel,yerazman;
    

    
    
    int x=6;
    int y=5;
    

    public static ArrayList <Lokasyon> konum= new ArrayList<Lokasyon>(4);
     
    public Oyun() throws FileNotFoundException {
        
         Lokasyon l = new Lokasyon();
         
        try {
            image = ImageIO.read(new FileImageInputStream(new File("sirine-removebg-preview.png")));
            image2 = ImageIO.read(new FileImageInputStream(new File("gozluklu-removebg-preview.png")));
            sagok = ImageIO.read(new FileImageInputStream(new File("sagok.png")));
            asagiok = ImageIO.read(new FileImageInputStream(new File("asagiok.png")));
            yukariok = ImageIO.read(new FileImageInputStream(new File("yukariok.png")));
            image3 = ImageIO.read(new FileImageInputStream(new File("gargamel.png")));
            image4 = ImageIO.read(new FileImageInputStream(new File("azman-removebg-preview.png")));
            imgmantar = ImageIO.read(new FileImageInputStream(new File("mantar-removebg-preview.png")));
            imgcoin = ImageIO.read(new FileImageInputStream(new File("coin-removebg-preview.png")));
            image5 = ImageIO.read(new FileImageInputStream(new File("tembel.png"))); 
            imgazman = ImageIO.read(new FileImageInputStream(new File("azman.png")));
            imggargamel = ImageIO.read(new FileImageInputStream(new File("gargamel2.png")));
            
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        
        setBackground(Color.ORANGE);
        

          int selectedOption = JOptionPane.showConfirmDialog(null, 
            "Oynamak istediğiniz oyuncuyu seçiniz.Gözlüklü Şirin için yes, tembel şirin için no'ya basınız", 
            "Oyuncu Seçimi", 
           JOptionPane.YES_NO_OPTION); 
           if (selectedOption == JOptionPane.YES_OPTION) {
               secilenoyuncu="gozluklu";
           }
           else if (selectedOption == JOptionPane.NO_OPTION) {
               secilenoyuncu="tembel";
           }
           System.out.println("Seçilen oyuncu:"+secilenoyuncu);
        
        File dosya = new File("C:\\Users\\Gökçe Yılmaz\\Documents\\NetBeansProjects\\SirinlerOyun\\harita.txt");
        Scanner scn = new Scanner(dosya);
        while (scn.hasNextLine()){
           yergargamel = scn.nextLine();
           yerazman = scn.nextLine();
        for(int i=0 ; i<11 ; i++){
        
            for(int j=0 ; j<13 ; j++) {
              
                labirent[i][j]=scn.nextInt();
                
            }
        }
        }
        

        Lokasyon a1 = new Lokasyon (1,1);Lokasyon a2 = new Lokasyon (2,1);Lokasyon a3 = new Lokasyon (3,1);Lokasyon a4 = new Lokasyon (4,1);
        Lokasyon a5 = new Lokasyon (6,1); Lokasyon a6 = new Lokasyon (7,1); Lokasyon a7 = new Lokasyon (8,1); Lokasyon a8 = new Lokasyon (9,1);
        Lokasyon a9 = new Lokasyon (10,1); Lokasyon a10 = new Lokasyon (11,1); Lokasyon a11 = new Lokasyon (1,2); Lokasyon a12 = new Lokasyon (3,2);
        Lokasyon a13 = new Lokasyon (4,2); Lokasyon a14 = new Lokasyon (5,2); Lokasyon a15 = new Lokasyon (6,2); Lokasyon a16 = new Lokasyon (7,2); 
        Lokasyon a17 = new Lokasyon (8,2); Lokasyon a18 = new Lokasyon (11,2); Lokasyon a19 = new Lokasyon (1,3); Lokasyon a20 = new Lokasyon (2,3);
        Lokasyon a21 = new Lokasyon (3,3); Lokasyon a22 = new Lokasyon (4,3); Lokasyon a23 = new Lokasyon (6,3); Lokasyon a24= new Lokasyon (8,3);
        Lokasyon a25 = new Lokasyon (9,3); Lokasyon a26 = new Lokasyon (11,3); Lokasyon a27 = new Lokasyon (1,4); Lokasyon a28 = new Lokasyon (3,4);
        Lokasyon a29 = new Lokasyon (6,4); Lokasyon a30 = new Lokasyon (8,4); Lokasyon a31 = new Lokasyon (11,4); Lokasyon a32 = new Lokasyon (1,5);
        Lokasyon a33 = new Lokasyon (3,5); Lokasyon a34 = new Lokasyon (4,5); Lokasyon a35 = new Lokasyon (5,5); Lokasyon a36 = new Lokasyon (6,5);
        Lokasyon a37 = new Lokasyon (8,5); Lokasyon a38 = new Lokasyon (10,5); Lokasyon a39 = new Lokasyon (11,5); Lokasyon a40 = new Lokasyon (1,6); Lokasyon a41 = new Lokasyon (4,6);
        Lokasyon a42 = new Lokasyon (5,6); Lokasyon a43 = new Lokasyon (6,6); Lokasyon a44 = new Lokasyon (8,6); Lokasyon a45 = new Lokasyon (9,6);
        Lokasyon a46 = new Lokasyon (10,6); Lokasyon a47 = new Lokasyon (11,6); Lokasyon a48 = new Lokasyon (1,7); Lokasyon a49 = new Lokasyon (3,7);
        Lokasyon a50 = new Lokasyon (4,7); Lokasyon a51 = new Lokasyon (5,7); Lokasyon a52 = new Lokasyon (6,7); Lokasyon a53 = new Lokasyon (7,7);
        Lokasyon a54 = new Lokasyon (8,7); Lokasyon a55 = new Lokasyon (9,7); Lokasyon a56 = new Lokasyon (10,7); Lokasyon a57 = new Lokasyon (11,7);
        Lokasyon a58 = new Lokasyon (1,8); Lokasyon a59 = new Lokasyon (3,8); Lokasyon a60 = new Lokasyon (9,8); Lokasyon a61 = new Lokasyon (10,8);
        Lokasyon a62 = new Lokasyon (11,8); Lokasyon a63 = new Lokasyon (1,9); Lokasyon a64 = new Lokasyon (2,9); Lokasyon a65 = new Lokasyon (3,9);
        Lokasyon a66 = new Lokasyon (4,9); Lokasyon a67 = new Lokasyon (5,9); Lokasyon a68 = new Lokasyon (6,9); Lokasyon a69 = new Lokasyon (7,9); 
        Lokasyon a70 = new Lokasyon (8,9); Lokasyon a71 = new Lokasyon (9,9); Lokasyon a72 = new Lokasyon (10,9); Lokasyon a73 = new Lokasyon (11,9);
        
        konum.add(a1); konum.add(a2); konum.add(a3); konum.add(a4); konum.add(a5); konum.add(a6); konum.add(a7); konum.add(a8); konum.add(a9); 
        konum.add(a10); konum.add(a11); konum.add(a12); konum.add(a13); konum.add(a14); konum.add(a15); konum.add(a16); konum.add(a17); konum.add(a18);
        konum.add(a19); konum.add(a20); konum.add(a21); konum.add(a22); konum.add(a23); konum.add(a24); konum.add(a25); konum.add(a26); konum.add(a27); 
        konum.add(a28); konum.add(a29); konum.add(a30); konum.add(a31); konum.add(a32); konum.add(a33); konum.add(a34); konum.add(a35); konum.add(a36);
        konum.add(a37); konum.add(a38); konum.add(a39); konum.add(a40); konum.add(a41); konum.add(a42); konum.add(a43); konum.add(a44); konum.add(a45);
        konum.add(a46); konum.add(a47); konum.add(a48); konum.add(a49); konum.add(a50); konum.add(a51); konum.add(a52); konum.add(a53); konum.add(a54);
        konum.add(a55); konum.add(a56); konum.add(a57); konum.add(a58); konum.add(a59); konum.add(a60); konum.add(a61); konum.add(a62); konum.add(a64); 
        konum.add(a65); konum.add(a66); konum.add(a67); konum.add(a68); konum.add(a69); konum.add(a70); konum.add(a71); konum.add(a72); konum.add(a73);
        

        
        
        
        if(yergargamel.equals("Karakter:Gargamel,Kapi:A")==true){
        gargamel.setkonum(3*40, 0*40);}
        else if(yergargamel.equals("Karakter:Gargamel,Kapi:B")==true){
        gargamel.setkonum(10*40, 0*40);}
        else if(yergargamel.equals("Karakter:Gargamel,Kapi:C")==true){
        gargamel.setkonum(0*40, 5*40);}
        else if(yergargamel.equals("Karakter:Gargamel,Kapi:D")==true){
        gargamel.setkonum(3*40, 10*40);}
        
        if(yerazman.equals("Karakter:Azman,Kapi:A")==true){
        azman.setkonum(3*40, 0*40);}
        else if(yerazman.equals("Karakter:Azman,Kapi:B")==true){
        azman.setkonum(10*40, 0*40);}
        else if(yerazman.equals("Karakter:Azman,Kapi:C")==true){
        azman.setkonum(0*40, 5*40);}
        else if(yerazman.equals("Karakter:Azman,Kapi:D")==true){
        azman.setkonum(3*40, 10*40);}
        
        System.out.println("gargamel konum: "+gargamel.getkonum_x()/40+" "+gargamel.getkonum_y()/40);
        System.out.println(""+yergargamel);
        gozluklu.setkonum(y*40, x*40);
        
        System.out.println(gozluklu.getkonum_y()/40+" "+gozluklu.getkonum_x()/40);
        
        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.translate(100, 200);
        
        // labirenti çizdir
        for (int satir = 0; satir < labirent.length; satir++) {
            for (int sutun = 0; sutun < labirent[0].length; sutun++) {
                Color color;
                switch (labirent[satir][sutun]) {
                    case 0 : color = Color.GRAY; 
                    break;
                    case 1 : color = Color.WHITE; 
                    break;
                    default : color = Color.BLUE;
                }
                g.setColor(color);
                g.fillRect(40 * sutun, 40 * satir, 40, 40);
                g.setColor(Color.BLACK);
                g.drawRect(40 * sutun, 40 * satir, 40, 40);
                
                
            }
        }
        
    
        g.setFont(getFont().deriveFont(Font.BOLD, 18));
        g.drawString("C",14 * 1, 45 * 5);
        g.drawString("A",45 * 3, 27 * 1);
        g.drawString("B",46 * 9, 29 * 1);
        g.drawString("D",45 * 3, 43 * 10);
        g.drawImage(image, 520, 250, image.getWidth()/6, image.getWidth()/6, this);
        g.drawImage(sagok, -40, 200, image.getWidth()/12, image.getWidth()/12, this);
        g.drawImage(asagiok, 400, -40, image.getWidth()/12, image.getWidth()/12, this);
        g.drawImage(asagiok, 120, -40, image.getWidth()/12, image.getWidth()/12, this);
        g.drawImage(yukariok, 120, 440, image.getWidth()/12, image.getWidth()/12, this);
        g.drawImage(image3, -90, -170, image.getWidth()/3, image.getWidth()/3, this);
        g.drawImage(image4, -30, -125, image.getWidth()/4, image.getWidth()/4, this);
        



    counter++;
    
    if(counter>1000){
    Collections.shuffle(konum);
    counter=0;
    }
    
       altin1.setAltinkonum(konum.get(1).getX()*40, konum.get(1).getY()*40);
       altin2.setAltinkonum(konum.get(6).getX()*40, konum.get(6).getY()*40);
       altin3.setAltinkonum(konum.get(50).getX()*40, konum.get(50).getY()*40);
       altin4.setAltinkonum(konum.get(12).getX()*40, konum.get(12).getY()*40);
       altin5.setAltinkonum(konum.get(33).getX()*40, konum.get(33).getY()*40);
        
       g.drawImage(imgcoin, altin1.getAltinkonum_x(),altin1.getAltinkonum_y(), image.getWidth()/11, image.getWidth()/11, this);
       g.drawImage(imgcoin, altin2.getAltinkonum_x(),altin2.getAltinkonum_y(), image.getWidth()/11, image.getWidth()/11, this);
       g.drawImage(imgcoin, altin3.getAltinkonum_x(),altin3.getAltinkonum_y(), image.getWidth()/11, image.getWidth()/11, this);
       g.drawImage(imgcoin, altin4.getAltinkonum_x(),altin4.getAltinkonum_y(), image.getWidth()/11, image.getWidth()/11, this);
       g.drawImage(imgcoin, altin5.getAltinkonum_x(),altin5.getAltinkonum_y(), image.getWidth()/11, image.getWidth()/11, this);
       
       mantar.setMantarkonum(konum.get(67).getX()*40, konum.get(67).getY()*40);
       g.drawImage(imgmantar, mantar.getMantarkonum_x(),mantar.getMantarkonum_y(), image.getWidth()/12, image.getWidth()/12, this);
      
       // labirentte hareket eden oyuncu yuvarlağı
       g.drawImage(imgazman, azman.getkonum_x(), azman.getkonum_y(), imgazman.getWidth()/6, imgazman.getWidth()/6, this);
       g.drawImage(imggargamel, gargamel.getkonum_x(), gargamel.getkonum_y(), imggargamel.getWidth()/6, imggargamel.getWidth()/6, this);
       
       
       if(secilenoyuncu.equals("gozluklu"))
        g.drawImage(image2, x*40, y*39, image2.getWidth()/5, image.getWidth()/5, this);
       else if(secilenoyuncu.equals("tembel"))
        g.drawImage(image5, x*40, y*40, image5.getWidth()/4, image5.getWidth()/4, this);
       
        g.drawString("PUAN: "+puan.PuaniGoster(0), 650, -50);
        

        repaint();
        
        
    }
    
    @Override
    protected void processKeyEvent(KeyEvent ke) {
        if (ke.getID() != KeyEvent.KEY_PRESSED) {
            return;
        }
        
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(secilenoyuncu=="gozluklu"){
            if(labirent[y][x+2]!=0 && labirent[y][x+1]!=0){
            x += 2;
              gozluklu.setkonum(y*40, x*40);
            }
              
           }
            else if(secilenoyuncu=="tembel"){
            if(labirent[y][x+1]!=0){
            x += 1;
              tembelsirin.setkonum(y*40, x*40);
            }
            }
               System.out.println(y+" " + x + " "+ labirent[y][x]);
               
           
        }
        else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
           if(secilenoyuncu=="gozluklu"){
            if(labirent[y][x-2]!=0 && labirent[y][x-1]!=0){
            x-= 2;
            gozluklu.setkonum(y*40, x*40);
            }
           }
            else if(secilenoyuncu=="tembel"){
            if(labirent[y][x-1]!=0){
            x -= 1;
              tembelsirin.setkonum(y*40, x*40);
            }
            }
            System.out.println(y+" "+x);
             
        }
        else if (ke.getKeyCode() == KeyEvent.VK_UP) {
            if(secilenoyuncu=="gozluklu"){
            if(labirent[y-2][x]!=0 && labirent[y-1][x]!=0){
            y-= 2;
            gozluklu.setkonum(y*40, x*40);
            }
            }
            else if(secilenoyuncu=="tembel"){
            if(labirent[y-1][x]!=0){
            y -= 1;
              tembelsirin.setkonum(y*40, x*40);
            }
            }
            System.out.println(y+" "+x);
             
        }
        else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            if(secilenoyuncu=="gozluklu"){
            if(labirent[y+2][x]!=0 && labirent[y+1][x]!=0){
            y+= 2;
            gozluklu.setkonum(y*40, x*40);
            }
            }
            else if(secilenoyuncu=="tembel"){
            if(labirent[y+1][x]!=0){
            y += 1;
              tembelsirin.setkonum(y*40, x*40);
            }
            }
             System.out.println(y+" "+x);
             
        }
        if((gozluklu.getkonum_x()==mantar.getMantarkonum_y() && gozluklu.getkonum_y()==mantar.getMantarkonum_x()) || (tembelsirin.getkonum_x()==mantar.getMantarkonum_y() && tembelsirin.getkonum_y()==mantar.getMantarkonum_x()) ){
        
        puan.PuaniGoster(50);
        Collections.shuffle(konum);
            
        }
        if(gozluklu.getkonum_x()==altin1.getAltinkonum_y() && gozluklu.getkonum_y()==altin1.getAltinkonum_x() || tembelsirin.getkonum_x()==altin1.getAltinkonum_y() && tembelsirin.getkonum_y()==altin1.getAltinkonum_x()){
        
        puan.PuaniGoster(5);
        Collections.shuffle(konum);
       
        }
        if(gozluklu.getkonum_x()==altin2.getAltinkonum_y() && gozluklu.getkonum_y()==altin2.getAltinkonum_x() || tembelsirin.getkonum_x()==altin2.getAltinkonum_y() && tembelsirin.getkonum_y()==altin2.getAltinkonum_x()){
        
        puan.PuaniGoster(5);
        Collections.shuffle(konum);    
        }
        if(gozluklu.getkonum_x()==altin3.getAltinkonum_y() && gozluklu.getkonum_y()==altin3.getAltinkonum_x() || tembelsirin.getkonum_x()==altin3.getAltinkonum_y() && tembelsirin.getkonum_y()==altin3.getAltinkonum_x()){
        
        puan.PuaniGoster(5);
        Collections.shuffle(konum);    
        }
        if(gozluklu.getkonum_x()==altin4.getAltinkonum_y() && gozluklu.getkonum_y()==altin4.getAltinkonum_x() || tembelsirin.getkonum_x()==altin4.getAltinkonum_y() && tembelsirin.getkonum_y()==altin4.getAltinkonum_x()){
        
        puan.PuaniGoster(5);
        Collections.shuffle(konum);    
        }
        if(gozluklu.getkonum_x()==altin5.getAltinkonum_y() && gozluklu.getkonum_y()==altin5.getAltinkonum_x() || tembelsirin.getkonum_x()==altin5.getAltinkonum_y() && tembelsirin.getkonum_y()==altin5.getAltinkonum_x()){
        
        puan.PuaniGoster(5);
        Collections.shuffle(konum);  
        }
        
        if((gozluklu.getkonum_x()==gargamel.getkonum_y()&& gozluklu.getkonum_y()==gargamel.getkonum_x()) || (tembelsirin.getkonum_x()==gargamel.getkonum_y() && tembelsirin.getkonum_y()==gargamel.getkonum_x()) ){
        
        puan.PuaniGoster(-15);  
        }
        
        if((gozluklu.getkonum_x()==azman.getkonum_y()&& gozluklu.getkonum_y()==azman.getkonum_x()) || (tembelsirin.getkonum_x()==azman.getkonum_y() && tembelsirin.getkonum_y()==azman.getkonum_x()) ){
        
        puan.PuaniGoster(-5);  
        }
        
        if((gozluklu.getkonum_x()==7*40 && gozluklu.getkonum_y()==12*40) || (tembelsirin.getkonum_x()==7*40 && tembelsirin.getkonum_y()==12*40) ){
        JLabel message=new JLabel("Tebrikler Şirineyi Kurtardın!!!");  
        message.setFont(new Font("Arial",Font.BOLD,35));
        JOptionPane.showMessageDialog(null, message);
        }
        
        if(puan.PuaniGoster(0)<=0){
        JLabel message=new JLabel("Başaramadın :( ");  
        message.setFont(new Font("Arial",Font.BOLD,35));
        JOptionPane.showMessageDialog(null, message);
        }
        repaint(); 
    }
    
    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    

    
    
    
}
