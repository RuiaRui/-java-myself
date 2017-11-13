public class ICarnegieInfo {
    private static ICarnegieInfo instance = null;
    private String name = "iCarnegie, Inc";
    private String address = "4615 Forbes Avenue Pittsburgh, PA 15213-3796";
    private String telephone = "1.412.622.2150";
    private String email = "info@icarnegie.com";
    private String url = "http://www.icarnegie.com";

    private ICarnegieInfo() {
    }

    public static ICarnegieInfo getInstance() {
        if (instance == null) {
            instance = new ICarnegieInfo();
        }

        return instance;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUrl() {
        return this.url;
    }
}
