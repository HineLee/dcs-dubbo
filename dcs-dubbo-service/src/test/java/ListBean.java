import com.google.gson.annotations.SerializedName;

public class ListBean {
    @SerializedName(value = "address", alternate = {"addr"})
    private String address;
    @SerializedName(value = "area", alternate = {"aa"})
    private String area;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "ListBean{" +
                "address='" + address + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
