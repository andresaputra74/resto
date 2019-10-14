package com.example.resto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.resto.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class KategoriMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_menu);
    }

    public static List<Menu> getListMenu() {
        List<Menu> listMakanan = new ArrayList<>();

        listMakanan.add(new Menu(
                R.drawable.chickenburger,

        ));
    }

    private static String[] KategoriMenu = {
            "Food",
            "Ice Drink",
            "Snack",
            "Hot Drink"
    };
    private static String[] Food = {
            "Chicken Burger dari bahan pilihan yang berkualitas baik, dengan roti kualitas terbaik, daun selada yang masih segar serta daging ayam pilihan yang berkualitas dengan baik",
            "Black Burger pengeluaran Burger terbaru dengan warna yang sedikit berbeda dan berkualitas baik tersedia dengan daging pilihan, keju berkualitas, dan sayuran yang terbaik dari hasil panen",
            "Beef Burger dengan menggunakan daging sapi pilihan dan berkualitas serta dengan tekstur yang pas cocok untuk semua usia",
            "Cheese Burger dari keju pilihan yang terbaik dan bahan-bahan pilihan yang berkualitas baik dengan menggunakan alat-alat yang hygienis sesuai standart",
            "Spicy Burger dengan pengeluaran terbaru dan mempunyai rasa pedas pada burger ini dengan cabe pilihan terbaik dari hasil panen dan berkualiatas",
            "Hot Dog terbuat dari sosis dari daging sapi pilihan yang terbaik dan roti pilihan yang terbuat dari gandum terbaik serta ditambahkan saus-saus pilihan yang sesuai standart",
            "Kebab merupakan makanan asal Turki dengan menggunakan daging-daging yang diolah terlebih dahulu dan ditambahkan sayur-sayuran hasil dari panen yang berkualitas",
            "Sandwich makanan dengan sayuran terbaik dari hasil panen dan ditambahkan dengan telur yang berkualitas dan beef daging yang diolah dengan hygienis"
    };
    private static String[] Harga_Food = {
            "Rp. 34.000",
            "Rp. 38.000",
            "Rp. 36.000",
            "Rp. 37.000",
            "Rp. 40.000",
            "Rp. 24.000",
            "Rp. 26.000"
    };
    private static int[] Pict_Food = {
            R.drawable.chickenburger,
            R.drawable.burgerblack,
            R.drawable.burgerdaging,
            R.drawable.burgerkeju1,
            R.drawable.burgerspicy,
            R.drawable.hotdog,
            R.drawable.kebab,
            R.drawable.sandwich
    };
    private static String[] Drink = {
            "Ice Bubble Gum",
            "Ice Cappucino",
            "Ice Chocolate",
            "Ice Green Tea",
            "Ice Taro Blend",
            "Ice Strowberry Blend",
            "Ice Lychee Tea",
            "Ice Milk Tea"
    };
    private static String[] Harga_Drink = {
            "Rp. 15.000",
            "Rp. 12.000",
            "Rp. 16.000",
            "Rp. 14.000",
            "Rp. 16.000",
            "Rp. 13.000",
            "Rp. 11.000",
            "Rp. 10.000"
    };
    private static int[] Pict_Drink = {
            R.drawable.bubblegum1,
            R.drawable.cappucino1,
            R.drawable.coklat,
            R.drawable.greentea1,
            R.drawable.taroblend1,
            R.drawable.strawberry,
            R.drawable.lecitea,
            R.drawable.milktea1
    };

    private static String[] Hot_Drink = {
            "Hot Cappucino",
            "Hot Carramel",
            "Hot Chocolate",
            "Hot Moccacino",
            "Hot Tea",
            "Kopi Tubruk"
    };
    private static String[] Harga_Hot_Drink = {
            "Rp. 14.000",
            "Rp. 16.000",
            "Rp. 12.000",
            "Rp. 16.000",
            "Rp. 8.000",
            "Rp. 12.000"
    };
    private static int[] Pict_Hot_Drink = {
            R.drawable.cappucino,
            R.drawable.caramel,
            R.drawable.coklatpanas,
            R.drawable.mochacino,
            R.drawable.hottea,
            R.drawable.kopitubruk
    };

    private static String[] Snack = {
            "Cryspi Chicken",
            "Cryspi Mushroom",
            "French Fries",
            "Onion Ring",
            "Roti Bakar",
            "Sosis Bakar",
            "Tahu Bakso",
            "Tahu Pong"
    };
    private static String[] Harga_Snack = {
            "Rp. 14.000",
            "Rp. 12.000",
            "Rp. 10.000",
            "Rp. 14.000",
            "Rp. 10.000",
            "Rp. 14.000",
            "Rp. 10.000",
            "Rp. 10.000"
    };
    private static int[] Pict_Snack = {
            R.drawable.ayamkrispi1,
            R.drawable.jamurkrispi1,
            R.drawable.kentang1,
            R.drawable.onionring1,
            R.drawable.rotibakar1,
            R.drawable.sosisbakar1,
            R.drawable.tahubakso1,
            R.drawable.tahupong
    };
}
