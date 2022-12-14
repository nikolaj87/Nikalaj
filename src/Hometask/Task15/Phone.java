package Hometask.Task15;

//       Найти ошибку в коде.
//       Исправить и запустить программу.
//       Менять можно только класс Phone.
//
//class Phone {
//    String model;{
//        Book(String newModel) {
//           this.model = newModel;
//        }

//        String getModel() {
//            return this.model;
//        }

//    }

class Phone {


    String model;      //лишняя скобка

        Phone(String newModel) {     //шаблон обьекта должен иметь имя Phone
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }

    }