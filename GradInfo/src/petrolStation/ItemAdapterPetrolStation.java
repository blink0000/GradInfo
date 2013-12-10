package petrolStation;

import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gradinfo.gradinfoproba.R;

public class ItemAdapterPetrolStation extends ArrayAdapter<String> {

	private final Context context;
	private final String[] Ids;
	private final int rowResourceId;

	public ItemAdapterPetrolStation(Context context, int textViewResourceId,
			String[] objects) {
		super(context, textViewResourceId, objects);

		this.context = context;
		this.Ids = objects;
		this.rowResourceId = textViewResourceId;
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(rowResourceId, parent, false);
		ImageView imageView = (ImageView) rowView
				.findViewById(R.id.iconPetrolStation);
		TextView textViewName = (TextView) rowView
				.findViewById(R.id.tvNamePetrol);
		TextView textViewAddress = (TextView) rowView
				.findViewById(R.id.tvAddressPetrol);
		TextView textViewTime = (TextView) rowView.findViewById(R.id.tvTime);
		TextView textViewPhone = (TextView) rowView
				.findViewById(R.id.tvPhonePetrol);

		int id = Integer.parseInt(Ids[position]);
		String imageFile = InputDataPetrolStation.GetbyId(id).IconFile;

		textViewName.setText(InputDataPetrolStation.GetbyId(id).Name);
		textViewAddress.setText(InputDataPetrolStation.GetbyId(id).Address);
		textViewTime.setText(InputDataPetrolStation.GetbyId(id).Time);
		textViewPhone.setText(InputDataPetrolStation.GetbyId(id).Phone);

		InputStream ims = null;
		try {
			ims = context.getAssets().open(imageFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// load image as Drawable

		Drawable d = Drawable.createFromStream(ims, null);
		// set image to ImageView
		imageView.setImageDrawable(d);
		return rowView;

	}

}
