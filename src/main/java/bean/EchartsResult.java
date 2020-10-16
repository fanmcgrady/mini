package bean;

import java.util.List;

public class EchartsResult {
    private List<String> xData;
    private List<Integer> yData;

    public List<String> getxData() {
        return xData;
    }

    public void setxData(List<String> xData) {
        this.xData = xData;
    }

    public List<Integer> getyData() {
        return yData;
    }

    public void setyData(List<Integer> yData) {
        this.yData = yData;
    }
}
