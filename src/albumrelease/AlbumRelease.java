
package albumrelease;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class AlbumRelease {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDate theJoshuaTree = LocalDate.of(1987, 3, 9);
        LocalDate rattleAndHum = LocalDate.of(1988, 10, 10);
        
        Period p1 = Period.between(theJoshuaTree, LocalDate.now());
        
        Period p2 = Period.between(theJoshuaTree, rattleAndHum);
        
        LocalDate nextAlbum = rattleAndHum.plus(p2);
        
        System.out.println("Time since release of \"The Joshua Tree\":");
        System.out.println("Years: " + p1.getYears() + " Months: " + p1.getMonths() + " Days: " + p1.getDays());
        System.out.println("Time between album releases: ");
        System.out.println("Years: " + p2.getYears() + " Months: " + p2.getMonths() + " Days: " + p2.getDays());
        System.out.println("Theoretical next album release date: ");
        System.out.println(nextAlbum.format(DateTimeFormatter.ISO_DATE));
        
    }
    
}
