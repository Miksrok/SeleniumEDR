package ua.gov.nais.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fop {

    private String name;
    private String surname;
    private String number;
    private String date;
    private String organization;
    private String birthday;
    private String code;

    public Fop(){
        this.name = "Термінатор";
        this.surname = "Кіборгенко";
        this.number = "ФФ123123";
        this.date = "11.11.2011";
        this.organization = "Скайнет";
        this.birthday = "11.11.2011";
    }
    {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss");
        this.code = format.format(date);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getOrganization() {
        return organization;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCode() {
        return code;
    }


}
