package net.senneco.moxy.cases.case3;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import net.senneco.moxy.cases.R;

public class MainActivity extends MvpAppCompatActivity implements HelloWorldView {
	@InjectPresenter
	HelloWorldPresenter mHelloWorldPresenter;
	private TextView mTimerTextView;
	private AlertDialog mMessageDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mTimerTextView = (TextView) findViewById(R.id.timer_text_view);
	}

	@Override
	public void showTimer() {
		mTimerTextView.setVisibility(View.VISIBLE);
	}

	@Override
	public void hideTimer() {
		mTimerTextView.setVisibility(View.GONE);
	}

	@Override
	public void setTimer(int seconds) {
		mTimerTextView.setText(getString(R.string.timer, seconds));
	}

	@Override
	public void showMessage(int message) {
		mMessageDialog = new AlertDialog.Builder(this)
				.setTitle(R.string.app_name)
				.setMessage(message)
				.setPositiveButton(android.R.string.ok, null)
				.setOnDismissListener(dialogInterface -> mHelloWorldPresenter.onDismissMessage())
				.show();
	}

	@Override
	public void hideMessage() {
		if (mMessageDialog != null) {
			mMessageDialog.dismiss();
		}
	}
}
