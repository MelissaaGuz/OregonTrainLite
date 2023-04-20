package org.example;

public class Traveler {

    private String name;

    private int health;

    private boolean isHealthy;

    private int food;

    public Traveler(String name, int health, int food) {
        this.name = name;
        this.health = health;
        this.food = food;
        this.isHealthy = true;
    }

    public String hunt(){
            //user needs to hunt

            //they have 50 percent chance of success
                if(Math.random() > .5){

            //if they are successful, 100 on the food
            this.food = this.food + 100;

            //if not, 0 to their food
            return "The hunt was successful for" + this.name + "and their food is now at: " + this.food;

        }

            return "The hunt was a huge failure for " + this.name + "and they let their family down. (embarrassing) The food is still at " + this.food;
    }
        public String eat() {
            //Consumes 20 of the traveler's food. If the traveler doesn't have 20 food, the traveler is no longer healthy.
            if (this.getFood() >= 20) {

                this.setFood(this.getFood() - 20);
                return "Man that was delicious";
            } else {
                this.setHealthy(false);
                this.setHealth(0);
                return "Im so hungry I could die";


            }
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}

