package student.com;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {

    public static void main(String[] args) {
        try {
            String url = "https://www.hindustantimes.com/";

            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
                    .header("Accept-Language", "en-US,en;q=0.9")
                    .timeout(15000)
                    .get();

            Elements headlines = doc.select("h2 a");

            System.out.println("📰 Hindustan Times Headlines:\n");

            int count = 1;
            for (Element headline : headlines) {
                String text = headline.text().trim();
                if (!text.isEmpty()) {
                    System.out.println(count++ + ". " + text);
                }
            }

        } catch (Exception e) {
            System.out.println("Error fetching headlines: " + e.getMessage());
        }
    }
}
