package com.example.android.bluetoothchat;

import android.graphics.Color;
import android.widget.ArrayAdapter;
import android.content.Context;
import com.example.android.bluetoothchat.ChatMessage;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.graphics.Color;

/**
 * Created by estelletidey on 07/03/2015.
 */
public class ChatMessageAdapter extends ArrayAdapter<ChatMessage> {

    public ChatMessageAdapter(Context context, ArrayList<ChatMessage> messages) {
        super(context, 0, messages);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ChatMessage chatMessage = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.message, parent, false);
        }
        // Lookup view for data population
        TextView msgUser = (TextView) convertView.findViewById(R.id.message_user);
        TextView msgText = (TextView) convertView.findViewById(R.id.message_msg);
        // Populate the data into the template view using the data object
        msgUser.setText(chatMessage.user);
        msgText.setText(chatMessage.msg);
        if (chatMessage.isMe) {
            msgUser.setTextColor(Color.RED);
        }
        else {
            msgUser.setTextColor(Color.BLUE);
        }
        // Return the completed view to render on screen
        return convertView;
    }
}
