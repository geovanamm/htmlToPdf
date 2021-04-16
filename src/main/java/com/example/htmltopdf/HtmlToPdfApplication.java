package com.example.htmltopdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.html2pdf.HtmlConverter;

@SpringBootApplication
public class HtmlToPdfApplication {

    public static String SRC = "src/main/resources/teacher-test.html";
    public static String DEST = "src/main/resources/teacher-test.PDF";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        HtmlConverter.convertToPdf(new FileInputStream(SRC),
                new FileOutputStream(DEST));

        System.out.println("PDF Created!");
    }


}
