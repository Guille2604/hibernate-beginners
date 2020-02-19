package com.research24x7.hibernate.beginners.util;

import com.research24x7.hibernate.beginners.entity.Persona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader {


    public static ArrayList<Persona> read (String csvFile)
    {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        ArrayList<Persona> personas = new Persona();

        Persona p;


        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] param = line.split(cvsSplitBy);

                p.setNombre(param[0]);
                p.setApellido(param[1]);
                p.setDni(param[2]);
                p.setEmail(param[3]);
                p.setTelefono(p.setEmail(param[4]);
                personas.add(p);
                );
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
