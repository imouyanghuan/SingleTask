package com.scp.singletask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_layout);

		button = (Button) findViewById(R.id.btn_1);

		button.setOnClickListener(this);

	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i("tag", "MainActivity中的onRestart(方法)");
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(MainActivity.this, TwoActivity.class);
		Toast.makeText(this, "MainActivity的位置:"+this.toString(), 0).show();
		startActivity(intent);
	}
}
