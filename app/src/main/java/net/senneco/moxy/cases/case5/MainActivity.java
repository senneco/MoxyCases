package net.senneco.moxy.cases.case5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import net.senneco.moxy.cases.R;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);

		if (savedInstanceState == null) {
			FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

			transaction.add(R.id.frame_1, getFragment(0xffFF80AB))
					.add(R.id.frame_2, getFragment(0xffCCFF90))
					.commit();
		}
	}

	private Fragment getFragment(int color) {
		CounterFragment fragment = new CounterFragment();
		Bundle args = new Bundle();
		args.putInt("argColor", color);
		fragment.setArguments(args);
		return fragment;
	}
}
