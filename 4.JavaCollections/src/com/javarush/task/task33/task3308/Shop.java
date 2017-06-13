package com.javarush.task.task33.task3308;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ариорх on 23.04.2017.
 */
@XmlRootElement
@XmlType(name = "shop")
public class Shop {

    public Goods goods;
    public int count;
    public double profit;
    public List<String> secretData = new ArrayList<>();
    public Shop() {
    }
    @XmlType(name = "goods")
    @XmlRootElement
   public static class Goods {

        public List<String> names = new ArrayList<>();
    }


//    @Override
//    public String toString() {
//        return "Shop {\n\t goods = " + n + ",\n\t count = " + count + ",\n\t profit = " + profit + ",\n\t secretData = " + secretData + "\n}";
//    }
}