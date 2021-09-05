package com.curtin.game.pracgrader;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

public class AppAlerter {
    Context ctx = null;
    private AlertDialog.Builder builder = null;
    public AppAlerter(Context context) {
        builder = new AlertDialog.Builder(context);
        ctx = context;
    }

    public void invalidSelection() {

    }

    public void showSuccess() {
        CharSequence seq = "Success!";
        Toast successToast = Toast.makeText(ctx, seq, Toast.LENGTH_SHORT);
        successToast.show();
    }



    public AlertDialog.Builder getAlert() {
        return builder;
    }



}
