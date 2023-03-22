package danhsachhinh;

public class HinhTron extends Hinh{
    public float r;

    public HinhTron(float r) {
        this.r = r;
    }

    public String toString() {
        return "HinhTron [r=" + r + "]";
    }
    @Override
    public double dienTich(){
        return this.r*this.r*3.14;
    }
}
