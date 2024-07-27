package com.example.scraper;

import java.util.List;

import com.example.model.SocialMediaPage;

public interface SocialMediaScraperBase {
    List<SocialMediaPage> scrape(String domain);
}
