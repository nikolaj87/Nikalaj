package AllHomeTasks.Hometask2.Task17;

//        Найти ошибку в коде.
//        Исправить и запустить программу.

    class BankAccount {

        String ownerFirstName;
        String ownerLastName;
        int moneyAmount;

        BankAccount(String ownerFirstName,
                    String ownerLastName,           //запятая
                    int moneyAmount) {
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;               //moneyAmount как в заголовке метода
        }

        String getOwnerFirstName() {                 //скобка
            return this.ownerFirstName;              //;
        }

        String getOwnerLastName() {                  //скобка
            return this.ownerFirstName;              //точка с запятой
        }

        Integer getMoneyAmount() {                   //void не дружит с return, указать возвращаемый тип
            return this.moneyAmount;
        }

    }




