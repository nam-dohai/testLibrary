package com.example.testlibrary;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class Nekowallet {
    public static void connect(Context context) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("nekowallet://market"));
        context.startActivity(intent);
    }
}
