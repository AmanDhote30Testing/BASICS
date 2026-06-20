# 🧪 Selenium Framework Foundation

> A hands-on Java-based Selenium WebDriver framework built from scratch using Maven and TestNG — covering core automation concepts, page object patterns, and reusable utilities.

---

## 🛠️ Tech Stack

| Tool / Library       | Version     | Purpose                          |
|----------------------|-------------|----------------------------------|
| Java                 | 23          | Core programming language        |
| Maven                | 3.x         | Build & dependency management    |
| Selenium WebDriver   | 4.27.0      | Browser automation               |
| TestNG               | 7.10.2      | Test execution & assertions      |
| Commons IO           | 2.16.1      | File and I/O utilities           |

---

## 📁 Project Structure

```
BASICS/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── (base classes, utilities, page objects)
│   └── test/
│       └── java/
│           └── (test classes)
├── pom.xml
├── .gitignore
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Java 23+ installed
- Maven 3.6+ installed
- A compatible browser (Chrome/Firefox) with the appropriate WebDriver

### Clone the Repository

```bash
git clone https://github.com/AmanDhote30Testing/BASICS.git
cd BASICS
```

### Build the Project

```bash
mvn clean install
```

### Run Tests

```bash
mvn test
```

---

## 📌 Key Concepts Covered

- ✅ WebDriver setup and browser initialization
- ✅ Page Object Model (POM) design pattern
- ✅ TestNG annotations (`@Test`, `@BeforeMethod`, `@AfterMethod`)
- ✅ Explicit & Implicit waits
- ✅ Screenshot capture on test failure
- ✅ Reusable utility methods (file I/O, element helpers)

---

## 🔧 Dependencies (pom.xml highlights)

```xml
<!-- Selenium WebDriver -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.27.0</version>
</dependency>

<!-- TestNG -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
</dependency>

<!-- Commons IO -->
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.16.1</version>
</dependency>
```

---

## 👤 Author

**Aman Dhote**  
SDET | Java | Selenium WebDriver | Appium | TestNG | Jenkins  
📍 Pimpri-Chinchwad, Maharashtra, India  
🔗 [GitHub Profile](https://github.com/AmanDhote30Testing)

---

## 📄 License

This project is open-sourced for learning and portfolio purposes.

---

> **Related Repositories:**
> - [`Framework-Practice-2`](https://github.com/AmanDhote30Testing/BASICS/tree/Release) — Advanced framework with Reports, Screenshots & TestSuites
> - [`Java_practice`](https://github.com/AmanDhote30Testing/BASICS/tree/Release) — Core Java practice exercises
