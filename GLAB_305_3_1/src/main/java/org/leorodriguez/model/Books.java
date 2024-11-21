package org.leorodriguez.model;

public class Books {
private  int id;
private  int isbn;
private String bookName;
//Constructors
public Books(){
    }
public Books (int isbn, String bookName){
    this.isbn = isbn;
    this.bookName = bookName;
}
public Books (int id, int isbn, String bookName){
    this.id = id;
    this.isbn = isbn;
    this.bookName = bookName;
}//Getters and setters
public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
public void setIsbn(int isbn){
    this.isbn = isbn;
}
public int getIsbn(){
    return isbn;
}
public void setBookName(String bookName){
    this.bookName = bookName;
}
public String getBookName(){
    return bookName;
}

}