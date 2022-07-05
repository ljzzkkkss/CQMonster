package com.yscq.monster.frame;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(String title) {
        setTitle(title);    //设置显示窗口标题
        setSize(1000,800);    //设置窗口显示尺寸
        setLocation(1000,400);    //设置窗口初始化位置
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        setVisible(true);    //设置窗口是否可见
    }
}
