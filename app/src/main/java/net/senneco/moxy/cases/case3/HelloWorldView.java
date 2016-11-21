package net.senneco.moxy.cases.case3;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * Date: 31.10.2016
 * Time: 18:32
 *
 * @author Yuri Shmakov
 */
@StateStrategyType(AddToEndSingleStrategy.class)
public interface HelloWorldView extends MvpView {
	void showTimer();

	void hideTimer();

	void setTimer(int seconds);

	void showMessage(int message);

	void hideMessage();
}
