package com.example.alessandro.f1pilots;

import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by alessandro on 14/04/16.
 */
public class Data {
    private String[] teams = new String[] {
            "Red Bull Racing",
            "McLaren",
            "Ferrari",
            "Williams",
            "Toro Rosso",
            "Mercedes",
            "Renault",
            "Force India",
            "Sauber",
            "Haas F1 Team",
            "Manor Racing"
    };

    private String[] pilots = new String[] {
            "Daniel Ricciardo, Daniil Kvyat",
            "Fernando Alonso, Jenson Button",
            "Sebastian Vettel, Kimi Raikkönen",
            "Felipe Massa, Valtteri Bottas",
            "Max Verstappen, Carlos Sainz",
            "Lewis Hamilton, Nico Rosberg",
            "Kevin Magnussen, Jolyon Palmer",
            "Sergio Perez, Nico Hulkenberg",
            "Marcus Ericsson, Felipe Nasr",
            "Romain Grosjean, Esteban Gutierrez",
            "Pascal Wehrlein, Rio Haryanto"
    };

    private HashMap<String, String> hm;

    public Data() {
        int i = 0;
        hm = new HashMap<String, String>();
        while (i < teams.length) {
            hm.put(teams[i], pilots[i]);
            i++;
        }
    }

    public String[] getTeams() {
        return teams;
    }

    public String getMapped(String key) {
        return hm.get(key);
    }
}

