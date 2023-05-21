package id.ac.uinsuska.myapplication;

import java.io.Serializable;

public class Lauk implements Serializable {
    private String Judul, price;
    private int img;

    public Lauk(String judul, String price, int img) {
        Judul = judul;
        this.price = price;
        this.img = img;
    }



    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
