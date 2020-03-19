package com.xuanbing.view;

import com.xuanbing.domain.TableInfo;
import com.xuanbing.service.SqlHandle;

import javax.swing.*;
import java.awt.*;
import java.util.List;

;

public class MainView {

    public JPanel buildMainPanel() {
        GridLayout layout = new GridLayout(1, 2);
        JPanel mainPanel = new JPanel(layout);
        JPanel inputPanel = this.buildInputPanel();
        mainPanel.add(inputPanel);
        JPanel resultPanel = this.buildResultPanel();
        mainPanel.add(resultPanel);

        return mainPanel;
    }

    public JPanel buildInputPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("请输入建表语句：");
        label.setBounds(10, 10, 400, 20);
        panel.add(label);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 40, 480, 430);
        panel.add(textArea);

        JButton button = new JButton("开始生成");
        button.setBounds(50, 480, 100, 25);
        button.addActionListener((e) -> {
            SqlHandle sqlHandle = new SqlHandle();
            List<TableInfo> list = sqlHandle.buildTableInfoList(textArea.getText());
            this.execute(list);
        });
        panel.add(button);

        JButton button1 = new JButton("开始导出");
        button1.setBounds(270, 480, 100, 25);
        button1.addActionListener((e) -> {

        });
        panel.add(button1);

        return panel;
    }

    JPanel resultPanel = new JPanel(null);

    public JPanel buildResultPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("生成结果：");
        label.setBounds(10, 10, 400, 20);
        panel.add(label);

        resultPanel.setBounds(10, 40, 480, 430);
        resultPanel.add(new JPanel());
        panel.add(resultPanel);

        return panel;
    }

    public void execute(List<TableInfo> list) {
        JTabbedPane result = this.buildTablePane(list);
        result.setBounds(0, 0, 480, 430);
        resultPanel.remove(0);
        resultPanel.add(result);
        resultPanel.validate();
        resultPanel.repaint();
    }

    private JTabbedPane buildTablePane(List<TableInfo> list) {

        JTabbedPane tabbedPane = new JTabbedPane();

        for (TableInfo result : list) {
            tabbedPane.addTab(result.tableName, this.buildObjectPane(result));
        }

        tabbedPane.setSelectedIndex(0);
        return tabbedPane;
    }

    private JComponent buildObjectPane(TableInfo result) {

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("DO", this.buildObjectInfo(result.doText));
        tabbedPane.addTab("DAO", this.buildObjectInfo(result.daoText));
        tabbedPane.addTab("MAPPER", this.buildObjectInfo(result.mapperText));

        tabbedPane.setSelectedIndex(0);
        return tabbedPane;
    }


    private JComponent buildObjectInfo(String text) {

        JPanel panel = new JPanel(null);

        JTextArea label = new JTextArea(text);
        label.setFont(new Font(null, Font.PLAIN, 12));
        label.setBounds(0, 0, 480, 400);

        // 添加标签到面板
        panel.add(label);

        return panel;
    }


}
