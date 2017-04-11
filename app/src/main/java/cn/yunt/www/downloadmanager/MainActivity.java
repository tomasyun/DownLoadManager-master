package cn.yunt.www.downloadmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.yunt.www.downloadmanager.manager.UpdateManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new UpdateManager(this).checkUpdate(false);
    }
}
