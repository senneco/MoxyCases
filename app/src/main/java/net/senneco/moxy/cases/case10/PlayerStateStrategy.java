package net.senneco.moxy.cases.case10;

import java.util.List;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

/**
 * Date: 05.11.2016
 * Time: 18:19
 *
 * @author Yuri Shmakov
 */

public class PlayerStateStrategy implements StateStrategy {

	@Override
	public <View extends MvpView> void beforeApply(List<ViewCommand<View>> currentState, ViewCommand<View> incomingState) {
		for (ViewCommand<View> viewCommand : currentState) {
			if (viewCommand.getTag().equals(PlayView.PLAYER_STATE)) {
				currentState.remove(viewCommand);
				break;
			}
		}
		currentState.add(incomingState);
	}

	@Override
	public <View extends MvpView> void afterApply(List<ViewCommand<View>> list, ViewCommand<View> viewCommand) {
		// pass
	}
}
