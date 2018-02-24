package bluetooth.example.com.mytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by cherry on 2018/2/3.
 */

public class resultActivity  extends Activity {
    TextView num;
    TextView unit01;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_view);
        Intent intent = getIntent();
        String data = intent.getStringExtra("num_data");
        String unit = intent.getStringExtra("unit");
        num = (TextView) findViewById(R.id.num);
        unit01 = (TextView) findViewById(R.id.unit);
        num.setText(data);
        unit01.setText(unit);
    }
}
