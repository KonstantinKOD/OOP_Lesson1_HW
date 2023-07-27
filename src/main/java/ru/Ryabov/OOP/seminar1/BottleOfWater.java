package ru.Ryabov.OOP.seminar1;

public class BottleOfWater extends Product {
    private Double volume;

    public BottleOfWater(Double price, String name, Double volume) {
        super(price, name);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name = '" + super.getName() + '\'' +
                "price = '" + super.getPrice() + '\'' +
                "volume=" + this.volume +
                '}';
    }
}
