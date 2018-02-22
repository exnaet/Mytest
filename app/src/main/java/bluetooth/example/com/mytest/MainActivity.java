package bluetooth.example.com.mytest;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import bluetooth.example.com.everightlibrary.everightActivity;

public class MainActivity extends Activity {
    private Button testButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testButton = (Button) super.findViewById(R.id.button);
        testButton.setOnClickListener(myOnClickListener);
    }
    protected View.OnClickListener myOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,bluetooth.example.com.everightlibrary.everightActivity.class);
            //Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
            //这里的packetname 一定记住填写 掉用方的packetname 因为 aar最终会被合并到调用方的manifest文件
            //intent.setComponent(new ComponentName("bluetooth.example.com.mytest","bluetooth.example.com.bluetooth.everightlibrary"));//classname//
            startActivity(intent);
            //Intent intent = intent.setClassName(MainActivity.this, PasswordActivity.class);
            //startActivity(intent);
        }
    };
}
