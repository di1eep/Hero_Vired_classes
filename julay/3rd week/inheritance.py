class Car : 
    color = "" ,
    varient = "",
    brand = "ABC",
    model = ""
    def __init__(self, model) :
        # self.brand = brand;
        self.model = model;
    
    def applyBrake(self) : 
           return "Brake Applied !";
    
    def acclerate(self) :
         return "Speed increase !";

#Inheritance Syntax (BaseClass)
class Bmw(Car) :
     engine = "";
     noOfSeat = "";
     def __init__(self,brand, model, engine,noOfSeat):
          super().__init__( model)
          self.engine = engine;
          self.noOfSeat = noOfSeat;
          self.brand = brand
     def display(self) : 
        print("The car " + self.engine + " has " + self.noOfSeat+ " seats");

bmw1 = Bmw("BMW","M1","v8","5");
def brake(self) :
          print(self.applyBrake());