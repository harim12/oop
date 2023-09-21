public class Robot {
    private String type;
    private int energy;
    public Robot(String type,int energy){
        this.type = type;
        this.energy = energy;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }

    public String getType(){
        return this.type;
    }
    public int getEnergy(){
        return this.energy;
    }



}

