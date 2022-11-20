
package Encapsulation;


class Author {
    
    private String name, email;
    private char gender;
    
    Author(String name, String email, char gender){
        
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String Name(){
        return name;
    }
    public String Email(){
        return email;
    }
    public char Gender(){
        return gender;
    }
    
    public String toString(){
        return "Author [Name: "+name+", Email: "+email+", Gender: "+gender+ "]";
    }
    
}
class Book{
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    Book(String name, Author author, double price, int qty){
        
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String Name(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public int getqty(){
        return qty;
    }
    public void setqty(){
        this.qty = qty;
    }
    
    public String toString(){
        return "Book Name: "+name+", Author: "+author+", Price: "+price+", Quantity: "+qty;
    }
}

public class BookDetails{
    public static void main(String[] args){
        
        Author A1 = new Author("Rhonda Byrne", "rb123@gmail,com", 'M');
        Book B1 = new Book("The Secret", A1, 599, 600);
        
        System.out.println(B1);
    }
}
