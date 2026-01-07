class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Dog dog1 = new Dog();
    dog1.name = "Toto";
    dog1.age = 3;
    dog1.breed = "Terrier";

    Dog dog2 = new Dog();
    dog2.name = "Fifi";
    dog2.age = 1;
    dog2.breed = "Chug";

    Dog dog3 = new Dog();
    dog3.name = "Brooklyn";
    dog3.age = 16;
    dog3.breed = "Maltese";

    
   
    
  }




  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}