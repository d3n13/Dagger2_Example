package ru.bilenkod.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PenComponent component = DaggerPenComponent.create();
        Pen pen = component.getPen();
        pen.write();
    }
}