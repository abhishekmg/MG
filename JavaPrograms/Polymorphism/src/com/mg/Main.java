package com.mg;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot";
    }

    public String getName() {
        return name;
    }
}

    class AttackOnTitan extends Movie {

        public AttackOnTitan() {
            super("Attack on titan");
        }

        @Override
        public String plot() {
            return "people fight with titans";
        }
    }

    class TokyoGohul extends Movie {

        public TokyoGohul() {
            super("Tokyo Gohul");

        }

        @Override
        public String plot() {
            return "its about life of gohuls";
        }
    }

    class forgettable extends Movie {
        public forgettable() {
            super("Forgettable");
        }

        //NO plot
    }



public class Main {


    public static void main(String[] args) {
            for(int i = 1 ; i<11 ; i++){
                Movie movie = RandomMovie();
                System.out.println("Movie #" + i + ":" + movie.getName() + "\n" + "Plot : " + movie.plot() + "\n");
            }

    }


    public static Movie RandomMovie() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new AttackOnTitan();

            case 2:
                return new TokyoGohul();

            case 3:
                return new forgettable();
        }
        return null;
    }
}




