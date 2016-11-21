package net.senneco.moxy.cases.case5;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

/**
 * Created by senneco on 04.11.2016
 */
@InjectViewState
public class CounterPresenter extends MvpPresenter<CounterView> {
	private int mCount;

	public CounterPresenter() {
		getViewState().showCount(mCount);
	}

	public void onPlusClick() {
		mCount++;
		getViewState().showCount(mCount);
	}
}
