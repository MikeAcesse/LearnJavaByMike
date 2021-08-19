package lamda.keys;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/18 10:00
 */
public class MainFunction {
	static class Student{
		String name;
		Integer id;

		public Student(String name, Integer id) {
			this.name = name;
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public Integer getId() {
			return id;
		}
	}
	public static void main(String[] args) {
		List<Student> list= Arrays.asList(new Student("jack",1),new Student("tom",2));
		Function<Student,Integer> function = Student::getId;
		list.stream().map(function).forEach(System.out::print);
		list.stream().map(Student::getId).forEach(System.out::print);

	}
}
