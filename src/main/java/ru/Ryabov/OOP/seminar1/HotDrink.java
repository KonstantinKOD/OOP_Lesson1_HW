package ru.Ryabov.OOP.seminar1;

public class HotDrink extends Product{
    private Double temp;
    private Double volume;

    public HotDrink(Double price, String name, Double volume, Double temp) {
        super(price, name);
        this.volume = volume;
        this.temp = temp;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name" + super.getName() + '\'' +
                "price" + super.getPrice() + '\'' +
                "temp" + this.temp +
                '}';
    }
}
