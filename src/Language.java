public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    public Language(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder= wdOrder;

    }
    public void getInfo(){
        System.out.println(this.name+" is spoken by "+ this.numSpeakers + " people mainly in "+this.regionsSpoken+"." );
        System.out.println("The language follows the word order: "+this.wordOrder);
    }
}
