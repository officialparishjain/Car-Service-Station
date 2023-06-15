<p align="center">
  <img src="https://www.garage.movemycar.in/assets/images/content-image-2.png" alt="Car Service Station"
       height= "320" width="900">
</p>

# Car Service Station

This program is a simple car service bill generator that allows users to select a car type (Hatchback, Sedan, or SUV) and choose from a list of services to be performed on the car. The program calculates the total bill based on the selected services and generates a bill with detailed information.

## Purpose of Project

The purpose of this project is to provide a basic car service bill generator that can be used by car service stations or individuals to calculate and generate bills for car services. It offers flexibility in selecting car types and services, and provides a detailed bill format with charges for each service.

## Usage

1. Run the `Main` class to start the program.
2. The program will display the car service station title and options to select the car type.
3. Choose a car type by entering the corresponding number.
4. The program will display the available services for the selected car type.
5. Enter the number of services you want to select.
6. Select the services by entering the corresponding numbers.
7. The program will calculate the total bill and generate a bill with service details.
8. If the total bill exceeds 10,000, a free car cleaning service will be added to the bill.
9. Repeat the process for different car types or exit the program.


## Technology Used

- Java


## Classes

- `Main`: The Main class is the entry point of the program. It provides the main menu and handles user input. It interacts with the CarServiceStation interface and its implementing classes to perform the services and generate bills.
- `CarServiceStation`: The CarServiceStation interface defines the methods for different car services such as basic service, engine fixing, clutch fixing, brake fixing, and gear fixing. All car types (Hatchback, Sedan, and SUV) implement this interface and provide their own implementations for the services.
- `Hatchback`, `Sedan`, and `SUV`: These classes represent different car types and implement the CarServiceStation interface. Each class has its own pricing information for the services and provides the implementation of the service methods. The prices are stored in a HashMap for easy retrieval based on the service code.

## Attractive Bill Format

| No. | Service Code | Service           | Charges |
| --- | ------------ | ----------------- | ------- |
| 1   | BS01         | Basic Servicing   | ₹2000   |
| 2   | EF01         | Engine Fixing     | ₹5000   |
| 3   | CF01         | Clutch Fixing     | ₹2000   |
| 4   | BF01         | Brake Fixing      | ₹1000   |
| 5   | GF01         | Gear Fixing       | ₹3000   |
|     |              | **Total Bill**    | **₹13000** |


## Step wise Step Explanation
- Step 1 : Select the car type
  ![image](https://github.com/officialparishjain/Car-Service-Station/assets/124424043/90fe4454-d019-4c78-b078-e9d7d18a7bee)

- Step 2: Select type of services do you want first put how many type of services you want and then select services
  ![image](https://github.com/officialparishjain/Car-Service-Station/assets/124424043/193004b8-6df1-46c8-9e1e-a88e48107762)

- Step 3: Then the bill will generated
  ![image](https://github.com/officialparishjain/Car-Service-Station/assets/124424043/04276c3c-7d1f-40c4-a315-e1dee9827e99)

- Step 4: For exit 
- ![image](https://github.com/officialparishjain/Car-Service-Station/assets/124424043/a13d8a6f-caf6-4a77-89f2-4016eca7cb1e)

## Features
- If Total Bill go abobe Rs 10000 user will get car Washing Free
![image](https://github.com/officialparishjain/Car-Service-Station/assets/124424043/bcafaa0f-0597-422e-9032-caa85631b637)




## Authors

- Name : Parish Jain
- Contact : officialparishjain@gmail.com

---

Feel free to customize the content and styling of the README according to your preferences. You can also add additional sections or images as needed.
