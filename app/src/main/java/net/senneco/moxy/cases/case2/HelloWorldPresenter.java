package net.senneco.moxy.cases.case2;

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
		AsyncTask<Void, Integer, Void> asyncTask = new AsyncTask<Void, Integer, Void>() {
			@Override
			protected void onPreExecute() {
				getViewState().showTimer();
			}

			@Override
			protected Void doInBackground(Void... voids) {
				for (int i = 5; i > 0; i--) {
					publishProgress(i);
					sleepSecond();

				}
				return null;
			}

			@Override
			protected void onProgressUpdate(Integer... values) {
				getViewState().setTimer(values[0]);
			}

			@Override
			protected void onPostExecute(Void aVoid) {
				getViewState().hideTimer();
				getViewState().showMessage(R.string.hello_world);
			}

			private void sleepSecond() {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// pass
				}
			}
		};

		asyncTask.execute();
	}
}
