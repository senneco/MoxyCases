package net.senneco.moxy.cases.case1;

import com.arellomobile.mvp.MvpView;

/**
 * Date: 31.10.2016
 * Time: 18:32
 *
 * @author Yuri Shmakov
 */

public interface HelloWorldView extends MvpView {
	void showMessage(int message);
}
