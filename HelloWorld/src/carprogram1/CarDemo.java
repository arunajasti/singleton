package carprogram1;

class Engine
{
   private String type;
   Engine (String type)
   {
      this.type = type;
   }
   public String getType () { return type; }
}
class Car
{
   private String make;
   private String model;
   private String manufacturer;
   Car (String make, String model, String manufacturer)
   {
      this.make = make;
      this.model = model;
      this.manufacturer = manufacturer;
   }
   public String getMake () { return make; }
   public String getModel () { return model; }
   public String getManufacturer () { return manufacturer; }
}
class CarDemo
{
   public static void main (String [] args)
   {
      Engine e1 = new Engine ("3.8L V6");
      Car c1 = new Car ("Mustang", "Convertible", "Ford");
      Engine e2 = new Engine ("4.6L V8");
      Car c2 = new Car ("Mustang", "GT Coupe", "Ford");
      System.out.println (c1.getManufacturer () + " " +
                          c1.getMake () + " " +
                          c1.getModel () + " " + e1.getType ());
      System.out.println (c2.getManufacturer () + " " +
                          c2.getMake () + " " +
                          c2.getModel () + " " + e2.getType ());
   }
}