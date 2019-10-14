package com.example.resto;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

public class Makanan implements Parcelable {

    private ImageView gambar;
    private String nama, harga;

    public ImageView getGambar() {
        return gambar;
    }
    public void setGambar(ImageView gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(harga);
    }

    protected Makanan(Parcel in) {
        nama = in.readString();
        harga = in.readString();
    }

    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };
}
