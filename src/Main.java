import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        ArrayList<String> NewLanguage = new ArrayList<String>();
        ArrayList<String> LanguageMayan = new ArrayList<String>();
        ArrayList<String> LanguageTibetan = new ArrayList<String>();



        for (int i = 0; i <999 ; i++) {

            System.out.println("Select the kind of family language you want to add select a number: ");
            System.out.println("1.Mayan");
            System.out.println("2.SinoTibetan");
            System.out.println("3.Other");
            int Selection = myObj.nextInt();
            myObj.nextLine();
        if(Selection == 1){

            System.out.println("You have selected Mayan, What is the name of the Language? ");
            String nowMayan= myObj.nextLine();


            System.out.println("How many speakers does this language have? ");

            int numMayan = myObj.nextInt();
            LanguageMayan.add(nowMayan);
            Language languageNowMayan = new Mayan(nowMayan,numMayan);
            languageNowMayan.getInfo();
            System.out.println("All the Mayan languages added so far: "+ LanguageMayan);
        } else if(Selection ==2){
            System.out.println("You have selected SinoTibetan, What is the name of the Language? ");
            String nowSinoTibetan= myObj.nextLine();
            LanguageTibetan.add(nowSinoTibetan);
            System.out.println("How many speakers does this language have? ");
            int numSinoTibetan = myObj.nextInt();
            Language languageSinoTibetan = new SinoTibetan(nowSinoTibetan,numSinoTibetan);
            languageSinoTibetan.getInfo();
            System.out.println("All the SinoTibetan languages added so far: "+ LanguageTibetan);

        } else if(Selection ==3) {
            System.out.println("You have selected Other, What is the name of the Language? ");
            String nowOther= myObj.nextLine();
            NewLanguage.add(nowOther);
            System.out.println("How many speakers does this language have? ");
            int numOther = myObj.nextInt();
            System.out.println("From what region it came from? ");
            String region = myObj.nextLine();
            System.out.println("What is the order from their language?");
            String order = myObj.nextLine();
            Language languageNowOther = new Language(nowOther,numOther,region,order);
            languageNowOther.getInfo();
            System.out.println("All the Mayan languages added so far: "+ NewLanguage);
        }
    }

        Language Spanish = new Language("Spanish", 500,"America","Subject-verb-Object");
        Spanish.getInfo();
        Language chontal = new Mayan("Chontal",900);
        chontal.getInfo();
        Language Burmese = new SinoTibetan("Burmese",800);
        Burmese.getInfo();
    }
}