package net.senneco.moxy.cases.case1;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import net.senneco.moxy.cases.R;

public class MainActivity extends MvpAppCompatActivity implements HelloWorldView {
	@InjectPresenter
	HelloWorldPresenter mHelloWorldPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void showMessage(int message) {
		TextView messageTextView = new TextView(this);
		messageTextView.setText(message);
		messageTextView.setTextSize(40);
		messageTextView.setGravity(Gravity.CENTER_HORIZONTAL);
		((ViewGroup) findViewById(R.id.activity_main)).addView(messageTextView);
	}
}
