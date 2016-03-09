package cawabanga.com.udacitycourse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] forecastArray = {
            "Today - Sunny - 88/63",
            "Tomorrow - Sunny - 88/63",
            "Weds - Sunny - 88/63",
            "Thurs - Sunny - 88/63",
            "Fri - Sunny - 88/63",
            "Sat - Sunny - 88/63",
            "Sun - Sunny - 88/63"
    };

    List<String> weekForecast = new ArrayList<String>(
            Arrays.asList(forecastArray)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
