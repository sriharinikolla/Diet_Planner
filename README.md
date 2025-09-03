# Diet_Planner
# Diet Planner

A Java-based desktop application that helps users plan meals, log daily intake, and track progress towards health goals such as **weight loss**, **muscle gain**, or **maintenance**. The project demonstrates the use of multiple **design patterns** (Strategy, Template, Observer, Proxy, DAO) along with a **GUI** and a **database backend**.

---

## 🚀 Features

* User authentication (login & profile management)
* Meal logging and calorie tracking
* Personalized meal plans:

  * Weight loss
  * Muscle gain
  * Maintenance
* Dashboard with user-friendly GUI
* Modular design using OOP and design patterns
* Database integration for storing meals, users, and logs

---

## 📂 Project Structure

```
dietplanner/
├── Main.java                  # Application entry point
├── auth/                      # Authentication (Proxy pattern)
├── dao/                       # Data Access Objects (DB interactions)
├── db/                        # Database connection handling
├── gui/                       # GUI components (Swing frames)
├── model/                     # Core models (User, Meal, MealLog)
├── observer/                  # Observer pattern for meal logs
├── strategy/                  # Strategy pattern for calorie calculation
├── template/                  # Template pattern for meal plans
```

---

## 🛠️ Technologies Used

* **Java (Swing)** – GUI development
* **JDBC** – Database connectivity
* **SQLite/MySQL** (configurable) – Data persistence
* **Design Patterns** – Strategy, Template, Observer, Proxy, DAO

---

## ⚡ Getting Started

### Prerequisites

* JDK 8 or higher
* Database (SQLite or MySQL)

### Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/dietplanner.git
   cd dietplanner
   ```
2. Configure database connection in `DatabaseConnection.java`
3. Compile and run:

   ```bash
   javac dietplanner/Main.java
   java dietplanner.Main
   ```

---

## 📸 GUI Preview

(Add screenshots of `LoginFrame`, `DashboardFrame`, and `Meal Logging` here)

---

## 📖 Design Patterns Implemented

* **Proxy** – User authentication
* **DAO** – Database interactions
* **Strategy** – Different calorie calculators (weight loss, muscle gain, maintenance)
* **Template** – Meal plan generation
* **Observer** – Meal log notifications

---


