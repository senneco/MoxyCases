package net.senneco.moxy.cases;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LauncherActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);

		findViewById(R.id.activity_launcher_text_view_case_1).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case1.MainActivity.class)));
		findViewById(R.id.activity_launcher_text_view_case_2).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case2.MainActivity.class)));
		findViewById(R.id.activity_launcher_text_view_case_3).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case3.MainActivity.class)));
		findViewById(R.id.activity_launcher_text_view_case_4).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case4.MainActivity.class)));
		findViewById(R.id.activity_launcher_text_view_case_5).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case5.MainActivity.class)));
		findViewById(R.id.activity_launcher_text_view_case_6).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case6.MainActivity.class)));
		findViewById(R.id.activity_launcher_text_view_case_7).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case7.MainActivity.class)));
		findViewById(R.id.activity_launcher_text_view_case_8).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case8.DetailsActivity.class)));
		findViewById(R.id.activity_launcher_text_view_case_9).setOnClickListener(view -> startActivity(new Intent(this, net.senneco.moxy.cases.case9.DetailsActivity.class)));
	}
}
