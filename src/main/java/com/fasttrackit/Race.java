package com.fasttrackit;

public class Race {
    //private Vehicle firstCompetitor;
    //private Vehicle secondCompetitor;

    private Vehicle[] competitors = new Vehicle[10];

    public void race() {
        RadioControlerCar competitor1 = new RadioControlerCar();
        competitor1.setName("Ferrari");
        insertCompetitor(0, competitor1);

        RadioControlerCar competitor2 = new RadioControlerCar();
        competitor2.setName("McLaren");
        insertCompetitor(1, competitor2);
        System.out.println(competitors[1].getName());

        for (int i = 0; i < competitors.length; i++) {
            //System.out.println(competitors[i].getName());
            System.out.println("Vehicle " + i + ": " + competitors[i].getName());
        }
    }

    public void insertCompetitor(int index, Vehicle vehicle) {
        competitors[index] = vehicle;
    }

    public static void main(String[] args) {
        Race race=new Race();
        race.race();
    }
}
