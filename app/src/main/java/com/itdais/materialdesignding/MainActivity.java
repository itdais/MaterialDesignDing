package com.itdais.materialdesignding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.itdais.materialdesignding.bottomsheet.BottomSheetActivity;
import com.itdais.materialdesignding.drawerlayout.DrawerLayoutMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doclick(View v){
        Intent intent;
        switch (v.getId()) {
            case R.id.botton_bottomsheets:
                intent = new Intent(this, BottomSheetActivity.class);
                startActivity(intent);
                break;
            case R.id.botton_drawerlayout:
                intent = new Intent(this, DrawerLayoutMainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
