package com.sharkexample.textwatcher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView tvCPF;
    private  EditText etCPF;
    private  TextWatcher     cpfMask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     tvCPF = (TextView) findViewById(R.id.lblTitleCPF);
     etCPF = (EditText) findViewById(R.id.txtCPF);

        cpfMask = textWatcherCPF.insert("###.###.###-##", etCPF);
        etCPF.addTextChangedListener(cpfMask);
    }
}
