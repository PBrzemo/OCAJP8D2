package abstrakcyjne;

import java.util.List;
import java.util.stream.Collectors;

public interface Wypisywalny {
	public List<String> pola();
	
	public default String wiersz() {
		return pola().stream().collect(Collectors.joining(";"));
	}

}