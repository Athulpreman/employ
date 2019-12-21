package com.example.employee;

public class Employ
{
    String eemp,edesig,esal,epla,ecomp,eemail,emob;

    public Employ() {
    }

    public Employ(String eemp, String edesig, String esal, String epla, String ecomp, String eemail, String emob)

    {
        this.eemp = eemp;
        this.edesig = edesig;
        this.esal = esal;
        this.epla = epla;
        this.ecomp = ecomp;
        this.eemail = eemail;
        this.emob = emob;
    }

    public String getEemp() {
        return eemp;
    }

    public void setEemp(String eemp) {
        this.eemp = eemp;
    }

    public String getEdesig() {
        return edesig;
    }

    public void setEdesig(String edesig) {
        this.edesig = edesig;
    }

    public String getEsal() {
        return esal;
    }

    public void setEsal(String esal) {
        this.esal = esal;
    }

    public String getEpla() {
        return epla;
    }

    public void setEpla(String epla) {
        this.epla = epla;
    }

    public String getEcomp() {
        return ecomp;
    }

    public void setEcomp(String ecomp) {
        this.ecomp = ecomp;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public String getEmob() {
        return emob;
    }

    public void setEmob(String emob) {
        this.emob = emob;
    }
}
