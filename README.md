📂 Automated Downloads Folder Organizer (Java)

A production-ready Java utility that automatically organizes files in the Downloads folder by intelligently categorizing them based on file type.

🚀 Why This Project?

Manually organizing the Downloads folder is repetitive and time-consuming.
This tool automates that process using Java NIO and modular OOP design, turning a common problem into a scalable system utility.

✨ Features

🔍 Scans Downloads directory automatically

📁 Creates folders dynamically based on file extensions

🔄 Moves files safely using Java NIO

🧱 Modular architecture (Scanner, Classifier, Mover)

📦 Packaged as executable JAR

🗂 Version-controlled with structured branch evolution

🧩 Project Evolution (Stage-Based Development)

This project was built incrementally to demonstrate structured software growth.

🟢 Stage 1 – Core File Organizer

Focus: Functionality

Implemented file scanning using DirectoryStream

Extracted file extensions

Dynamically created folders

Moved files using Files.move()

Concepts Used:

Java NIO API

Path & Files handling

Exception handling

🟡 Stage 2 – Modular OOP Architecture

Focus: Clean Design

Refactored into separate classes:

FileScanner

FileClassifier

FileMover

Benefits:

Separation of concerns

Maintainable code

Easy scalability

Industry-style architecture

🔵 Stage 3 – Production Build

Focus: Deployment

Configured IntelliJ Artifacts

Generated executable JAR

Added proper Manifest configuration

Ready-to-run production version

Run with:

java -jar DownloadOrganizer.jar

No IDE required.

🛠 Tech Stack

Java (JDK 21)

Java NIO

IntelliJ IDEA

Git & GitHub

Object-Oriented Programming

📁 Project Structure
src/
 ├── Main.java
 ├── FileScanner.java
 ├── FileClassifier.java
 ├── FileMover.java
🧠 Engineering Highlights

Uses modern Java NIO instead of legacy java.io

Follows clean modular architecture

Demonstrates build packaging knowledge

Branch-based development workflow

Production-ready executable artifact

📦 Branch Strategy
Branch	Purpose
stage1	Basic implementation
stage2	Modular OOP refactor
stage3	Production JAR build
💡 Real-World Applications

Keeps system organized automatically

Saves manual sorting time

Can be extended with:

GUI

Scheduler

Logging system

Cloud integration

File monitoring (WatchService)

📈 Future Enhancements

One-click GUI interface

Real-time monitoring

Background service mode

Installer (.exe version)

Advanced rule-based categorization

👨‍💻 Author

Jay Dixit

⭐ If you find this useful, give it a star!
