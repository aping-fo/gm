package com.luckygames.wmxz.gamemaster.common.constants;

/**
 * Created by lucky on 2018/3/29.
 * GM管理地址
 */
public enum AdminUrl {
    BAN("/ban", "封禁操作"),
    MESSAGE("/sendSysMsg", "系统消息"),
    GETINFO("/getInfo", "获取玩家信息"),
    MAIL("/send_mail", "发送邮件"),
    CHAT("/chatMonitoring", "聊天监控"),
    KICK("KICK_PLAYER", "踢人"),
    BROADCAST("KICK_PLAYER", "发送广播");

    private final String url;
    private final String desc;

    private AdminUrl(String url, String desc) {
        this.url = url;
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public String getDesc() {
        return desc;
    }
}
