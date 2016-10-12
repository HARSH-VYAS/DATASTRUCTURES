package com.codejam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Harsh P Vyas on 10/4/2016.
 */
public class CatchTrades {

    public String [] findTrade(String []feed){

        String temp [] = new String[feed.length];
        HashMap<Integer,ArrayList<Pojo>> tradesList = new HashMap<Integer,ArrayList<Pojo>>();
        ArrayList<Pojo> pojoList = new ArrayList<Pojo>();
        ArrayList<Pojo> pojoList1 = new ArrayList<Pojo>();
        String []out = new String[temp.length];
        int price =0;
        Pojo p=null;

        for(int i=0;i<feed.length;i++){
            temp = feed[i].split("\\|");
            System.out.println(temp.length);
            if(temp.length==2){
                price = Integer.parseInt(temp[1]);
                p = new Pojo(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
                pojoList.add(p);
                tradesList.put(Integer.parseInt(temp[0]),pojoList);
                pojoList.clear();
            }
            else{
                    System.out.println("This:"+temp[1]+" "+temp[2]+""+temp[3]);
                    if (temp[2].equals("SELL")) {
                        p = new Pojo(Integer.parseInt(temp[0]), temp[1], 0, Integer.parseInt(temp[3]), price);
                    } else {
                        p = new Pojo(Integer.parseInt(temp[0]), temp[1], 1, Integer.parseInt(temp[3]), price);
                    }
                    if(tradesList.get(i)==null)
                        pojoList.add(p);
                    else
                        pojoList = tradesList.get(i);
                    pojoList.add(p);
                    tradesList.put(Integer.parseInt(temp[0]), pojoList);
                }
        }
       Iterator<Map.Entry<Integer,ArrayList<Pojo>>> it = tradesList.entrySet().iterator();
       while(it.hasNext()){
           pojoList = it.next().getValue();
           int i=0,j=0;
           while(i < pojoList.size()){
                        System.out.println("Reached");
                        System.out.println(pojoList.get(i).day+" "+pojoList.get(i).getPrice()+" "+pojoList.get(i).getType()+" "+pojoList.get(i).getName());
                        i++;
                        j++;
                    }
       }
        return out;
    }

    public class Pojo{
        int day,type,stocks;
        String name;
        int price;
        public Pojo(int day,String name, int type,int stocks,int price) {
            this.day = day;
            this.type = type;
            this.stocks = stocks;
            this.name = name;
            this.price =price;
        }

        public Pojo(int day, int price) {
            this.day = day;
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getStocks() {
            return stocks;
        }

        public void setStocks(int stocks) {
            this.stocks = stocks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String args[]){
        String [] s ={
                "0|20",
                "0|Tom|SELL|5000",
                "0|Hardy|BUY|5700",
                "0|Billy|SELL|25000",
                "0|James|BUY|150000",
                "3|25",
                "3|Kelly|SELL|6000",
                "3|Tom|SELL|9000",
                "4|Sam|BUY|1000",
        };

        CatchTrades c = new CatchTrades();
        c.findTrade(s);
    }



}
