package com.example.parvez.findmyphone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class about_pop extends Activity {
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_pop);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("&#169;7ate9Dev \nBy- Karandeep & Parvez Hassan(UI)")
                .setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        about_pop.this.finish();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        // show it
        alertDialog.show();
    }

}
