# 📦 Simple RESTful API – Product Service

This project is a basic RESTful API built using **Spring Boot**, demonstrating the fundamental HTTP methods: **GET**, **POST**, **PUT**, and **DELETE**. It simulates a simple product catalog with in-memory data and is tested using **Postman**.

---

## 🚀 Features

- ✅ Retrieve all products (`GET /products`)
- 🔍 Get a product by ID (`GET /products/{id}`)
- ➕ Add a new product (`POST /products`)
- ✏️ Update a product (`PUT /products`)
- ❌ Delete a product (`DELETE /products/{id}`)

---

## 🧪 Tools & Technologies

- Java 17+
- Spring Boot
- Spring Web
- Postman (for API testing)
- Maven
- IntelliJ IDEA / VS Code

---

## 📫 API Endpoints

| Method | Endpoint           | Description             |
|--------|--------------------|-------------------------|
| GET    | `/products`        | Fetch all products      |
| GET    | `/products/{id}`   | Fetch product by ID     |
| POST   | `/products`        | Add a new product       |
| PUT    | `/products`        | Update an existing one  |
| DELETE | `/products/{id}`   | Delete a product by ID  |

---

## 📌 Sample JSON for POST/PUT

```json
{
  "id": 104,
  "name": "New Product",
  "price": 25000
}
