# Java Reservation System

This project is a reservation system developed for the Programming Laboratory II course at Kocaeli University Computer Engineering Department.

## 📋 Table of Contents
- [About Project](#about-project)
- [Features](#features)
- [Supported Transportation Types and Companies](#supported-transportation-types-and-companies)
- [Routes](#routes)
- [Technical Details](#technical-details)
- [Installation](#installation)
- [Usage](#usage)
- [FAQ](#faq)
- [Project Status](#project-status)
- [Updates](#updates)
- [Contributors](#contributors)
- [License](#license)

## About Project

This system is a comprehensive platform where passengers can make reservations from different transportation companies (railway, highway, and airline). The system is developed in Java programming language using Object-Oriented Programming (OOP) principles.

### Features

- **Admin Panel**
  - Company management (add, delete, view)
  - Service fee setting (fixed daily fee)
  - View and update company information

- **Company Panel**
  - Add/remove vehicles (bus, train, plane)
  - Add/remove trips
  - Daily profit calculation (passenger fares, service fees, personnel costs, fuel costs)
  - Update vehicle information
  - Trip management

- **User Panel**
  - Search and list trips
  - Make reservations
  - Multiple ticket booking
  - Seat selection
  - Enter passenger information (Name, Surname, ID, Date of Birth)
  - Payment transactions

### Supported Transportation Types and Companies

- 🚌 **Highway**
  - Company A (2 buses - Route 3)
  - Company B (2 buses - Routes 3 and 4)
  - Company C (1 bus - Route 4)

- 🚂 **Railway**
  - Company D (3 trains - Routes 1 and 2)

- ✈️ **Airline**
  - Company F (2 planes - Route 6)
  - Company C (2 planes - Route 5)

### Routes

1. **Railway Route 1**: Istanbul ↔️ Kocaeli ↔️ Bilecik ↔️ Eskisehir ↔️ Ankara
2. **Railway Route 2**: Istanbul ↔️ Kocaeli ↔️ Bilecik ↔️ Eskisehir ↔️ Konya
3. **Highway Route 3**: Istanbul ↔️ Kocaeli ↔️ Ankara
4. **Highway Route 4**: Istanbul ↔️ Kocaeli ↔️ Eskisehir ↔️ Konya
5. **Airline Route 5**: Istanbul ↔️ Konya
6. **Airline Route 6**: Istanbul ↔️ Ankara

## Technical Details

### Technologies Used

- Java SE
- Swing (GUI)
- NetBeans IDE
- OOP Principles
  - Abstraction (Person, User, Vehicle classes)
  - Inheritance (Admin, Company, Bus, Train, Airplane classes)
  - Polymorphism (Vehicle derivatives)
  - Encapsulation (Getter/setter usage in all classes)

### System Architecture

- **Abstract Classes**
  - `User`: Base class representing system users
  - `Vehicle`: Base class representing vehicles
  - `Person`: Base class containing person information

- **Concrete Classes**
  - `Admin`: System administrator functions
  - `Company`: Company functions
  - `Bus`, `Train`, `Airplane`: Vehicle types
  - `Route`: Route information
  - `Trip`: Trip information
  - `Passenger`: Passenger information
  - `Reservation`: Reservation operations
  - `Transport`: Transportation options

- **Interfaces**
  - `ILoginable`: Login capabilities
  - `IReservable`: Reservation capabilities
  - `IProfitable`: Profit calculation capabilities

### Database Structure

The project currently uses a static data structure. Data is stored in RAM while the program is running.

## Installation

1. Clone the project:
```bash
git clone https://github.com/MerttMetinn/Java-Reservation-System.git
```

2. Open the project in your Java IDE (preferably NetBeans)

3. Make sure required libraries are installed

4. Compile and run the project

## 💻 Usage

### Admin Login
1. Start the program
2. Click "Admin Login" button
3. Login with username: `admin`, password: `admin`
4. Manage companies and services from admin panel

### Company Login
1. Click "Company Login" button
2. Login with your provided username and password
3. Manage vehicles and trips

### User Operations
1. Click "Buy Ticket" from main menu
2. Select departure and arrival points
3. Choose date
4. View available trips
5. Select seats
6. Enter passenger information
7. Complete payment

## ❓ FAQ

**Q: How to add a new company that is not registered in the system?**
A: You can add new companies using the "Company Registration" tab in the admin panel.

**Q: Can a company have multiple transportation types?**
A: Yes, as in the example of Company C, a company can operate both highway and airline transportation.

**Q: Can reservations be cancelled?**
A: Currently, reservation cancellation feature is not available. It will be added in future updates.

## 📊 Project Status

- [x] Admin Panel
- [x] Company Panel
- [x] User Interface
- [x] Reservation System
- [x] Payment System
- [ ] Reservation Cancellation
- [ ] Mobile Application
- [ ] Multi-language Support

## 🔄 Updates

### Version 1.0.0 (Current)
- Basic reservation system
- Multiple company support
- Three different transportation types
- Profit/loss calculation

### Planned Updates
- Reservation cancellation system
- Email ticket delivery
- Mobile application
- Multi-language support
- User account system

## 👥 Contributors

<a href="https://www.linkedin.com/in/mertmetinn/" target="blank"><img align="left" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="mertmetin" height="27" width="36" /></a>
<strong>Mert Metin</strong>

<strong>📫 How to reach me mertmetin39@gmail.com</strong>

---

<a href="https://www.linkedin.com/in/berk-karao%C4%9Flu-301493259/" target="blank"><img align="left" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="berkkaraoglu" height="27" width="36" /></a>
<strong>Berk Karaoğlu</strong>

<strong>📫 How to reach me karaogluberk64@gmail.com</strong>

Project Link: [https://github.com/MerttMetinn/Java-Reservation-System](https://github.com/MerttMetinn/Java-Reservation-System)

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
