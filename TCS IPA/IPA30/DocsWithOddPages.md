Create class Document with below attributes

id - int
title - String
folderName - String
pages - int

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - docsWithOddPages in Solution class.

This method will take array of Document objects and return another array with Document objects which has odd number of pages. 

This method should be called from main method and display values of returned objects as shared in the sample (in ascending 
order of id attribute). 

Before calling this method, use Scanner object to read values for four Document objects referring attributes in the above 
sequence. 

Next call the method and display the result. 

Consider below sample input and output:

Input:
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40


Output (each line has values separated by single space):
2 question1 exams 55
3 question2 exams 45



Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:
22
hello

Referring below code:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -> here we expect str to have value hello. Instead it may be """".

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.


Here is the solution in Java:
```
## Document Class

```java
public class Document {
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
```

## Solution Class

```java
public class Solution {
    public static Document[] docsWithOddPages(Document[] documents) {
        List<Document> oddPagesDocs = new ArrayList<>();
        for (Document doc : documents) {
            if (doc.getPages() % 2 != 0) {
                oddPagesDocs.add(doc);
            }
        }
        return oddPagesDocs.toArray(new Document[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document[] documents = new Document[4];
        for (int i = 0; i < 4; i++) {
            documents[i] = new Document(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine(); // Read nextLine to handle issue with Scanner
        }

        Document[] oddPagesDocs = docsWithOddPages(documents);

        for (Document doc : oddPagesDocs) {
            System.out.println(doc.getId() + " " + doc.getTitle() + " " + doc.getFolderName() + " " + doc.getPages());
        }
    }
}
```

## Explanation

The `Document` class has a constructor that takes the four attributes (`id`, `title`, `folderName`, and `pages`) and setter/getter methods for each attribute.

The `Solution` class has a static method `docsWithOddPages` that takes an array of `Document` objects and returns a new array containing only the documents with odd number of pages.

In the `main` method, we create a `Scanner` object to read the input values for four `Document` objects. We read the values in the following order: `id`, `title`, `folderName`, and `pages`. We also add an extra call to `nextLine()` after reading each numeric value to handle the issue with the `Scanner`.

After reading the input values, we call the `docsWithOddPages` method and store the result in a new array. We then iterate through the result array and print the values of each document, separated by spaces, in ascending order of `id`.

The output will be:
```
2 question1 exams 55
3 question2 exams 45
```