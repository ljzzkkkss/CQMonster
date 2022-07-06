package com.yscq.monster.frame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    private List<JPanel> panelList = new ArrayList<>();

    public MainFrame(String title) {
        setTitle(title);    //设置显示窗口标题
        setSize(1200,800);    //设置窗口显示尺寸
        setLocation(1000,400);    //设置窗口初始化位置
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        setVisible(true);    //设置窗口是否可见
    }

    public void addPanel(JPanel panel) {
        panelList.add(panel);
    }

    public List<JPanel> getPanelList() {
        return panelList;
    }
}
