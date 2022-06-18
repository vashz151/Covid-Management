# Covid-Management
This is a JAVA-DBMS Project. Here, we have developed a JAVA GUI Application.
The project focuses on handling a user and an admin, with the scope of bed booking/handling, and vaccine booking/handling.
The application is designed keeping the user in mind. Hence, it is a simple and user friendly inventory management application. 
A user is identified by user id(pk), username and password.
An admin having a password can login to the respective hospital/vaccine centre and can update status of beds and vaccine count respectively.
##### ADMIN/STAFF Functionalities
*	The admin check the list of beds/vaccine slots.
*	The admin can also update the bed count after the patient is discharged.
*	The vaccine centre can also generate session for the next day and add the various details like type, count,etc.
*	They can track the beds/slots and see the list of beds/slots along with their available quantity.
*	The admin can see and review the patient details. 
*	The hospital admin can register or discharge a patient.
*	A hospital can have more than one person having admin authorities and same for vaccine centre.


#### USER Functionalities 
*	The user can check the list of available beds and slots by entering the pincode/zipcode of his locality.
*	The user can book a vaccine slot depending on the availability of slot.
*	The user can also select the type of vaccine required like CoviShield, Covaxin, etc.
*	The user can also view his/her past bookings from the user dashboard.
*	The user can also book a hospital bed again depending on the availability of beds.
*	The user can select the type of bed like O2, non O2, etc. and accodingly add the patient details while booking the bed. An acknowledgement will be generated for the same.
*	Also the user can access the mobile number/email and address of the various hospitals in the city.

# Tools and Technology:
This project was developed with Netbeans Apache and the database application used was MySQL. 
The connection was possible with the help of JDBC connector.

#Database ER and Mapping
![image](https://user-images.githubusercontent.com/96206852/174431829-cc9ce0b0-7145-4f70-91f8-ddb0a6bfa027.png)
![image](https://user-images.githubusercontent.com/96206852/174431875-bf62df57-c11c-408c-8a4b-3c67c80dc217.png)
