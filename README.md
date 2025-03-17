# Simple-Banking-App
## Description
This is a simple banking application written in Java that allows users to create accounts, deposit money, withdraw money, and check their account balances. The program provides an interactive command-line interface where users can perform various banking operations.

It allows multiple accounts to be created and managed with unique account IDs. Each account starts with a balance of $0.00, and the program offers functionality to manage deposits and withdrawals with basic validation.

---

## Features
- **Create Account:** Users can create a new account, which will automatically receive a unique account ID.

- **Deposit Money:** Users can deposit money into their account.

- **Withdraw Money:** Users can withdraw money from their account, provided they have sufficient balance.

- **Check Balance:** Users can check the balance of their account.

- **Exit:** Exit the application.

---

## Requirements
- Java Development Kit (JDK) 8 or higher.

- Command-line interface for interaction.

---

## How to Run
- **Clone or Download the repository:** Download the code or clone it to your local machine.

- **Compile the Code:** In the terminal or command prompt, navigate to the directory containing the file SimpleBankingApp.java, and run:

```nginx
javac SimpleBankingApp.java
```

- **Run the Program:** After compilation, run the program with:


```nginx
java SimpleBankingApp
```

- **Follow the On-Screen Prompts:** The program will display a menu where you can choose different options.

---

## Usage
Once the program is running, you will see the following menu:

```markdown
Simple Banking Application
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice:
```

- **Option 1:** Create a new account. It will generate a unique account ID.

- **Option 2:** Deposit money into an existing account. The user will enter their account ID and the deposit amount.

- **Option 3:** Withdraw money from an existing account. The user will enter their account ID and the withdrawal amount. It will check if the withdrawal is valid based on the current balance.

- **Option 4:** Check the balance of an existing account. The user will enter their account ID to see the balance.

- **Option 5:** Exit the application.

---

## Example Workflow
```pgsql
Simple Banking Application
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 1
Account created successfully with ID: 1001

Simple Banking Application
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 2
Enter your account ID: 1001
Enter deposit amount: 500
Deposited $500.0 to account ID: 1001

Simple Banking Application
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 4
Enter your account ID: 1001
Account ID: 1001 has a balance of $500.0

```

## Classes and Methods
### Account Class:

 **int accountId:** Unique identifier for each account.

- **double balance:** Balance in the account.

- **void deposit(double amount):** Deposits a positive amount to the account.

- **void withdraw(double amount):** Withdraws money from the account if sufficient funds are available.

- **void checkBalance():** Displays the current balance of the account.

 ### SimpleBankingApp Class (Main Class):

Contains the main method which handles user interaction and manages multiple accounts using an **ArrayList<Account>.**

---

## Error Handling
- If an invalid account ID is entered during deposit, withdrawal, or balance check, an error message will appear: **"Account not found."**

- If an invalid deposit or withdrawal amount is entered (e.g., negative values), the program will show an error message.

- If a withdrawal exceeds the available balance, the program will notify the user that the transaction cannot be completed due to insufficient funds.

---

## Contribution
If you'd like to contribute to this project, feel free to fork the repository, make changes, and create a pull request.

---

## License
This project is open-source and available under the MIT License.

---
