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
    public void contains57()
    {
        aZahlenliste.toFirst();
        int lAmoutOf57s = 0;
        while(aZ
    }
}
