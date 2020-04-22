package com.example.mynotification;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class NotificationCounter {
    private TextView notificationNumber;

    private final int MAX_NUMBER=99;
    private  int notification_number_counter = 1;

    public NotificationCounter(View view){
        notificationNumber = view.findViewById(R.id.notificationNumber);
    }

    public void  IncreaseNumber(){
        notification_number_counter++;

        if(notification_number_counter>MAX_NUMBER){
            Log.d("counter","Max number reached");
        }else{
                notificationNumber.setText(String.valueOf(notification_number_counter));
        }
    }
}

