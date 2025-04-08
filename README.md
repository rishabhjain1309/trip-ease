# 🚕 Trip Ease – Taxi Booking Backend System

## Project Overview

Trip Ease is a high-performance backend system for a taxi booking platform, developed using **Java** and **Spring Boot**, with **PostgreSQL** as the database. The system achieves API response times under **200ms** and includes **automated email notifications** for booking updates.

---

## ✨ Features

- ⚡ **High Performance**: APIs optimized for sub-200ms response time.
- 📧 **Automated Email Notifications**: Sends booking status updates to users via SMTP.
- 🧩 **Modular & Scalable**: Clean architecture for easy maintenance and scalability.
- 🔐 **Secure Configuration**: Uses secure database credentials and Spring Boot best practices.
- 📄 **API Documentation**: Integrated Swagger UI for interactive API testing.

---

## 🛠️ Tech Stack

- **Language**: Java  
- **Framework**: Spring Boot  
- **Database**: PostgreSQL  
- **Tools & Libraries**:  
  - Spring Data JPA  
  - REST APIs  
  - Swagger UI  
  - JavaMailSender (SMTP)

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven
- PostgreSQL

### Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/rishabhjain1309/trip-ease.git
   cd trip-ease

2. Configure your application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.mail.username=your_email
spring.mail.password=your_email_password


3. Run the application:

mvn spring-boot:run
Access Swagger docs:
http://localhost:8080/swagger-ui.html

4. 📫 Contact
For any queries, feel free to reach out via LinkedIn or raise an issue in this repo.(https://www.linkedin.com/in/rishabh-jain-56815a218/)
