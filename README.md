# 👥 User Management System

A full-stack **User Management System** featuring secure JWT-based authentication, role-based access control, dynamic user interface rendering, real-time filtering, and password reset functionality. Built using **Angular** (frontend) and **Spring Boot** (backend).

---

## 🚀 Features

- ✅ **JWT Authentication**: Secure login and token storage
- 🔒 **Role-Based Access Control**: User, Manager, Admin — each with specific permissions
- 🔁 **Real-Time Filtering**: Search user table dynamically
- 🧑‍🎨 **Dynamic Avatars**: Fetched from external API using username
- 🧑‍💼 **User Profile Management**: Update name, email, and avatar
- 📨 **Password Reset via Email**
- 🔐 **Account Lockout**: Auto-lock after repeated failed login attempts
- 🖥️ **Admin Panel**: Add, edit, and unlock users

---

## 🧱 Tech Stack

| Layer     | Technology                        |
|-----------|-----------------------------------|
| Frontend  | Angular, TypeScript               |
| Backend   | Java, Spring Boot, Spring Security |
| Database  | MySQL + Spring Data JPA           |
| Auth      | JWT (JSON Web Tokens)             |
| Email     | JavaMailSender                    |
| Tools     | Maven, Node.js, Angular CLI       |

---

## 📁 Repositories

- 🔹 **Frontend**: [student-management-system-frontend](https://github.com/atakuba/student-management-system-frontend.git)
- 🔹 **Backend**: [student-management-system](https://github.com/atakuba/student-management-system.git)

---

## 📥 Installation Guide

### 1. Clone the Repositories

```bash
# Clone Frontend
git clone https://github.com/atakuba/student-management-system-frontend.git

# Clone Backend
git clone https://github.com/atakuba/student-management-system.git
2. Backend Setup (Spring Boot)
✅ Prerequisites
Java 11+

Maven

MySQL

⚙️ Configuration
Create a MySQL database:

sql
Copy
Edit
CREATE DATABASE userdb;
Update src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD

jwt.secret=your_jwt_secret

# Mail configuration (for password reset)
spring.mail.username=your_email@example.com
spring.mail.password=your_email_password
spring.mail.host=smtp.yourprovider.com
spring.mail.port=587
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
▶️ Run Backend
bash
Copy
Edit
cd student-management-system
mvn spring-boot:run
Backend runs at: http://localhost:8080

3. Frontend Setup (Angular)
✅ Prerequisites
Node.js (18+)

Angular CLI

⚙️ Configure API Endpoint
In src/environments/environment.ts:

ts
Copy
Edit
export const environment = {
  production: false,
  apiUrl: 'http://localhost:8080' // Adjust if needed
};
▶️ Run Frontend
bash
Copy
Edit
cd student-management-system-frontend
npm install
ng serve
Frontend runs at: http://localhost:4200

🔐 User Roles & Permissions
Role	Read	Update	Create	Delete
User	✅	❌	❌	❌
Manager	✅	✅	❌	❌
Admin	✅	✅	✅	❌ (UI shows button, but action blocked)

UI adapts dynamically to the logged-in user's role.

Admins can access user creation and profile editing features.

Managers can edit users but cannot create/delete.

Users can only view data.

🔄 Additional Features
👤 Live Filtering – Filter users as you type

🔒 Brute Force Protection – 5 failed login attempts in 15 minutes locks the account

📨 Reset Password – Triggered via email for valid accounts

🖼️ Avatar Integration – Unique avatar assigned using external API

📝 Audit-Friendly UI – Disabled buttons still visible to show permission levels

🧪 Useful Commands
🔹 Backend (Java)
bash
Copy
Edit
mvn spring-boot:run     # Run backend server
mvn clean install       # Package JAR
🔹 Frontend (Angular)
bash
Copy
Edit
ng serve                # Start dev server
ng build                # Build for production
ng test                 # Run unit tests
👨‍💻 Contributing
Fork this repository

Create a branch: git checkout -b feature/your-feature

Commit your changes: git commit -m "Added new feature"

Push to the branch: git push origin feature/your-feature

Open a Pull Request

📧 Contact
Author: Atabek Kubanychbek uulu
Email: atakubanychbek@gmail.com
GitHub: @atakuba

🪪 License
This project is open-source and free to use. Attribution is appreciated. Built for educational and real-world applications.
