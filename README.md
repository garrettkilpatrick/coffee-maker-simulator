## Project Overview
I created this project as part of Hyperskill's Java Backend Developer course. For the project, I was provided with a general description of what the program needed to accomplish and expected output of the program. It was my job to write the code to produce the expected output after multiple test cases are run.

This is my first "major" project incorporating Object-Oriented Programming (OOP) principles. The goal of the program is to simulate a coffee maker that allows users to:

- Buy different types of coffee
- Fill the coffee maker with supplies
- Take money from the coffee maker
- Clean the coffee maker
- Check the current amount of supplies

## Code Structure
The program consists of four classes:  
- **CoffeeMaker**: The base of the program. Contains static fields for the supplies used in the program and methods for various actions.
- **Espresso**: A subclass of CoffeeMaker for the espresso-making process.   
- **Latte**: A subclass of CoffeeMaker for the latte-making process.  
- **Cappuccino**: A subclass of CoffeeMaker for the cappuccino-making process.  

Although it could have been possible to put everything in the `CoffeeMaker` class, I chose to create a subclass for each coffee type in order to practice using OOP principles.
