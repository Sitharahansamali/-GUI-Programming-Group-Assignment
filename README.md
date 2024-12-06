Sign-Up and Sign-In Application


**Overview**

This project demonstrates a Java Swing-based Sign-Up and Sign-In graphical user interface (GUI) application, connected to a relational database. The application provides a user-friendly interface for account creation and login, adhering to the specifications outlined in the provided video tutorial.



**Features**

**Sign-Up Page:** Allows users to create a new account by providing details such as username,email,gender,birthday and password.

**Sign-In Page:** Enables existing users to log in with their credentials.

Database Integration: Stores user data securely in a relational database using JDBC.

UI Similarity: The graphical interface replicates the visual design and functionality of the reference video.



**Technologies Used**

Programming Language: Java
GUI Framework: Java Swing
Database: MySQL
JDBC: For database connectivity



**Project Structure**

The project is organized as follows:

Class Files: Contains compiled Java files for execution.
Database: Includes an exported .sql file to create the required tables and populate initial data.
Video Demonstration: A video showcasing the application's functionality and features.
Optional PDF: List of group members and their contributions.



**Prerequisites**

Before running the application, ensure the following are installed:

Java Development Kit (JDK) (version 8 or later)
MySQL Server
Database Client (e.g., MySQL Workbench, phpMyAdmin)



**Evaluation Criteria**

Code Efficiency: Minimal lines of code with optimized logic.
Readability: Clear and concise comments explaining the functionality.
UI Similarity: Graphical interface closely mirrors the design shown in the tutorial.



**Files Included**

.class Files: Compiled Java files for execution.
.sql File: Database schema and data export.
lib file : For the include .jar file mannualy.(Mysql-connector-j-8.2.0.jar).


**Installation**

1. Clone the repository using the Git URL:
git clone https://github.com/Sitharahansamali/GUI-Programming-Group-Assignment.git

2. Once cloned, navigate to the project directory:
   cd repository
   
4. Open the Project
  ** If you use VS code**
   Please install the java extension pack and run the code.

   If you use intellij IDEA please replace the .jar connector in lib file following below steps.
   1. Open Project Structure: Go to File > Project Structure or press Ctrl + Alt + Shift + S (Windows/Linux) or Command + ; (macOS).
   2. Go to Libraries Section: In the Project Structure dialog, select Libraries from the left-hand panel.
   3. Add a New Library: Click the + button (top-left corner) and choose Java.
                         Browse to the location where you saved the .jar file and select it.
                         Click OK to add the .jar file.
   4. Assign the Library to Modules: After adding the .jar file, IntelliJ will ask you to associate it with your project's module(s). Select the appropriate module 
                                     and click OK.

5. Set Up the Database
  1. Open a MySQL client (e.g., MySQL Workbench, Command Line, or a GUI tool).
  2. Execute the SQL file provided in the repository (e.g., gui_user.sql) to create and initialize the database


6. Update Database Connection Details:
   1. In your project, locate the configuration file or class where the database connection is set (e.g., DBHandler, application.properties).
   2. Update it with your MySQL username, password, and database name:
       private static final String DB_URL = "jdbc:mysql://localhost:3306/Name of Data Base";
       private static final String DB_USERNAME = "root";
       private static final String DB_PASSWORD = "yourpassword";


7. Run the Project
 
   



