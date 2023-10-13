package com.pluralsight;

public class Books {
    //Jamie, declare those variables dude
    private int id = 0;
    private String isbn = " ";
    private String title = " ";
    private boolean isCheckedOut = false;
    private String CheckedOutTo = " ";

    //cont.
    public Books() {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.CheckedOutTo = CheckedOutTo;
        this.isCheckedOut = isCheckedOut;
    }
    public Books(int id, String CheckedOutTo, String title, String isbn, boolean isCheckedOut){
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = isCheckedOut;
            this.CheckedOutTo = CheckedOutTo;
        }  public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }
    public String getCheckedOutTo() {
        return CheckedOutTo;
    }
    // Jamie make those methods, man
    public void checkOut(String name) {
        if (!isCheckedOut) {
            this.isCheckedOut = true;
            this.CheckedOutTo = name;
            System.out.println("This book is checked out to " + name);
        }}
    public void checkIn() {
        if (isCheckedOut) {
            this.isCheckedOut = false;
            this.CheckedOutTo = " ";

        }}
    public String toString() {
        return "Book ID: " + "id=" + id + ", isbn='" + isbn + '\'' + ", title='" + title + '\'' + ", isCheckedOut=" + isCheckedOut + ", checkedOutTo='" + CheckedOutTo + '\'' + '}';
    }}

