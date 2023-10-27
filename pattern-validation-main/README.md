# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.15/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.15/maven-plugin/reference/html/#build-image)

## `Case Study`

## 1. Pattern Validation
Anda sedang mengembangkan sebuah aplikasi, yang mana beberapa titik akhir diperlukan untuk memvalidasi inputan dari FE, contoh nya seperti untuk menambahkan Company baru dimana di dalamnya memerlukan inputan NPWP dengan pattern sebagai berikut : xx.xxx.xxx.x-xxx.xxx
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

Problem

> Ketika User menambahkan Data Company baru dengan pattern/pola NPWP tidak sesuai dengan ketentuan masih tetap diterima oleh server/BE

DoD

> Server akan memberikan exception atau pemberitahuan jika pattern/pola NPWP tidak sesuai dengan ketentuan

Tips

> Menggunakan ConstraintViolation untuk validasi