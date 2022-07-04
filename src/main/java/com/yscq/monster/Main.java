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
        mainFrame.add(innerPanel);
        mainFrame.add(outerPanel);
        constraint.weightx = 1.0;
        constraint.weighty = 1.0;
        constraint.gridx =0;
        constraint.gridy = 0;
        constraint.insets = new Insets(5,5,5,5);
        mainLayout.setConstraints(innerPanel,constraint);
        constraint.weightx = 1.0;
        constraint.weighty = 1.0;
        constraint.gridx =0;
        constraint.gridy = 1;
        constraint.insets = new Insets(5,5,5,5);
        mainLayout.setConstraints(outerPanel,constraint);
        makeInnerPanel(innerPanel);
        makeOuterPanel(outerPanel);
    }

    private static void makeInnerPanel(JPanel innerPanel){
        GridBagConstraints constraint = new GridBagConstraints();//布局内容控制器
        GridBagLayout innerLayout = new GridBagLayout();
        innerPanel.setLayout(innerLayout);
        JLabel title = new JLabel("国内BOSS");
        title.setFont(new Font("宋体", Font.BOLD,30));
        JLabel tr1 = new JLabel("BOSS名称");
        tr1.setFont(new Font("宋体", Font.BOLD,20));
        JLabel tr2 = new JLabel("BOSS位置");
        tr2.setFont(new Font("宋体", Font.BOLD,20));
        JLabel tr3 = new JLabel("击杀时间");
        tr3.setFont(new Font("宋体", Font.BOLD,20));
        JLabel tr4 = new JLabel("刷新间隔（分钟）");
        tr4.setFont(new Font("宋体", Font.BOLD,20));
        JLabel tr5 = new JLabel("刷新时间");
        tr5.setFont(new Font("宋体", Font.BOLD,20));
        innerPanel.add(title);
        innerPanel.add(tr1);
        innerPanel.add(tr2);
        innerPanel.add(tr3);
        innerPanel.add(tr4);
        innerPanel.add(tr5);
        innerLayout.setConstraints(title,generateConstraints(constraint,1.0,1.0,0,0,5,1));
        innerLayout.setConstraints(tr1,generateConstraints(constraint,1.0,1.0,0,1,1,1));
        innerLayout.setConstraints(tr2,generateConstraints(constraint,1.0,1.0,1,1,1,1));
        innerLayout.setConstraints(tr3,generateConstraints(constraint,1.0,1.0,2,1,1,1));
        innerLayout.setConstraints(tr4,generateConstraints(constraint,1.0,1.0,3,1,1,1));
        innerLayout.setConstraints(tr5,generateConstraints(constraint,1.0,1.0,4,1,1,1));
    }

    private static void makeOuterPanel(JPanel outerPanel){
        GridBagConstraints constraint = new GridBagConstraints();//布局内容控制器
        GridBagLayout innerLayout = new GridBagLayout();
        outerPanel.setLayout(innerLayout);
        JLabel title = new JLabel("国外BOSS");
        title.setFont(new Font("宋体", Font.BOLD,30));
        outerPanel.add(title);
        constraint.weightx = 1.0;
        constraint.weighty = 1.0;
        constraint.gridx =0;
        constraint.gridy = 0;
        constraint.insets = new Insets(5,5,5,5);
        innerLayout.setConstraints(title,constraint);
    }

    private static GridBagConstraints generateConstraints(GridBagConstraints constraint,double weightx,double weighty,int gridx,int gridy,int gridwidth,int gridheight){
        constraint.fill = GridBagConstraints.CENTER;
        constraint.weightx = weightx;
        constraint.weighty = weighty;
        constraint.gridwidth = gridwidth;
        constraint.gridheight = gridheight;
        constraint.gridx = gridx;
        constraint.gridy = gridy;
        constraint.insets = new Insets(5,5,5,5);
        return constraint;
    }
}
