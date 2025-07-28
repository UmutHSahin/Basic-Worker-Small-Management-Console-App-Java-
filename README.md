# 👷 Worker Management Console App (Java)

## 📌 Description

This is a simple Java console application that allows a user to manage a single worker's data. 
The user can input worker details and perform basic actions such as viewing information, simulating a salary raise, and simulating an operating system formatting operation.

---

## 🧾 Contents

The application consists of two main classes:

### 1. `Worker` Class

This class represents the structure of a worker and includes methods related to worker operations.

**Fields:**
- `int number` : ID of the worker
- `String name` : Name of the worker
- `String surname` : Surname of the worker
- `int experiance` : Years of experience
- `double salary` : Current salary

**Methods:**
- `printInfoWorkers()` : Displays the worker's details.
- `raise(int valueRaise)` : Simulates a salary raise.
- `formatting(String op, String who)` : Simulates formatting an OS by someone.

---

### 2. `Page` Class (Main Class)

This is where the program runs and interacts with the user.

**Flow:**
1. Takes input for the worker's details.
2. Creates a `Worker` object with the input data.
3. Prompts the user to choose an operation:
   - `1`: Show worker info
   - `2`: Do raise
   - `3`: Formatting
4. Performs the selected operation.

---

## 🖥️ Example Usage

```
-------------------------Welcome to App----------------------
Enter the worker number : 101
Enter the worker name : Alice
Enter the worker surname : Smith
Enter the worker experiance : 5
Enter the worker salary : 12000
--------------------------------------
1-Show workers info
2- Do raise
3- Formatting
Choose the process: 1

=====Worker Info====
Number    :101
Name      :Alice
Surname   :Smith
Experiance:5
```

---

## 📌 Açıklama (Türkçe)

Bu proje, kullanıcıdan alınan bir çalışana ait bilgileri saklayan ve bazı temel işlemleri yapabilen basit bir Java konsol uygulamasıdır. Kullanıcı, çalışan bilgilerini girdikten sonra 3 farklı işlemden birini seçebilir: bilgileri görüntüleme, maaş artırma veya bir işletim sistemi formatlama simülasyonu.

---

## 🧾 İçerik

Uygulama iki temel sınıftan oluşur:

### 1. `Worker` Sınıfı

Bu sınıf, bir çalışanın temel bilgilerini (numara, ad, soyad, deneyim, maaş) tutar ve bu çalışanla ilgili çeşitli işlemleri barındırır.

**Alanlar:**
- `int number` : Çalışanın numarası
- `String name` : Çalışanın adı
- `String surname` : Çalışanın soyadı
- `int experiance` : Çalışanın deneyim yılı
- `double salary` : Çalışanın maaşı

**Yöntemler:**
- `printInfoWorkers()` : Çalışan bilgilerini ekrana yazdırır.
- `raise(int valueRaise)` : Maaş artışı simüle eder.
- `formatting(String op, String who)` : Belirtilen kişinin, belirtilen işletim sistemini formatladığını bildirir.

---

### 2. `Page` Sınıfı (Ana Sınıf)

Programın çalıştığı ve kullanıcı ile etkileşimin sağlandığı kısımdır.

**Uygulama Akışı:**
1. Konsolda kullanıcıdan çalışana ait bilgiler alınır.
2. Bu bilgilerle bir `Worker` nesnesi oluşturulur.
3. Kullanıcıdan yapılacak işlem seçmesi istenir:
   - `1`: Çalışan bilgilerini göster
   - `2`: Maaşa zam yap
   - `3`: Formatlama işlemi başlat
4. Seçime göre uygun işlem gerçekleştirilir.

---

## 🖥️ Örnek Kullanım

```
-------------------------Welcome to App----------------------
Enter the worker number : 101
Enter the worker name : Alice
Enter the worker surname : Smith
Enter the worker experiance : 5
Enter the worker salary : 12000
--------------------------------------
1-Show workers info
2- Do raise
3- Formatting
Choose the process: 1

=====Worker Info====
Number    :101
Name      :Alice
Surname   :Smith
Experiance:5
```
![Görüntü 7-28-25 ÖS 2 38](https://github.com/user-attachments/assets/3b20c999-22db-408b-925c-fae1e5583cc0)

![Görüntü 7-28-25 ÖS 2 39](https://github.com/user-attachments/assets/2f822646-9cd0-4438-9fbb-e8d2a78431eb)

![Görüntü 7-28-25 ÖS 2 40](https://github.com/user-attachments/assets/6949313d-c46e-423f-a385-352db1be7c39)





