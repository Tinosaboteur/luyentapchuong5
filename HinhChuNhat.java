package danhsachhinh;

public class HinhChuNhat extends Hinh{
    public float cd, cr;

    public HinhChuNhat(){}

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public String toString() {
        return "HinhChuNhat [cd=" + cd + ", cr=" + cr + "]";
    }
    
    @Override
    public double dienTich(){
        return this.cd*this.cr;
    }
}
