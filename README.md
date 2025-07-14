# 📚 Library Management System – Spring Boot Backend

A robust and extensible backend system for managing a library’s books, members, and lending operations.  
Built using **Spring Boot**, **JPA**, and **MySQL**, it provides secure REST APIs for managing users, books, and transactions.

---

## 📌 Features

- ✅ Book catalog management (Add, Update, Delete, Search)  
- ✅ User/member registration and management  
- ✅ Book issue and return tracking  
- ✅ Availability status and due date calculation  
- ✅ Admin & user role-based access  
- ✅ Exception handling & logging  
- ✅ API-first approach – ready for frontend or Postman

---

## 🏗️ Architecture Overview

```plaintext
          +----------------------------+
          |   Library Management API   |
          +----------------------------+
                       |
        +--------------+---------------+
        |              |               |
        ↓              ↓               ↓
+---------------+  +-----------+  +----------------+
| Book Service  |  | User/Auth |  | Issue/Return   |
| (Books CRUD)  |  | Service   |  | Service        |
+---------------+  +-----------+  +----------------+
        |               |               |
        ↓               ↓               ↓
    DB: books       DB: users       DB: transactions
