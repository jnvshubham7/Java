import java.util.*;

public class courseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            courses[i] = new Course(a, b, c, d, e);
        }

        String adm = sc.nextLine();
        int avg = findAvgOfQuizByAdmin(courses, adm);
        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("No Course found.");
        }

        int hs = sc.nextInt();
        Course[] sortedCourses = sortCourseByHandsOn(courses, hs);

        if (sortedCourses != null) {
            for (Course course : sortedCourses) {
                System.out.println(course.getCname());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }
    }

    public static int findAvgOfQuizByAdmin(Course[] cs, String ad) {
        int sum = 0;
        int count = 0;

        for (Course c : cs) {
            if (c.getCadmin().equalsIgnoreCase(ad)) {
                sum += c.getQuiz();
                count++;
            }
        }

        return count != 0 ? sum / count : 0;
    }

    public static Course[] sortCourseByHandsOn(Course[] cs, int h) {
        List<Course> filteredCourses = new ArrayList<>();

        for (Course c : cs) {
            if (c.getHandson() < h) {
                filteredCourses.add(c);
            }
        }

        if (filteredCourses.isEmpty()) {
            return null;
        }

        filteredCourses.sort(Comparator.comparingInt(Course::getHandson));
        return filteredCourses.toArray(new Course[0]);
    }
}

class Course {
    private int cid, quiz, handson;
    private String cname, cadmin;

    public Course(int cid, String cname, String cadmin, int quiz, int handson) {
        this.cid = cid;
        this.cname = cname;
        this.cadmin = cadmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCadmin() {
        return cadmin;
    }

    public void setCadmin(String cadmin) {
        this.cadmin = cadmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}
