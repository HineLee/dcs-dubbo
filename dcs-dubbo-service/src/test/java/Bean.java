import java.util.List;

public class Bean {
    private String name;
    private List<ListBean> listBeans;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ListBean> getListBeans() {
        return listBeans;
    }

    public void setListBeans(List<ListBean> listBeans) {
        this.listBeans = listBeans;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", listBeans=" + listBeans +
                '}';
    }
}
