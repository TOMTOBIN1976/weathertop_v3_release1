package controllers;

import java.util.List;

import models.Station;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller {
    public static void index() {
        Logger.info("Rendering Dashboard");

        List<Station> station = Station.findAll();
        render("dashboard.html", station);
    }

    public static void addStation(String title) {
        Station station = new Station(title);
        Logger.info("Adding a new station called " + title);
        station.save();
        redirect("/dashboard");
    }
}




