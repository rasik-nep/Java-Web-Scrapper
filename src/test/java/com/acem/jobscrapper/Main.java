package com.acem.jobscrapper;

import com.acem.jobscrapper.dto.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.json.simple.JSONObject;

// for regex
import java.util.regex.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{

        ArrayList<Job> jobs = new ArrayList<>();
        Document doc = Jsoup.connect("https://merojob.com/search/?q=java").get();
        Elements contents = doc.getElementsByClass("text-primary font-weight-bold media-heading h4");
        for(Element content : contents){
            Job job = new Job();
//            job.setName(content.text());
//            System.out.println(content.text());
//            jobs.add(job);
            Pattern pattern = Pattern.compile("Java.*");
            Matcher matcher = pattern.matcher(content.text());
            boolean matches = matcher.matches();

            if (matches){
                job.setName(content.text());
                jobs.add(job);
            }
        }

    System.out.println(jobs);
    }
}
