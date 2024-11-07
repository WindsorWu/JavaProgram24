public class BlackLandCorp implements Advertisement{
    @Override
    public void showAdvertisement(){
        System.out.println("****************");
        System.out.println("黑土集团广告词");
        System.out.println("****************");
    }

    @Override
    public String getCorpName() {
        return "黑土集团";
    }
}
