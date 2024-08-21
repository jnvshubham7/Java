// package java;
public class College {

    // Private fields
    private int clgId;
    private int clgRank;
    private String clgName;
    private String clgCity;
    private String clgState;
    private String clgCountry;
    private String clgType;

    // Constructor
    public College(int clgId, int clgRank, String clgName, String clgCity, String clgState, String clgCountry, String clgType) {
        this.clgId = clgId;
        this.clgRank = clgRank;
        this.clgName = clgName;
        this.clgCity = clgCity;
        this.clgState = clgState;
        this.clgCountry = clgCountry;
        this.clgType = clgType;
    }

    // Getter methods
    public int getClgId() {
        return clgId;
    }

    public int getClgRank() {
        return clgRank;
    }

    public String getClgName() {
        return clgName;
    }

    public String getClgCity() {
        return clgCity;
    }

    public String getClgState() {
        return clgState;
    }

    public String getClgCountry() {
        return clgCountry;
    }

    public String getClgType() {
        return clgType;
    }

    // Setter methods
    public void setClgId(int clgId) {
        this.clgId = clgId;
    }

    public void setClgRank(int clgRank) {
        this.clgRank = clgRank;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public void setClgCity(String clgCity) {
        this.clgCity = clgCity;
    }

    public void setClgState(String clgState) {
        this.clgState = clgState;
    }

    public void setClgCountry(String clgCountry) {
        this.clgCountry = clgCountry;
    }

    public void setClgType(String clgType) {
        this.clgType = clgType;
    }

    // Main method for testing
    public static void main(String[] args) {
        College college = new College(1, 1, "IIT", "Delhi", "Delhi", "India", "Engineering");

        

        // Using setter methods to update values
        college.setClgId(2);
        college.setClgRank(2);
        college.setClgName("ABC College");
        college.setClgCity("Mumbai");
        college.setClgState("Maharashtra");
        college.setClgCountry("India");
        college.setClgType("Arts");

        // Retrieving values using getter methods
        System.out.println("College ID: " + college.getClgId());
        System.out.println("College Rank: " + college.getClgRank());
        System.out.println("College Name: " + college.getClgName());
        System.out.println("College City: " + college.getClgCity());
        System.out.println("College State: " + college.getClgState());
        System.out.println("College Country: " + college.getClgCountry());
        System.out.println("College Type: " + college.getClgType());
    }
}
