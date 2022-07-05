package com.yscq.monster.action;

import com.yscq.monster.bean.Boss;
import com.yscq.monster.button.KillButton;
import com.yscq.monster.cache.Cache;
import com.yscq.monster.utils.PanelUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class KillAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        KillButton button  = (KillButton) e.getSource();
        int id = button.getId();
        Boss boss = Cache.BossMap.get(id);
        Date killTime = new Date();
        int freshTime = Cache.half ? boss.getFreshTime() / 2 : boss.getFreshTime();
        Date rebornTime = new Date(killTime.getTime() + (long) freshTime * 60 * 1000);
        boss.setKillTime(killTime);
        boss.setRebornTime(rebornTime);
        Cache.BossMap.put(id,boss);
        JPanel panel = (JPanel) button.getParent();
        panel.removeAll();
        PanelUtils.makeInnerPanel(panel);
    }
}
