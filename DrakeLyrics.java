import java.util.HashMap;
import java.util.Set;

public class DrakeLyrics {
    public static void main(String[] args) throws Exception {

        HashMap<String, String> recordList = new HashMap<String, String>();
        recordList.put("God's plan","She say, Do you love me? I tell her Only partly");
        recordList.put("Nice For What","With your phone out, gotta hit them angles");
        recordList.put("Laugh Now Cry Later","Sometimes we laugh and sometimes we cry, but I guess you know now, baby");
        recordList.put("Trust Issues","All I care about is money and the city that I'm from");
        
        String title = recordList.get("Nice For What");
        System.out.println("Track: " + title);

        Set <String> keys = recordList.keySet();
        for (String key : keys) {
            System.out.println("\n----- Drake Hits-----");
                System.out.println(key);
                System.out.println(recordList.get(key));
        }
}
}