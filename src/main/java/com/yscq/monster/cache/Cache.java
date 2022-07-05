package com.yscq.monster.cache;

import com.yscq.monster.bean.Boss;
import com.yscq.monster.frame.MainFrame;

import javax.swing.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    public static Map<Integer, Boss> BossMap = new ConcurrentHashMap<>();
    public static boolean half = false;
    public static JFrame mainFrame;
}
