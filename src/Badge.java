public class Badge {
    private String base_code;
    private String target_code;
    private double conversion_result;

    public Badge(BadgeApi badgeApi){
        this.base_code = badgeApi.base_code();
        this.target_code = badgeApi.target_code();
        this.conversion_result = badgeApi.conversion_result();
    }

    @Override
    public String toString() {
        return "" + conversion_result;
    }
}
