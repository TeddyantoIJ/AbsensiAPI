package ac.id.polman.astra.api.vo;

import java.util.List;

public class Model<T> {
    List<T> data;

    public Model(List<T> obj) {
        this.data = obj;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}