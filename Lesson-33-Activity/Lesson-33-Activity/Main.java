class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

  class CartItem{
    constructor(name, price, onSAle){
      this.name = name;
      this.price = price;
      this.type = type;
      this.onSale = onSale;
    }

    getItemPrice() {
      if (this.onSale) {
        return this.price * 0.99;
      }
    }
  }
  
  let cart = [
    new CartItem("Bananas", 3.49, "food", true),
    new CartItem("Headphones", 49.99, "eletronics", false),
    new CartItem("Notebook", 2.25, "school", true)
  ];
    for let(i = 0; i < cart.length; i ++){
      let item = cart[i];
      if (item.onSale){

      }
    }
    let subtotal = 0;
    for(let i = 0, i < cart.length; i++){
      
    }

  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}