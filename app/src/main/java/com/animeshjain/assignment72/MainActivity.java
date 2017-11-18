package com.animeshjain.assignment72;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button viewContactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing obj for the Button

        viewContactBtn= (Button)findViewById(R.id.viewContactBtn);

        //OnClickListener for the viewContactBtn

        viewContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent to open contact menu of the phone

                Toast.makeText(MainActivity.this, "View Contact Button Clicked, Showing Contacts from Device",Toast.LENGTH_LONG).show();

                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivity(i);

            }
        });


    }

}
