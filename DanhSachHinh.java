package danhsachhinh;

import java.util.ArrayList;

public class DanhSachHinh {
    public ArrayList<Hinh> listdanhsachhinh;

    public DanhSachHinh(){
        this.listdanhsachhinh = new ArrayList<Hinh>();
    }

    public DanhSachHinh(ArrayList<Hinh> listdanhsachhinh) {
        this.listdanhsachhinh = listdanhsachhinh;
    }

    public void THEM(Hinh hinh){
        this.listdanhsachhinh.add(hinh);
    }
    public void inDanhSach(){
        for(Hinh danhsach : listdanhsachhinh){
            System.out.println(danhsach);
        }
    }
}
