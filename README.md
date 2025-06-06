# Grade Converter - Hệ thống chuyển đổi điểm số

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-4.13.2-green.svg)](https://junit.org/junit4/)

## 📋 Tổng quan

Grade Converter là một ứng dụng Java đơn giản được thiết kế để chuyển đổi điểm số (0-100) thành thang điểm chữ cái (A, B, C, D, E). Dự án này được phát triển với mục đích học tập và thực hành các kỹ thuật lập trình Java, testing với JUnit, và tích hợp CI/CD với Jenkins.

## 🏗️ Cấu trúc dự án

```
ncyu-jenkins/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── example/
│   │               ├── Main.java              # Class chính của ứng dụng
│   │               └── GradeConverter.java    # Logic chuyển đổi điểm
│   └── test/
│       └── java/
│           └── GradeConverterTest.java        # Test cases cho GradeConverter
├── pom.xml                                    # Maven configuration
└── README.md                                  # Tài liệu dự án
```

## 🔧 Yêu cầu hệ thống

- **Java**: Phiên bản 17 trở lên
- **Maven**: Phiên bản 3.6 trở lên
- **JUnit**: 4.13.2 (được quản lý bởi Maven)

## 🚀 Hướng dẫn cài đặt và chạy

### 1. Clone repository

```bash
git clone https://github.com/NguyenHuynhPhuVinh/ncyu-jenkins.git
cd ncyu-jenkins
```

### 2. Biên dịch dự án

```bash
mvn compile
```

### 3. Chạy ứng dụng

```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```

### 4. Chạy tests

```bash
mvn test
```

### 5. Tạo package

```bash
mvn package
```

## 📊 Hệ thống chuyển đổi điểm

Ứng dụng sử dụng thang điểm sau để chuyển đổi:

| Điểm số | Thang điểm chữ cái | Mô tả |
|---------|-------------------|-------|
| 90-100  | A                 | Xuất sắc |
| 80-89   | B                 | Giỏi |
| 70-79   | C                 | Khá |
| 60-69   | D                 | Trung bình |
| 0-59    | E                 | Yếu |
| < 0 hoặc > 100 | Invalid | Điểm không hợp lệ |

## 🧪 Testing

Dự án bao gồm một bộ test toàn diện với 18 test cases để đảm bảo tính chính xác của thuật toán chuyển đổi:

### Các nhóm test chính:

1. **Test điểm A (90-100)**:
   - Kiểm tra các giá trị biên: 90, 100
   - Kiểm tra giá trị điển hình: 95
   - Kiểm tra giá trị trong khoảng: 91

2. **Test điểm B (80-89)**:
   - Kiểm tra các giá trị biên: 80, 89
   - Kiểm tra giá trị điển hình: 85
   - Kiểm tra giá trị trong khoảng: 81

3. **Test điểm C (70-79)**:
   - Kiểm tra các giá trị biên: 70, 79
   - Kiểm tra giá trị điển hình: 75
   - Kiểm tra giá trị trong khoảng: 71

4. **Test điểm D (60-69)**:
   - Kiểm tra các giá trị biên: 60, 69
   - Kiểm tra giá trị điển hình: 65
   - Kiểm tra giá trị trong khoảng: 61

5. **Test điểm E (0-59)**:
   - Kiểm tra các giá trị biên: 0, 59
   - Kiểm tra giá trị điển hình: 30
   - Kiểm tra giá trị trong khoảng: 1

6. **Test giá trị không hợp lệ**:
   - Điểm âm: -1, -10
   - Điểm quá cao: 101, 150

### Chạy test cụ thể:

```bash
# Chạy tất cả tests
mvn test

# Chạy test với output chi tiết
mvn test -Dtest=GradeConverterTest

# Xem báo cáo test
mvn surefire-report:report
```

## 💡 Sử dụng GradeConverter

### Ví dụ sử dụng trong code:

```java
import org.example.GradeConverter;

public class Example {
    public static void main(String[] args) {
        GradeConverter converter = new GradeConverter();

        // Chuyển đổi điểm số
        System.out.println(converter.convert(95));  // Output: A
        System.out.println(converter.convert(85));  // Output: B
        System.out.println(converter.convert(75));  // Output: C
        System.out.println(converter.convert(65));  // Output: D
        System.out.println(converter.convert(45));  // Output: E
        System.out.println(converter.convert(105)); // Output: Invalid
    }
}
```

## 🔄 CI/CD với Jenkins

Dự án này được thiết kế để tích hợp với Jenkins cho việc tự động hóa build và test:

1. **Build tự động**: Jenkins sẽ tự động build dự án khi có commit mới
2. **Test tự động**: Chạy toàn bộ test suite và báo cáo kết quả
3. **Quality Gate**: Đảm bảo tất cả tests pass trước khi deploy

## 🤝 Đóng góp

Chúng tôi hoan nghênh mọi đóng góp cho dự án! Để đóng góp:

1. Fork repository
2. Tạo feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Tạo Pull Request

### Quy tắc đóng góp:

- Đảm bảo tất cả tests pass
- Viết tests cho code mới
- Tuân thủ coding style hiện tại
- Cập nhật documentation nếu cần

## 📝 License

Dự án này được phát hành dưới MIT License. Xem file `LICENSE` để biết thêm chi tiết.

## 👨‍💻 Tác giả

- **Nguyen Huynh Phu Vinh** - [NguyenHuynhPhuVinh](https://github.com/NguyenHuynhPhuVinh)

## 📞 Liên hệ

Nếu bạn có bất kỳ câu hỏi nào về dự án, vui lòng tạo issue trên GitHub hoặc liên hệ qua email.

---

⭐ Nếu dự án này hữu ích cho bạn, hãy cho chúng tôi một star!
