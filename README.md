# Java Banking System

A beginner-friendly console banking application written in Java. It lets a user view their balance, deposit money, withdraw money, and exit the program.

## Features

- View the current account balance
- Deposit money into the account
- Withdraw money when sufficient funds are available
- Validate menu choices and monetary input
- Prevent negative or zero deposits and withdrawals
- Exit the application safely

## Technologies

- Java
- `Scanner` for console input

## Project structure

```text
Bank_Management_System/
└── Main.java
```

## How to run

1. Make sure Java is installed.

2. Save the source code as `Main.java` inside a folder named `Bank_Management_System`.

3. Open a terminal in the folder containing `Bank_Management_System`.

4. Compile the program:

```bash
javac Bank_Management_System/Main.java
```

5. Run the program:

```bash
java Bank_Management_System.Main
```

## Menu options

```text
1. Show balance
2. Deposit
3. Withdraw
4. Exit
```

## Example

```text
Banking System

1. Show balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice (1-4): 2
Enter an amount to deposit: 100

Enter your choice (1-4): 1
Current balance: $100.00
```

## Notes

- The balance begins at `$0.00`.
- Deposits and withdrawals must be greater than zero.
- A withdrawal cannot be greater than the available balance.
- This project is intended for Java practice and does not connect to a real bank or database.

## Author

Created by **Bsmala Mohamed Abdulhamid**.
