package by.home.maxzzzit;

import java.util.Scanner;

// Напишите класс, который принимает с клавиатуры значение, равное сумме на счету клиента
// в начале месяца, а затем - 28 значений, соответствующих проведенным клиентом операциям со счетом.
// Положительные значение соответствуют внесению суммы на счет, отрицательные - снятию суммы со счета.
// Следуте определить следующие итоговые данные:
// - сумму на счету в конце месяца;
// - сумму внесенных (не снятых) на счету денег;
// - количество операции по снятию денег со счета.

public class BankovskiiSchet {

	public static void main(String[] args) {
		int obsch, sum=0, otroper=0, ostatok=0, sum1=0;
		System.out.print("Введите сумму полученную на счет клиента: ");
		Scanner znath = new Scanner(System.in);
		obsch=znath.nextInt();
		ostatok=obsch;
		sum=obsch;
		for (int i=1; i<=28; i++) {
			System.out.println("Введите операцию с числом");
			obsch=znath.nextInt();
			sum+=obsch;
			if (obsch>0)
			sum1+=obsch;	
			if (obsch<0)
			otroper++;
			System.out.println("Денег на счету сейчас: "+sum);
			System.out.println("Количество отрицательных операций: "+otroper);
			System.out.println("Общая сумма внесенных на счет денег: "+sum1);
		}
			System.out.println("На начало месяца: "+ostatok);
	}
}
