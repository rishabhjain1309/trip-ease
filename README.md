# 🚕 Trip Ease - Taxi Booking Backend

Trip Ease is a high-performance backend system for a taxi booking platform, designed to deliver fast, reliable, and scalable services with automated workflows.

---

## 🚀 Features

- ⚡ Sub-200ms API response times  
- 📬 Automated email notifications for bookings  
- 🧩 Modular and scalable architecture  
- 🔐 Secure database connectivity and configuration  

---

## 🛠 Tech Stack

- **Language:** Java  
- **Framework:** Spring Boot  
- **Database:** PostgreSQL  
- **Tools:** Spring Data JPA, REST APIs, Swagger UI, SMTP for Emails  

---

## 📦 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/trip-ease.git
   cd trip-ease


2. Set up PostgreSQL

Create a database named tripdb
Configure your DB credentials in src/main/resources/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tripdb
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword


3. Configure Email (SMTP)

spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=yourEmail@example.com
spring.mail.password=yourPassword


4. Run the application

./mvnw spring-boot:run
📚 API Documentation (Swagger)
Swagger UI is available once the application is running:

📎 http://localhost:8080/swagger-ui.html

Use this to explore and test all available endpoints easily.

5. 🧱 Project Architecture
Trip Ease
│
├── controller          # REST API endpoints
├── service             # Business logic
├── repository          # JPA Repositories
├── model               # Entity classes
├── config              # Email & DB configuration
└── utils               # Helper classes (email, response handlers)
