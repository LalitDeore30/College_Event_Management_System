# 🎉 College Event Management System

A full-featured **Java Swing desktop application** designed for **efficient event coordination** in colleges. This system empowers users to register, browse, and manage events in real-time with a smooth and responsive GUI.

---

## 🚀 Features

- 🔐 **Secure User Authentication**  
  Login system to ensure only authorized access.

- 📝 **Event Registration**  
  Students can register for their favorite events easily.

- 📂 **Category-wise Event Browsing**  
  Events are organized into categories for seamless navigation.

- 📄 **Detailed Event Information**  
  Each event displays description, timing, venue, and organizer info.

- 💡 **Admin & User Mode** *(optional enhancement)*  
  Different access roles for administrators and students.

---

## 💻 Tech Stack

| Technology      | Usage                                 |
|-----------------|----------------------------------------|
| **Java (JDK 17)** | Core logic and application backend   |
| **Java Swing**   | GUI components and desktop interface |
| **MySQL**        | Database for storing user & event data |
| **NetBeans 17**  | IDE used for development and testing |

---

## 🧪 Development Approach

✅ **Test-Driven Development (TDD)** used to ensure code modularity and robustness  
✅ All major functionalities were tested in modules before integration  
✅ Emphasis on clean UI, structured database design, and efficient query handling

---

## 🖼️ Screenshots

> *(Add screenshots here to make the README visually appealing)*  
> You can insert: Login screen, Event list, Event details, Registration confirmation, etc.

---

## 🔗 Database Schema (MySQL)

- **Users Table**
  - `id`, `username`, `password`, `email`
- **Events Table**
  - `event_id`, `name`, `category`, `description`, `date`, `venue`
- **Registrations Table**
  - `user_id`, `event_id`, `timestamp`

> The application uses JDBC to connect and interact with MySQL seamlessly.

---

## 📈 Scalability

- ⚙️ Built to handle **hundreds of users**
- Designed for **performance and low memory usage**
- Modular codebase for easy maintenance and future upgrades

---

## 🔧 Installation & Setup

1. Clone this repository.
2. Import the project into **NetBeans 17**.
3. Setup MySQL and import the provided `.sql` file.
4. Configure the database credentials in the Java code.
5. Run the project and start exploring!

