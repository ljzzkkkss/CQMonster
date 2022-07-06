package com.yscq.monster.action;

import com.yscq.monster.bean.Boss;
import com.yscq.monster.button.KillButton;
import com.yscq.monster.cache.Cache;
import com.yscq.monster.utils.DataUtils;
import com.yscq.monster.utils.PanelUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Date;

public class OuterKillAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        KillButton button  = (KillButton) e.getSource();
        int id = button.getId();
        Boss boss = Cache.BossMap.get(id);
        Date killTime = new Date();
        boss.setKillTime(killTime);
        Cache.BossMap.put(id,boss);
        JPanel panel = (JPanel) button.getParent();
        if(null != panel) {
            panel.removeAll();
            PanelUtils.makeOuterPanel(panel);
        }

        try {
            DataUtils.writeData();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
