import java.util.*;
import java.io.*;
public class test4 {
    public static Scanner input=new Scanner(System.in);
    public static void writeString (String filename, String[]arr) {
        try {
            BufferedWriter ow = null;
            ow = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < arr.length; i++) {

                ow.write(arr[i] + "");
                ow.newLine();
            }
            ow.flush();
            ow.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void writeInt (String filename, int[]arr) {
        try {
            BufferedWriter ow = null;
            ow = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < arr.length; i++) {

                ow.write(arr[i] + "");
                ow.newLine();
            }
            ow.flush();
            ow.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void writeDouble (String filename, double[]arr) {
        try {
            BufferedWriter ow = null;
            ow = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < arr.length; i++) {

                ow.write(arr[i] + "");
                ow.newLine();
            }
            ow.flush();
            ow.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static String[] strFileToArray(String filePath,String[] array){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));


            int i = 0;
            for(i=0;i< array.length;i++) {
                String line = bf.readLine();
                if(line.equals("")){
                    array[i]="";
                }
                else{
                    array[i]=line;
                }

            }
        }
        catch(Exception x){
            System.out.println(x);
        }
        return array;

    }
    public static int[] intFileToArray(String filePath,int[] array){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));


            int i = 0;
            for(i=0;i< array.length;i++) {
                int line = Integer.parseInt(bf.readLine());
                array[i]=line;
            }
        }
        catch(Exception x){
            System.out.println(x);
        }
        return array;

    }
    public static double[] doubleFileToArray(String filePath,double[] array){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));


            int i = 0;
            for(i=0;i< array.length;i++) {
                double line = Double.parseDouble(bf.readLine());
                array[i]=line;
            }
        }
        catch(Exception x){
            System.out.println(x);
        }
        return array;

    }
    public static int levelValid(String in){
        boolean b=true;
        String value = in;
        while(b==true){
            if(value.equals("1")||value.equals("2")){
                b=false;
            }
            else{
                System.out.println("Please enter correct level!!!");
                value=input.nextLine();
            }
        }
        return Integer.parseInt(value);
    }
    public static int startValid(String in){
        boolean b=true;
        String value = in;
        while(b==true){
            if(value.equals("1")||value.equals("2")||value.equals("3")||value.equals("4")){
                b=false;
            }
            else{
                System.out.println("Please enter correct Number!!!");
                value=input.nextLine();
            }
        }
        return Integer.parseInt(value);
    }
    public static int intValid() {
        while (true) {
            String line = input.nextLine();
            try {
                int n = Integer.parseInt(line);
                if (n > 0 && n<16) {
                    return n;
                }
            } catch (NumberFormatException e) {
                //ok to ignore
            }
            System.out.print("Please Enter Positive Integer Only which falls in slot numbers!!!");
            System.out.println();
        }
    }
    public static double doubleValid() {
        while (true) {
            String line = input.nextLine();
            try {
                double n = Double.parseDouble(line);
                if (n > 0) {
                    return n;
                }
            } catch (NumberFormatException e) {
                //ok to ignore
            }
            System.out.print("Please Enter Positive Numbers Only!!!");
            System.out.println();
        }
    }
    public static int categoryValid(String in){
        boolean b=true;
        String value = in;
        while(b==true){
            if(value.equals("1")||value.equals("2")||value.equals("3")){
                b=false;
            }
            else{
                System.out.println("Please enter correct Number for Category!!!");
                value=input.nextLine();
            }
        }
        return Integer.parseInt(value);
    }
    public static void printCategory(){
        System.out.println("Enter vehicle category");
        System.out.println("1 for Bike/Motorcycle");
        System.out.println("2 for sedan/hatchback/Crossover");
        System.out.println("3 for SUV/Pickup/Van");
    }
    public static void printVehicle(int n) {
        if (n == 1) {
            System.out.println("Your vehicle was parked under Bike/Motorcycle category");
        }
        if (n == 2) {
            System.out.println("Your vehicle was parked under sedan/hatchback/Crossover category");
        }
        if (n == 3) {
            System.out.println("Your vehicle was parked under SUV/Pickup/Van category");
        }

    }
    public static int adminOptionsValid(String in){
        boolean b=true;
        String value = in;
        while(b==true){
            if(value.equals("1")||value.equals("2")||value.equals("3")||(value.equals("4"))){
                b=false;
            }
            else{
                System.out.println("Please enter correct Number for Category!!!");
                value=input.nextLine();
            }
        }
        return Integer.parseInt(value);
    }
    public static int billChange(String in){
        boolean b=true;
        String value = in;
        while(b==true){
            if(value.equals("1")||value.equals("2")||value.equals("3")){
                b=false;
            }
            else{
                System.out.println("Please enter correct Number for Category!!!");
                value=input.nextLine();
            }
        }
        return Integer.parseInt(value);
    }
    public static void totalParked(int[] arr1,int[] arr2){
        int totalPark=0;
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]==1){
                totalPark=totalPark+1;
            }
        }
        for(int j=0;j< arr2.length;j++){
            if(arr2[j]==1){
                totalPark=totalPark+1;
            }
        }
        System.out.println("Total number of Vehicles Parked are: "+totalPark);

    }
    public static void categoryTotal(int[] arr1,int[] arr2){
        int suvTotal=0;
        int bikeTotal=0;
        int carTotal=0;
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]==1){
                bikeTotal=bikeTotal+1;
            }
            if(arr1[i]==2){
                carTotal=carTotal+1;
            }
            if(arr1[i]==3){
                suvTotal=suvTotal+1;
            }
        }
        for(int j=0;j< arr2.length;j++){
            if(arr2[j]==1){
                bikeTotal=bikeTotal+1;
            }
            if(arr2[j]==2){
                carTotal=carTotal+1;
            }
            if(arr2[j]==3){
                suvTotal=suvTotal+1;
            }
        }
        System.out.println("The total number of Bike/Motorcycle parked currently :  "+bikeTotal);
        System.out.println("The total number of Sedan/Hatchback/Crossover parked currently : "+carTotal);
        System.out.println("The total number of SUV/Pickup/Van parked currently : "+suvTotal);

    }
    public static void main(String[] args) {
        int[] slotList=new int[15];
        String[] nameList= new String[15];
        String[] numberPlate= new String[15];
        double[] startTime = new double[15];
        int[] slotList2=new int[15];
        String[] nameList2= new String[15];
        String[] numberPlate2= new String[15];
        String[] password= new String[1];
        double[] startTime2 = new double[15];
        double[] bill = new double[3];
        int[] endTime = new int[15];
        int[] category = new int[15];
        int[] category2= new int[15];
        int sum,sum2,key,key2;
        int num,num1,num2,num3,stf1;
        String name,name2;
        String numPlate,numPlate2;
        double end,totalTime,end2,totalTime2;
        String ans,ans1;
        slotList=intFileToArray("slots.txt",slotList);
        nameList=strFileToArray("names.txt",nameList);
        numberPlate=strFileToArray("numberPlate.txt",numberPlate);
        startTime=doubleFileToArray("startTime.txt",startTime);
        slotList2=intFileToArray("slots2.txt",slotList2);
        nameList2=strFileToArray("names2.txt",nameList2);
        numberPlate2=strFileToArray("numberPlate2.txt",numberPlate2);
        startTime2=doubleFileToArray("startTime2.txt",startTime2);
        bill=doubleFileToArray("bill.txt",bill);
        category=intFileToArray("category.txt",category);
        category2=intFileToArray("category2.txt",category2);
        password=strFileToArray("password.txt",password);
        String mainAns;
        int mainAns1;
        while(true){
            sum=0;
            sum2=0;
            key=0;
            key2=0;
            Scanner input1= new Scanner(System.in);
            System.out.println("Enter 1 for Admin");
            System.out.println("Enter 2 for Vehicle Parking Panel");
            System.out.println("Enter 3 for Vehicle EXIT Panel");
            System.out.println("Enter 4 to Exit the Car Park System");
            mainAns= input.nextLine();
            mainAns1=startValid(mainAns);
            if(mainAns1==1){
                while(true){
                    System.out.println("Enter password:");
                    String adminPass=input.nextLine();
                    while(true){
                        if(adminPass.equals(password[0])){
                            System.out.println("Welcome to Admin Panel");
                            while(true){
                                System.out.println("Enter 1 for Admin password Change");
                                System.out.println("Enter 2 for Statistics Data");
                                System.out.println("Enter 3 for Bill Rates Change");
                                System.out.println("Enter 4 to EXIT");
                                String stf=input.nextLine();
                                stf1=adminOptionsValid(stf);
                                if(stf1==1){
                                    System.out.println("Enter new password:");
                                    String stf2=input.nextLine();
                                    password[0]=stf2;
                                    System.out.println("Password successfully changed");
                                    writeString("password.txt",password);
                                }
                                if(stf1==2){
                                    totalParked(slotList,slotList2);
                                    categoryTotal(category,category2);

                                }
                                if(stf1==3){
                                    System.out.println("Enter 1 to Change bill Price of Bike/Motorcycle category ");
                                    System.out.println("Enter 2 to Change bill Price of Sedan/Hatchback/Crossover ");
                                    System.out.println("Enter 3 to Change bill Price of SUV/Pickup/Van category ");
                                    String billC=input.nextLine();
                                    int billC1=billChange(billC);
                                    if(billC1==1){
                                        System.out.println("Enter the new Rates per Second to be charged for Bike/Motorcycle category(i.e 0.012 per second)");
                                        double g1=doubleValid();
                                        bill[0]=g1;
                                        writeDouble("bill.txt",bill);
                                        System.out.println("The rates were updated successfully");
                                    }
                                    if(billC1==2){
                                        System.out.println("Enter the new Rates per Second to be charged for Sedan/Hatchback/Crossover category(i.e 0.012 per second)");
                                        double g2=doubleValid();
                                        bill[1]=g2;
                                        writeDouble("bill.txt",bill);
                                        System.out.println("The rates were updated successfully");
                                    }
                                    if(billC1==3){
                                        System.out.println("Enter the new Rates per Second to be charged for SUV/Pickup/Van category(i.e 0.012 per second)");
                                        double g3=doubleValid();
                                        bill[2]=g3;
                                        writeDouble("bill.txt",bill);
                                        System.out.println("The rates were updated successfully");
                                    }
                                }
                                if(stf1==4){
                                    break;
                                }
                            }
                            if(stf1==4){
                                break;
                            }

                        }
                        else{
                            System.out.println("You have entered Wrong Password!!!");
                            System.out.println("Do you really know the Password?");
                            String in = input.nextLine().toLowerCase();
                            if(in.contains("n")||in.contains("no")){
                                break;
                            }
                            else{
                                System.out.println("Enter the password again:");
                                adminPass=input.nextLine();
                            }
                        }
                    }
                    writeString("password.txt",password);

                    System.out.println("Do you want to exit Admin panel?");
                    String adminExit=input.nextLine().toLowerCase();
                    if(adminExit.contains("y")||adminExit.contains("yes")){
                        break;
                    }
                }

            }
            if(mainAns1==2){
                System.out.println("Welcome to Vehicle Park Panel");
                while(true){
                    System.out.println("Enter Parking level (Level 1 and Level 2 only)");
                    String s= input.nextLine();
                    int level=levelValid(s);
                    if(level==1){
                        System.out.println("Following are the available slots in Level 1: ");
                        for(int i=0;i<slotList.length;i++){
                            if(slotList[i]==0){
                                System.out.print("Slot: "+(i+1)+"\t");
                                sum=sum+1;
                            }
                            System.out.println();
                        }
                        if(sum==0){
                            System.out.println("All slots are full!!");
                        }
                        if(sum>=1 && sum<=15){
                            System.out.println("Do you want to park a vehicle in Level 1?");
                            String level1Park=input.nextLine().toLowerCase();
                            if(level1Park.contains("y")||level1Park.contains("yes")){
                                System.out.println("Enter the slot number you want to park in: ");
                                while (true) {
                                    int t=intValid();
                                    if ((t-1)<15 && slotList[t - 1] == 0) {
                                        slotList[t - 1] = 1;
                                        System.out.println("Enter your name: ");
                                        nameList[t - 1] = input1.nextLine();
                                        System.out.println("Enter the vehicle's number plate (e.g ABC 123): ");
                                        numPlate = input1.nextLine();
                                        numberPlate[t - 1] = numPlate;
                                        printCategory();
                                        String c = input.nextLine();
                                        category[t-1]=categoryValid(c);
                                        startTime[t - 1] = System.currentTimeMillis() / 1000.0;
                                        System.out.println("Your vehicle has been successfully parked");
                                        break;
                                    }
                                    else {
                                        System.out.println("Please enter the correct slot!!!");
                                    }
                                }
                            }
                            else{};


                        }
                        writeInt("slots.txt",slotList);
                        writeDouble("startTime.txt",startTime);
                        writeString("names.txt",nameList);
                        writeString("numberPlate.txt",numberPlate);
                        writeInt("category.txt",category);


                    }
                    if(level==2){
                        System.out.println("Following are the available slots in Level 2: ");
                        for(int j=0;j<slotList2.length;j++){
                            if(slotList2[j]==0){
                                System.out.print("Slot: "+(j+1)+"\t");
                                sum2=sum2+1;
                            }
                            System.out.println();
                        }
                        if(sum2==0){
                            System.out.println("All slots are full!!");
                        }
                        if(sum2>=1 && sum2<=15){
                            System.out.println("Do you want to park a vehicle in Level 2?");
                            String level2Park=input.nextLine().toLowerCase();
                            if(level2Park.contains("y")||level2Park.contains("yes")){
                                System.out.println("Enter the slot number you want to park in: ");
                                while (true) {
                                    int v =intValid();
                                    if ((v-1)<15 && slotList2[v - 1] == 0) {
                                        slotList2[v - 1] = 1;
                                        System.out.println("Enter your name: ");
                                        nameList2[v - 1] = input1.nextLine();
                                        System.out.println("Enter the vehicle's number plate (e.g ABC 123): ");
                                        numPlate2 = input1.nextLine();
                                        numberPlate2[v - 1] = numPlate2;
                                        printCategory();
                                        String d = input.nextLine();
                                        category2[v-1]=categoryValid(d);
                                        startTime2[v - 1] =  System.currentTimeMillis() / 1000.0;
                                        System.out.println("Your vehicle has been successfully parked");
                                        break;
                                    }
                                    else {
                                        System.out.println("Please enter the correct slot!!!");
                                    }
                                }
                            }
                            else{};



                        }
                        writeInt("slots2.txt",slotList2);
                        writeDouble("startTime2.txt",startTime2);
                        writeString("names2.txt",nameList2);
                        writeString("numberPlate2.txt",numberPlate2);
                        writeInt("category2.txt",category2);
                    }
                    sum=0;
                    sum2=0;
                    Scanner input3=new Scanner(System.in);
                    System.out.println("Do you want to exit the Vehicle Parking Panel?");
                    String t = input3.nextLine().toLowerCase();
                    if(t.contains("y")||(t.contains("yes"))){
                        break;
                    }


                }
            }
            if(mainAns1==3){
                System.out.println("Welcome to the Vehicle EXIT Panel");
                while(true){
                    System.out.println("Enter the EXIT level");
                    String s1 = input.nextLine();
                    int level2=levelValid(s1);
                    if(level2==1){

                        for(int o=0;o<slotList.length;o++){
                            if(slotList[o]==1){
                                key=key+1;
                            }
                        }
                        if(key>=1 && key<=15){
                                System.out.println("The vehicles are parked in the slots: ");
                                for(int k=0;k< slotList.length;k++){
                                    if(slotList[k]!=0){
                                        System.out.print("Slot: "+(k+1)+"\t");
                                    }
                                    System.out.println();
                                }
                            System.out.println("Do you want to Exit vehicle from Level 1?");
                                String level1Exit=input.nextLine();
                            if(level1Exit.contains("y")||level1Exit.contains("yes")){
                                System.out.println("Enter the vehicle you want to exit: ");
                                while(true){
                                    int y =intValid();
                                    if(slotList[y-1]!=0){
                                        System.out.println(nameList[y-1]);
                                        System.out.println("Your vehicle's number plate is "+numberPlate[y-1]);
                                        end=System.currentTimeMillis()/1000.0;
                                        totalTime=Math.round(end-startTime[y-1]);
                                        int b1 =category[y-1];
                                        printVehicle(category[y-1]);
                                        System.out.printf("Your vehicle has been parked for %.2f minutes ",totalTime/60.0);
                                        System.out.println();
                                        System.out.printf("Total bill is %.2f Rupees",(bill[b1-1]*totalTime));
                                        System.out.println();
                                        startTime[y-1]=0;
                                        slotList[y-1]=0;
                                        category[y-1]=0;
                                        nameList[y-1]="";
                                        numberPlate[y-1]="";
                                        break;

                                    }
                                    else{
                                        System.out.println("Please enter correct slot number!!!");
                                    }


                                }
                            }




                        }
                        else{
                            System.out.println("There is no vehicle parked in Level 1");
                        }
                        writeInt("slots.txt",slotList);
                        writeDouble("startTime.txt",startTime);
                        writeString("names.txt",nameList);
                        writeString("numberPlate.txt",numberPlate);
                        writeInt("category.txt",category);
                    }
                    if(level2==2){
                        for(int n=0;n<slotList2.length;n++){
                            if(slotList2[n]==1){
                                key2=key2+1;
                            }
                        }

                        if(key2>=1 && key2<=15){
                            System.out.println("The vehicle are parked in the slots: ");
                            for(int m=0;m< slotList.length;m++){
                                if(slotList2[m]!=0){
                                    System.out.print("Slot: "+(m+1)+"\t");
                                }
                                System.out.println();
                            }
                            System.out.println("Do you want to Exit vehicle from Level 2?");
                            String level2Exit=input.nextLine();
                            if(level2Exit.contains("y")||level2Exit.contains("yes")){
                                System.out.println("Enter the vehicle you want to exit: ");
                                while(true){
                                    int z = intValid();
                                    if(slotList2[z-1]!=0){
                                        System.out.println(nameList2[z-1]);
                                        System.out.println("Your vehicle's number plate is "+numberPlate2[z-1]);
                                        end2=System.currentTimeMillis()/1000.0;
                                        totalTime2=Math.round(end2-startTime2[z-1]);
                                        int b2 = category2[z-1];
                                        printVehicle(category2[z-1]);
                                        System.out.printf("Your vehicle has been parked for %.2f minutes ",totalTime2/60.0);
                                        System.out.println();
                                        System.out.printf("Total bill is %.2f Rupees",(bill[b2-1]*totalTime2));
                                        System.out.println();
                                        startTime2[z-1]=0;
                                        slotList2[z-1]=0;
                                        category2[z-1]=0;
                                        nameList2[z-1]="";
                                        numberPlate2[z-1]="";
                                        break;

                                    }
                                    else{
                                        System.out.println("Please enter correct slot number!!!");
                                    }


                                }
                            }




                        }
                        else{
                            System.out.println("There is no vehicle parked in Level 2");
                        }
                        writeInt("slots2.txt",slotList2);
                        writeDouble("startTime2.txt",startTime2);
                        writeString("names2.txt",nameList2);
                        writeString("numberPlate2.txt",numberPlate2);
                        writeInt("category2.txt",category2);

                    }
                    key=0;
                    key2=0;
                    Scanner input4=new Scanner(System.in);
                    System.out.println("Do you want to exit the EXIT PARK Panel?");
                    String u = input4.nextLine().toLowerCase();
                    if(u.contains("y")||(u.contains("yes"))){
                        break;
                    }
                }
            }
            if(mainAns1==4){
                writeInt("slots.txt",slotList);
                writeDouble("startTime.txt",startTime);
                writeString("names.txt",nameList);
                writeString("numberPlate.txt",numberPlate);
                writeInt("slots2.txt",slotList2);
                writeDouble("startTime2.txt",startTime2);
                writeString("names2.txt",nameList2);
                writeString("numberPlate2.txt",numberPlate2);
                writeInt("category.txt",category);
                writeInt("category2.txt",category2);
                writeString("password.txt",password);
                writeDouble("bill.txt",bill);
                break;
            }
        }


    }

}
