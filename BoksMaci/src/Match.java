public class Match {

    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match (Fighter f1, Fighter f2, int maxWeight, int minWeight) {

        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    public void run() {
        if (isCheck()){

            int chance= Math.round((float)Math.random());
            System.out.println("Chance :" + chance);

            while (this.f1.health>0 && this.f2.health>0) {
                System.out.println("--------");

                if (chance==0){
                    this.f2.health=f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    this.f1.health=f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                }

                if (chance==1){
                    this.f1.health=f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health = f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                }

                System.out.println(f1.name + " : " + f1.health + " / " + f2.name + " : " + f2.health);
            }

        }else {
            System.out.println("Müsabaka Gerçekleştirilemez.");
        }
    }

    boolean isCheck() {
        return  (this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight)&&(this.f2.weight>=this.minWeight&&this.f2.weight<=this.maxWeight);
    }

    boolean isWin() {

        if (this.f1.health==0) {
            System.out.println(f2.name + "KAZANDI!");
            return true;
        }
        if (this.f2.health==0) {
            System.out.println(f1.name + " KAZANDI! ");
            return true;
        }
        return false;
    }
}
