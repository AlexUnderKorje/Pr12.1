    import java.util.Hashtable;
		import java.util.Objects;
		import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws INNException {
		Scanner in = new Scanner(System.in);
		var base = new Hashtable<String, String>();
		base.put("Фамилия Имя Отчество", "1234567890");
		base.put("Иванова Иван Иванович", "1234567190");
		base.put("Павлов Женёк сергеевич", "666666666");
		base.put("Коржов Александр Андреевич", "777777777");
		System.out.println("Для оформления заказа введите данные:");
		String FIO, INN;
		System.out.print("ФИО: ");
		FIO = in.nextLine();
		System.out.print("ИНН: ");
		INN = in.next();
		String dINN = base.get(FIO);
		if (Objects.equals(INN, dINN)) {
			System.out.println("Заказ для пользователя " + FIO + " оформлен.");}
		else {throw new INNException("Введенный ИНН не действителен для данного пользователя.");}
	}
}