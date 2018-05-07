package com.forloop.app;

public class Student {

    private String name;
    private Double d1;
    private Double d2;
    private Double d3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getD1() {
        return d1;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public Double getD2() {
        return d2;
    }

    public void setD2(Double d2) {
        this.d2 = d2;
    }

    public Double getD3() {
        return d3;
    }

    public void setD3(Double d3) {
        this.d3 = d3;
    }

    public double getSum(){
        return this.d1 + this.d2 + this.d3;
    }

    public String getNatega(){
        if(getSum() > 60){
            return "ناجح";
        }else {
            return "راسب";
        }
    }

    public String getTakdeer(){
        double sum = getSum();
        if(sum >= 95 && sum <= 100){
            return "A+";
        }else if(sum >= 90 && sum < 95){
            return "A";
        }else if(sum >= 85 && sum < 90){
            return "B+";
        }else if(sum >= 80 && sum < 85){
            return "B";
        }else if(sum >= 75 && sum < 80){
            return "C+";
        }else if(sum >= 70 && sum < 75){
            return "C";
        }else if(sum >= 65 && sum < 70){
            return "D+";
        }else if(sum >= 60 && sum < 65){
            return "D";
        }else if(sum < 60){
            return "F";
        }else{
            return "فضلا تأكد من الحسابات";
        }
    }
}
