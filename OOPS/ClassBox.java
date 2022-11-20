//Question1-ClassAndObjects
package ClassAndObjects;


class ClassBox {
    
    private double width;
    private double height;
    private double depth;
    
    ClassBox(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double Volume(){
        return width*height*depth;
}
    public static void main(String[] args){
        
        ClassBox B1 = new ClassBox(11.1, 23.4, 14.0);
        System.out.println("The volume of the box is: "+B1.Volume());
    }
}
