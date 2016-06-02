package com.arpaul.sampletoolbar;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Aritra on 6/2/2016.
 */
public class ThirdActivity extends BaseActivity {

    @Override
    public void initialize() {
        View view = baseinflater.inflate(R.layout.activity_child,null);
        llBody.addView(view);

        TextView tvChild = (TextView) view.findViewById(R.id.tvChild);

        tvChild.setText("Third Screen");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorGreen)));
//        tvChild.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
//            }
//        });
    }
}
