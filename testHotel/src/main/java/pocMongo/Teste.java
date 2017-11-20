package pocMongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by daniel on 09/08/17.
 */

public class Teste {
    MongoClient mongoClient = new MongoClient();
    MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
    MongoCollection<Document> collection = mongoDatabase.getCollection("test");

    public Object test(String name) {
        Document doc = new Document("name", name);
        if(name == null)return collection.find();
        return collection.find(doc);
    }

    public String insert(String name, String status, String age){
        Document doc = new Document("name", name)
                .append("age", age)
                .append("status", status);
        collection.insertOne(doc);
        if(doc.getObjectId("_id") == null) return "Error!";
        else return "salvo com sucesso!";
    }

    public String  delete(String age){
        Document doc = new Document("name", age);
         if(collection.findOneAndDelete(doc) == null) return "Cliente não encontrado!";
         else return "Cliente deletado com sucesso!";
    }

    public void update(String name, String nameUpdate){
        Document doc = new Document("name", name);
        Document docU = new Document("name", nameUpdate)
                .append("age", 21)
                .append("status", "pending");
        collection.findOneAndUpdate(doc, new Document("$set", new Document(docU)));
        System.out.println("ok");
    }
//
//    public void createCollection(){
//        ValidationOptions validationOptions = new ValidationOptions().validator(Filters.or(Filters.exists("age"), Filters.exists("test")));
//        collection.createCollertion("contacts",
//                new CreateCollectionOptions().validationOptions(validationOptions));
//    }

}
