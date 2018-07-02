import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class GsonMain {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Bean bean = new Bean();
        bean.setName("test");
        ListBean listBean = new ListBean();
        listBean.setAddress("测试地址");
        listBean.setArea("测试地区");
        List<ListBean> listBeans = new ArrayList<ListBean>();
        listBeans.add(listBean);
        bean.setListBeans(listBeans);
        System.out.println(gson.toJson(bean));
        String json = "{\"name\":\"test\",\"listBeans\":[{\"addr\":\"测试地址\",\"aa\":\"测试地区\"}]}";
        Bean bean1 = gson.fromJson(json, Bean.class);
        System.out.println(bean1);

    }
}
