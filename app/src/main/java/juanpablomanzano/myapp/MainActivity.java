package juanpablomanzano.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void comenzar (View v){
        Intent intent = new Intent(getApplication(), MenuActivity.class);
        startActivity(intent);
    }
}
