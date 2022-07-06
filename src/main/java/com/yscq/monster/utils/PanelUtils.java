package com.yscq.monster.utils;

import com.yscq.monster.action.InnerKillAction;
import com.yscq.monster.action.OuterKillAction;
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
        JLabel tr6 = new JLabel("状态");
        tr6.setFont(new Font("宋体", Font.BOLD,20));
        innerPanel.add(title);
        innerPanel.add(tr1);
        innerPanel.add(tr2);
        innerPanel.add(tr3);
        innerPanel.add(tr4);
        innerPanel.add(tr5);
        innerPanel.add(tr6);
        generateBossItem(constraint,innerPanel,innerLayout,1,"魔龙教主", "会员之家①层", null, 60,3, 1);
        generateBossItem(constraint,innerPanel,innerLayout,2,"魔龙教主", "魔龙祭坛", null, 60,4, 1);
        generateBossItem(constraint,innerPanel,innerLayout,3,"魔龙教主", "地宫·入口", null, 60,5, 1);
        generateBossItem(constraint,innerPanel,innerLayout,4,"魔龙教主", "地宫·深渊", null, 60,6, 1);
        generateBossItem(constraint,innerPanel,innerLayout,5,"魔龙树妖", "幻境九层", null, 60,7, 1);
        generateBossItem(constraint,innerPanel,innerLayout,6,"魔龙树妖", "会员之家②层", null, 60,8, 1);
        generateBossItem(constraint,innerPanel,innerLayout,7,"魔龙树妖", "魔龙谷", null, 60,9, 1);
        generateBossItem(constraint,innerPanel,innerLayout,8,"魔龙树妖", "地宫·峡谷", null, 60,10, 1);
        generateBossItem(constraint,innerPanel,innerLayout,9,"变异魔龙战将", "恶魔广场", null, 60,11, 1);
        generateBossItem(constraint,innerPanel,innerLayout,10,"变异魔龙战将", "魔龙血路", null, 60,12, 1);
        generateBossItem(constraint,innerPanel,innerLayout,12,"变异魔龙战将", "会员之家③层", null, 60,14, 1);
        generateBossItem(constraint,innerPanel,innerLayout,13,"暗之魔龙教主", "魔龙血域", null, 60,15, 1);
        generateBossItem(constraint,innerPanel,innerLayout,14,"暗之魔龙教主", "烟花之地", null, 60,16, 1);
        generateBossItem(constraint,innerPanel,innerLayout,16,"暗之魔龙教主", "恶魔广场", null, 60,18, 1);
        generateBossItem(constraint,innerPanel,innerLayout,17,"火龙教主", "火龙殿", null, 90,19, 1);
        generateBossItem(constraint,innerPanel,innerLayout,18,"火龙教主", "圣域幻境一层", null, 90,20, 1);
        generateBossItem(constraint,innerPanel,innerLayout,19,"火龙统领", "恶魔广场", null, 90,21, 1);
        generateBossItem(constraint,innerPanel,innerLayout,20,"火龙统领", "屠龙殿", null, 90,22, 1);
        generateBossItem(constraint,innerPanel,innerLayout,21,"火龙统领", "烟花之地", null, 90,23, 1);
        generateBossItem(constraint,innerPanel,innerLayout,22,"火龙统领", "地宫·入口", null, 90,24, 1);
        generateBossItem(constraint,innerPanel,innerLayout,23,"变异火龙教主", "恶魔广场", null, 90,25, 1);
        generateBossItem(constraint,innerPanel,innerLayout,24,"变异火龙教主", "玛雅神殿五层", null, 90,26, 1);
        generateBossItem(constraint,innerPanel,innerLayout,25,"变异火龙教主", "火龙地带", null, 90,27, 1);
        generateBossItem(constraint,innerPanel,innerLayout,26,"变异火龙教主", "地宫·峡谷", null, 90,28, 1);
        generateBossItem(constraint,innerPanel,innerLayout,27,"变异火龙教主", "地宫·深渊", null, 90,29, 1);
        generateBossItem(constraint,innerPanel,innerLayout,28,"绿魔蜘蛛", "恶魔广场", null, 120,30, 1);
        generateBossItem(constraint,innerPanel,innerLayout,29,"绿魔蜘蛛", "会员之家①层", null, 120,31, 1);
        generateBossItem(constraint,innerPanel,innerLayout,30,"绿魔蜘蛛", "雷炎洞穴二层", null, 120,32, 1);
        generateBossItem(constraint,innerPanel,innerLayout,31,"绿魔蜘蛛", "地宫·入口关", null, 120,33, 1);
        generateBossItem(constraint,innerPanel,innerLayout,32,"红魔蜘蛛", "恶魔广场", null, 120,34, 1);
        generateBossItem(constraint,innerPanel,innerLayout,33,"红魔蜘蛛", "会员之家①层", null, 120,35, 1);
        generateBossItem(constraint,innerPanel,innerLayout,34,"红魔蜘蛛", "烟花之地", null, 120,36, 1);
        generateBossItem(constraint,innerPanel,innerLayout,35,"雷炎蛛王", "会员之家②层", null, 120,37, 1);
        generateBossItem(constraint,innerPanel,innerLayout,36,"雷炎蛛王", "雷炎殿", null, 120,38, 1);
        generateBossItem(constraint,innerPanel,innerLayout,37,"雷炎蛛王", "圣域幻境二层", null, 120,39, 1);
        generateBossItem(constraint,innerPanel,innerLayout,38,"玉面素狐王", "恶魔广场", null, 150,40, 1);
        generateBossItem(constraint,innerPanel,innerLayout,39,"玉面素狐王", "会员之家②层", null, 150,41, 1);
        generateBossItem(constraint,innerPanel,innerLayout,40,"玉面素狐王", "狐月圣殿", null, 150,42, 1);
        generateBossItem(constraint,innerPanel,innerLayout,41,"玉面素狐王", "圣域幻境三层", null, 150,43, 1);
        generateBossItem(constraint,innerPanel,innerLayout,42,"玉面素狐王", "沙巴克宝阁", null, 150,44, 1);
        generateBossItem(constraint,innerPanel,innerLayout,43,"金爪赤狐王", "恶魔广场", null, 150,45, 1);
        generateBossItem(constraint,innerPanel,innerLayout,44,"金爪赤狐王", "会员之家②层", null, 150,46, 1);
        generateBossItem(constraint,innerPanel,innerLayout,45,"金爪赤狐王", "狐月密道", null, 150,47, 1);
        generateBossItem(constraint,innerPanel,innerLayout,46,"金爪赤狐王", "地宫·峡谷", null, 150,48, 1);
        generateBossItem(constraint,innerPanel,innerLayout,47,"变异狐月天珠", "烟花之地", null, 150,49, 1);
        generateBossItem(constraint,innerPanel,innerLayout,48,"变异狐月天珠", "会员之家③层", null, 150,50, 1);
        generateBossItem(constraint,innerPanel,innerLayout,49,"雪域魔王", "玛雅神殿五层", null, 150,51, 1);
        generateBossItem(constraint,innerPanel,innerLayout,50,"雪域魔王", "雪域冰宫三层", null, 150,52, 1);
        generateBossItem(constraint,innerPanel,innerLayout,51,"雪域魔王", "圣域幻境四层", null, 150,53, 1);
        generateBossItem(constraint,innerPanel,innerLayout,52,"雪域魔王", "极寒入口", null, 150,54, 1);
        generateBossItem(constraint,innerPanel,innerLayout,53,"冰城帝王", "会员之家②层", null, 150,55, 1);
        generateBossItem(constraint,innerPanel,innerLayout,54,"冰城帝王", "英雄圣地", null, 150,56, 1);
        generateBossItem(constraint,innerPanel,innerLayout,55,"冰城帝王", "极寒入口", null, 150,57, 1);
        generateBossItem(constraint,innerPanel,innerLayout,56,"冰宫守护神", "恶魔广场", null, 180,58, 1);
        generateBossItem(constraint,innerPanel,innerLayout,57,"冰宫守护神", "地宫·深渊", null, 150,59, 1);
        generateBossItem(constraint,innerPanel,innerLayout,58,"冰宫守护神", "跨服遗迹四层", null, 150,60, 1);
        generateBossItem(constraint,innerPanel,innerLayout,59,"半兽人统帅", "玛雅神殿六层", null, 180,61, 1);
        generateBossItem(constraint,innerPanel,innerLayout,60,"半兽人统帅", "半兽人陵墓", null, 180,62, 1);
        generateBossItem(constraint,innerPanel,innerLayout,61,"兽人巨怪", "会员之家③层", null, 180,63, 1);
        generateBossItem(constraint,innerPanel,innerLayout,62,"兽人巨怪", "瘟疫沼泽", null, 180,64, 1);
        generateBossItem(constraint,innerPanel,innerLayout,63,"兽人巨怪", "跨服遗迹四层", null, 180,65, 1);
        generateBossItem(constraint,innerPanel,innerLayout,64,"半兽人首领", "半兽人陵墓", null, 180,66, 1);
        generateBossItem(constraint,innerPanel,innerLayout,65,"半兽人首领", "瘟疫沼泽", null, 180,67, 1);
        generateBossItem(constraint,innerPanel,innerLayout,66,"半兽人首领", "极寒地宫", null, 180,68, 1);
        generateBossItem(constraint,innerPanel,innerLayout,67,"至尊圣皇[五倍]", "皇陵地宫", null, 180,69, 1);
        generateBossItem(constraint,innerPanel,innerLayout,68,"威远将军[三倍]", "皇陵地宫", null, 150,70, 1);
        innerLayout.setConstraints(title,generateConstraints(constraint,1.0,1.0,0,0,5,1));
        innerLayout.setConstraints(tr1,generateConstraints(constraint,1.0,1.0,0,1,1,1));
        innerLayout.setConstraints(tr2,generateConstraints(constraint,1.0,1.0,1,1,1,1));
        innerLayout.setConstraints(tr3,generateConstraints(constraint,1.0,1.0,2,1,1,1));
        innerLayout.setConstraints(tr4,generateConstraints(constraint,1.0,1.0,3,1,1,1));
        innerLayout.setConstraints(tr5,generateConstraints(constraint,1.0,1.0,4,1,1,1));
        innerLayout.setConstraints(tr6,generateConstraints(constraint,1.0,1.0,5,1,1,1));
        innerPanel.updateUI();
    }

    public static void makeOuterPanel(JPanel outerPanel){
        GridBagConstraints constraint = new GridBagConstraints();//布局内容控制器
        GridBagLayout outerLayout = new GridBagLayout();
        outerPanel.setLayout(outerLayout);
        JLabel title = new JLabel("国外BOSS");
        title.setFont(new Font("宋体", Font.BOLD,30));
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
        JLabel tr6 = new JLabel("状态");
        tr6.setFont(new Font("宋体", Font.BOLD,20));
        outerPanel.add(title);
        outerPanel.add(tr1);
        outerPanel.add(tr2);
        outerPanel.add(tr3);
        outerPanel.add(tr4);
        outerPanel.add(tr5);
        outerPanel.add(tr6);
        constraint.weightx = 1.0;
        constraint.weighty = 1.0;
        constraint.gridx =0;
        constraint.gridy = 0;
        constraint.insets = new Insets(5,5,5,5);
        outerLayout.setConstraints(title,constraint);
        generateBossItem(constraint,outerPanel,outerLayout,69,"远古蛛后", "神龙帝国", null, 120,3, 2);
        outerLayout.setConstraints(title,generateConstraints(constraint,1.0,1.0,0,0,5,1));
        outerLayout.setConstraints(tr1,generateConstraints(constraint,1.0,1.0,0,1,1,1));
        outerLayout.setConstraints(tr2,generateConstraints(constraint,1.0,1.0,1,1,1,1));
        outerLayout.setConstraints(tr3,generateConstraints(constraint,1.0,1.0,2,1,1,1));
        outerLayout.setConstraints(tr4,generateConstraints(constraint,1.0,1.0,3,1,1,1));
        outerLayout.setConstraints(tr5,generateConstraints(constraint,1.0,1.0,4,1,1,1));
        outerLayout.setConstraints(tr6,generateConstraints(constraint,1.0,1.0,5,1,1,1));
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

    private static void generateBossItem(GridBagConstraints constraint, JPanel panel, GridBagLayout layout, int id, String bossName, String position, Date killTime, int freshTime, int row, int type){
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
        freshTime = Cache.half ? boss.getFreshTime() / 2 : boss.getFreshTime();
        JLabel labelFreshTime = new JLabel(String.valueOf(freshTime));
        labelFreshTime.setFont(new Font("行楷", Font.PLAIN,20));
        panel.add(labelFreshTime);
        layout.setConstraints(labelFreshTime,generateConstraints(constraint,1.0,1.0,3,row - 1,1,1));
        if(null == boss.getKillTime()) {
            KillButton killButton = new KillButton(id,"击杀");
            killButton.addActionListener(1 == type ? new InnerKillAction() : new OuterKillAction());
            panel.add(killButton);
            layout.setConstraints(killButton, generateConstraints(constraint, 1.0, 1.0, 2, row - 1, 1, 1));
            JLabel labelRebornTime = new JLabel("未知");
            labelRebornTime.setFont(new Font("行楷", Font.PLAIN, 20));
            panel.add(labelRebornTime);
            layout.setConstraints(labelRebornTime, generateConstraints(constraint, 1.0, 1.0, 4, row - 1, 1, 1));
            JLabel labelStatus = new JLabel("未知");
            labelStatus.setFont(new Font("行楷", Font.PLAIN,20));
            panel.add(labelStatus);
            layout.setConstraints(labelStatus,generateConstraints(constraint,1.0,1.0,5,row - 1,1,1));
        }else{
            Date rebornTime = new Date(boss.getKillTime().getTime() + (long) freshTime * 60 * 1000);
            JLabel labelRebornTime = new JLabel(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(rebornTime));
            labelRebornTime.setFont(new Font("行楷", Font.PLAIN, 20));
            panel.add(labelRebornTime);
            layout.setConstraints(labelRebornTime, generateConstraints(constraint, 1.0, 1.0, 4, row - 1, 1, 1));
            if(rebornTime.after(new Date())) {
                JLabel labelKillTime = new JLabel(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(boss.getKillTime()));
                labelKillTime.setFont(new Font("行楷", Font.PLAIN, 20));
                panel.add(labelKillTime);
                layout.setConstraints(labelKillTime, generateConstraints(constraint, 1.0, 1.0, 2, row - 1, 1, 1));
                JLabel labelStatus = new JLabel("复活中");
                labelStatus.setFont(new Font("行楷", Font.PLAIN,20));
                labelStatus.setForeground(Color.RED);
                panel.add(labelStatus);
                layout.setConstraints(labelStatus,generateConstraints(constraint,1.0,1.0,5,row - 1,1,1));
            }else{
                KillButton killButton = new KillButton(id,"击杀");
                killButton.addActionListener(new InnerKillAction());
                panel.add(killButton);
                layout.setConstraints(killButton, generateConstraints(constraint, 1.0, 1.0, 2, row - 1, 1, 1));
                JLabel labelStatus = new JLabel("已刷新");
                labelStatus.setFont(new Font("行楷", Font.PLAIN,20));
                labelStatus.setForeground(Color.GREEN);
                panel.add(labelStatus);
                layout.setConstraints(labelStatus,generateConstraints(constraint,1.0,1.0,5,row - 1,1,1));
            }
        }
    }

}
