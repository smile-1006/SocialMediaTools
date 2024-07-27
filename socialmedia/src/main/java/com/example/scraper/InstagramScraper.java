package com.example.scraper;

import com.example.model.SocialMediaPage;
import java.util.ArrayList;
import java.util.List;

public class InstagramScraper implements SocialMediaScraperBase {
    @Override
    public List<SocialMediaPage> scrape(String domain) {
        List<SocialMediaPage> pages = new ArrayList<>();
        // Add scraping logic here
        pages.add(new SocialMediaPage("Instagram", "https://www.instagram.com/" + domain));
        return pages;
    }
}
