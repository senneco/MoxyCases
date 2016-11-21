package net.senneco.moxy.cases.case1;

import java.util.concurrent.TimeUnit;

import android.os.AsyncTask;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import net.senneco.moxy.cases.R;

/**
 * Date: 31.10.2016
 * Time: 18:32
 *
 * @author Yuri Shmakov
 */

@InjectViewState
public class HelloWorldPresenter extends MvpPresenter<HelloWorldView> {
	public HelloWorldPresenter() {
		AsyncTask<Void, Void, Void> asyncTask = new AsyncTask<Void, Void, Void>() {

			@Override
			protected Void doInBackground(Void... voids) {
				sleepSecond();
				return null;
			}

			@Override
			protected void onPostExecute(Void aVoid) {
				getViewState().showMessage(R.string.hello_world);
			}

			private void sleepSecond() {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException ignore) {}
			}
		};

		asyncTask.execute();
	}
}
