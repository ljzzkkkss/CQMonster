package com.yscq.monster.utils;

import com.yscq.monster.bean.Boss;
import com.yscq.monster.cache.Cache;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class DataUtils {
    public synchronized static void writeData() throws IOException {
        File file = new File("data");
        List<String> lines = new ArrayList<>();
        for(Integer key : Cache.BossMap.keySet()){
            Boss boss = Cache.BossMap.get(key);
            lines.add(boss.getId() + "|" + boss.getName() + "|" + boss.getPosition() + "|" + boss.getFreshTime() + "|" + (null ==  boss.getKillTime() ? "" : boss.getKillTime().getTime()));
        }
        Path path = file.toPath();
        Files.write(path,lines, StandardCharsets.UTF_8);
    }

    public synchronized static Map<Integer,Boss> loadData() throws IOException {
        File file = new File("data");
        Path path = file.toPath();
        List<String> lines = Files.readAllLines(path);
        Map<Integer,Boss> result = new ConcurrentHashMap<>();
        lines = lines.stream().filter(v -> !v.isEmpty()).collect(Collectors.toList());
        for (String line : lines) {
            String[] data = line.split("\\|",5);
            Boss boss = new Boss();
            boss.setId(Integer.parseInt(data[0]));
            boss.setName(data[1]);
            boss.setPosition(data[2]);
            boss.setFreshTime(Integer.valueOf(data[3]));
            if(data[4].isEmpty()){
                boss.setKillTime(null);
            }else {
                boss.setKillTime(new Date(Long.parseLong(data[4])));
            }
            result.put(boss.getId(),boss);
        }
        return result;
    }
}
