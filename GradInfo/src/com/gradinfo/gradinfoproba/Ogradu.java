package com.gradinfo.gradinfoproba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class Ogradu extends Activity {

	TextView inText;
	ListView list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		inText = (TextView) findViewById(R.id.ogradu_txtview_uvod);
	
		list = (ListView) findViewById(R.id.ogradu_listview_list);

	}
}