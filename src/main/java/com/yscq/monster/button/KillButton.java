package com.yscq.monster.button;

import javax.swing.*;

public class KillButton extends JButton {
    private int id;

    public KillButton(int id,String text) {
        super(text);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
