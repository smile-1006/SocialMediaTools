package com.example.util;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HttpUtil {
    public static Document getDocument(String url) throws IOException {
        return Jsoup.connect(url).get();
    }
}
