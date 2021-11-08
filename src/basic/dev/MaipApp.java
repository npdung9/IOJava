package basic.dev;

import java.util.Scanner;

public class MaipApp {

	public static void main(String[] args) {
		//Thông tin một sinh viên
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap tenSinhVien :");
		String tenSinhVien = sc.nextLine() ;
		System.out.println(" ten Sinh Vien :" + tenSinhVien);
		
		System.out.println("Nhap ma SV :");
		String maSinhVien = sc.nextLine();
		System.out.println(" ma Sinh Vien :" + maSinhVien);
		
		System.out.println(" Nhap CMND :");
		int cmnd = sc.nextInt();
		System.out.println("cmnd :" + cmnd);
		
		System.out.println(" Nhap ten lop :");
		String tenLop = sc.nextLine();
		System.out.println("ten Lop :" + tenLop);
		
		System.out.println(" Nhap ten truong :");
		String tenTruong = sc.nextLine();
		System.out.println("ten Truong :" + tenTruong);
		
		System.out.println(" Nhap diem TB :");
		float diemTB = sc.nextFloat();
		System.out.println("diem TB :" + diemTB);
		
		//Thông tin công nhân
		
		System.out.println(" Nhap ten cong nhan :");
		String tenCongNhan = sc.nextLine();
		System.out.println(" ten Cong Nhan:" + tenCongNhan);
		
		System.out.println(" Nhap dia chi :");
		String diaChi = sc.nextLine();
		System.out.println(" dia Chi :" + diaChi);
		
		System.out.println(" Nhap so dien thoai");
		String soDienThoai = sc.nextLine();
		System.out.println(" so dien thoai :" + soDienThoai);
		
		System.out.println(" Nhap he so luong :");
		float heSoLuong = sc.nextFloat();
		System.out.println("he so luong :" + heSoLuong);
		
		//Thông tin một chiếc xe
		
		System.out.println(" Nhap ten xe :");
		String tenXe = sc.nextLine();
		System.out.println(" ten xe :" + tenXe);
		
		System.out.println(" Nhap hang xe :");
		String hangXe = sc.nextLine();
		System.out.println(" hang xe :" + hangXe);
		
		System.out.println(" Nhap gia xe :");
		int giaXe = sc.nextInt();
		System.out.println(" gia xe :" + giaXe);
		
		System.out.println(" Nhap mau son :");
		String mauSon = sc.nextLine();
		System.out.println(" mau son :" + mauSon);
		
	}

}
