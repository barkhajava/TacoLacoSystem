# Project TacoLaco System

This project has been implemented in Spring Boot + Maven using MVC pattern

# Importing the Project in your IDE

Import the project in your IDE using Import option of Existing Maven Projects

# Running the Service
Step 1: Run the mvn clean package command or run Maven clean package goals in your IDE

Step 2: Step 1 will create an executable JAR file of your Spring Boot application and put it within the target folder.

Step 3: Run the executable JAR, using the following Java command.
java -jar target/<your-jar-name>.jar

# Testing the Service
Using Postman call the endpoint http://localhost:8080/getOrderTotal with the sample JSON Request given below and you should get a sample JSON Response as shown below

# Sample JSON Request

{
    "order": [
        {
            "OrderItem": "Veggie Taco",
            "orderQuantity": 2
        },
         {
            "OrderItem": "Chicken Taco",
            "orderQuantity": 1
        }
    ]
}

# Sample JSON Response
{
    "orderTotal": 8.0
}
