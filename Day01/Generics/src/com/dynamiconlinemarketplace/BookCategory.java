package com.dynamiconlinemarketplace;

 class BookCategory {
     private String author;

     public BookCategory(String author) {
         this.author = author;
     }
     public String getAuthor() {

         return author;
     }
     public void setAuthor(String author) {
         this.author = author;
     }
     public void display() {
         System.out.println("Author is "+author);
     }
}
