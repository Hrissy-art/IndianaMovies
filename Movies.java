public class Movies {
    public static void main(String[] args) {

        String[] indianaMovies= new String[] {
                "Raiders of the Lost Ark",
                "Indiana Jones and the Temple of Doom",
                "Indiana Jones and the Last Crusade "
        };
        String[][] actors = new String[][]{
                {"Harrison Ford", "Karen Allen", "Paul Freeman"},
                {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
                {"Harrison Ford", "Sean Connery", "Alison Doody"}
        };

for (int i = 0; i < indianaMovies.length; i++) {
    System.out.println("Dans le film " + indianaMovies[i] + "les principaux acteurs sont :");
    for (int j = 0; j < actors[i].length; j++) {
        System.out.println(actors[i][j]);
    }
}
    }
}

