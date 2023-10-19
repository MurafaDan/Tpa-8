package Person;

public class Person {
    private String name;
    private String adress;

    public Person(){

    }

    public Person(String name, String adress) {
        setName(name);
        setAdress(adress);
    }

        public String getName() {
        return name;
    }

        public String getAdress () {
        return adress;
    }

        public void setAdress (String adress){
        this.adress = adress;

    }

        public  String toString() {
        return ("[Nume:" + name + " Adresa:" + adress+"]");
    }

        public String setName(String name){
        return this.name=name;
        }
    }
