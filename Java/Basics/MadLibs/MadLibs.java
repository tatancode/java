public class MadLibs {
  /*
   * Your description here
   * This program generates a mad libbed story.
   * Author: Seb
   * Date: 01/28/2023
   */
  public static void main(String[] args) {
    // Choose two names
    String name1 = "Ariana";
    String name2 = "Maggie";

    // Choose your favorite adjectives
    String adjective1 = "amazing";
    String adjective2 = "ginormous";
    String adjective3 = "crazy";

    // Choose a verb
    String verb1 = "run";

    // Choose your favorite nouns
    String noun1 = "mom";
    String noun2 = "smile";
    String noun3 = "soccer ball";
    String noun4 = "blanket";
    String noun5 = "love";
    String noun6 = "husband";

    // Choose any number
    int number = 32;

    // Choose any place
    String place1 = "san diego";

    // The template for the story
    String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2
        + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to "
        + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3
        + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped "
        + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number
        + ", in a world where " + noun6 + "s ruled the world.";

    System.out.println(story);
  }
}
