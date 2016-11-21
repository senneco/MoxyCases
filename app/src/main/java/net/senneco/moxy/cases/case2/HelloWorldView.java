package net.senneco.moxy.cases.case2;

import com.arellomobile.mvp.MvpView;

/**
 * Date: 31.10.2016
 * Time: 18:32
 *
 * @author Yuri Shmakov
 */

public interface HelloWorldView extends MvpView {
	void showTimer();

	void hideTimer();

	void setTimer(int seconds);

	void showMessage(int message);
}
