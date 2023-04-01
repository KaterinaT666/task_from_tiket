import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

/**
 * В этом методе необходимо реализовать следующий алгоритм:
 * 1. На вход получаем список названий книг
 * 2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
 * 3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
 * 4. Количество полок константное - 5 штук
 * 5. Вернуть книги распределенные по полкам
 */

public class TaskTest {

	public void task() {
		List<String> books = Arrays.asList("Тихий дон", "Вишневый сад", "Война и мир", "Мертвые души", "Преступление и наказание", "Аэлита",
				"Идиот", "Каменный цветок", "Мстители: Финал", "Игра престолов", "Тень воина", "Путь героя", "Ангелы и демоны",
				"Код да Винчи", "Гуси-лебеди", "Колобок", "Маша и медведь", "Снегурочка");

		Map<Integer, List<String>> result = TaskTest.task(books);

		Assertions.assertEquals("Гуси-лебеди", result.get(2).get(1), "Гуси-лебеди д.б. первой книгой на второй полке");
		Assertions.assertEquals("Код да Винчи", result.get(3).get(2), "Гуси-лебеди д.б. второй книгой на третьей полке");
		Assertions.assertEquals("Аэлита", result.get(1).get(1), "Гуси-лебеди д.б. первой книгой на первой полке");
	}

	private static Map task(Collection<String> source) {
		return null;
	}
}
