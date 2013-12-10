package petrolStation;

import java.util.ArrayList;

public class InputDataPetrolStation {
	public static ArrayList<ItemPetrolStation> Items;

	public static void LoadData() {

		Items = new ArrayList<ItemPetrolStation>();
		Items.add(new ItemPetrolStation(1, "ina_logo.png", "INA Mitnica",
				"Adresa: Bana Josipa Jelaèiæa BB", "Radno vrijeme: 00:24h",
				"Telefon: 091/497-1308"));
		Items.add(new ItemPetrolStation(2, "ina_logo.png", "INA Priljevo",
				"Priljevo BB", "00:24", "091/497-1309"));
		Items.add(new ItemPetrolStation(3, "ina_logo.png", "INA Borovo",
				"Blage Zadre BB", "00:24", "091/497-1293"));
		Items.add(new ItemPetrolStation(4, "ina_petrol_logo.png", "INA Petrol",
				"Kudeljarska 3", "00:24", "032/432-253"));
		Items.add(new ItemPetrolStation(5, "vuka_logo.png", "Vuka Benz",
				"Kudeljarska 6", "00:24", "032/432-864"));
		Items.add(new ItemPetrolStation(6, "omv_logo.png", "OMV",
				"Kudeljarska 4B", "00:24", "032/432-829"));
		Items.add(new ItemPetrolStation(7, "lukoil_logo.png", "Lukoil",
				"Trg Drvena pijaca BB", "00:24", "032/414-769"));
	}

	public static ItemPetrolStation GetbyId(int id) {

		for (ItemPetrolStation item : Items) {
			if (item.Id == id) {
				return item;
			}
		}
		return null;
	}

}
