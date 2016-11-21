package net.senneco.moxy.cases.case7;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import net.senneco.moxy.cases.R;

public class MainActivity extends MvpAppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);

		((CounterWidget) findViewById(R.id.counter_1)).init(getMvpDelegate());
		((CounterWidget) findViewById(R.id.counter_2)).init(getMvpDelegate());
	}
}
