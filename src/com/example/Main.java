package com.example;
import com.example.common.Month;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one of the months. See below for your choices.");
        List<String> monthsArray = new ArrayList<String>();

        for (Month m : Month.values()) {
            System.out.println(m.getEnglishName());
        }

        String answer = scanner.nextLine();

        switch (answer) {
            case "January":
                monthsArray.add("January");
            case "February":
                monthsArray.add("February");
            case "March":
                monthsArray.add("March");
            case "April":
                monthsArray.add("April");
            case "May":
                monthsArray.add("May");
            case "June":
                monthsArray.add("June");
            case "July":
                monthsArray.add("July");
            case "August":
                monthsArray.add("August");
            case "September":
                monthsArray.add("September");
            case "October":
                monthsArray.add("October");
            case "November":
                monthsArray.add("November");
            case "December":
                monthsArray.add("December");
                break;
            default:
                System.out.println("You need to enter the correct input.");
                break;
        }

        if (monthsArray.isEmpty()) {
            System.out.println("Invalid month entry");
        } else {
            for (String m : monthsArray) {
                System.out.println(m);
            }
        }

        ////////////////// Here, i present to you, Month.May as json. BEN I BETTER EXCEED YOUR EXPECTATIONS /////////////////////

        File f = new File("may.json");
        FileWriter fw = null;

        try {
            fw = new FileWriter(f);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectMapper mapper = new ObjectMapper();
        Month may = Month.MAY;

        String jsonInString;

        try {
            jsonInString = mapper.writeValueAsString(may);
            fw.write(jsonInString);
            fw.close();
            System.out.println(jsonInString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException eio) {
            eio.printStackTrace();
        }



    }
}
