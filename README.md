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

---

## Sample Output

### Login Page
<img width="565" alt="Screenshot 2025-05-15 at 3 13 38 PM" src="https://github.com/user-attachments/assets/19045bce-f870-4e4f-bbbd-08a393591cc6" />

### Registration Update Interface
<img width="567" alt="Screenshot 2025-05-15 at 3 09 04 PM" src="https://github.com/user-attachments/assets/350a9022-beec-4601-93ef-eb38cb6b2080" />

### Database
<img width="580" alt="Screenshot 2025-05-15 at 3 10 36 PM" src="https://github.com/user-attachments/assets/7af99085-f5c5-4c24-a309-d45f7cb4ecf8" />

### Admin Dashboard
<img width="568" alt="Screenshot 2025-05-15 at 3 11 37 PM" src="https://github.com/user-attachments/assets/b8154658-75b4-4f78-8202-b94eebd42d16" />

### Interface for Adding event
<img width="566" alt="Screenshot 2025-05-15 at 3 12 08 PM" src="https://github.com/user-attachments/assets/754a8743-12f5-4070-a917-a4c16a93fe5e" />

### Registration form
<img width="566" alt="Screenshot 2025-05-15 at 3 12 46 PM" src="https://github.com/user-attachments/assets/2dfbb88a-ecda-41bb-b699-ca6c6687d8cc" />

### Delete registration
<img width="566" alt="Screenshot 2025-05-15 at 3 13 11 PM" src="https://github.com/user-attachments/assets/08136b5d-002e-4750-ace9-543195dfecbd" />

