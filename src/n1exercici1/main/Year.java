package n1exercici1.main;

import java.util.ArrayList;

public class Year {
    private  ArrayList<String> months = new ArrayList();

    public Year() {
        this.months = months;
        months.add("enero");
        months.add("febrero");
        months.add("marzo");
        months.add("abril");
        months.add("mayo");
        months.add("junio");
        months.add("julio");
        months.add("agosto");
        months.add("septiembre");
        months.add("octubre");
        months.add("noviembre");
        months.add("diciembre");
    }

    public  ArrayList<String> getMonths() {
        return months;
    }

    public void setMonths(ArrayList<String> months) {
        this.months = months;
    }
}
