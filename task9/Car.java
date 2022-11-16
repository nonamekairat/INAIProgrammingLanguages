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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getYearRelease() != car.getYearRelease()) return false;
        if (getBrandName() != null ? !getBrandName().equals(car.getBrandName()) : car.getBrandName() != null)
            return false;
        return getModelCar() != null ? getModelCar().equals(car.getModelCar()) : car.getModelCar() == null;
    }

    @Override
    public int hashCode() {
        int result = getBrandName() != null ? getBrandName().hashCode() : 0;
        result = 31 * result + (getModelCar() != null ? getModelCar().hashCode() : 0);
        result = 31 * result + getYearRelease();
        return result;
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
