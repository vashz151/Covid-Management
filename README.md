# Covid-Management
This is a JAVA-DBMS project. Here, we have developed a Java GUI application. The project focuses on handling a user and an admin, with the scope of bed booking and handling, and vaccine booking and handling. The application is designed with the user in mind. Hence, it is a simple and user-friendly inventory management application. A user is identified by a user id (pk), username, and password. An admin having a password can login to the respective hospital/vaccine centre and can update the status of beds and vaccine count respectively.

##### ADMIN/STAFF Functionalities
*	The admin checks the list of beds and vaccine slots.
* The admin can also update the bed count after the patient is discharged.
* The vaccine centre can also generate a session for the next day and add the various details like type, count, etc.
* They can track the beds and slots and see the list of beds and slots along with their available quantity.
* The admin can see and review the patient's details.
* The hospital admin can register or discharge a patient.
* A hospital can have more than one person having admin authority and the same for a vaccine centre.


#### USER Functionalities 
* The user can check the list of available beds and slots by entering the pincode or zipcode of their locality.
* The user can book a vaccine slot depending on the availability of the slot.
* The user can also select the type of vaccine required, like CoviShield, Covaxin, etc.
* The user can also view his/her past bookings from the user dashboard.
* The user can also book a hospital bed again depending on the availability of beds.
* The user can select the type of bed, like O2, non-O2, etc., and accordingly add the patient details while booking the bed. An acknowledgement will be generated for the same.
* Also, the user can access the mobile number, email, and address of the various hospitals in the city.

# Tools and Technology:
This project was developed with Netbeans Apache and the database application used was MySQL. The connection was possible with the help of the JDBC connector.

# A Database ER Diagram
![image](https://user-images.githubusercontent.com/96206852/174431829-cc9ce0b0-7145-4f70-91f8-ddb0a6bfa027.png)
