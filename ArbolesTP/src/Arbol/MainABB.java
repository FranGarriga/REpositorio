package Arbol;

public class MainABB {
	
	static int[] elementos = new int[100];
    static int indice = 0;

    public static void AlmacenarElementos(TDAABB arbol) {
        if (!arbol.ArbolVacio()) {
            AlmacenarElementos(arbol.HijoIzq());
            elementos[indice++] = arbol.Raiz();
            AlmacenarElementos(arbol.HijoDer());
        }
    }
    
    public static double CalcularMediana() {
        if (indice % 2 == 0) {
            int central1 = elementos[indice / 2];
            int central2 = elementos[(indice / 2) - 1];
            return (double)((central1 + central2) / 2);
        } else {
            return elementos[indice / 2];
        }
    }

	public static void Mostrar(TDAABB arbol, int contador) {
		if (!arbol.ArbolVacio()) {
			contador++;
			Mostrar(arbol.HijoDer(), contador);
			for (int f = 0; f < contador; f++) {
				System.out.print("   ");
			}
			System.out.println(arbol.Raiz());
			Mostrar(arbol.HijoIzq(), contador);
		}
	}

	public static int Sumar(TDAABB arbol) {
		if (arbol.ArbolVacio()) {
			return 0;
		} else {
			return (arbol.Raiz() + Sumar(arbol.HijoIzq())) + Sumar(arbol.HijoDer());
		}
	}

	public static int Contar(TDAABB arbol) {
		if (arbol.ArbolVacio()) {
			return 0;
		} else {
			return (1 + Contar(arbol.HijoIzq()) + Contar(arbol.HijoDer()));
		}
	}

	public static void MostrarOrdenAscendente(TDAABB arbol) {
		if (!arbol.ArbolVacio()) {
			MostrarOrdenAscendente(arbol.HijoIzq());
			System.out.println(arbol.Raiz());
			MostrarOrdenAscendente(arbol.HijoDer());
		}
	}

	public static boolean BuscarTemperatura(TDAABB arbol, int x) {
		if (arbol.ArbolVacio()) {
			return false;
		} else if (arbol.Raiz() == x) {
			return true;
		} else if (arbol.Raiz() > x) {
			return BuscarTemperatura(arbol.HijoIzq(), x);
		} else {
			return BuscarTemperatura(arbol.HijoDer(), x);
		}
	}

	public static void main(String[] args) {
		int contador = 0;
		TDAABB Arbol = new ABB();
		Arbol.InicializarArbol();
		Arbol.AgregarElem(47);
		Arbol.AgregarElem(21);
		Arbol.AgregarElem(50);
		Arbol.AgregarElem(7);
		Arbol.AgregarElem(11);
		Arbol.AgregarElem(25);
		Arbol.AgregarElem(60);
		Arbol.AgregarElem(49);
		Arbol.AgregarElem(9);
		Arbol.AgregarElem(8);
		Arbol.AgregarElem(55);
		Arbol.EliminarElem(11);

		if (BuscarTemperatura(Arbol, 7))
			System.out.println("La temperatura " + 7 + " SI existe en el arbol.");
		else
			System.out.println("La temperatura " + 7 + " NO existe en el arbol.");

		if (BuscarTemperatura(Arbol, 56))
			System.out.println("La temperatura " + 56 + " SI existe en el arbol.");
		else
			System.out.println("La temperatura " + 56 + " NO existe en el arbol.");

		System.out.println("--------------------------------------------------------");
		System.out.println("Elementos del arbol representados de manera ascendente: ");
		MostrarOrdenAscendente(Arbol);
		System.out.println("--------------------------------------------------------");
		int resultado = Sumar(Arbol);
		int cantidad = Contar(Arbol);
		System.out.println("La suma de los elementos del arbol es: " + resultado);
		System.out.println("La cantidad de elementos que hay en el arbol es : " + cantidad);
		if (cantidad > 0) {
			double promedio = resultado / cantidad;
			System.out.println("El promedio es : " + promedio);
		} else {
			System.out.println("No se pudo calcular, el arbol se encuentra vacío");
		}
		
		System.out.println("--------------------------------------------------------");
		AlmacenarElementos(Arbol);
		double mediana = CalcularMediana();
		System.out.println("La mediana de los elementos del arbol es: " + mediana);

		System.out.println("--------------------------------------------------------");
		System.out.println("Arbol representado de manera horizontal:");
		Mostrar(Arbol, contador);

	}

}
