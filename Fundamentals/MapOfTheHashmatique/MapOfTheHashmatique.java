import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {
        public static void main(String[] args) {
            HashMap<String , String> SongsList = new HashMap<String , String>();

            SongsList.put("song1" , "sdqsdqsdqssdsqsdq");
            SongsList.put("song2" , "azeazezaezaeazeza");
            SongsList.put("song3"  , "wxcxcxxwcwcwc");
            SongsList.put("song4" , "lklmklmmkmmlklm") ;
            SongsList.put("song5" , "azdfhjjkkljkjlkjl");

            String oneSong = SongsList.get("song5");

            System.out.println(oneSong);

            Set<String> keys = SongsList.keySet();
            for(String key : keys) {
                System.out.println(key + ":" + SongsList.get(key));
            }

        }

}