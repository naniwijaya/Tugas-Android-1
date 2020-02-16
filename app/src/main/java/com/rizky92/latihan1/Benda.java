package com.rizky92.latihan1;

import android.os.Parcel;
import android.os.Parcelable;

// INI POJO (Plain Old Java Object)

public class Benda implements Parcelable {
    private String nama;
    private int harga;
    private int stok;

    public Benda() {
    }

    private Benda(Parcel in) {
        nama = in.readString();
        harga = in.readInt();
        stok = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeInt(harga);
        dest.writeInt(stok);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Benda> CREATOR = new Creator<Benda>() {
        @Override
        public Benda createFromParcel(Parcel in) {
            return new Benda(in);
        }

        @Override
        public Benda[] newArray(int size) {
            return new Benda[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
