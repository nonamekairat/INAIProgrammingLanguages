package com.java.se.ProgrammingLanguage.task9;

public class Car implements Comparable<Car>{
    private String brandName;
    private String modelCar;
    private int yearRelease;

    public Car(String brandName, String modelCar, int yearRelease) {
        this.brandName = brandName;
        this.modelCar = modelCar;
        this.yearRelease = yearRelease;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
    public int compareTo(Car p){

        return brandName.compareTo(p.getBrandName());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", yearRelease=" + yearRelease +
                '}';
    }
}
