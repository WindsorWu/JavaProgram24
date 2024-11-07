public class WhiteCloudCorp implements Advertisement{
    @Override
    public void showAdvertisement(){
        System.out.println("@@@@@@@@@@@@@@@@");
        System.out.println("白云公司广告词");
        System.out.println("@@@@@@@@@@@@@@@@");
    }

    @Override
    public String getCorpName() {
        return "白云有限公司";
    }
}
