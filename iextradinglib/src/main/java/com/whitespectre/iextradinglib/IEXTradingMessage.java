package com.whitespectre.iextradinglib;

import android.content.Context;
import android.widget.Toast;

public class IEXTradingMessage {
    public static void getMessage(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
