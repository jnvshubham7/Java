import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NewsApp {

    public static void main(String[] args) {
        String apiUrl = "https://newsapi.org/v2/top-headlines?country=in&apiKey=fa44c6cae5c94f739b7db22c2c7cc475";
        try {
            // Create URL object
            URL url = new URL(apiUrl);

            // Create connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());
                String status = jsonResponse.getString("status");
                int totalResults = jsonResponse.getInt("totalResults");
                JSONArray articles = jsonResponse.getJSONArray("articles");

                System.out.println("Status: " + status);
                System.out.println("Total Results: " + totalResults);
                System.out.println("Articles:");

                for (int i = 0; i < articles.length(); i++) {
                    JSONObject article = articles.getJSONObject(i);
                    String title = article.getString("title");
                    String author = article.getString("author");
                    String description = article.getString("description");
                    String urlToImage = article.getString("urlToImage");
                    String publishedAt = article.getString("publishedAt");
                    String content = article.getString("content");

                    System.out.println("Title: " + title);
                    System.out.println("Author: " + author);
                    System.out.println("Description: " + description);
                    System.out.println("URL to Image: " + urlToImage);
                    System.out.println("Published At: " + publishedAt);
                    System.out.println("Content: " + content);
                    System.out.println();
                }
            } else {
                System.out.println("Error: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
