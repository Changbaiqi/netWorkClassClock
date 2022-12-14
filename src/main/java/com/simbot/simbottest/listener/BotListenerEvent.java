package com.simbot.simbottest.listener;

import love.forte.simboot.annotation.ContentTrim;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simboot.filter.MatchType;
import love.forte.simbot.event.GroupMessageEvent;
import love.forte.simbot.message.MessagesBuilder;
import org.springframework.stereotype.Component;

import java.applet.Applet;
import java.io.File;
import java.net.MalformedURLException;

@Component
public class BotListenerEvent {


    @Filter(value = "签到" , matchType = MatchType.TEXT_CONTAINS)
    @Listener
    @ContentTrim
    public void onSource(GroupMessageEvent event){
        MessagesBuilder builder = new MessagesBuilder();
        builder.append("触发关键字...\n正在启动闹钟...\n启动成功...");
        //这里改成对应闹钟音频的绝对路径
        File file = new File("C:\\Users\\20840\\Music\\鹿乃 (かの) - DAYBREAK FRONTLINE.wav");
        try {
            Applet.newAudioClip(file.toURL()).play();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        event.getSource().sendBlocking(builder.build());

    }

}
