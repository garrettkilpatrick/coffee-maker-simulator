## Project Overview
I created this project as part of Hyperskill's Java Backend Developer course. For the project, I was provided with a general description of what the program needed to accomplish and expected output of the program. It was my job to write the code to produce the expected output after multiple test cases are run.

This is my first "major" project incorporating Object-Oriented Programming (OOP) principles, particularly inheritance. The goal of the program is to simulate a coffee maker that allows users to:

- Buy different types of coffee
- Fill the coffee maker with supplies
- Take money from the coffee maker
- Clean the coffee maker
- Check the current amount of supplies

## Code Structure
The program consists of 4 main classes:  
- **CoffeeMaker**: The base class containing the common logic and resources (water, milk, beans, etc.).  
- **Espresso**: A subclass of CoffeeMaker that implements the specific process for making espresso.  
- **Latte**: A subclass of CoffeeMaker for the latte-making process.  
- **Cappuccino**: A subclass for making cappuccinos.

Although it could have been possible to put everything in the `CoffeeMaker` class, I chose to create a subclass for each coffee type to practice using inheritance and other OOP principles. Each subclass has a method that handles the process of making the corresponding type of coffee.
