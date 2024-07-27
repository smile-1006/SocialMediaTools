package com.example;

import java.util.List;

import com.example.model.SocialMediaPage;
import com.example.scraper.SocialMediaScraper;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SocialMediaTool extends Application {
    @Override
    public void start(Stage primaryStage) {
        ListView<String> listView = new ListView<>();
        
        String domain = "example.com";  // Replace with the actual domain input
        SocialMediaScraper scraper = new SocialMediaScraper();
        List<SocialMediaPage> pages = scraper.scrape(domain);
        
        for (SocialMediaPage page : pages) {
            listView.getItems().add(page.toString());
        }

        VBox root = new VBox(listView);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Social Media Tool");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
