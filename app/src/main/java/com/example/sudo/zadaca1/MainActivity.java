package com.example.sudo.zadaca1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sudo.zadaca1.models.InspiringPerson;


class MainActivity extends AppCompatActivity implements View.OnClickListener {


    InspiringPerson Turing = new InspiringPerson();
    InspiringPerson Bebidz = new InspiringPerson();
    InspiringPerson Grace = new InspiringPerson();

    TextView tvTuring, tvBebidz, tvGrace;

    ImageView ivturing;
    ImageView ivbebidz;
    ImageView ivgrace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();

    }
    private void initializeUI() {
        this.ivturing = (ImageView) findViewById(R.id.ivturing);
        this.ivbebidz = (ImageView) findViewById(R.id.ivbebidz);
        this.ivgrace = (ImageView) findViewById(R.id.ivgrace);
        this.tvTuring = (TextView) findViewById(R.id.tvturing);
        this.tvBebidz= (TextView) findViewById(R.id.tvbebidz);
        this.tvGrace= (TextView) findViewById(R.id.tvgrace);

        this.ivturing.setOnClickListener(this);
        this.ivbebidz.setOnClickListener(this);
        this.ivgrace.setOnClickListener(this);


        Turing.setBio(getResources().getString(R.string.turing));
        tvTuring.setText(Turing.getBio());

        Bebidz.setBio(getResources().getString(R.string.bebidz));
        tvBebidz.setText(Bebidz.getBio());

        Grace.setBio(getResources().getString(R.string.grace));
        this.tvGrace.setText(Grace.getBio());
    }

    public void onClick(View view){

       switch (view.getId()) {
           case R.id.ivturing:
               this.displayToast(getString(R.string.qTuring));

           case R.id.ivbebidz:
               this.displayToast(getString(R.string.qBebidz));

           case R.id.ivgrace:
               this.displayToast(getString(R.string.qGrace));
       }
    }
    private void displayToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
