public class House implements Housing {
    private int size;
    private int rooms;
    private int price;
    private String name;

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", rooms=" + rooms +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}