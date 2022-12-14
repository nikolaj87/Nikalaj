package Hometask.Task14;

class Book {

    //Найти ошибку в коде.
    //Исправить и запустить программу.
    //Менять можно только класс Book.


    String title;  //пропущена точка с запятой

    Book(String bookTitle) {
        this.title = bookTitle;   // конструктор должен присваивать характеристике title обьекта myBook
                                  // входящую переменную bookTitle а не newTitle
    }

    String getTitle() {
        return this.title;
    }

}