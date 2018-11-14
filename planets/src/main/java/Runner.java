public class Runner {

    public static void main(String[] args){
        Planet mars = new Planet("Mars", 908973);
        String result = mars.getName() + " is " + mars.getSize();
        System.out.println(result);
        mars.explode();
    }



}
