package com.xuanbing.start;

import com.xuanbing.view.MainView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame jf = new JFrame("mybatis工具");
        jf.setSize(1024, 568);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainView mainView = new MainView();
        JPanel panel = mainView.buildMainPanel();
        jf.setContentPane(panel);
        jf.setVisible(true);
    }
}
