package net.senneco.moxy.cases.case9;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

/**
 * Created by senneco on 06.11.2016
 */
@InjectViewState
public class DetailsPresenter extends MvpPresenter<DetailsView> {
	public DetailsPresenter(long newsId) {
		loadNews(newsId);
	}

	private void loadNews(long newsId) {
		getViewState().showDetails("Details of \"" + newsId + "\"");
	}
}
