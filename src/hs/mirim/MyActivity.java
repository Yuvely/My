package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MyActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageButton btnStart = (ImageButton)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MyActivity.this, Secret.class);
				
			}
		});
    }
}