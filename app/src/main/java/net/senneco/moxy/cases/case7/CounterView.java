package net.senneco.moxy.cases.case7;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * Created by senneco on 04.11.2016
 */
public interface CounterView extends MvpView {
	@StateStrategyType(AddToEndSingleStrategy.class)
	void showCount(int count);
}
