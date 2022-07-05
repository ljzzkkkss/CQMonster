package com.yscq.monster;

import com.yscq.monster.frame.MainFrame;
import com.yscq.monster.utils.PanelUtils;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        InputStream in = Main.class.getClassLoader().getResourceAsStream("data");
        String data = getFileContent(in);
        JFrame mainFrame = new MainFrame("原始传奇记怪器");
        JPanel innerPanel = new JPanel();//国内BOSS面板
        JPanel outerPanel = new JPanel();//国外BOSS面板
        PanelUtils.makeInnerPanel(innerPanel);
        PanelUtils.makeOuterPanel(outerPanel);
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
