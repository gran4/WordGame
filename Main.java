import org.json.JSONObject;
import org.json.JSONException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Read the JSON file as a string
            String jsonContent = new String(Files.readAllBytes(Paths.get("Spainish.json")));

            // Create a JSONObject from the JSON string
            JSONObject jsonObject = new JSONObject(jsonContent);

            // Get the keys (terms) from the JSONObject
            List<String> terms = new ArrayList<>(Arrays.asList(JSONObject.getNames(jsonObject)));

            Random rand = new Random();

            Scanner myObj = new Scanner(System.in);
            while(terms.size() > 0){
                int randomIndex = rand.nextInt(terms.size());
                String randomElement = terms.get(randomIndex);
                System.out.println("Word: " + randomElement);

                System.out.print("Your Answer: ");
                String t = myObj.nextLine();
                System.out.println("Answer: " + jsonObject.get(randomElement));
                System.out.println();

                if (!t.isEmpty()){
                    terms.remove(randomElement);
                }
            }
            System.out.println("FINISHED, You Studied all the words!!!");

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
