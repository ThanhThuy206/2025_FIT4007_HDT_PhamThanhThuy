+------------------------+
|         Book           |
+------------------------+
| - IdSach: String       |
| - tenSach: String      |
| - giaSach: double      |
| - giamGia: double      |
+------------------------+
| + Book(IdSach: String, tenSach: String, giaSach: double, giamGia: double) |
| + Book(IdSach: String, tenSach: String, giaSach: double)                  |
| + getIdSach(): String                                                     |
| + setIdSach(IdSach: String): void                                         |
| + getTenSach(): String                                                    |
| + setTenSach(tenSach: String): void                                       |
| + getGiaSach(): double                                                    |
| + setGiaSach(giaSach: double): void                                       |
| + getGiamGia(): double                                                    |
| + setGiamGia(giamGia: double): void                                       |
| + giaBan(): double                                                        |
| + hienThi(): void                                                         |
+------------------------+

             1
Main -------------------- 1..*
+------------------------+
|         Main           |
+------------------------+
| + main(args: String[]): void |
+------------------------+