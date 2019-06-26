package main;

import java.util.Scanner;

public class bookclass {

    //create instance variables

    private  String Author;
    private  String BookTitle ;
    private  String description;
    private boolean IsInStock ;
    private  double price;

    public bookclass (){

    }
    //constructor for user input
    private bookclass(String Author, String BookTitle, String description, int price, boolean IsInStock){
        {   this.Author = Author;
            this.BookTitle = BookTitle;
            this.price = price;
            this.description = description;
            this.IsInStock = IsInStock;
        }

    //    set & return for the user input
        public void setAuthor(String Author)
        {
            this.Author = Author;
        }
        public String getAuthor()
        {
            return this.Author;
        }

        public void setBookTitle(String BookTitle)
        {
            this.BookTitle = BookTitle;
        }
        public String getBookTitle()
        {
            return BookTitle;

        }

        public void setDescription(String description)
        {
            this.description = description;
        }
        public String getDescription()
        {
            return description;
        }

        public void setPrice(double price)

        {
            this.price = price;
        }

        public double getPrice()
        {
            return price;
        }

        public void setInStock(boolean inStock)
        {
            IsInStock = IsInStock;
        }
        public boolean isInStock()
        {
            return IsInStock;
        }

        public void getDisplayText()
        {
            System.out.println(Author +" "+BookTitle+" "+ description);
        }
        public String getTotalPrice( double noBooks)
        {
            if (IsInStock == true) {
                return (noBooks * price)+"";

            }
            return "Item is not in stock";
        }

    }

  }




