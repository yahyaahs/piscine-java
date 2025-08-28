public class HouseBuilder implements HousingBuilder {
    private Housing house;

    public HouseBuilder() {
        this.house = new House();
    }
    @Override
    public HousingBuilder setSize(int size) {
        house.setSize(size);
        return this;
    }
    @Override
    public HousingBuilder setRooms(int rooms) {
        house.setRooms(rooms);
        return this;
    }
    @Override
    public HousingBuilder setPrice(int price) {
        house.setPrice(price);
        return this;
    }
    @Override
    public HousingBuilder setName(String name) {
        house.setName(name);
        return this;
    }
    @Override
    public Housing build() {
        return this.house;
    }
       public static void main(String[] args) {
        Housing house = new HouseBuilder()
                .setName("Maison")
                .setRooms(4)
                .setSize(80)
                .setPrice(100000)
                .build();
        Housing apartment = new ApartmentBuilder()
                .setName("Appart")
                .setRooms(2)
                .setSize(30)
                .setPrice(25000)
                .build();

        System.out.println(house);
        System.out.println(apartment);
    }
}