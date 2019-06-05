package appointments.exceptions;

/**
 * Класс-исключение,
 * возникающее, если при поиске ребенка он не была найден
 *
 * @author yanchenko_evgeniya
 */
public class OrganizationNotFoundException extends RuntimeException {

    public OrganizationNotFoundException(String message) {
        super(message);
    }
}
