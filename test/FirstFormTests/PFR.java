/**
 * Указывает, к какому пакету принадлежит класс
 */
package FirstFormTests;
/**
 * Импортируются необходимые для работы теста библиотеки
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mainpack.FirstForm;

public class PFR {
	/**
	 * Аннотация указывает на то, что за ней следует метод тестирования
	 */
	@Test
    public void PFRTest() {
            /**
             * Вызывается метод, вычисляющий размер выплаты по ПФР
             */            
            String s = FirstForm.PFR(15000);
            /**
             * Сверяются результат работы вызванной ранее функции с ожидаемым результатом, в случае несоответствия выводит сообщение о ошибке
             */
            assertEquals("Ошибка при вычислении размера выплаты по ПФР.","3300",s);
	}
}