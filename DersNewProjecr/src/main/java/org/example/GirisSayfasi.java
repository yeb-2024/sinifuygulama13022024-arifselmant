package org.example;

import javax.swing.*;
import java.awt.*;

public class GirisSayfasi {

    JFrame frame;
    JTextField kullaniciAdi;


    public GirisSayfasi(){
        frame = new JFrame("Giriş Sayfası");
        kullaniciAdi = new JTextField();
        kullaniciAdi.setPreferredSize(new Dimension(200,30));

        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,2));



        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(new JLabel("Kullanıcı Adı"));
        panel.add(kullaniciAdi);
        frame.add(panel);
        frame.add(new JLabel("Kullanıcı Adını Giriniz"));
        frame.add(kullaniciAdi);



        frame.setVisible(true);
    }
}
