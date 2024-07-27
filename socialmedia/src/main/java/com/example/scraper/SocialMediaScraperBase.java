package com.example.scraper;

import com.example.model.SocialMediaPage;
import java.util.List;

public interface SocialMediaScraperBase {
    List<SocialMediaPage> scrape(String domain);
}
