public class bai2 {
    static class book {
        private String IdSach;
        private String tenSach;
        private double giaSach;
        private double giamGia;

        public book(String idSach, String tenSach, double giaSach, double giamGia) {
            this.IdSach =  idSach;
            this.tenSach = tenSach;
            this.giaSach = giaSach;  
            this.giamGia = giamGia;
        }

        public book(String idSach, String tenSach, double giaSach) {
            this.IdSach = idSach;
            this.tenSach = tenSach;
            this.giaSach = giaSach;
            this.giamGia = 0;
        }

        public String getIdSach() {
            return IdSach;
        }

        public void setIdSach(String IdSach) {
            this.IdSach = IdSach;
        }
        
        public String getTenSach() {
            return tenSach;
        }

        public void setTenSach(String tenSach) {
            this.tenSach = tenSach;
        }

        public double getGiaSach() {
            return giaSach;
        }

        public void setGiaSach(double giaSach) {
            this.giaSach = giaSach;
        }
        
        public double getGiamGia() {
            return giamGia;
        }

        public void setGiamGia(double giamGia) {
            this.giamGia = giamGia;
        }

        public double giaBan() {
            return giaSach - giamGia;
        }

        public void hienThi() {
            System.out.println("Mã Sách: " + IdSach);
            System.out.println("Tên Sách: " + tenSach);
            System.out.println("Giá Sách: " + giaSach);
            System.out.println("Giảm giá: " + giamGia);
            System.out.println("Giá bán: " + giaBan());
        }
    }
    public static void main(String[] args) {
        book sach = new book("B001", "Doraemon", 100000, 200);
        System.out.println("Thông tin sách ban đầu :");
        sach.hienThi();
        System.out.println("Giá bán: " + sach.giaBan());

        // giá đổi
        sach.setGiaSach(3000);
        
        System.out.println("Thông tin sau khi thay đổi được giảm giá: ");
        sach.hienThi();
        System.out.println("Giá bán mới: " + sach.giaBan());

    }
}
