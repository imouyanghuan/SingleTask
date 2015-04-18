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

public class TwoActivity extends Activity implements OnClickListener {
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.two_layout);

		button = (Button) findViewById(R.id.btn_2);

		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(TwoActivity.this, MainActivity.class);
		Toast.makeText(this, "TwoActivity的位置:"+this.toString(), 0).show();
		startActivity(intent);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("tag", "TwoActivity中的onDestroy");
	}
}
