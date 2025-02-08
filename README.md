# Selenium Cucumber Test Automation Framework

## 📌 Overview
This repository contains a **Selenium Cucumber** test automation framework using **JUnit 5, WebDriverManager, and Allure Reporting**. It is designed for running **UI automation tests** efficiently with **Behavior-Driven Development (BDD)**.

## 🏗️ Tech Stack
- **Java 11**
- **Selenium 4.x**
- **Cucumber 7.x**
- **JUnit 5**
- **WebDriverManager** (Automatic driver management)
- **Allure Reporting**

## 📦 Installation & Setup
### **1. Clone the Repository**
```sh
git clone https://github.com/jodybarata000/SeleniumJava.git
cd SeleniumJava
```

### **2. Install Dependencies**
```sh
mvn clean install
```

### **3. Configure Test Data**
Modify the `config.properties` file under `src/test/resources/` to set up:
- **Browser** (`chrome`)
- **Base URL**
- **Implicit/Explicit Wait Times**

---

## 🎯 Running Tests
### **1. Run Tests Using Maven**
```sh
mvn test
```

### **2. Run Specific Tests by Tag**
Modify `@ConfigurationParameter` in `TestRunners.java` to run specific scenarios:
```java
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@Login")
```
Then execute:
```sh
mvn test
```

---

## 📊 Test Reports
### **Allure Report Generation**
1. **Run Tests and Generate Results:**
   ```sh
   mvn test
   ```
2. **Serve Allure Report:**
   ```sh
   mvn allure:serve
   ```
   This will launch an interactive Allure report in your browser.

---

Happy Testing! 🚀

