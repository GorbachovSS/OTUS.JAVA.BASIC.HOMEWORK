package otus.java.basic.homework.lesson12;

public class Plate {
    private int maxAmountOfFood;
    private int currentAmountOfFood;

    public Plate(int maxAmountOfFood, int currentAmountOfFood) {
        this.maxAmountOfFood = maxAmountOfFood;
        this.currentAmountOfFood = currentAmountOfFood;
    }

    public int getMaxAmountOfFood() {
        return maxAmountOfFood;
    }

    public int getCurrentAmountOfFood() {
        return currentAmountOfFood;
    }

    public void setCurrentAmountOfFood(int currentAmountOfFood) {
        this.currentAmountOfFood = currentAmountOfFood;
    }

    public void addFoodPlate(int addingFood) {
        if (maxAmountOfFood > currentAmountOfFood + addingFood) {
            currentAmountOfFood += addingFood;
        } else {
            currentAmountOfFood = maxAmountOfFood;
        }
    }

    public boolean reducingCountFood(int reduce) {
        if (currentAmountOfFood - reduce >= 0) {
            currentAmountOfFood -= reduce;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Тарелка: " + "\n" +
                "Максимальное количесто еды в тарелке: " + maxAmountOfFood + " гр." + "\n" +
                "Текущее количество еды: " + currentAmountOfFood + " гр.";
    }
}
