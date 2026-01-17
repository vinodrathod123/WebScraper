# 📰 Java Web Scraper – Dockerized & Deployed on AWS EC2

A production-ready **Java web scraping application** that fetches live news headlines using **Jsoup**, containerized with **Docker**, automated using **GitHub Actions CI/CD**, and deployed on **AWS EC2**.

---

## 🚀 Features

- Scrapes live news headlines using **Jsoup**
- Built with **Java + Maven**
- Fully **Dockerized**
- **CI/CD pipeline** using GitHub Actions
- Deployed on **AWS EC2 (Ubuntu)**
- Auto-build and auto-deploy on every Git push

---

## 🛠️ Tech Stack

- **Language:** Java
- **Build Tool:** Maven
- **Web Scraping:** Jsoup
- **Containerization:** Docker
- **CI/CD:** GitHub Actions
- **Cloud:** AWS EC2 (Ubuntu Linux)

---
## ⚙️ How It Works

1. Developer pushes code to GitHub
2. GitHub Actions CI/CD pipeline is triggered
3. Pipeline connects to AWS EC2 using SSH
4. Docker image is built on EC2
5. Java Web Scraper container is started
6. Headlines are fetched and displayed

---

## ▶️ Run Locally (Without Docker)

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="student.com.WebScraper"
🐳 Run with Docker (Local or EC2)
bash
Copy code
docker build -t webscraper-java .
docker run webscraper-java
☁️ Deployment on AWS EC2
Steps followed:

Provisioned EC2 Ubuntu instance

Configured SSH access using PEM key

Installed Docker on EC2

Copied project using SCP

Built Docker image on EC2

Ran container successfully

🔄 CI/CD with GitHub Actions
Automated build and deployment on every push

Uses SSH-based deployment to EC2

Ensures consistent and reliable delivery


## 🏗️ Deployment Architecture

┌──────────────────────┐
│  Developer Laptop    │
│  (Git Push)          │
└─────────┬────────────┘
│
▼
┌──────────────────────┐
│  GitHub Repository   │
│  (Source Code)       │
└─────────┬────────────┘
│
▼
┌────────────────────────────────────┐
│  GitHub Actions (CI/CD Pipeline)   │
│  - Checkout code                  │
│  - Build Docker image             │
│  - SSH into EC2                   │
│  - Deploy container               │
└─────────┬─────────────────────────┘
│
▼
┌────────────────────────────────────┐
│  AWS EC2 (Ubuntu Server)           │
│  - Docker installed               │
│  - Image build / pull             │
│  - Container execution            │
└─────────┬─────────────────────────┘
│
▼
┌────────────────────────────────────┐
│  Java Web Scraper Container        │
│  - Java + Maven                   │
│  - Jsoup                          │
│  - Fetches News Headlines         │
└────────────────────────────────────┘

👤 Author
Vinod Rathod
Java | Docker | AWS | CI/CD