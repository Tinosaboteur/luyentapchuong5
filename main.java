package danhsachhinh;

import java.util.Scanner;

public class main {
    
    private static HinhTron nhapHinhTron() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ban kinh:");
        int r=input.nextInt();
        return new HinhTron(r);
    }
    private static HinhChuNhat nhapHinhChuNhat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        int cd=input.nextInt();
        System.out.println("Nhap chieu rong:");
        int cr=input.nextInt();
        return new HinhChuNhat(cd,cr);
    }
        public static void main(String[] args) {
            HinhChuNhat hinhchunhat = nhapHinhChuNhat();
            HinhTron hinhtron = nhapHinhTron();

            // System.out.println("Thong tin hinh tron: "+hinhtron.toString()+"Dien tich hinh tron la:"+hinhtron.dienTich());
            // System.out.println("Thong tin hinh chu nhat: "+hinhchunhat.toString()+"Dien tich hinh chu nhat la:"+hinhchunhat.dienTich());

            DanhSachHinh dsh = new DanhSachHinh();
            System.out.println("Thong tin cac danh sach hinh la:");
            dsh.THEM(hinhtron);
            dsh.THEM(hinhchunhat);
            dsh.inDanhSach();
    }
}
