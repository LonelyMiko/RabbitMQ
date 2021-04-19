package md.usm.fmi.lab_2;

import md.usm.fmi.assets.Movie;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadJSON {
    public static ArrayList<Movie> read()
    {
        ArrayList<Movie> movies = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();
        Movie movie;
        try {
            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("C:\\Users\\Admin\\IdeaProjects\\ACDC\\src\\main\\resources\\data.json"));
            for (Object object : jsonArray)
            {
                JSONObject jsonObject = (JSONObject) object;
                long id = (long) jsonObject.get("id");
                String title = (String) jsonObject.get("title");
                long rating = (long) jsonObject.get("rating");
                long reviews = (long) jsonObject.get("reviews");
                long year = (long) jsonObject.get("year");
                String genres = (String) jsonObject.get("genres");
                movie = new Movie(id,rating,reviews,year,title,genres);
                movies.add(movie);
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
}
