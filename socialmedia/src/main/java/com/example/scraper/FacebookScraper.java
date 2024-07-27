package com.example.scraper;

import java.util.ArrayList;
import java.util.List;

import com.example.model.SocialMediaPage;

public class FacebookScraper implements SocialMediaScraperBase {
    @Override
    public List<SocialMediaPage> scrape(String domain) {
        List<SocialMediaPage> pages = new ArrayList<>();
        // Add scraping logic here
        pages.add(new SocialMediaPage("Facebook", "https://www.facebook.com/" + domain));
        return pages;
    }
}
