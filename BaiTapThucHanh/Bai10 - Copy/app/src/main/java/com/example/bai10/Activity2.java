package com.example.bai10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_layout);

        EditText receiveValueEdit = findViewById(R.id.value_receive);
        Button callReceiverButton = findViewById(R.id.call_button);

        Bundle bundle = getIntent().getExtras();
        final long receiveValue = bundle.getLong("value");

        receiveValueEdit.setText(String.valueOf(receiveValue));

        callReceiverButton.setOnClickListener(v -> {
            Intent i = new Intent(Activity2.this, Receiver.class);
            i.putExtra("new value", receiveValue - 10);
            sendBroadcast(i);
        });
    }
}
