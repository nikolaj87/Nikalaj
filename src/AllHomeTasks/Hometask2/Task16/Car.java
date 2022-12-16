package AllHomeTasks.Hometask2.Task16;

//        Найти ошибку в коде.
//        Исправить и запустить программу.
//        Менять можно только класс Car.
//
//class Car {
//
//    String model;
//
//    Car(String newModel) {
//        this.model = newModel;
//    }
//
//    String getModel {
//        return this.model
//    }
//
//}

//
//}

class Car {
    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {      //пропущены скобки. Это метод и они должны быть
        return this.model;   // -;
    }

}