package com.example.bai10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Activity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_layout);

        final EditText editValue = findViewById(R.id.value_edit);
        final Button sendButton = findViewById(R.id.send_button);

        sendButton.setOnClickListener(v -> {
            String valueString = editValue.getText().toString();
            long value = (valueString.isEmpty()) ? 0 : Long.parseLong(valueString);

            Bundle sendBundle = new Bundle();
            sendBundle.putLong("value", value);

            Intent intent = new Intent(Activity1.this, Activity2.class);
            intent.putExtras(sendBundle);
            startActivity(intent);
        });
    }
}
