public class Car{
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return "Car{make='" + make + "', model='" + model + "', year=" + year + "}";
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2021);
        System.out.println(car); // 자동으로 toString() 호출
    }
}
