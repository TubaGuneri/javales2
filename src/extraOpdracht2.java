//100 g tonijn uit blik op olijfolie
//30 g feta
//200 g pompoen
//50 g cherrytomaatjes
//30 g rucola
//½ avocado
//1 el extra vierge olijfolie
//1 el olijfolie
//Snufje garam masala
//        Peper
//Zout
public class extraOpdracht2 {
    Ingredient tuna = new Ingredient(100, "gram ", "tonijn uit blik op olijfolie");
    Ingredient feta = new Ingredient(30, "gram ", "feta");
    Ingredient pumpkin = new Ingredient(200, "gram ", "pompoen");
    Ingredient cherryTomatoes = new Ingredient(50, "gram ", "cherrytomaatjes");
    Ingredient arugula = new Ingredient(30, "gram ", "rucola");
    Ingredient avocado = new Ingredient(1.5, "stuks", "avocado");

    Ingredient viergeOliveOil = new Ingredient(1, "eetlepel ", "extra vierge olijfolie");
    Ingredient extraOliveOil = new Ingredient(1, "eetlepel ", "olijfolie");
    Ingredient garamMasala = new Ingredient(1, "snufje ", "garam masala");
    Ingredient pepper = new Ingredient(1, "theelepel ", "peper");
    Ingredient salt = new Ingredient(1, "theelepel ", "zout");

    public void heat() {
        System.out.println("Verwarm de oven voor op 200 °C.");
    }

    public void cut() {
        System.out.println("Snijd de pompoen in plakken.");
    }

    public void flavour() {
        System.out.println("Besprenkel met de reguliere olijfolie en breng op smaak met garam masala, peper en zout.");
    }

    public void roast() {
        System.out.println("Leg op een met bakpapier bekleedde bakplaat en rooster circa 20 minuten in de oven.");
    }

    public void flip() {
        System.out.println("Keer regelmatig om.");
    }

    public void cutAvocado() {
        System.out.println("Snijd de avocado in stukjes,");
    }

    public void cutCherry() {
        System.out.println("halveer de cherrytomaatjes en");
    }

    public void drainTuna() {
        System.out.println("laat de tonijn uitlekken.");
    }

    public void onPlate() {
        System.out.println("Schep de rucola op een diep bord en verdeel de pompoen, avocado, cherrytomaatjes, feta en tonijn hier overheen.");
    }

    public void finishingTouch() {
        System.out.println("Besprenkel met de extra vierge olijfolie en breng op smaak met peper en zout.");
    }

    public void tunaSalad() {
        heat();
        cut();
        flavour();
        roast();
        flip();
        cutAvocado();
        cutCherry();
        drainTuna();
        onPlate();
        finishingTouch();
    }
    public void ingredientsTunaSalad(){
        System.out.println(tuna);
        System.out.println(feta);
        System.out.println(pumpkin);
        System.out.println(cherryTomatoes);
        System.out.println(arugula);
        System.out.println(avocado);
        System.out.println(viergeOliveOil);
        System.out.println(extraOliveOil);
        System.out.println(garamMasala);
        System.out.println(pepper);
        System.out.println(salt);

    }
}