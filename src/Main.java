import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cha> QuanLySach;
    static Scanner sc = new Scanner(System.in);

    public static void nhapTaiLieu() {
        int n;
        int nhapLoaiTaiLieu;
        int nhapTiep;
        boolean hopLe = false;
        do {
            System.out.println("--- Chon loai tai lieu ban muon nhap ---");
            System.out.println("1 ---> Sach");
            System.out.println("2 ---> Bao");
            System.out.println("3 ---> Tap Chi");
            System.out.print("Lua chon cua ban la: ");
            nhapLoaiTaiLieu = sc.nextInt();
            System.out.print("- Nhap so luong tai lieu: ");
            n = sc.nextInt();
            sc.nextLine();
            System.out.println("So luong tai lieu muon them la: " + n);
            System.out.println("----------------------");
            switch (nhapLoaiTaiLieu) {
                case 1:
                    System.out.println("--------> SACH <--------");
                    for (int i = 0; i < n; i++) {
                        Sach sach = new Sach();
                        System.out.print("- Nhap ma sach thu " + i + ": ");
                        sach.maTaiLieu = sc.nextInt();
                        int k = 0;
                        do {
                            k = 0;
                            for (Cha taiLieu : QuanLySach) {
                                if (taiLieu.maTaiLieu == sach.maTaiLieu) {
                                    k = 1;
                                }
                            }
                            if (k == 1) {
                                System.out.println("Ma tai lieu da ton tai, xin hay nhap lai !!!");
                                System.out.print("+ Nhap lai ma sach thu " + i + ": ");
                                sach.maTaiLieu = sc.nextInt();
                            }
                        } while (k == 1);
                        sc.nextLine();
                        System.out.print("Nhap ten nha xuat ban: ");
                        sach.tenNhaXuatBan = sc.nextLine();
                        System.out.print("Nhap so ban phat hanh: ");
                        sach.SoBanPhatHanh = sc.nextInt();
                        System.out.print("Nhap so trang: ");
                        sach.soTrang = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhap ten tac gia: ");
                        sach.TenTacGia = sc.nextLine();
                        System.out.println("-----------------------------------");
                        QuanLySach.add(sach);
                    }
                    System.out.println("Ban muon nhap them tai lieu khong?");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    nhapTiep = sc.nextInt();
                    sc.nextLine();
                    if(nhapTiep == 1){
                        continue;
                    }
                    else if( nhapTiep == 2){
                        hopLe = true;
                        break;
                    }
                case 2:
                    System.out.println("----> BAO <----");
                    for (int i = 0; i < n; i++) {
                        Bao bao = new Bao();
                        System.out.print("- Nhap ma bao thu " + i + ": ");
                        bao.maTaiLieu = sc.nextInt();
                        int k = 0;
                        do {
                            k = 0;
                            for (Cha taiLieu : QuanLySach) {
                                if (taiLieu.maTaiLieu == bao.maTaiLieu) {
                                    k = 1;
                                }
                            }
                            if (k == 1) {
                                System.out.println("Ma tai lieu da ton tai, xin hay nhap lai !!!");
                                System.out.print("+ Nhap lai ma bao thu " + i + ": ");
                                bao.maTaiLieu = sc.nextInt();
                            }
                        } while (k == 1);
                        sc.nextLine();
                        System.out.print("Nhap ten nha xuat ban: ");
                        bao.tenNhaXuatBan = sc.nextLine();
                        System.out.print("Nhap so ban phat hanh: ");
                        bao.SoBanPhatHanh = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhap ngay phat hanh theo dinh dang dd/mm/YYYY: ");
                        bao.ngayPhatHanh = sc.nextLine();
                        System.out.println("-----------------------------------");
                        QuanLySach.add(bao);
                    }
                    System.out.println("Ban muon nhap them tai lieu khong?");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    nhapTiep = sc.nextInt();
                    sc.nextLine();
                    if(nhapTiep == 1){
                        continue;
                    }
                    else if( nhapTiep == 2){
                        hopLe = true;
                        break;
                    }
                case 3:
                    System.out.println("----> TAP CHI <----");
                    for (int i = 0; i < n; i++) {
                        TapChi tc = new TapChi();
                        System.out.print("- Nhap ma sach thu " + i + ": ");
                        tc.maTaiLieu = sc.nextInt();
                        int k = 0;
                        do {
                            k = 0;
                            for (Cha taiLieu : QuanLySach) {
                                if (taiLieu.maTaiLieu == tc.maTaiLieu) {
                                    k = 1;
                                }
                            }
                            if (k == 1) {
                                System.out.println("Ma tai lieu da ton tai, xin hay nhap lai !!!");
                                System.out.print("+ Nhap lai ma sach thu " + i + ": ");
                                tc.maTaiLieu = sc.nextInt();
                            }
                        } while (k == 1);
                        sc.nextLine();
                        System.out.print("Nhap ten nha xuat ban: ");
                        tc.tenNhaXuatBan = sc.nextLine();
                        System.out.print("Nhap so ban phat hanh: ");
                        tc.SoBanPhatHanh = sc.nextInt();
                        System.out.print("Nhap so phat hanh: ");
                        tc.soPhatHanh = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhap thang phat hanh: ");
                        tc.thangPhatHanh = sc.nextLine();
                        System.out.println("-----------------------------------");
                        QuanLySach.add(tc);
                    }
                    System.out.println("Ban muon nhap them tai lieu khong?");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    nhapTiep = sc.nextInt();
                    sc.nextLine();
                    if(nhapTiep == 1){
                        continue;
                    }
                    else if( nhapTiep == 2){
                        hopLe = true;
                        break;
                    }
                case 4:
                    System.out.println("=====================================");
                    break;
                default:
                    System.out.println("!!!Oh no so ban nhap khong hop le vui long nhap lai tu so 1 - 3!!!!");
                    break;
            }
        } while (!hopLe);
    }

    public static void xuatTaiLieu(List<Cha> QuanLySach){
        System.out.println("----> Danh sach sach <----");

        for (Cha cha : QuanLySach) {
            if(cha instanceof Sach){
                Sach sach = (Sach) cha;
                System.out.println("Ma san pham: " + sach.maTaiLieu);
                System.out.println("Ten nha xuat ban: " + sach.tenNhaXuatBan);
                System.out.println("So ban phat hanh: " + sach.SoBanPhatHanh);
                System.out.println("So trang: " + sach.soTrang);
                System.out.println("Ten tac gia: " + sach.TenTacGia);
                System.out.println("-----------------------------------");
            }
        }
        System.out.println("----> Danh sach bao <----");
        for (Cha cha : QuanLySach) {
            if(cha instanceof Bao){
                Bao bao = (Bao) cha;
                System.out.println("Ma san pham: " + bao.maTaiLieu);
                System.out.println("Ten nha xuat ban: " + bao.tenNhaXuatBan);
                System.out.println("So ban phat hanh: " + bao.SoBanPhatHanh);
                System.out.println("So trang: " + bao.ngayPhatHanh);
                System.out.println("-----------------------------------");
            }
        }
        System.out.println("----> Danh sach tap chi <----");
        for (Cha cha : QuanLySach) {
            if(cha instanceof TapChi){
                TapChi tc = (TapChi) cha;
                System.out.println("Ma san pham: " + tc.maTaiLieu);
                System.out.println("Ten nha xuat ban: " + tc.tenNhaXuatBan);
                System.out.println("So ban phat hanh: " + tc.SoBanPhatHanh);
                System.out.println("So trang: " + tc.thangPhatHanh);
                System.out.println("So trang: " + tc.soPhatHanh);
                System.out.println("-----------------------------------");
            }
        }
    }

    public static void xoaTaiLieu(List<Cha> QuanLySach) {
        boolean hopLe = false;
        do {
            System.out.println("--- Chon loai tai lieu ban muon xoa ---");
            System.out.println("1 ---> Sach");
            System.out.println("2 ---> Bao");
            System.out.println("3 ---> Tap Chi");
            int xoaLoaiTaiLieu = sc.nextInt();
            sc.nextLine();
            switch (xoaLoaiTaiLieu) {
                case 1:
                    Sach sach = new Sach();
                    int maTaiLieu = sc.nextInt();
                    sc.nextLine();
                    sach.maTaiLieu = maTaiLieu;
                    List<Cha> maTaiLieuCanXoa = new ArrayList<>();
                    for (Cha taiLieu : QuanLySach) {
                        if (taiLieu instanceof  Sach){
                            if (taiLieu.maTaiLieu == sach.maTaiLieu) {
                                maTaiLieuCanXoa.add(taiLieu);
                            }
                        }
                    }
                    QuanLySach.removeAll(maTaiLieuCanXoa);
                    hopLe = true;
                    break;
                case 2:
                    Bao bao = new Bao();
                    System.out.print("- Nhap ma bao can xoa: ");
                    int maTaiLieu2 = sc.nextInt();
                    sc.nextLine();
                    bao.maTaiLieu = maTaiLieu2;
                    List<Cha> maTaiLieuCanXoa2 = new ArrayList<>();
                    for (Cha taiLieu : QuanLySach) {
                        if(taiLieu instanceof Bao){
                            if (taiLieu.maTaiLieu == bao.maTaiLieu) {
                                maTaiLieuCanXoa2.add(taiLieu);
                            } else {
                                System.out.println("!!! Ma tai lieu khong ton tai !!!");
                            }
                        }
                    }
                    QuanLySach.removeAll(maTaiLieuCanXoa2);
                    hopLe = false;
                    break;
                case 3:
                    TapChi tc = new TapChi();
                    System.out.print("- Nhap ma tap chi can xoa: ");
                    int maTaiLieu3 = sc.nextInt();
                    sc.nextLine();
                    tc.maTaiLieu = maTaiLieu3;
                    List<Cha> maTaiLieuCanXoa3 = new ArrayList<>();
                    for (Cha taiLieu : QuanLySach) {
                        if (taiLieu instanceof  TapChi){
                            if (taiLieu.maTaiLieu == tc.maTaiLieu) {
                                maTaiLieuCanXoa3.add(taiLieu);
                            }
                        }
                    }
                    QuanLySach.removeAll(maTaiLieuCanXoa3);
                    hopLe = true;
                    break;
                default:
                    break;
            }
        } while (!hopLe);
    }

    public static void timKiemTaiLieu(List<Cha> QuanLySach) {
        boolean hopLe = false;
        List<Cha> KetQua = new ArrayList<Cha>();
        do {
            System.out.println("--- Chon loai tai lieu ban muon xem ---");
            System.out.println("1 ---> Sach");
            System.out.println("2 ---> Bao");
            System.out.println("3 ---> Tap Chi");
            System.out.print("Lua chon cua ban la: ");
            int kiemTra = sc.nextInt();
            sc.nextLine();
            switch (kiemTra) {
                case 1:
                    System.out.print("Ma tai lieu ban muon tim la: ");
                    Sach sach = new Sach();
                    sach.maTaiLieu = sc.nextInt();
                    sc.nextLine();
                    for (Cha tailieu : QuanLySach) {
                        if (sach.maTaiLieu == tailieu.maTaiLieu) {
                            KetQua.add(tailieu);
                        }
                        for (Cha cha : KetQua) {
                            sach = (Sach) cha;
                            System.out.println("Ma san pham: " + sach.maTaiLieu);
                            System.out.println("Ten nha xuat ban: " + sach.tenNhaXuatBan);
                            System.out.println("So ban phat hanh: " + sach.SoBanPhatHanh);
                            System.out.println("So trang: " + sach.soTrang);
                            System.out.println("Ten tac gia: " + sach.TenTacGia);
                            System.out.println("-----------------------------------");
                        }
                    }
                    hopLe = true;
                    break;
                case 2:
                    System.out.print("Ma tai lieu ban muon tim la: ");
                    Bao bao = new Bao();
                    bao.maTaiLieu = sc.nextInt();
                    sc.nextLine();
                    for (Cha tailieu : QuanLySach) {
                        if (bao.maTaiLieu == tailieu.maTaiLieu) {
                            KetQua.add(tailieu);
                        }
                        for (Cha cha : KetQua) {
                            bao = (Bao) cha;
                            System.out.println("Ma san pham: " + bao.maTaiLieu);
                            System.out.println("Ten nha xuat ban: " + bao.tenNhaXuatBan);
                            System.out.println("So ban phat hanh: " + bao.SoBanPhatHanh);
                            System.out.println("So trang: " + bao.ngayPhatHanh);
                            System.out.println("-----------------------------------");
                        }
                    }
                    hopLe = true;
                    break;
                case 3:
                    System.out.print("Ma tai lieu ban muon tim la: ");
                    TapChi tc = new TapChi();
                    tc.maTaiLieu = sc.nextInt();
                    sc.nextLine();
                    for (Cha tailieu : QuanLySach) {
                        if (tc.maTaiLieu == tailieu.maTaiLieu) {
                            KetQua.add(tailieu);
                        }
                        for (Cha cha : KetQua) {
                            tc = (TapChi) cha;
                            System.out.println("Ma san pham: " + tc.maTaiLieu);
                            System.out.println("Ten nha xuat ban: " + tc.tenNhaXuatBan);
                            System.out.println("So ban phat hanh: " + tc.SoBanPhatHanh);
                            System.out.println("So trang: " + tc.thangPhatHanh);
                            System.out.println("Ten tac gia: " + tc.soPhatHanh);
                            System.out.println("-----------------------------------");
                        }
                    }
                    hopLe = true;
                    break;
            }
        } while (!hopLe);
    }

    public static void main(String[] args) {
        QuanLySach = new ArrayList<Cha>();
        nhapTaiLieu();
        xuatTaiLieu(QuanLySach);
        int check;
        do{
            check = 0;
            System.out.println("--- Chon chuc nang ban muon thuc hien ---");
            System.out.println("1 ---> Xoa tai lieu");
            System.out.println("2 ---> Tim kiem tai lieu");
            int chucNang = sc.nextInt();
            if(chucNang == 1){
                xoaTaiLieu(QuanLySach);
                xuatTaiLieu(QuanLySach);
                check = 1;
            } else if (chucNang == 2) {
                timKiemTaiLieu(QuanLySach);
                check = 1;
            } else {
                System.out.println("--- Lam gi co chuc nang nay, chon lai di ---");
                check = 0;
            }
        }while(check == 0);
    }
}