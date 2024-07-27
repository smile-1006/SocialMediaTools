package com.example.scraper;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.model.SocialMediaPage;

public class SocialMediaScraperTest {

    @Test
    public void testLinkedInScraper() {
        LinkedInScraper scraper = new LinkedInScraper();
        List<SocialMediaPage> pages = scraper.scrape("example");
        assertFalse(pages.isEmpty());
        assertTrue(pages.get(0).getUrl().contains("linkedin"));
    }

    @Test
    public void testFacebookScraper() {
        FacebookScraper scraper = new FacebookScraper();
        List<SocialMediaPage> pages = scraper.scrape("example");
        assertFalse(pages.isEmpty());
        assertTrue(pages.get(0).getUrl().contains("facebook"));
    }

    @Test
    public void testInstagramScraper() {
        InstagramScraper scraper = new InstagramScraper();
        List<SocialMediaPage> pages = scraper.scrape("example");
        assertFalse(pages.isEmpty());
        assertTrue(pages.get(0).getUrl().contains("instagram"));
    }

    @Test
    public void testSocialMediaScraper() {
        SocialMediaScraper scraper = new SocialMediaScraper();
        List<SocialMediaPage> pages = scraper.scrape("example");
        assertFalse(pages.isEmpty());
        assertTrue(pages.stream().anyMatch(page -> page.getUrl().contains("linkedin")));
        assertTrue(pages.stream().anyMatch(page -> page.getUrl().contains("facebook")));
        assertTrue(pages.stream().anyMatch(page -> page.getUrl().contains("instagram")));
    }
}
