package fr.efrei.dtcs.projet.model;

import java.io.Serializable;
import java.util.Date;

public class Metric implements Serializable {
    public Date datetime;
    public int value;
    public String type;
    public String unit;

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "datetime=" + datetime +
                ", value=" + value +
                ", unit=" + unit +
                ", type='" + type + '\'' +
                '}';
    }
}
