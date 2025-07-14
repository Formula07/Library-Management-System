Digital Wallet – Microservices-Based Payment System

A scalable, event-driven Digital Wallet backend system built using **Spring Boot**,
**Kafka** and **JPA**. Designed with modular microservices architecture 
to handle onboarding, wallet management, transactions, and notifications.

---

## 📌 Features

- ✅ User onboarding and verification
- ✅ Wallet creation, balance tracking
- ✅ Secure fund transfers (credit/debit)
- ✅ Real-time transaction updates via **Kafka**
- ✅ Notification service integration
- ✅ Dockerized microservices for easy deployment

---

## 🏗️ Architecture Overview

```plaintext
                          +------------------------+
                          |   API Gateway (Future) |
                          +------------------------+
                                     |
    +-------------+-----------------+-------------------+-------------+
    |             |                 |                   |             |
    ↓             ↓                 ↓                   ↓             ↓
+-----------+  +-----------+   +-------------+   +--------------+  +-------------+
| Onboarding|  | Wallet    |   | Transaction |   | Notification |  |  Common     |
| Service   |  | Service   |   | Service     |   | Service      |  | Module      |
+-----------+  +-----------+   +-------------+   +--------------+  +-------------+
       ↕             ↕               ↕                    ↕              |
     DB: Users     DB: Wallets    DB: Txn Logs           SMTP/SMS        |
                          ↕               ↕                    ↕              |
                      Kafka Topics:  --------------------> Notification Queue
                          └─ TXN_UPDATE_QUEUE
---                          

## ⚙️ Tech Stack

| Layer            | Technology             |
| ---------------- | ---------------------- |
| Backend          | Spring Boot (Java 21)  |
| Messaging        | Apache Kafka           |
| Persistence      | JPA, Hibernate         |
| Database         | MySQL                  |
| Security         | Spring Security        |
| Testing          | JUnit, Mockito         |

---

## 🧩 Microservices Breakdown

| Service               | Description                                     |
| --------------------- | ----------------------------------------------- |
| OnboardingService     | Manages user sign-up and profile verification   |
| WalletService         | Handles wallet creation, balance updates        |
| TransactionService    | Processes fund transfers, triggers Kafka events |
| NotificationService   | Sends alerts/notifications to users             |
| Common                | Shared DTOs, constants, utilities               |



