package net.senneco.moxy.cases.case10;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * Date: 05.11.2016
 * Time: 18:11
 *
 * @author Yuri Shmakov
 */
@StateStrategyType(value = PlayerStateStrategy.class, tag = PlayView.PLAYER_STATE)
public interface PlayView extends MvpView {
	String PLAYER_STATE = "playerState";

	@StateStrategyType(SingleStateStrategy.class)
	void setCurrentTrack(String name);

	void play();
	void pause();
	void stop();
}
