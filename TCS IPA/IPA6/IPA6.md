Create the class RRT(Rapid response team) with the below attributes:

ticketNo-int

raisedBy-String 

assignedTo-String

priority-int

project-String



All attributes should be private,write getters and setters and 

parameterized constructor as required.



Create class MyClass with main method.



Implement a static method-getHighestPriorityTicket in MyClass class.



getHighestPriorityTicket method:

     This method will take an array of RRT objects ,and a String value as parameters.This method will return the RRT object with highest priority
ticket from the array of the RRT objects for the given project(String parameter passed).Highest priority is the one which has lesser value.

for example:1 is considered as high priority and 5 is considered as low priority.

If no RRT with the above condition is present in the array of the RRT objects,then the method should return null.

The main method should print the ticketNo,raisedBy and assignedTo from returned object if the returned object is not null.if the returned object is null then main method should print "No such Ticket". 





input1:
----------------------
123
Velantish
Mani
3
Xperience
234
Sathish
Akshaya
1
AIG
345
John
Jack
2
AIG
456
Bhuvi
Jack
5
AIG
AIG


output1:
------------------
234
Sathish
Akshaya

**************

Input2:
--------------
123
Velantish
Mani
3
Xperience
234
Sathish
Akshaya
1
AIG
345
John
Jack
2
AIG
456
Bhuvi
Jack
5
AIG
Xplore


output2:
--------------
No such ticket.



Here is the solution in a structured markdown format:

**RRT Class**
----------------

### Attributes
* `ticketNo` (int)
* `raisedBy` (String)
* `assignedTo` (String)
* `priority` (int)
* `project` (String)

### Getters and Setters
```java
public class RRT {
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    // getter and setter methods
    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
```

### Constructor
```java
public RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project) {
    this.ticketNo = ticketNo;
    this.raisedBy = raisedBy;
    this.assignedTo = assignedTo;
    this.priority = priority;
    this.project = project;
}
```

**MyClass Class**
----------------

### Main Method
```java
public class MyClass {
    public static void main(String[] args) {
        // input data
        RRT[] tickets = new RRT[] {
            new RRT(123, "Velantish", "Mani", 3, "Xperience"),
            new RRT(234, "Sathish", "Akshaya", 1, "AIG"),
            new RRT(345, "John", "Jack", 2, "AIG"),
            new RRT(456, "Bhuvi", "Jack", 5, "AIG"),
            new RRT(567, "John", "Jack", 3, "Xplore")
        };

        // call getHighestPriorityTicket method
        RRT highestPriorityTicket = getHighestPriorityTicket(tickets, "AIG");

        // print ticket information
        if (highestPriorityTicket != null) {
            System.out.println(highestPriorityTicket.getTicketNo() + " " + highestPriorityTicket.getRaisedBy() + " " + highestPriorityTicket.getAssignedTo());
        } else {
            System.out.println("No such ticket.");
        }
    }

    // getHighestPriorityTicket method implementation
    public static RRT getHighestPriorityTicket(RRT[] tickets, String project) {
        RRT highestPriorityTicket = null;
        int highestPriority = 1; // assume highest priority is 1

        for (RRT ticket : tickets) {
            if (ticket.getProject().equals(project) && ticket.getPriority() < highestPriority) {
                highestPriorityTicket = ticket;
                highestPriority = ticket.getPriority();
            }
        }

        return highestPriorityTicket;
    }
}
```

### Input and Output
* Input 1:
	+ `tickets` array: `[123, "Velantish", "Mani", 3, "Xperience", 234, "Sathish", "Akshaya", 1, "AIG", 345, "John", "Jack", 2, "AIG", 456, "Bhuvi", "Jack", 5, "AIG", "AIG"]`
	+ Output: `234 Sathish Akshaya`
* Input 2:
	+ `tickets` array: `[123, "Velantish", "Mani", 3, "Xperience", 234, "Sathish", "Akshaya", 1, "AIG", 345, "John", "Jack", 2, "AIG", 456, "Bhuvi", "Jack", 5, "AIG", "Xplore"]`
	+ Output: `No such ticket.`