package com.example.android.bluetoothchat;

/**
 * Created by estelletidey on 07/03/2015.
 */
public class ChatMessage {
    public Boolean isMe;
    public String user;
    public String msg;

    public ChatMessage(Boolean isMe, String user, String msg)
    {
        this.isMe = isMe;
        this.user = user;
        this.msg = msg;
    }
}
