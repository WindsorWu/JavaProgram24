public class Main {
    public static void main(String[] args) {
        AdvertisementBoard board=new AdvertisementBoard();
        board.show();
        board.setAdvertisement(new BlackLandCorp());
        board.show();
        board.setAdvertisement(new WhiteCloudCorp());
        board.show();
    }
}