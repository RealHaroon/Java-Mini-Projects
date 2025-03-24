

// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books

class Library {
     String [] avbooks;
     int no_of_books;
     Library(){
         this.avbooks=new String[10];
         this.no_of_books=0;


     }
 void addbook(String book ){
         this.avbooks[no_of_books]=book;
     no_of_books++;
     System.out.println(book +", has been added.");

 }void issueBook(String isbook){
         for (int i=0; i<this.avbooks.length; i++){
             if (this.avbooks[i].equals(isbook)){
                 System.out.println(isbook +"  has been issued!");
                 this.avbooks[i]=null;
                 return;
             }
         }
         System.out.println(" This book does not exist!");

     }
     void returnBook(String rbook){
         addbook(rbook);


     }
     void showAvailableBooks(){
         System.out.println(" Available books are:");
         for (String book : this.avbooks) {
             if (book == null){
                 continue;
             }
             System.out.println("* "+ book);
         }
     }

}
class caller_library{
    public static void main(String[] args) {
        Library lbr = new Library();
        lbr.addbook("Atomic habits");
        lbr.addbook("Java");
        lbr.addbook("Human Psychology");
        lbr.addbook("Python");

        lbr.issueBook("Java");
        lbr.showAvailableBooks();
        lbr.returnBook("java");
        lbr.showAvailableBooks();
    }
}
