package net.senneco.moxy.cases.case9;

import android.os.Bundle;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.PresenterType;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.arellomobile.mvp.presenter.ProvidePresenterTag;
import net.senneco.moxy.cases.R;

public class DetailsActivity extends MvpAppCompatActivity implements DetailsView {

	@InjectPresenter(type = PresenterType.GLOBAL)
	DetailsPresenter mDetailsPresenter;

	@ProvidePresenterTag(presenterClass = DetailsPresenter.class, type = PresenterType.GLOBAL)
	String provideDetailsPresenterTag() {
		return "details_" + getIntent().getLongExtra("extraDetailsId", 0);
	}

	@ProvidePresenter(type = PresenterType.GLOBAL)
	DetailsPresenter provideDetailsPresenter() {
		return new DetailsPresenter(getIntent().getLongExtra("extraDetailsId", 0));
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
	}

	@Override
	public void showDetails(String details) {
		((TextView) findViewById(R.id.activity_details_text_view_details)).setText(details);
	}
}
