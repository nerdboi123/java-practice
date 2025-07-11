public class Car {   // 모델과 연식 입력 및 조회 가능하게 코딩

    private String brand;

    private String model;

    private int year;

    public void move() {
        System.out.println("자동차가 움직입니다.");
    }


    public void stop() {
        System.out.println("자동차가 정지합니다.");
    }


    public void setBrand(String brand){
            this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // 모델 조회
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    // 연식 조회
    public void setYear(int year) {
        this.year = year;

    }

    public int getYear() {
        return year;

    }


    public static void main(String[] args){
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setModel("Prius");
        myCar.setYear(2017);

        System.out.println("브랜드:"+ myCar.getBrand());
        System.out.println("모델:"+ myCar.getModel());
        System.out.println("모델:"+ myCar.getYear());
        myCar.move();
        myCar.stop();
    }


}






