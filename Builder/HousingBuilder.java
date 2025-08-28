public interface HousingBuilder {

    HousingBuilder setSize(int size);
    HousingBuilder setRooms(int rooms);
    HousingBuilder setPrice(int price);
    HousingBuilder setName(String name);
    Housing build();
}