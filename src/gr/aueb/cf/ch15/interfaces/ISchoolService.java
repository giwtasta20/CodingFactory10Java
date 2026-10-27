package gr.aueb.cf.ch15.interfaces;

/**
 * Το ISchoolService είναι ένα interface που ορίζει τις βασικές λειτουργίες για την εγγραφή και την απεγγραφή
 * σε μια σχολική υπηρεσία. Περιλαμβάνει δύο μεθόδους: register() για την εγγραφή και unregister() για την απεγγραφή.
 */

public interface ISchoolService {
    void register();
    void unregister();
}

