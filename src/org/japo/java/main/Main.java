package org.japo.java.main;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Main {

    public static final GregorianCalendar CAL
            = new GregorianCalendar();

    public static void main(String[] args) {
        int ds;
        int ms;
        int as;
        ds = CAL.get(Calendar.HOUR);
        ms = CAL.get(Calendar.MINUTE);
        as = CAL.get(Calendar.SECOND);
        System.out.printf("Fecha del Sistema  %02dh:%dm:%ds%n", ds, ms, as);
    }

}
