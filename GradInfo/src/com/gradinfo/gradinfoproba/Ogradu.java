package com.gradinfo.gradinfoproba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Ogradu extends Activity {

	TextView inText;
	ListView list;
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.city_list_in_n_past);

		inText = (TextView) findViewById(R.id.ogradu_txtview_uvod);

		list = (ListView) findViewById(R.id.ogradu_listview_list);

		new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
				R.array.listogradu);
		list.setAdapter(adapter);

	}
}