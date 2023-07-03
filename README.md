# Car_Park_System_Procedural_Programming
I made this car park system using Command Line Interface in JAVA. This is a car parking system that keeps track of when you parked your car and when you come back it maintains your data which it stores in file and then tells you the exact time the car was parked for and the total bill. I have used File Handling to store the user information
About the Project:
I have made a Java Project on “Vehicle Parking System”. This project solves the 
problem of going into a car parking place or a building and roaming around in the 
hopes that you will find an empty space.
Sometimes you get lucky but if you don’t find a place to park it is waste of time. 
This project solves this problem. Whenever you enter the Vehicle Parking System 
you will be shown the Empty Slots that are available so that you don’t have to roam 
around and waste your time. If there are multiple slots available then you can select 
the slot of your own choice.
Once the slot has been selected, the details regarding your vehicle like owner’s name, 
number plate etc. are asked. Once all the required information is given the vehicle is 
parked in the slot of your choice.
You can Exit your vehicle anytime you want. Because a unique slot number was 
selected by the user so if you want to Exit you can do that by providing the slot in 
which your vehicle is parked. Once you have entered your slot number all the details 
of your vehicle are displayed along with the Total time it was parked and the bill 
will be generated accordingly depending upon the time and the vehicle category.
Besides these functions this Parking System also has an Admin Panel. A password 
is required whenever you want to enter the Admin panel. Admin can change the 
passwords, view the statistical data and change the Rates of different categories of 
vehicle anytime.


Technical Details:
I have made this project using Java Language. I have used IntelliJ. Command Line 
Interface is used. I integrated different concepts that have been taught throughout 
the Semester. I have used conditional statements, while and for loops, in-built 
methods and user defined methods. A lot of user defined methods were used since 
this project required validation and update every time a new vehicle was parked or 
exited. I have used 1D Arrays as well. These arrays hold all the Data that is required 
by the Program. To keep this Data Saved once the user exits the program I have 
implemented File handling. There are multiple files that are created already and hold 
the data.
Once the program starts these files send the data into their respective arrays. The 
arrays do the rest of the processing and whenever a major change occurs, the data 
saved on these files are updated accordingly. When the user exits all the data that 
arrays contain is transferred back to these files that keep the data saved. So whenever 
the user enters the program next time, the correct data is transferred from the files 
into respective arrays.
Data validation is an important point that I have worked on in this project. If the 
correct data is not entered the whole program is affected. So for Input Validation I 
have made sure that only correct data is taken and whenever user enters Wrong 
Information or anything else that is not asked the user is prompted with a Warning 
message to enter the data again until the user enters the correct data. So I have made 
sure that at every stage where input is required, input validation is implemented.
Exception handling is also used because once you use Files you have to implement 
exception handling. Exception handling is used where it is required so that the flow 
of the program is not disturbed when error occurs.
