package com.yscq.monster.utils;

import com.yscq.monster.action.InnerKillAction;
import com.yscq.monster.bean.Boss;
import com.yscq.monster.button.KillButton;
import com.yscq.monster.cache.Cache;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PanelUtils {
    public static void makeInnerPanel(JPanel innerPanel){
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
        generateBossItem(constraint,innerPanel,innerLayout,1,"魔龙教主", "会员之家①层", null, 60,3);
        generateBossItem(constraint,innerPanel,innerLayout,2,"魔龙教主", "魔龙祭坛", null, 60,4);
        generateBossItem(constraint,innerPanel,innerLayout,3,"魔龙教主", "地宫·入口", null, 60,5);
        generateBossItem(constraint,innerPanel,innerLayout,4,"魔龙教主", "地宫·深渊", null, 60,6);
        innerLayout.setConstraints(title,generateConstraints(constraint,1.0,1.0,0,0,5,1));
        innerLayout.setConstraints(tr1,generateConstraints(constraint,1.0,1.0,0,1,1,1));
        innerLayout.setConstraints(tr2,generateConstraints(constraint,1.0,1.0,1,1,1,1));
        innerLayout.setConstraints(tr3,generateConstraints(constraint,1.0,1.0,2,1,1,1));
        innerLayout.setConstraints(tr4,generateConstraints(constraint,1.0,1.0,3,1,1,1));
        innerLayout.setConstraints(tr5,generateConstraints(constraint,1.0,1.0,4,1,1,1));
        innerPanel.updateUI();
    }

    public static void makeOuterPanel(JPanel outerPanel){
        GridBagConstraints constraint = new GridBagConstraints();//布局内容控制器
        GridBagLayout outerLayout = new GridBagLayout();
        outerPanel.setLayout(outerLayout);
        JLabel title = new JLabel("国外BOSS");
        title.setFont(new Font("宋体", Font.BOLD,30));
        outerPanel.add(title);
        constraint.weightx = 1.0;
        constraint.weighty = 1.0;
        constraint.gridx =0;
        constraint.gridy = 0;
        constraint.insets = new Insets(5,5,5,5);
        outerLayout.setConstraints(title,constraint);
        outerPanel.updateUI();
    }

    private static GridBagConstraints generateConstraints(GridBagConstraints constraint,double weightx,double weighty,int gridx,int gridy,int gridwidth,int gridheight){
        constraint.fill = GridBagConstraints.CENTER;
        constraint.weightx = weightx;
        constraint.weighty = weighty;
        constraint.gridwidth = gridwidth;
        constraint.gridheight = gridheight;
        constraint.gridx = gridx;
        constraint.gridy = gridy;
        constraint.insets = new Insets(5,5,5,20);
        return constraint;
    }

    private static void generateBossItem(GridBagConstraints constraint, JPanel panel, GridBagLayout layout, int id, String bossName, String position, Date killTime, int freshTime, int row){
        Boss boss = Cache.BossMap.get(id);
        if(null == boss) {
            boss = new Boss();
            boss.setId(id);
            boss.setName(bossName);
            boss.setPosition(position);
            boss.setKillTime(killTime);
            boss.setFreshTime(freshTime);
            Cache.BossMap.put(id,boss);
        }
        JLabel labelName = new JLabel(boss.getName());
        labelName.setFont(new Font("行楷", Font.PLAIN,20));
        panel.add(labelName);
        layout.setConstraints(labelName,generateConstraints(constraint,1.0,1.0,0,row - 1,1,1));
        JLabel labelPosition = new JLabel(boss.getPosition());
        labelPosition.setFont(new Font("行楷", Font.PLAIN,20));
        panel.add(labelPosition);
        layout.setConstraints(labelPosition,generateConstraints(constraint,1.0,1.0,1,row - 1,1,1));
        if(null == boss.getKillTime()) {
            KillButton killButton = new KillButton(id,"击杀");
            killButton.addActionListener(new InnerKillAction());
            panel.add(killButton);
            layout.setConstraints(killButton, generateConstraints(constraint, 1.0, 1.0, 2, row - 1, 1, 1));
        }else{
            JLabel labelKillTime = new JLabel(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(boss.getKillTime()));
            labelKillTime.setFont(new Font("行楷", Font.PLAIN, 20));
            panel.add(labelKillTime);
            layout.setConstraints(labelKillTime, generateConstraints(constraint, 1.0, 1.0, 2, row - 1, 1, 1));
        }
        freshTime = Cache.half ? boss.getFreshTime() / 2 : boss.getFreshTime();
        JLabel labelFreshTime = new JLabel(String.valueOf(freshTime));
        labelFreshTime.setFont(new Font("行楷", Font.PLAIN,20));
        panel.add(labelFreshTime);
        layout.setConstraints(labelFreshTime,generateConstraints(constraint,1.0,1.0,3,row - 1,1,1));
        if(null == boss.getKillTime()) {
            JLabel labelRebornTime = new JLabel("未知");
            labelRebornTime.setFont(new Font("行楷", Font.PLAIN, 20));
            panel.add(labelRebornTime);
            layout.setConstraints(labelRebornTime, generateConstraints(constraint, 1.0, 1.0, 4, row - 1, 1, 1));
        }else{
            JLabel labelRebornTime = new JLabel(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(boss.getKillTime().getTime() + freshTime * 60 * 1000)));
            labelRebornTime.setFont(new Font("行楷", Font.PLAIN, 20));
            panel.add(labelRebornTime);
            layout.setConstraints(labelRebornTime, generateConstraints(constraint, 1.0, 1.0, 4, row - 1, 1, 1));
        }
    }

}
