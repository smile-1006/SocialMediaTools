package com.example.scraper;

import java.util.ArrayList;
import java.util.List;

import com.example.model.SocialMediaPage;

public class SocialMediaScraper {
    List<SocialMediaScraperBase> scrapers;

    public SocialMediaScraper() {
        scrapers = new ArrayList<>();
        scrapers.add(new LinkedInScraper());
        scrapers.add(new FacebookScraper());
        scrapers.add(new InstagramScraper());
    }

    public List<SocialMediaPage> scrape(String domain) {
        List<SocialMediaPage> pages = new ArrayList<>();
        for (SocialMediaScraperBase scraper : scrapers) {
            pages.addAll(scraper.scrape(domain));
        }
        return pages;
    }
}
