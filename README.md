# Racanaa Assignment

### This repository contains a Selenium, TestNG framework that is used for the for automated testing of web application : http://the-internet.herokuapp.com
---
## Setup and Configuration
### Follow these steps to set up the framework and configure it for your project.

### Prerequisites

```
Java Development Kit (JDK) installed on your machine
IDE (Eclipse, IntelliJ, etc.) or a text editor of your choice
Maven (if using Maven for dependency management)
```
---
## Step 1: Clone the Repository
### Clone this repository to your local machine using the following command:

```bash
git clone https://github.com/Chauhan-Hemant/racanaa-assignment.git
```
---
## Step 2: Set Up the Project
### 1. Open your preferred IDE and import the project as a Maven project.
### 2. Ensure that the necessary dependencies are resolved by Maven. If you're not using Maven, manually add the TestNG and Selenium dependencies to your project's classpath.
---
## Step 3: Configure Selenium WebDriver
### 1. Download the appropriate WebDriver executable for the browser you intend to use. By Default chromedriver is used and configured and is stored at the racanaa-assignment\resources directory.
### 2. Update the setUp() method in the BaseTest class with the path to the WebDriver executable as required:

```bash
System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
```
---
## Step 4: Write Test Cases
### 1. Create a new Java package and inside that new class for each test case you want to write inside the src/test/java directory.
### 2. Add @Test annotations to the test methods within the class.
### 3. Implement the test logic using Selenium WebDriver API to interact with web elements and perform actions.
---
## Step 5: Run the Tests
### 1. Right-click on the test class or the test package in your IDE.
### 2. Choose "Run as TestNG Test" to execute the tests.
### 3. TestNG will run the test methods and generate a test report.

### For Execution of all the testcases combined first create thr testng.xml file and Run the test by right clicking on the TestNG xml file and select Run As -> TestNG Suite.

### To generate testng.xml file using plugins go to 
```
File -> settings -> Plugins 
```
### and search "Create TestNG XML" plugin and install it, and then Apply -> ok
### Right clicking on the Project -> Creat TestNG XML
### It will generate the testng.xml file for the project.
---
## Step 6: Reporting 
```
Run -> Edit Configuration -> Listeners 
click + sign -> search EmailableReporter -> ok
click + sign -> search FailedReporter -> ok
Apply -> ok
```
### After executing testng.xml it will generate test-output directory consist of emailable html report.
---