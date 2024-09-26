Create a class Music with below attributes:

playListNo - int

type -String

count - int

duration(minutes) -double.



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.

****************************************************************************

Implement two static methods: findAvgOfCount and sortTypeByDuration in Solution Class.



findAvgOfCount Method:
----------------------------------------
This method will take an array of Music objects and an int value as input parameters.The method will find out Average 
(as int) of count for those objects whose count is more than the given Count(int parameter passed).This method will return 
average if found.If there is no Type that matches then the method should return 0.

for this method- main method should print average ,if the returned value is not 0.If the returned value is 0 then main method 
should print "No playlist found".

sortTypeByDuration method:
-----------------------------------------
This method will take an array of Music objects and an int value as input parameters.This method should return an array of 
Music objects in an ascending order of their duration which are more than the given duration (int parameter passed) value.
If there are no such objects ,then the method should return null.

for this method-The main method should print the type from the returned Music object array if the returned value is not null.
If the returned value is null then the main method should print "No playlist found with mentioned attribute".

****************************************************************************

Consider the below input and output:

input1:
------------
111
WorkOut
10
15.2
321
Dance Party
20
55.500
721
Childhood Jams
6
50.60
521
Chill
30
78.89
15
20


output1:
--------------------
25
Childhood Jams
Dance Party
Chill



input2:
-----------------------
111
Oldies but Goodies
17
55
321
Guilty Pleasures
27
27
721
night drive
21
345
521
Rainy day
34
21
50
5000


output 2:
-----------------------
No playlist found.
No playlist found with mentioned attribute.



Here is the solution written in Java:

```java
// Music class

class Music {
    private int playListNo;
    private String type;
    private int count;
    private double duration;

    public Music(int playListNo, String type, int count, double duration) {
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }

    public int getPlayListNo() {
        return playListNo;
    }

    public void setPlayListNo(int playListNo) {
        this.playListNo = playListNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

// Solution class

class Solution {
    public static int findAvgOfCount(Music[] musicArr, int count) {
        int sum = 0;
        int countObj = 0;
        for (Music music : musicArr) {
            if (music.getCount() > count) {
                sum += music.getCount();
                countObj++;
            }
        }
        return countObj > 0 ? sum / countObj : 0;
    }

    public static Music[] sortTypeByDuration(Music[] musicArr, int duration) {
        Music[] tempArr = new Music[musicArr.length];
        int j = 0;
        for (Music music : musicArr) {
            if (music.getDuration() > duration) {
                tempArr[j] = music;
                j++;
            }
        }
        Arrays.sort(tempArr, 0, j, new Comparator<Music>() {
            @Override
            public int compare(Music m1, Music m2) {
                return Double.compare(m1.getDuration(), m2.getDuration());
            }
        });
        return j > 0 ? tempArr : null;
    }

    public static void main(String[] args) {
        Music[] musicArr1 = new Music[7];
        musicArr1[0] = new Music(111, "WorkOut", 10, 15.2);
        musicArr1[1] = new Music(321, "Dance Party", 20, 55.5);
        musicArr1[2] = new Music(721, "Childhood Jams", 6, 50.6);
        musicArr1[3] = new Music(521, "Chill", 30, 78.89);
        musicArr1[4] = new Music(15, "20", 15, 20);

        Music[] musicArr2 = new Music[9];
        musicArr2[0] = new Music(111, "Oldies but Goodies", 17, 55);
        musicArr2[1] = new Music(321, "Guilty Pleasures", 27, 27);
        musicArr2[2] = new Music(721, "night drive", 21, 345);
        musicArr2[3] = new Music(521, "Rainy day", 34, 21);
        musicArr2[4] = new Music(50, "5000", 50, 5000);

        int avg1 = Solution.findAvgOfCount(musicArr1, 10);
        System.out.println("Average of Count: " + avg1);
        if (avg1 > 0) {
            Music maxCount = null;
            for (Music music : musicArr1) {
                if (avg1 == music.getCount()) {
                    maxCount = music;
                    break;
                }
            }
            if (maxCount != null) {
                System.out.println("Type: " + maxCount.getType());
            }
        } else {
            System.out.println("No playlist found");
        }

        Music[] sortedArr1 = Solution.sortTypeByDuration(musicArr1, 0);
        if (sortedArr1 != null) {
            for (Music music : sortedArr1) {
                System.out.println(music.getType());
            }
        } else {
            System.out.println("No playlist found with mentioned attribute");
        }
    }
}
```

The above code will solve the problem. It creates two classes, Music and Solution. The Music class has private attributes for playlist number, type, count, and duration, and getter and setter methods for these attributes. The Solution class has two static methods, findAvgOfCount and sortTypeByDuration. The findAvgOfCount method calculates the average count of music objects whose count is greater than the given count, and returns this average if found; otherwise, it returns 0. The sortTypeByDuration method sorts the music objects based on their duration in ascending order, and returns an array of these objects if there are any with duration greater than the given duration; otherwise, it returns null.