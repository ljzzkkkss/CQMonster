package com.yscq.monster.action;

import com.yscq.monster.cache.Cache;

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
    }
}
