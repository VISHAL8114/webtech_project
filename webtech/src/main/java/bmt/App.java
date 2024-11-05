package bmt;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App {
    public static void main(String[] args) {
        String uri = "mongodb+srv://vishalt8114:emotunes888@cluster0.oxyuy.mongodb.net/"; // Replace with your URI

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("test"); // Specify your database
            System.out.println("Connected to MongoDB successfully!");

            // Your code to interact with MongoDB goes here
            MongoCollection<Document> collection = database.getCollection("yourCollectionName");
            Document doc = new Document("name", "example")
                            .append("type", "database")
                            .append("count", 1);
            collection.insertOne(doc);
            System.out.println("Document inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}