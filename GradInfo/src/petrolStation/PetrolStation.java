package petrolStation;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.gradinfo.gradinfoproba.R;

public class PetrolStation extends Activity {

	ListView listviewPetrol;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.petrol_station_main);

		listviewPetrol = (ListView) findViewById(R.id.petrol_station_list);
		String[] ids = new String[InputDataPetrolStation.Items.size()];
		for (int i = 0; i < ids.length; i++) {

			ids[i] = Integer.toString(i + 1);
		}

		ItemAdapterPetrolStation adapter = new ItemAdapterPetrolStation(this,
				R.layout.display_petrol_station, ids);
		listviewPetrol.setAdapter(adapter);

	}

}
