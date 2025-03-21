class Cooking {
    public static void main(String[] args) {
        Ingredients.collectIngredients();
    }
}

class Ingredients {
    public static void collectIngredients() {
        Preparation.prepareItems();
    }
}

class Preparation {
    public static void prepareItems() {
        CookingProcess.startCooking();
    }
}

class CookingProcess {
    public static void startCooking() {
        Plating.arrangeDish();
    }
}

class Plating {
    public static void arrangeDish() {
        Serving.serveFood();
    }
}

class Serving {
    public static void serveFood() {
        System.out.println(" Delicious dish is ready to be served!");
    }
}
