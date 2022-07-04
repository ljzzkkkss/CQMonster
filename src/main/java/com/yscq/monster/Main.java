package com.yscq.monster;

import com.yscq.monster.frame.MainFrame;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new MainFrame("原始传奇记怪器");
        JPanel innerPanel = new JPanel();//国内BOSS面板
        JPanel outerPanel = new JPanel();//国外BOSS面板
        GridBagConstraints constraint = new GridBagConstraints();//布局内容控制器
        GridBagLayout mainLayout = new GridBagLayout();
        mainFrame.setLayout(mainLayout);
        constraint.fill = GridBagConstraints.BOTH;    //组件填充显示区域
        constraint.weightx = 1.0;
        mainLayout.setConstraints(innerPanel,constraint);
        constraint.gridwidth = GridBagConstraints.REMAINDER;
        mainLayout.setConstraints(outerPanel,constraint);
        makeInnerPanel(innerPanel);
        makeOuterPanel(outerPanel);
    }

    private static void makeInnerPanel(JPanel innerPanel){
        GridBagConstraints constraint = new GridBagConstraints();//布局内容控制器
        GridBagLayout innerLayout = new GridBagLayout();
        innerPanel.setLayout(innerLayout);
        constraint.fill = GridBagConstraints.BOTH;    //组件填充显示区域
        constraint.weightx = 1.0;
        innerPanel.add(new JLabel("国内BOSS"));
        constraint.gridwidth = GridBagConstraints.REMAINDER;
    }

    private static void makeOuterPanel(JPanel outerPanel){
        GridBagConstraints constraint = new GridBagConstraints();//布局内容控制器
        GridBagLayout innerLayout = new GridBagLayout();
        outerPanel.setLayout(innerLayout);
        constraint.fill = GridBagConstraints.BOTH;    //组件填充显示区域
        constraint.weightx = 1.0;
        outerPanel.add(new JLabel("国内BOSS"));
        constraint.gridwidth = GridBagConstraints.REMAINDER;

    }
}
