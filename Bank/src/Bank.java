public class Bank implements Runnable{
    int money=200;
    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("会计")){
            //存钱
            saveOrtake(500,false);
        }
        else if(Thread.currentThread().getName().equals("出纳")){
            //取钱
            saveOrtake(200,true);
        }
    }

    private synchronized void saveOrtake(int amount, boolean flag){ //synchronized不共享数据
        if(flag){
            for(int i=1;i<=4;i++){
                money-=amount/4;
                System.out.println("取了一笔，还剩"+money);
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        else {
            for (int i=1;i<=2;i++){
                money+=amount/2;
                System.out.println("存了一笔，还剩"+money);
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

