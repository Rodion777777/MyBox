public class Box implements IDefining {

    private Sweet[] arrayBox;

    Box() {
        this.arrayBox = new Sweet[0];
    }

    @Override
    public void removeTheSweetByIndex(int i) {
        if (this.arrayBox.length == 0) {
            System.out.print("");
        } else {
            if ((i < 1) || (i > this.arrayBox.length)) {
                System.out.println("Удалить сладость по данному индексу невозможно! " + "Введите индекс от 1 до " +
                        this.arrayBox.length + " включительно.");
            } else {
                Sweet[] newArr1 = new Sweet[this.arrayBox.length - 1];


                for (int iNew = 0; iNew < i - 1; iNew++) {
                    newArr1[iNew] = this.arrayBox[iNew];
                }
                for (int iNew2 = i - 1; iNew2 < this.arrayBox.length - 1; iNew2++) {
                    newArr1[iNew2] = this.arrayBox[iNew2 + 1];
                }

                this.arrayBox = newArr1;
            }

        }
    }


    private int infoFreePlaces(){
        int nullCounter = 0;
        for (Sweet s : arrayBox) {
            if (s == null){
                nullCounter++;
            }
        }
        return nullCounter;
    }

    private boolean checkFreePlace(){
        return this.infoFreePlaces() > 0;
    }

    private Sweet[] createNewArrayBox(){
        int currentLength = this.arrayBox.length;
        Sweet[] longerArray;
        if (currentLength == 0){
            longerArray = new Sweet[1];
        } else {
            longerArray = new Sweet[currentLength+1];
        }
        return longerArray;
    }

    private void moveToFreeArray(){
        Sweet[] newPlace = this.createNewArrayBox();
        for (int i = 0; i < this.arrayBox.length; i++) {
            newPlace[i] = this.arrayBox[i];
        }
        this.arrayBox = newPlace;
    }

    private void increaseFreeSpace(){
        if (this.arrayBox.length == 0) {
            this.arrayBox = this.createNewArrayBox();
        } else if (this.infoFreePlaces() == 0){
            this.moveToFreeArray();
        }
    }

    private void addToFirstFreeSpace(Sweet sweet){
        for (int i = 0; i < this.arrayBox.length; i++) {
            if (this.arrayBox[i] == null){
                this.arrayBox[i] = sweet;
                break;
            }
        }
    }



    @Override
    public void add(Sweet newSweet) {
        if (!this.checkFreePlace()){
            this.increaseFreeSpace();
        }
        this.addToFirstFreeSpace(newSweet);


    }



    private boolean isEmpty(){
        for (Sweet s :
                this.arrayBox) {
            if (s != null){
                return false;
            }
        }
        return true;
    }


    @Override
    public double getWeight() {
        if (this.isEmpty()){
            System.out.println("Коробка пуста!");
            return 0;
        }else {
            double weight = 0;
            for (Sweet s : this.arrayBox) {
                if(s != null) {
                    weight += s.getWeight();
                }
            }
            return weight;
        }
    }

    @Override
    public double getPrice() {
        if (this.isEmpty()){
            System.out.println("Коробка пуста!");
            return 0;
        }else {
            double price = 0;
            for (Sweet s : this.arrayBox) {
                if(s != null) {
                    price += s.getPrice();
                }
            }
            return price;
        }
    }

    @Override
    public String getAllInfoAboutBox() {
        if (this.isEmpty()){
            String s ="В коробке нет сладостей!";
            return s;
        }else {
            System.out.println("Полная информация о коробке:");
            String newString = "";
            for (int i = 0; i < this.arrayBox.length; i ++) {
                newString+=  this.arrayBox[i].toString() + "\n";

            }
            return  newString;
        }
    }




    @Override
    public void removeTheLastSweet() {

        if(this.arrayBox.length==0){
            System.out.print("Вы не можете убрать сладости из коробки, так как они закончились!\n");
        }
        else{
        Sweet[] newArr = new Sweet[this.arrayBox.length - 1];

        for(int i = 0; i < this.arrayBox.length-1; i++) {
            newArr[i] = this.arrayBox[i];
        }
        this.arrayBox = newArr;}



    }







}
