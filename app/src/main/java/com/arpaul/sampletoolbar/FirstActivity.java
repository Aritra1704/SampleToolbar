package com.arpaul.sampletoolbar;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Aritra on 6/2/2016.
 */
public class FirstActivity extends BaseActivity {

    @Override
    public void initialize() {
        View view = baseinflater.inflate(R.layout.activity_child,null);
        llBody.addView(view);

        TextView tvChild = (TextView) view.findViewById(R.id.tvChild);

        tvChild.setText("First Screen");

        tvChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstActivity.this,SecondActivity.class));
            }
        });
    }
}
