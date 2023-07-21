import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class VoiceAssistant {
    
    // Function to recognize voice input and return it as text
    public static String recognizeSpeech() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something!");
        String text = scanner.nextLine();
        return text;
    }
    
    // Function to search for a song based on its lyrics
    public static String[] searchSong(String lyrics) {
        String[] result = new String[2];
        try {
            String url = "https://api.audd.io/findLyrics/?q=" + lyrics.replace(" ", "%20");
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                Scanner scanner = new Scanner(con.getInputStream());
                String response = scanner.useDelimiter("\\A").next();
                JSONObject json = new JSONObject(response);
                String status = json.getString("status");
                if (status.equals("success")) {
                    JSONArray resultArray = json.getJSONArray("result");
                    if (resultArray.length() > 0) {
                        JSONObject resultObj = resultArray.getJSONObject(0);
                        String songTitle = resultObj.getString("title");
                        String artist = resultObj.getString("artist");
                        result[0] = songTitle;
                        result[1] = artist;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    // Main program
    public static void main(String[] args) {
        while (true) {
            // Listen for voice input
            String query = recognizeSpeech();
            if (query != null && !query.equals("")) {
                // Check if the user asked for a song identification
                if (query.contains("identify") && query.contains("song")) {
                    // Ask the user to sing or recite some lyrics
                    System.out.println("Please sing or recite some lyrics from the song.");
                    String lyrics = recognizeSpeech();
                    if (lyrics != null && !lyrics.equals("")) {
                        // Search for the song based on the lyrics
                        String[] result = searchSong(lyrics);
                        if (result[0] != null && result[1] != null) {
                            System.out.println("The song is " + result[0] + " by " + result[1]);
                        } else {
                            System.out.println("Sorry, I could not identify the song.");
                        }
                    }
                }
                // Add more commands for your voice assistant here
                // ...
                else {
                    System.out.println("Sorry, I did not understand your command.");
                }
            }
        }
    }
}
