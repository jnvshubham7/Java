## Problem Statement

Create a class Institution with below attributes:

institutionId - int
institutionName - String
noOfStudentsPlaced - String
noOfStudentsCleared- int
location - String
grade - String

Write getters, setters for the above attributes.
Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method.
Implement two static methods - findNumClearancedByLoc and updateInstitutionGrade in Solution class.

**findNumClearancedByLoc method:**
This method will take two input parameters - array of Institution objects and string parameter location.
The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as parameter.
If no institution with the given location is present in the array of institution objects, then the method should return 0.

**updateInstitutionGrade method:**
This method will take a String parameter institutionName, along with the array of Institution objects.
The method will return the institution object, if the input String parameter matches with the institutionName attribute of the institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return null.

**The grade attribute should be calculated as follows:**
rating=(noOfStudentsPlaced \* 100)/noOfStudentsCleared
If the rating &gt= 80 , then grade should be 'A'.
Else, then grade should be 'B'

**Note:**
No institution object would have the same value for institutionName attribute.
All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is greater than 0, or it
should print "There are no cleared students in this particular location".

For updateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the institution name and A is the grade.
If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes in the above mentioned attribute sequence (except grade attribute).
Next, read the value for location and institutionName.

## Input

    111
    Amrita
    5000
    10000
    Chennai
    222
    Karunya
    16000
    20000
    Coimbatore
    333
    AppleTech
    10000
    12000
    Chennai
    444
    Aruna
    6000
    10000
    Vellore
    Chennai
    Karunya

## Output

    22000
    Karunya::A

## Starter Code

    import java.util.Scanner
    public class Solution
    {

    public static void main(String[] args)
    {
    //code to read values
    //code to call required method
    //code to display the result
    }

    public static int findNumClearancedByLoc(Institution[] instArray, String location)
    {
    //method logic
    }

    public static Institution updateInstitutionGrade(Institution[] instArray, String instName)
    {
    //method logic
    }
    }
    class Institution
    {
    //code to build Institution class
    }


Here's the solution:

## Problem Statement

Create a class Institution with below attributes:

institutionId - int
institutionName - String
noOfStudentsPlaced - String
noOfStudentsCleared- int
location - String
grade - String

Write getters, setters for the above attributes.
Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method.
Implement two static methods - findNumClearancedByLoc and updateInstitutionGrade in Solution class.

**findNumClearancedByLoc method:**
This method will take two input parameters - array of Institution objects and string parameter location.
The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as parameter.
If no institution with the given location is present in the array of institution objects, then the method should return 0.

**updateInstitutionGrade method:**
This method will take a String parameter institutionName, along with the array of Institution objects.
The method will return the institution object, if the input String parameter matches with the institutionName attribute of the institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return null.

**The grade attribute should be calculated as follows:**
rating=(noOfStudentsPlaced \* 100)/noOfStudentsCleared
If the rating &gt= 80 , then grade should be 'A'.
Else, then grade should be 'B'

**Note:**
No institution object would have the same value for institutionName attribute.
All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is greater than 0, or it
should print "There are no cleared students in this particular location".

For updateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the institution name and A is the grade.
If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes in the above mentioned attribute sequence (except grade attribute).
Next, read the value for location and institutionName.

## Input

    111
    Amrita
    5000
    10000
    Chennai
    222
    Karunya
    16000
    20000
    Coimbatore
    333
    AppleTech
    10000
    12000
    Chennai
    444
    Aruna
    6000
    10000
    Vellore
    Chennai
    Karunya

## Output

    22000
    Karunya::A

## Starter Code

    import java.util.Scanner
    public class Solution
    {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int institutionId = scanner.nextInt();
        String institutionName = scanner.next();
        String noOfStudentsPlaced = scanner.next();
        int noOfStudentsCleared = scanner.nextInt();
        String location = scanner.next();

        int institutionId2 = scanner.nextInt();
        String institutionName2 = scanner.next();
        String noOfStudentsPlaced2 = scanner.next();
        int noOfStudentsCleared2 = scanner.nextInt();
        String location2 = scanner.next();

        int institutionId3 = scanner.nextInt();
        String institutionName3 = scanner.next();
        String noOfStudentsPlaced3 = scanner.next();
        int noOfStudentsCleared3 = scanner.nextInt();
        String location3 = scanner.next();

        int institutionId4 = scanner.nextInt();
        String institutionName4 = scanner.next();
        String noOfStudentsPlaced4 = scanner.next();
        int noOfStudentsCleared4 = scanner.nextInt();
        String location4 = scanner.next();

        String instName = scanner.next();
        String locationFinal = scanner.next();

        Institution[] institutions = new Institution[4];
        institutions[0] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        institutions[1] = new Institution(institutionId2, institutionName2, noOfStudentsPlaced2, noOfStudentsCleared2, location2);
        institutions[2] = new Institution(institutionId3, institutionName3, noOfStudentsPlaced3, noOfStudentsCleared3, location3);
        institutions[3] = new Institution(institutionId4, institutionName4, noOfStudentsPlaced4, noOfStudentsCleared4, location4);

        int sum = findNumClearancedByLoc(institutions, locationFinal);
        System.out.println(sum == 0 ? "There are no cleared students in this particular location" : sum);

        Institution institution = updateInstitutionGrade(institutions, instName);
        if (institution != null) {
            System.out.println(instName + "::" + institution.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }
    }

    public static int findNumClearancedByLoc(Institution[] instArray, String location)
    {
        int sum = 0;
        for (Institution institution : instArray) {
            if (institution.getLocation().equalsIgnoreCase(location)) {
                sum += institution.getNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institution updateInstitutionGrade(Institution[] instArray, String instName)
    {
        for (Institution institution : instArray) {
            if (institution.getInstitutionName().equalsIgnoreCase(instName)) {
                double rating = (Double.parseDouble(institution.getNoOfStudentsPlaced()) * 100) / institution.getNoOfStudentsCleared();
                if (rating >= 80) {
                    institution.setGrade("A");
                } else {
                    institution.setGrade("B");
                }
                return institution;
            }
        }
        return null;
    }
    }

    class Institution {
        private int institutionId;
        private String institutionName;
        private String noOfStudentsPlaced;
        private int noOfStudentsCleared;
        private String location;
        private String grade;

        public Institution(int institutionId, String institutionName, String noOfStudentsPlaced, int noOfStudentsCleared, String location) {
            this.institutionId = institutionId;
            this.institutionName = institutionName;
            this.noOfStudentsPlaced = noOfStudentsPlaced;
            this.noOfStudentsCleared = noOfStudentsCleared;
            this.location = location;
        }

        public int getInstitutionId() {
            return institutionId;
        }

        public void setInstitutionId(int institutionId) {
            this.institutionId = institutionId;
        }

        public String getInstitutionName() {
            return institutionName;
        }

        public void setInstitutionName(String institutionName) {
            this.institutionName = institutionName;
        }

        public String getNoOfStudentsPlaced() {
            return noOfStudentsPlaced;
        }

        public void setNoOfStudentsPlaced(String noOfStudentsPlaced) {
            this.noOfStudentsPlaced = noOfStudentsPlaced;
        }

        public int getNoOfStudentsCleared() {
            return noOfStudentsCleared;
        }

        public void setNoOfStudentsCleared(int noOfStudentsCleared) {
            this.noOfStudentsCleared = noOfStudentsCleared;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }
    }