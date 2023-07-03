package test04;

public class BookArrayTest {
 public static void main(String[] args) {
  Book[] library = new Book[5];
  for (int i = 0; i < library.length; i++) {
   System.out.println(library[i]);
  }
  library[0] = new Book("HTML1", "김가나1");
  library[1] = new Book("HTML2", "김가나2");
  library[2] = new Book("HTML3", "김가나3");
  library[3] = new Book("HTML4", "김가나4");
  library[4] = new Book("HTML5", "김가나5");

  for (int i = 0; i < library.length; i++) {
   System.out.println(library[i]);
   library[i].showBookInfo();
  }
  // 객체배열 복사하기(얕은복사, 깊은복사)
  // System.arrayCopy(src, srcPos, dest, destPos, length)
  Book[] copyLibrary = new Book[5];
  System.arraycopy(library,0,copyLibrary,0,5);
  System.out.println("==copy library====");
  for(Book book:copyLibrary){
   book.showBookInfo();
  }
   library[0].setTitle("CSS");
   library[0].setAuthor("이세종");

 }
}
