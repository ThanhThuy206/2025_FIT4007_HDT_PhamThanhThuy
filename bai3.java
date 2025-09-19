import java.time.LocalDate;

public class bai3 {
    static class Student {
        private String maSinhVien;
        private String hoTen;
        private int namSinh;
        private String diaChi;

        public Student(String maSinhVien, String hoTen, int namSinh, String diaChi) {
            this.maSinhVien = maSinhVien;
            this.hoTen = hoTen;
            this.namSinh = namSinh;
            this.diaChi = diaChi;
        }

        public String getMaSinhVien() {
            return maSinhVien;
        }

        public void setMaSinhVien(String maSinhVien) {
            this.maSinhVien = maSinhVien;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen= hoTen;
        }

        public double getNamSinh() {
            return namSinh;
        }

        public void setNamSinh(int namSinh) {
            this.namSinh =  namSinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public int tinhTuoi() {
            int namHienTai = LocalDate.now().getYear();
            if (namSinh == 0) {
                return 0;
            }
            return namHienTai - (int) namSinh;
        }

        public void hienThi() {
            System.out.println("Thông tin Sinh viên: ");
            System.out.println("- Mã sinh viên: " + maSinhVien);
            System.out.println("- Họ tên: " + hoTen);
            System.out.println("- Năm sinh: " + namSinh);
            System.out.println("- Địa chỉ: " + diaChi);
            System.out.println("- Tuổi của sinh viên: " + tinhTuoi() + " tuổi");
        }
    }

    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Bùi Văn Chương", 2006, "Hà Nội");
        sv1.hienThi();
        Student sv2 = new Student("SV002", "Phạm Thanh Thuý", 2006, "Hà Nội");
        sv2.hienThi();
    }
}
