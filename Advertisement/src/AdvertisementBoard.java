public class AdvertisementBoard {
    Advertisement AD;
    public void setAdvertisement(Advertisement AD){
        this.AD=AD;
    }
    public void show(){
        if(AD==null){
            System.out.println("空广告牌");
        }
        else{
            AD.showAdvertisement();
            System.out.println(AD.getCorpName());
        }
    }
}
