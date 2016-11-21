package net.senneco.moxy.cases.case7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.arellomobile.mvp.MvpDelegate;
import com.arellomobile.mvp.presenter.InjectPresenter;
import net.senneco.moxy.cases.R;

/**
 * Date: 05.11.2016
 * Time: 16:09
 *
 * @author Yuri Shmakov
 */

public class CounterWidget extends FrameLayout implements CounterView {

	private MvpDelegate mParentDelegate;
	private MvpDelegate<CounterWidget> mMvpDelegate;

	@InjectPresenter
	CounterPresenter mCounterPresenter;
	private TextView mCounterTextView;

	public CounterWidget(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.item_counter, this, true);
		mCounterTextView = (TextView) findViewById(R.id.count_text);
		View button = findViewById(R.id.plus_button);
		button.setOnClickListener(view -> mCounterPresenter.onPlusClick());
	}

	public void init(MvpDelegate parentDelegate) {
		mParentDelegate = parentDelegate;

		getMvpDelegate().onCreate();
		getMvpDelegate().onAttach();
	}

	@Override
	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();

		getMvpDelegate().onSaveInstanceState();
		getMvpDelegate().onDetach();
	}

	public MvpDelegate<CounterWidget> getMvpDelegate() {
		if (mMvpDelegate != null) {
			return mMvpDelegate;
		}

		mMvpDelegate = new MvpDelegate<>(this);
		mMvpDelegate.setParentDelegate(mParentDelegate, String.valueOf(getId()));
		return mMvpDelegate;
	}

	@Override
	public void showCount(int count) {
		mCounterTextView.setText(String.valueOf(count));
	}
}
