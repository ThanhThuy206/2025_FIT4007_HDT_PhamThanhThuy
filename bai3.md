             1..*       
Main ----------------- Student
+-------------------------------+
|            Main               |
+-------------------------------+
|                               |
+-------------------------------+
| + main(args: String[]): void  |
+-------------------------------+

+-------------------------------+
|           Student             |
+-------------------------------+
| - maSinhVien: String          |
| - hoTen: String               |
| - namSinh: int                |
| - diaChi: String              |
+-------------------------------+
| + Student(maSinhVien: String, hoTen: String, namSinh: int, diaChi: String) |
| + getMaSinhVien(): String                                                 |
| + setMaSinhVien(maSinhVien: String): void                                 |
| + getHoTen(): String                                                      |
| + setHoTen(hoTen: String): void                                           |
| + getNamSinh(): double                                                    |
| + setNamSinh(namSinh: int): void                                          |
| + getDiaChi(): String                                                     |
| + setDiaChi(diaChi: String): void                                         |
| + tinhTuoi(): int                                                         |
| + hienThi(): void                                                         |
+-------------------------------+