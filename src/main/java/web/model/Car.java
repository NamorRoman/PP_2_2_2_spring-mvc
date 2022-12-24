package web.model;

public class Car {

    private String brandName;
    private String modelName;
    private int generation;

    public Car() {
    }

    public Car(String brandName, String modelName, int generation) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.generation = generation;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", generation=" + generation +
                '}';
    }




}
