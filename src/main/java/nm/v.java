package nm;

public class v {
    String nam;


    public v(String nam) {
        this.nam = nam;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "v{" +
                "nam='" + nam + '\'' +
                '}';
    }
}
