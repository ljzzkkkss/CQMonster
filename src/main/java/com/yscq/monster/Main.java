package com.yscq.monster;

import com.yscq.monster.action.HalfAction;
import com.yscq.monster.cache.Cache;
import com.yscq.monster.frame.MainFrame;
import com.yscq.monster.utils.PanelUtils;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        initData();
        Cache.mainFrame = new MainFrame("原始传奇记怪器");
        JPanel innerPanel = new JPanel();//国内BOSS面板
        JPanel outerPanel = new JPanel();//国外BOSS面板
        JPanel halfPanel = new JPanel();//存放双倍单倍刷怪说明面板
        JButton halfButton = new JButton("单倍刷怪");//设置单倍双倍刷怪按钮

        halfButton.addActionListener(new HalfAction());
        JLabel halfLabel = new JLabel("当前刷怪倍率：");
        halfLabel.setFont(new Font("宋体", Font.BOLD,20));
        halfPanel.add(halfLabel);
        halfPanel.add(halfButton);

        GridBagConstraints constraint = new GridBagConstraints();//布局内容控制器
        GridBagLayout mainLayout = new GridBagLayout();
        Cache.mainFrame.setLayout(mainLayout);
        Cache.mainFrame.add(halfPanel);
        Cache.mainFrame.add(innerPanel);
        Cache.mainFrame.add(outerPanel);
        constraint.weightx = 0;
        constraint.weighty = 0;
        constraint.gridx =0;
        constraint.gridy = 0;
        constraint.insets = new Insets(20,5,5,5);
        mainLayout.setConstraints(halfPanel,constraint);
        constraint.weightx = 1.0;
        constraint.weighty = 10;
        constraint.gridx =0;
        constraint.gridy = 1;
        constraint.insets = new Insets(5,5,5,5);
        mainLayout.setConstraints(innerPanel,constraint);
        constraint.fill = GridBagConstraints.CENTER;
        constraint.weightx = 1.0;
        constraint.weighty = 5;
        constraint.gridx =0;
        constraint.gridy = 2;
        constraint.insets = new Insets(5,5,5,5);
        mainLayout.setConstraints(outerPanel,constraint);
        PanelUtils.makeInnerPanel(innerPanel);
        PanelUtils.makeOuterPanel(outerPanel);
    }

    private static void initData() {
        InputStream in = Main.class.getClassLoader().getResourceAsStream("data");
        String data = getFileContent(in);
    }

    private static String getFileContent(InputStream in){
        StringBuilder result = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
}
