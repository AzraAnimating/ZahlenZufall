import java.util.*;
public class Controller
{
    List<Integer> aZahlenListe;
    public Controller(int pAmount)
    {
        aZahlenListe = new List<Integer>();
        for(int i = 0; i < pAmount ; i++)
        {
            aZahlenListe.append(new Integer(new java.util.Random().nextInt(pAmount)));
        }
    }
    public void print()
    {
        aZahlenListe.toFirst();
        while(aZahlenListe.hasAccess())
        {
            System.out.println(aZahlenListe.getContent().intValue());
            aZahlenListe.next();
        }
    }
    public void addieren()
    {
        int lGesamt = 0;
        aZahlenListe.toFirst();
        while(aZahlenListe.hasAccess())
        {
            lGesamt = aZahlenListe.getContent().intValue() + lGesamt;
            aZahlenListe.next();
        }
        System.out.println(lGesamt);
    }

    public void contains(int lNumber){
        int lAmountOfNumbers = 0;
        int i = 0;
        aZahlenListe.toFirst();
        while (aZahlenListe.hasAccess())
        {
            if(aZahlenListe.getContent() == lNumber)
            {
                lAmountOfNumbers++;
            }
            aZahlenListe.next();
        }
        System.out.println(lAmountOfNumbers);

    }

    public void containsAt(int lNumber)
    {
        int i = 0;
        aZahlenListe.toFirst();
        while (aZahlenListe.hasAccess())
        {
            if(aZahlenListe.getContent() == lNumber)
            {
                System.out.println(lNumber + " an Index " + i);
            }
            aZahlenListe.next();
            i++;
        }
    }

    public void removeThingsThatContain30()
    {
        aZahlenListe.toFirst();
        while (aZahlenListe.hasAccess())
        {
            if(aZahlenListe.getContent().toString().contains("30")){
                aZahlenListe.remove();
                System.out.println("removed");
            }
            aZahlenListe.next();
        }
    }

    public void add1k(int lIndex)
    {
        aZahlenListe.toFirst();
        for (int i = 0 ; i < lIndex - 1; i++){
            aZahlenListe.next();
        }

        aZahlenListe.insert(10000);
    }

    public void printFibonacciZahlen(){
        long lLetzteZahl = 0;
        long lZahlDavor = 1;
        long lFibonacciZahl = 0;

        List<Long> lFibonacciListe = new List<Long>();

        lFibonacciListe.toFirst();

        while (lFibonacciZahl < 1000000000)
        {
            lFibonacciZahl = lZahlDavor + lLetzteZahl;
            lZahlDavor = lFibonacciZahl;
            lFibonacciListe.append(lFibonacciZahl);
            System.out.println(lFibonacciZahl);
            lFibonacciZahl = lLetzteZahl + lZahlDavor;
            lLetzteZahl = lFibonacciZahl;
            System.out.println(lFibonacciZahl);
        }
    }


}
