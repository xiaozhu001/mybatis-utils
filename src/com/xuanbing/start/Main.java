package com.xuanbing.start;

import com.xuanbing.view.MainView;

import javax.swing.*;

public class Main {
    private MainView mainView;
    public static void main(String[] args) {
        JFrame jf = new JFrame("mybatis工具");          // 创建窗口
        jf.setSize(1024, 568);                       // 设置窗口大小
        jf.setLocationRelativeTo(null);             // 把窗口位置设置到屏幕中心
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainView mainView = new MainView();
        JPanel panel = mainView.buildMainPanel();                // 创建面板容器，使用默认的布局管理器
        jf.setContentPane(panel);
        jf.setVisible(true);
    }
}
