import java.util.*;
import java.nio.charset.StandardCharsets;

public class Inversor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa una cadena");
		String s = sc.nextLine();

		System.out.println();
		System.out.println();
		System.out.println("Tu cadena " + s);
		System.out.println("Cadena invertida      | " + invertir(s));
		System.out.println("Cadena invertida REC  | " + invertirDesde(s, 0));
		System.out.println("Es palindromo?        | " + isPalindromo(s.toLowerCase()));
		System.out.println();
		System.out.println();

		List<Integer> lista = new ArrayList<>();
		System.out.println("Dame tantos numeros como quieras");
		while (true) {
			try {
				s = sc.nextLine();
				lista.add(Integer.parseInt(s));
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("Tu lista           | " + lista);
		System.out.println("Tu lista ordenada  | " + Arrays.asList(ordenarBurbuja(lista.toArray(new Integer[0]))));

		System.out.println();
		System.out.println();
		System.out.println("Dame una cadena aleatoria...");
		s = sc.nextLine();
		System.out.println("Dame una llave a buscar");
		String key = sc.nextLine();

		System.out.println();
		System.out.println("Tu cadena " + s);
		System.out.println("Tu llave  " + key);
		System.out.println("Coincidencias en los indices " + Arrays.asList(findMatches(s, key)));


		System.out.println();
		System.out.println();
    }

    public static String invertir(String s) {
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        byte[] bytesInvertidos = new byte[bytes.length];

		for (int i= 0; i < bytes.length; i++)
			bytesInvertidos[bytes.length - 1 - i] = bytes[i];

		return new String(bytesInvertidos, StandardCharsets.UTF_8);
    }

	public static String invertirDesde(String s, int index) {
		if (index >= s.length())
			return "";

		return invertirDesde(s, index + 1) + String.valueOf(s.charAt(index));
	}

	public static boolean isPalindromo(String s) {
		String sNoSpaces = s.replaceAll(" ", "");
		String sInvertidaNoSpaces = invertir(s).replaceAll(" ", "");

		return sNoSpaces.equals(sInvertidaNoSpaces);
	}

	public static Integer[] ordenarBurbuja(Integer[] arr){
		for (int i = 0; i < arr.length; i++) {
			int auxI = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int auxJ = arr[j];

				if (auxJ < auxI){
					arr[i] = auxJ;
					arr[j] = auxI;

					auxI = arr[i];
					auxJ = arr[j];
				}
			}
		}

		return arr;
	}

	public static Integer[] findMatches(String s, String k) {
		s = s.toLowerCase();
		k = k.toLowerCase();

		byte[] sBytes = s.getBytes();
		byte[] kBytes = k.getBytes();

		int index = 0;
		int j = 0;

		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < sBytes.length; i++) {
			byte byteI = sBytes[i];
			byte byteJ = kBytes[j];

			if (byteI == byteJ && j == 0)
				index = i;

			if (byteI == byteJ)
				j++;
			else
				j = 0;

			if (j == kBytes.length) {
				lista.add(index);
				index = 0;
				j = 0;
			}
		}

		return lista.toArray(new Integer[0]);
	}
}
