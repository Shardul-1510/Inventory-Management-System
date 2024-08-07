# Inventory Management System (Java & MySQL)

## Project Overview
The Inventory Management System is a Java application designed to streamline inventory tracking and 
management. Using JDBC, it interacts with a database to add, update, and delete items. The user-friendly 
interface, developed with NetBeans IDE, ensures efficient operation.

## Features
**Login Page**

Users (Admin and Customers) must login with valid credentials to access the application.
Authentication ensures secure access and protects sensitive data.

**Registration Page**

New users can register to become part of the system.
Required information is collected to create new user accounts securely.

**Welcome Page**

Central hub for navigating through the application.
Provides access to all modules and functionalities based on user roles.

**Add Product Module**

Allows inventory owners to add new products to the system.
Includes fields for product details such as name, description, quantity, and price.

**Search Product Module**

Enables users (both owners and customers) to search for products based on their unique identifier (ID).
Facilitates quick and easy retrieval of product information.

**Display Inventory**

Shows current stock levels and availability of products in the inventory.
Helps owners and customers alike make informed decisions about product availability.

**Return Product**

Provides a mechanism for customers to initiate product returns if they are dissatisfied.
Supports efficient handling of returns and ensures customer satisfaction.

**Purchase Product**

Allows customers to select and purchase desired products.
Facilitates seamless transaction processing and updates inventory levels accordingly.

**Bill Generation**

Generates bills or invoices for customers upon completing their purchases.
Provides a printable format for customers to keep records of their transactions.

**Orders**

Gives inventory owners visibility into received orders and their details.
Helps manage and fulfill customer orders efficiently.

## User Interface
![LoginPage](https://github.com/user-attachments/assets/779cc6cd-0b84-453d-bfc1-806105c7930e)
![Registration](https://github.com/user-attachments/assets/8e09e191-b541-4307-8496-91830c228d71)
![Welcome](https://github.com/user-attachments/assets/b662e79b-f326-4edb-b5d9-6f6b00ba2689)
![AddProduct](https://github.com/user-attachments/assets/1e88214a-97b8-4f92-a6b7-89dac75c0b3e)
![SearchProduct](https://github.com/user-attachments/assets/447a9136-e99d-4fc6-adf3-e88863383a2d)
![Display Inventory](https://github.com/user-attachments/assets/1bb7786a-7c6d-4b28-ae83-32439dc2ee77)
![ReturnProduct](https://github.com/user-attachments/assets/1b234eb5-618a-4135-9d87-815c822f2bee)
![PurchaseProduct](https://github.com/user-attachments/assets/30cf3a84-dc7d-4fcf-a529-9086dc5157d2)
![BillGeneration](https://github.com/user-attachments/assets/362b682b-a001-48c2-8bbc-11710c5689d4)
![OrderDisplay](https://github.com/user-attachments/assets/a3c20407-2437-4ef7-936a-f9a2ac7ffe4d)



## Technologies Used
- Java
- MySQL
- NetBeans IDE 8.2
- Tomcat5.0/6.X 
- mySQL-connector-java (version 8.0.11)
- XAMPP Control Panel (version 3.3.0)

## Installation Guide
1. Clone the repository: `git clone https://github.com/Shardul-1510/InventoryManagementSystem.git`
2. Import the project into NetBeans IDE.
3. Configure MySQL database settings in the project.
4. Configure the database on localhost/phpmyadmin and create database there
5. Import the jar file
6. Ensure the JDBC Connectivity
7. Run the application from NetBeans.

## Usage
- Launch the application and log in with user credentials.
- Navigate through different modules such as add product, search product,inventory,bill generation, etc.
- Use the various features to manage the inventory and save the bills.

## Database Configuration
- Create a MySQL database named `inventory_management(or whatever you prefer)`.
- Configure MySQL database settings in the project.
- Configure the database on localhost/phpmyadmin and create database there
- Import the jar file
- Ensure the JDBC Connectivity

## Contributing
Contributions are welcome! Please follow the [Contributing Guidelines](CONTRIBUTING.md) before submitting pull requests.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author
SHARDUL CHAVAN
