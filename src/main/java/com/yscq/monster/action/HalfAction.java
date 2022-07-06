package com.yscq.monster.action;

import com.yscq.monster.cache.Cache;
import com.yscq.monster.utils.PanelUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class HalfAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button  = (JButton) e.getSource();
        if(Cache.half){
            Cache.half = false;
            button.setText("单倍刷怪");
        }else{
            Cache.half = true;
            button.setText("双倍刷怪");
        }

        JPanel innerPanel = Cache.mainFrame.getPanelList().get(1);
        JPanel outerPanel = Cache.mainFrame.getPanelList().get(2);
        innerPanel.removeAll();
        outerPanel.removeAll();
        PanelUtils.makeInnerPanel(innerPanel);
        PanelUtils.makeOuterPanel(outerPanel);
    }
}
